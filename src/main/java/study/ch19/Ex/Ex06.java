package study.ch19.Ex;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
class Student {
    private String name;
    private int studentYear;
    private int korScore;
    private int engScore;
    private int mathScore;
}

public class Ex06 {
    public static void main(String[] args) {
        int currentStudentCode = 20260000;
        List<Student> studentList = List.of(
                Student.builder().name("휴").studentYear(1).korScore(80).engScore(90).mathScore(100).build(),
                Student.builder().name("크롱").studentYear(2).korScore(70).engScore(80).mathScore(90).build(),
                Student.builder().name("붕1").studentYear(1).korScore(90).engScore(80).mathScore(70).build(),
                Student.builder().name("붕2").studentYear(2).korScore(60).engScore(70).mathScore(80).build()
        );
        Map<Integer, List<Student>> studentMap = Map.of(
                1, new ArrayList<>(),
                2, new ArrayList<>()
        );
        for (Student student : studentList) {                       //studentYear끼리 묶기
            studentMap.get(student.getStudentYear()).add(student);
        }
        Map<String, Double> scoreMap = new HashMap<>(Map.of(
                "korScore", 0.0,
                "engScore", 0.0,
                "mathScore", 0.0
        ));

        //과목별 평균
        for (Student student : studentList) {
            scoreMap.replace("korScore", scoreMap.get("korScore") + student.getKorScore());
            scoreMap.replace("engScore", scoreMap.get("engScore") + student.getEngScore());
            scoreMap.replace("mathScore", scoreMap.get("mathScore") + student.getMathScore());
        }
        for (String key : scoreMap.keySet()) {
            scoreMap.replace(key, scoreMap.get(key) / studentList.size());
        }
        System.out.println(scoreMap);

        //학생 이름별로 총점
        Map<String, Integer> totalScoreMap = new HashMap<>();
        for (Student student : studentList) {
            totalScoreMap.put(student.getName(), student.getKorScore() + student.getEngScore() + student.getMathScore());
        }
        System.out.println(totalScoreMap);
    }
}
