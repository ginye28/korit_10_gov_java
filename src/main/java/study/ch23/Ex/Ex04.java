package study.ch23.Ex;


//Stream.of("java", "python", "c++", "javascript", "go")에서
// 글자수가 4 이상인 단어만 골라 대문자로 변환한 리스트를 구하시오.

// 4글자 이상: java, python, javascript
// 대문자: JAVA, PYTHON, JAVASCRIPT
// 출력: [JAVA, PYTHON, JAVASCRIPT]

import java.util.List;
import java.util.stream.Stream;

public class Ex04 {
    public static void main(String[] args) {
        List<String> result = Stream.of("java", "python", "c++", "javascript", "go")
                .filter(s -> s.length() >= 4)
                .map(String::toUpperCase)
                .toList();
        System.out.println(result);
    }
}
