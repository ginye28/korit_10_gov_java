package study.ch21.Ex;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

//다음 예외 상황을 모두 처리하는 성적 관리 시스템을 작성하시오.
//
//**사용자 정의 예외:**
//
//- `InvalidScoreException` — 점수 범위 오류 (0~100)
//- `StudentNotFoundException` — 학생 미존재
//
//**클래스:**
//
//- `Student`: name, score (setScore에서 범위 검증)
//- `GradeManager`: Map<String, Student>으로 관리
//    - `addStudent(String name, int score)` — 점수 범위 검증
//    - `getStudent(String name)` — 없으면 StudentNotFoundException
//    - `updateScore(String name, int score)` — 검증 + 조회
//    - `printAll()` — 전체 출력
//
//```java
//GradeManager gm = new GradeManager();
//gm.addStudent("김자바", 90);    // 정상
//gm.addStudent("이파이", 150);   // InvalidScoreException
//gm.getStudent("없는사람");       // StudentNotFoundException
//gm.updateScore("김자바", -10);   // InvalidScoreException

class InvalidScoreException extends RuntimeException {     //꼭 확인해야 하는 예외면 Exception
    public InvalidScoreException() {
        super("점수 범위 오류(0 ~ 100)");
    }
}

class StudentNOtFoundException extends RuntimeException {
    public StudentNOtFoundException() {
        super("학생 미존재");
    }
}

@Data

class Student {
    private String name;
    private int score;

    public Student(String name, int score) throws InvalidScoreException {      //예외처리 해줘야함
        this.name = name;
        if (score < 0 || score > 100) {
            throw new InvalidScoreException();
        }
        this.score = score;
    }

    public void setScore(int score) throws InvalidScoreException {         //예외처리 해줘야함
        if (score < 0 || score > 100) {
            throw new InvalidScoreException();
        }
        this.score = score;
    }
}

class GradeManager {
    private static GradeManager instance;
    private Map<String, Student> studentMap;

    private GradeManager() {
        this.studentMap = new HashMap<>();
    }

    public static GradeManager getInstance() {
        if (instance == null) instance = new GradeManager();
        return instance;
    }

    public void addStudent(String name, int score) throws InvalidScoreException {
        studentMap.put(name, new Student(name, score));
    }

    public Student getStudent(String name) throws StudentNOtFoundException {
        Student foundStudent = null;

        for (Student student : studentMap.values()) {
            if (student.getName().equals(name)) foundStudent =  student;
        }

       if (foundStudent == null) throw new StudentNOtFoundException();

       return foundStudent;
    }

    public void updateScore(String name, int score) throws StudentNOtFoundException, InsufficientStockException {
        getStudent(name).setScore(score);

    }

    public void printAll() {
        for (Student student : studentMap.values()) {
            System.out.println(student);
        }

    }
}

public class Ex19 {
    public static void main(String[] args) {
        GradeManager gradeManager = GradeManager.getInstance();
        try {
            gradeManager.addStudent("진혜정", 100);
            Student foundStudent = gradeManager.getStudent("진혜정");
            System.out.println(foundStudent);
            gradeManager.updateScore("진혜정", 90);
            gradeManager.printAll();
        } catch (InvalidScoreException | StudentNOtFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
