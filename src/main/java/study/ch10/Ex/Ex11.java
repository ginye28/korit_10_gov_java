package study.ch10.Ex;

public class Ex11 {
    public static void main(String[] args) {
        double[] arr = new double[] {3.5, 2.1, 7.8, 4.6, 1.9};

        double sum = 0;

        for (double d : arr) sum += d;

        System.out.println("합계 : " + sum);
    }
}
