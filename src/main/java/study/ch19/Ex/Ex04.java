package study.ch19.Ex;

//두 ArrayList를 합치고 오름차순 정렬하시오.

// listA: [5, 2, 8]
// listB: [3, 9, 1]
// 결과: [1, 2, 3, 5, 8, 9]


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        List<Integer> listA = List.of(5, 2, 8);
        List<Integer> listB = List.of(3, 9, 1);
        List<Integer> result = new ArrayList<>();
        result.addAll(listA);
        result.addAll(listB);
        System.out.println(result);
        Collections.sort(result);               //list 정렬
        System.out.println(result);
    }
}
