package study.ch08;

public class OBJ02 {
    public static void main(String[] args) {
        class Addition {
            int defualtNumber = 10;

            Addition() {  //함수와 리턴타입이 같아서 생략
                System.out.println("생성자 호출");
               // return this; //생략
            }

            //
            // 1. 중복 코드 제거
            // 2. 기능별로 코드를 나눌 때
            int add(int a, int b) {
                System.out.println("변수a: " + a);
                System.out.println("변수b: " + b);
                System.out.println("기본값: " + defualtNumber);
                return a + b + defualtNumber;
            }

            void printDefaultNumber() {
                System.out.println();
            }
        }

        Addition add1 = new Addition();
        int num = 1000;
        int num2 = add1.add(100, 200);  //add1에 . add를 대입
        int num3 = add1.add(400, 500);
        System.out.println(num + num2);
        System.out.println(num + num3);
    }
}
