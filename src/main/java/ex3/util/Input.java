package ex3.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static String nextLine() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("입력: ");
            return bufferedReader.readLine();
        } catch (IOException e) {
            return null;
        }
    }
}
