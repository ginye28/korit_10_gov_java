package study.ch21;

import java.util.List;

public class Exception03 {
    public static void main(String[] args) {

        List<String> usernames = List.of("aaa", "bbb", "ccc");

        String username = null;

        try {
            if (username == null) {
                throw new NullPointerException();
            } else {
                boolean isEmpty = usernames.stream().filter(u -> u.equals(username)).count() == 0;
                try {
                    if (isEmpty) {
                        throw new UsernameNotFoundException();
                    }
                } catch (UsernameNotFoundException e) {     //try를 빼고 catch끼리 나열해도 됨
                    System.out.println("사용자 아이디를 찾지 못했습니다.");
                }
            }
        } catch (NullPointerException e) {
            System.out.println("username이 NULL입니다.");
        }

        System.out.println("프로그램 정상 종료");
    }
}
