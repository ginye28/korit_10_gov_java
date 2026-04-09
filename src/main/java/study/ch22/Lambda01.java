package study.ch22;

interface Calculator {
    int calc(int x, int y);     //변수명이 중요하지 않음
}

public class Lambda01 {
    public static void main(String[] args) {
        Calculator addition = new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        };

        Calculator additionLambda = (int a, int b) -> {
            return a + b;
        };

        Calculator additionLambda2 = (a, b) -> {
            return a + b;
        };

        Calculator additionLambda3 = (a, b) -> a + b;

        int result = addition.calc(10, 20);
        int result2 = additionLambda.calc(30, 40);
        System.out.println(result);
        System.out.println(result2);
    }
}
