package study.ch10;

import java.util.Random;

public class Array06 {
    public static void main(String[] args) {

        int[] nums = new int[10];

        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100) + 1;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + ((i < nums.length - 1) ? ", " : ""));  //마지막 인덱스가 아니면 , 마지막이면 ""
        }
        System.out.println();


        //nums에 저장된 랜덤한 숫자 중 최대값과 최소값을 각각 구하시오.
        int max = 0;
        int min = 0;

        // [10 24 5 8]

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                max = nums[i];
                min = nums[i];
                continue;
            }
            //nums[0] > nums[0 + 1] ? nums[0] > nums[0 + 2] ? nums[0] > nums[0 + 3] ? nums[0] : nums[0 + 3] : nums[0 + 2] : nums[0 + 1];
            max = nums[i] > max ? nums[i] : max;
            min = nums[i] < min ? nums[i] : min;

//            if (nums[i] > max) {
//                nums[i] = max;
//            }
//            if (nums[i] < min) {
//                nums[i] = min;
//            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
