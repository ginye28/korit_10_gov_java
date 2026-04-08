package study.ch19.Ex;

//ArrayList에서 중복 요소를 제거한 새 리스트를 만드시오. (순서 유지)

// 입력: ["Java", "Python", "Java", "C++", "Python", "Go"]
// 출력: ["Java", "Python", "C++", "Go"]

import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

public class Ex02 {
    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>(List.of("Java", "Python", "Java", "C++", "Python", "Go"));//subjects를 list에 입력하고 초기화
        List<String> result = new ArrayList<>();        //result 초기화

//        System.out.println(new HashSet<>(list));
        for (int i = 0; i < subjects.size(); i++) {     //subjects의 사이즈만큼 반복
            String subject = subjects.get(i);           //subject는 i를 갖는다
            if (!result.contains(subject)) {            //result에 subject와 일치하지 않는다면
                result.add(subject);                    //result에 subject를 추가
            }

        }
        System.out.println(result);                     //result 출력

    }
}
