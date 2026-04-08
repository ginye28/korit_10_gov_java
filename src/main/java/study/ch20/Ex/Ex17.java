package study.ch20.Ex;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;

import java.util.Map;

@Data
@AllArgsConstructor
class Student {
    private int id;
    private String name;
    private int score;
}

//List와 Map을 모두 활용하는 학생 관리 시스템을 구현하시오.
//
//   StudentManager` 클래스
//   내부: `Map<Integer, Student>` (학번 → 학생)
//   void addStudent(int id, Student s)` — 등록
//   Student findById(int id)` — 학번으로 조회
//   List<Student> findByMinScore(int min)` — 점수 기준 필터
//   double getAverage()` — 전체 평균
//   void printAll()` — 전체 출력

interface StudentManager {
    void addStudent(int id, String name, int score);
    Student findById(int id);
    List<Student> findByMinScore(int min);
    double getAverage();
    void printAll();
}

class StudentManagerImpl implements StudentManager {
    private Map<Integer, Student> studentMap;

    public StudentManagerImpl() {
        studentMap = new HashMap<>();
    }

    @Override
    public void addStudent(int id, String  name, int score) {
        studentMap.put(id, new Student(id, name, score));
    }

    @Override
    public Student findById(int id) {
        return studentMap.get(id);
    }

    @Override
    public List<Student> findByMinScore(int min) {
        return studentMap.values().stream()
                .filter(student -> student.getScore() > min)        //score가 아닌 student를 담음
                .toList();
    }

    @Override
    public double getAverage() {
//        double avg = 0;
//        for (Student student : studentMap.values()) {
//            avg += student.getScore();
//        }
//        return avg / studentMap.size();
        return studentMap.values().stream()
                .map(student -> (double) student.getScore())
                .reduce(0.0, Double::sum) / studentMap.size();
    }

    @Override
    public void printAll() {
        studentMap.values().forEach(System.out::println);  //줄인 것(student -> System.out.println(student))
    }
}

public class Ex17 {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManagerImpl();

        studentManager.addStudent(20260001, "진혜정", 80);
        studentManager.addStudent(20260002, "이긴혜정", 75);
        studentManager.addStudent(20260003, "비긴혜정", 70);
        studentManager.addStudent(20260004, "진달정", 65);

        Student foundStudent = studentManager.findById(20260003);
        System.out.println(foundStudent);

        System.out.println(studentManager.findByMinScore(70));

        System.out.println(studentManager.getAverage());

        studentManager.printAll();
    }
}
