package study.ch05;

public class Main {
    public static void main(String[] args) {
        int num = 10;
        boolean result = num % 2 == 0;
//        if (result) System.out.println(num * 10);   /*true일때*/
//        if (!result) System.out.println(num * 20);   /*false 일때*/

        if (result) {
            System.out.println(num * 10);
            System.out.println("짝수");
        } else {
            System.out.println(num * 20);
            System.out.println("홀수");
        }
        // num의 값이 짝수면 num에 10을 곱하고 짝수가 아니면 20을 곱하여 결과를 출력해라.

        int num2 = 12;

        if (num2 % 8 == 0) {
            System.out.println("8의 배수입니다.");
        } else if (num2 % 7 == 0) {
            System.out.println("7의 배수입니다.");
        } else if (num2 % 6 == 0) {
            System.out.println("6의 배수입니다.");
        } else {
            System.out.println("8, 7, 6의 배수가 아닙니다.");
        }

        int 키 = 140;
        int 나이 = 7;

        if (나이 >= 7 && 키 >= 140) {
            System.out.println("탑승 가능");
        } else {
            if (나이 < 7) {
                System.out.println("나이는 7세 이상이어야 합니다.");
            } else {
                System.out.println("키는 140cm 이상이어야 합니다.");
            }
            System.out.println("탑승 불가능");
        }
    }
}
//        if (나이 >= 7 && 키 >= 140) {
//            System.out.println("탑승 가능");
//        } else if (나이 < 7){
//            System.out.println("나이는 7세 이상이어야 합니다.");
//            System.out.println("탑승 불가능");
//        } else {
//            System.out.println("키는 140cm 이상이어야 합니다.");
//            System.out.println("탑승 불가능");
//        }

//        if (나이 >= 7) {
//            System.out.println("7세 이상입니다.");
//            if (키 >= 140) {
//                System.out.println("140cm 이상입니다.");
//                System.out.println("탑승 가능");
//            } else {
//                System.out.println("탑승 불가능");
//            }
//        } else {
//            System.out.println("탑승 불가능");
//
//
//        }



