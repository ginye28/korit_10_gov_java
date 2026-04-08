package study.ch20.Ex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class Student1 {
    String name; int score;
    Student1(String name, int score) {
        this.name = name; this.score = score;
    }
    public String toString() {
        return "Student1{name='" + name + "', score=" + score + "}";
    }
}

public class Ex01 {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1("진혜정", 80));
        list.add(new Student1("김혜정", 75));
        list.add(new Student1("이혜정", 60));
        list.add(new Student1("박혜정", 90));
        list.add(new Student1("최혜정", 70));
//        ArrayList<Student1> student1s = new ArrayList.of(
//                new Student1("진혜정", 80),
//                new Student1("김혜정", 75),
//                new Student1("이혜정", 60),
//                new Student1("박혜정", 90),
//                new Student1("최혜정", 70)
//        );
        System.out.println(list);
    }
}
