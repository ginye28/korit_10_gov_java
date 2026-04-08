package study.ch21.Ex;

//다음 코드의 출력 결과를 쓰고 직접 실행하여 확인하시오

public class Ex06 {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            int x = 10 / 0;
            System.out.println("B");
        } catch (ArithmeticException e) {
            System.out.println("C");
        } finally {
            System.out.println("D");
        }
        System.out.println("E");
    }
    //A
    //B -> C
    //D
    //E

    //ACDE   A출력 -> 10/0 예외 발생 -> B패스 C->D->E
}
