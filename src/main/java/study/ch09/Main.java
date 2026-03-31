package study.ch09;

import study.ch09.entity.Teacher;
import study.ch09.entity.User;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "진혜정";
        s1.age = 21;
        s1.printInfo();

        Teacher t1 = new Teacher("김준일", 33);
        t1.월급 = t1.월급계산(200000);

        User user = new User("korit001");
        user.setPassword("1111");
        user.setName("진혜정");
        System.out.println(user.getUsername());
    }

}
