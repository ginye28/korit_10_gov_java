package study.ch19.Ex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            nums.add(i + 1);
        }

        for (int i = 0; i < 20; i++) {
            int num = nums.get(i);
            if (num % 3 == 0) result.add(0, num);
        }
        System.out.println(result);



        for (int i = 0; i < 20; i++) {
            int num = nums.get(i);
            if (num % 3 == 0) result2.add(num);
        }
        Collections.reverse(result2);
        System.out.println(result2);
    }
}
