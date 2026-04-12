package study.ch23.Ex;

//다음 Map 리스트에서 "name" 값만 추출하여 List<String>으로 만드시오.

//List<Map<String, Object>> people = List.of(
//        Map.of("name", "김자바", "age", 25),
//        Map.of("name", "이파이", "age", 30),
//        Map.of("name", "박고랭", "age", 22)
//);
// 출력: [김자바, 이파이, 박고랭]

import java.util.List;
import java.util.Map;

public class Ex05 {
    public static void main(String[] args) {
        List<Map<String, Object>> people = List.of(
                Map.of("name", "김자바", "age", 25),
                Map.of("name", "이파이", "age", 30),
                Map.of("name", "박고랭", "age", 22)
        );

        //형식이 갖춰줘야 함
        List<String> names = people.stream() //people List 열어주기
                .map(m -> (String) m.get("name"))
                .toList();
        System.out.println(names);
//        System.out.println(people.stream().filter());
    }
}
