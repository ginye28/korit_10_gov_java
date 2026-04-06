package staticsingleton;

class StringUtil {
    private StringUtil() {} //인스턴스 생성 방지

    static boolean isEmpty(String s) {
        return s == null || s.isEmpty();
        //s가 null이거나 s가 비어있으면 return
    }

    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static int countChar(String s,char c) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) count ++;
        }
        return count;
    }
}


public class Ex04 {
}
