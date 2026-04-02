package study.ch10.Ex;

import java.util.Arrays;

public class Ex27 {
    public static void main(String[] args) {
        int[][] nums = new int[][] {{10,20,30},{40,50,60},{70,80,90}};
        int[] colSums = new int[nums[0].length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int num = j + 1;
//                nums[i][j] = nums + (i * nums[i].length);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                colSums[j] += nums[i][j];
            }
        }
        System.out.println(Arrays.toString(colSums));
    }
}
