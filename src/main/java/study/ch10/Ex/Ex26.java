package study.ch10.Ex;

public class Ex26 {
    public static void main(String[] args) {

        // 3x3의 행렬을 1~9까지 채워라
        int[][] nums = new int[3][3];     //3행, 3열
        int num = 1;                      //숫자 1부터 시작

        for (int i = 0; i < 3; i++) {         //행 세 번 증가
            for (int j = 0; j < 3; j++) {     //열 세 번 증가
                nums[i][j] = num++;           //행렬의 숫자 증가
            }
        }
        for (int i = 0; i < 3; i++) {         //for문이 돌 때 sout
            for (int j = 0; j < 3; j++) {
                System.out.print(nums[i][j] + " ");     //줄바꿈 X, 띄어쓰기 추가
            }
            System.out.println();    // 줄바꿈
        }

//        i * nums[i].length
    }
}
