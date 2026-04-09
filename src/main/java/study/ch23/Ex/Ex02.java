package study.ch23.Ex;

//Stream.of(1, 2, 3, 4, 5)의 각 요소를 제곱(n²)하여 리스트로 만드시오.

// 출력: [1, 4, 9, 16, 25]

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex02 {
    public static void main(String[] args) {
        List<Integer> result = Stream.of(1, 2, 3, 4, 5)
                .map(n -> n * n)
                .toList();
        System.out.println(result);
    }
}
