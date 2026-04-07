package study.ch19.Ex;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

//ArrayList를 사용하여 5명의 학생 점수를 저장하고, 평균과 최고 점수를 구하시오.

// 점수: 85, 92, 78, 96, 88
// 출력:
// 전체 점수: [85, 92, 78, 96, 88]
// 평균: 87.8
// 최고 점수: 96

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>(List.of(85, 92, 78, 96, 88));
        System.out.println("전체 점수: " + scores);

        double avg = 0;
        int max = scores.get(0);
        for (int s : scores) {          //Integer score :scores
            avg += s;                   //모든 숫자 더하기
            if (s > max) max = s;       //최고 점수
        }
        avg /= scores.size();       //평균

        System.out.println("평균: " + avg);
        System.out.println("최고 점수: " + max);

    }
}
