package study.ch14;

import java.util.Objects;

class Teacher {
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }


//    retrun o instanceof Teacher;  //true, false일 때도 return 함

//    if (!(o instanceof Teacher)) {    //클래스명이 같고 패키지명이 다른 Teacher는 false
//        return false;
//    }                                                         //밑 override와 같은 코드
//    Teacher teacher = (Teacher) o;
//    return this.age == teacher.age && this.name.equals(teacher.name);


//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Teacher teacher = (Teacher) o;
//        return age == teacher.age && Objects.equals(name, teacher.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Teacher teacher)) return false;
        return age == teacher.age && Objects.equals(name, teacher.name);
    }

public class Equals {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김준일", 33);
        Teacher teacher2 = new Teacher("김준일", 33);

        System.out.println(teacher1.equals(teacher2));  //false
        System.out.println(teacher1 == teacher2);   //위랑 같은 코드
    }
}}
