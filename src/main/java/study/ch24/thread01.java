package study.ch24;

public class thread01 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() ->{
            for (int i = 0; i < 100; i++) {
                System.out.println("T1: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(() ->{
            for (int i = 0; i < 100; i++) {
                System.out.println("T2: " + i);
            }
        });

        thread1.start();
        thread2.start();
    }
}
