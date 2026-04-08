package study.ch21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public class Exception01 {
    public static void unchecked() {
        System.out.println("프로그램 실행");      //unchecked
        int a = 10 / 0;
        System.out.println(a);
        System.out.println("프로그램 종료");
    }

    public static void checked() {
        System.out.println("프로그램 실행");
        try {
            FileReader fileReader = new FileReader("text.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
    public static void main(String[] args) {
//        unchecked();
        checked();
    }
}
