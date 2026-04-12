package study.ch23.Ex;

import java.util.List;
import java.util.stream.Stream;

// 문제 3. filter + map 체이닝

//Stream.of(3, 7, 2, 9, 4, 11, 6)`에서 5보다 큰 수만 골라 3배로 만든 리스트를 구하시오.

// 5보다 큰 수: 7, 9, 11, 6
// 3배: 21, 27, 33, 18
// 출력: [21, 27, 33, 18]


public class Ex03 {
    public static void main(String[] args) {
        List<Integer> result = Stream.of(3, 7, 2, 9, 4, 11, 6)
                .filter(n -> n > 5)
                .map(n -> n * 3)
                .toList();
        System.out.println(result);
    }
}
