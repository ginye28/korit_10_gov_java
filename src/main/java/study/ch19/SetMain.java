package study.ch19;

import study.ch17.UserService;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();
        // 값 추가(중복X)
        strSet.add("a");
        strSet.add("a");
        strSet.add("a");
        strSet.add("a");
        System.out.println(strSet);

        Set<User> userSet = new HashSet<>(Set.of(
                new User(1, "aaa"),
                new User(2, "bbb"),
                new User(3, "ccc"),
                new User(4, "ddd")
        ));
        System.out.println(userSet);
        int id = 3;
        for (User user : userSet) {     //for each만 가능
            if (user.getId() == id) {
                System.out.println("3번 아이디 찾음");
                System.out.println(user);
            }
        }
    }
}
