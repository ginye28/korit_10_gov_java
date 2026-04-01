package study.ch10;

public class Array05 {
    public static void main(String[] args) {
        // 구구단을 배열에 시작 단부터 끝단까지
        // 자동으로 저장하여 출력하는 프로그램을 작성하시오

        int danStart = 2;
        int danEnd = 9;
        int size = danEnd - danStart + 1;
        int[][] results = new int[size][9];
        for (int i = 0; i < results.length; i++) {
            int dan = i + danStart;
            for (int j = 0; j < results[i].length; j++) {
                int num = j + 1;
                results[i][j] = dan * num;
            }
        }
        for (int i = 0; i < results.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < results[i].length; j++) {
                System.out.print(results[i][j] + " ");
            }
            System.out.println("]");
        }


        /*int[][] results = new int[9][9];

        for (int danStart = 2; danStart < 9; danStart++) {
            for (int danEnd = 1; danEnd < 10; danEnd++) {
                System.out.print(danStart * danEnd);
            }
        }*/
    }
}
