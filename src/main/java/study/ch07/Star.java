package study.ch07;

public class Star {
    public static void main(String[] args) {
        int count = 10;

        /**
         * *
         * **
         * ***
         * ****
         * *****
         */

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < count - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*  ");   /*ln 지움*/
//            }
//            System.out.println();  /*줄바꿈*/
//        }
//        for (int i = 5; 1 < i; i-- ) {
//            for (int j = 5; j > i - 1; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
