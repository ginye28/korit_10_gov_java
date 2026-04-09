package study.ch23;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
class Student {
    private int studentCode;
    private String name;
    private int score;
}

public class Stream03 {
    public static void main(String[] args) {
        Map<String, Object> studentMap = Map.of(
                "studentCode", 20260001,
                "name", "진혜정",
                "score", 70
        );

        Map<String, Object> studentMap2 = Map.of(
                "studentCode", 20260002,
                "name", "진정해",
                "score", 80
        );

        Map<String, Object> studentMap3 = Map.of(
                "studentCode", 20260003,
                "name", "진정",
                "score", 90
        );

        List<Map<String, Object>> studentMapList = List.of(studentMap, studentMap2, studentMap3);
        List<Student> studentList = studentMapList.stream()
                .map(sm -> new Student(
                        (Integer) sm.get("studentCode"),
                        (String) sm.get("name"),                    //return 값
                        (Integer) sm.get("score")
                ))
                .toList();

        System.out.println(studentList);
    }
}
