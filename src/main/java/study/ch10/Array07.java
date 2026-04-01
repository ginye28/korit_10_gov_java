package study.ch10;

import java.util.Arrays;

public class Array07 {
    public static void main(String[] args) {
        int[] nums = {5, 2, 10, 4, 1};
        int [] sortedNums = nums.clone();

        for (int i = 0; i < sortedNums.length - 1; i++) {
            for (int j = 0; j < sortedNums.length -1 - i; j++) {
                if (sortedNums[j] > sortedNums[j + 1]) {
                    int temp = sortedNums[j];
                    sortedNums[j] = sortedNums[j + 1];
                    sortedNums[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.stream(nums).boxed().toList());
        System.out.println(Arrays.stream(sortedNums).boxed().toList());
    }
}
