package study.ch07;

public class Main3 {
    public static void main(String[] args) {
        int num = 0;
//        while (num < 10) {
//            num++;
//            System.out.println(num);
//        }
        while (num < 5) {
            int j = 0;
            while (j < 5 - 1 - num ) {
                System.out.print(" ");
                j++;
            }
            j = 0;
            while (j < num + 1 ) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            num++;
        }
//        for (int i = 0; i < 5; i++) {
//            System.out.print("안녕하세요");
//        }

//        int i = 0;
//        while (i < 5) {
//            System.out.println("안녕하세요");
//            i++;
//        }

    }
}
