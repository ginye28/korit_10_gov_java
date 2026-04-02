package study.ch10.Ex;

public class Ex03 {
    public static void main(String[] args) {
        int[] arr = new int[]{34, 78, 12, 56, 91, 23};

        int max = arr[0];

//        for (int i = 0; i < arr.length; i++) {
//            if (i == 0) {
//                max = arr[i];                          수업 시간에 알려주신 내용
//                continue;
//            }
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("최대값 : " + max);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("최대값 : " + max);
    }
}