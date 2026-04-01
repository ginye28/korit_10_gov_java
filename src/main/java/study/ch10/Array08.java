package study.ch10;

public class Array08 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            System.out.println(num);
        }

        for (int num : nums) {
            System.out.println(num);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * 10;
        }

        for (int num : nums) {
            num = num * 10;
        }

        for (int num : nums) {
            System.out.println(num);
        }

        String[] names = {"이긴혜정", "비긴혜정", "진혜정"};

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println(name);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
