package ex1.util;

import java.io.*;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class InputUtil {
    public static int nextInt() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = bufferedReader.readLine().trim();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) > 47 && input.charAt(i) < 58) {
                    stringBuilder.append(input.charAt(i));
                } else {
                    stringBuilder.append(",");
                }
            }
            int result = Arrays.stream(stringBuilder.toString().split(","))
                    .filter(str -> !str.isEmpty())
                    .map(Integer::parseInt)
                    .findFirst()
                    .get();
            return result;
        } catch (IOException e) {
            return 0;
        }
    }

    public static int nextInt(StringReader stringReader) {
        BufferedReader bufferedReader = new BufferedReader(stringReader);
        try {
            String input = bufferedReader.readLine().trim();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) > 47 && input.charAt(i) < 58) {
                    stringBuilder.append(input.charAt(i));
                } else {
                    stringBuilder.append(",");
                }
            }
            int result = Arrays.stream(stringBuilder.toString().split(","))
                    .filter(str -> !str.isEmpty())
                    .map(Integer::parseInt)
                    .findFirst()
                    .get();
            return result;
        } catch (IOException e) {
            return 0;
        }
    }

    public static List<Integer> nextInts() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = bufferedReader.readLine().trim();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) > 47 && input.charAt(i) < 58) {
                    stringBuilder.append(input.charAt(i));
                } else {
                    stringBuilder.append(",");
                }
            }
            String[] splitStr = stringBuilder.toString().split(",");
            List<Integer> strList = Arrays.stream(splitStr)
                    .filter(str -> !str.isEmpty())
                    .map(Integer::parseInt)
                    .toList();
            return strList;
        } catch (IOException e) {
            return List.of();
        }
    }
}