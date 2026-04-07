package study.ch19.Ex;

//ArrayList에서 중복 요소를 제거한 새 리스트를 만드시오. (순서 유지)

// 입력: ["Java", "Python", "Java", "C++", "Python", "Go"]
// 출력: ["Java", "Python", "C++", "Go"]

import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

//public class Ex02 {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>(List.of("Java", "Python", "Java", "C++", "Python", "Go"));
//        List<String> result = new ArrayList<>();
////        System.out.println(new HashSet<>(list));
//        for (int i = 0; i < list.size(); i++) {
//            String list = list.get(i);
//            if (!result.contains(list)) {
//                result.add(list);
//            }
//
//        }
//        System.out.println(result);
//
//        ArrayList<String> unique = new ArrayList<>();
//        for (String s : list) {
//
//        }
//
//
//    }
//}
