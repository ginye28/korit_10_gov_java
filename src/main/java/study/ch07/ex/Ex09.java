package study.ch07.ex;

public class Ex09 {
    public static void main(String[] args) {
        int month = 7;
        if (month < 3) {
            System.out.println("겨울");
        } else if (month < 6) {
            System.out.println("봄");
        } else if (month < 9) {
            System.out.println("여름");
        } else if (month < 12){
            System.out.println("가을");
        } else
            System.out.println("겨울");
    }
}
