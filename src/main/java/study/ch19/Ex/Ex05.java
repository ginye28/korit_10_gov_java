package study.ch19.Ex;

// 초기: ["사과", "바나나", "포도", "딸기"]
// "포도"를 "망고"로 변경
// "체리"를 맨 앞에 추가
// "딸기"를 삭제
// 최종: ["체리", "사과", "바나나", "망고"]

import java.util.ArrayList;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("사과", "바나나", "포도", "딸기"));
        int foundIndex = fruits.indexOf("포도");
        fruits.set(foundIndex, "망고");
        fruits.add(0, "체리");
        fruits.remove("딸기");
        System.out.println(fruits);
    }
}
