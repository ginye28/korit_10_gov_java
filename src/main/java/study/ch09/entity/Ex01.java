package study.ch09.entity;

class Dog {
    String name;
    int age;
}
public class Ex01 {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.name);
        System.out.println(d.age);
    }
}
//아무것도 나오지 않음. 입력값이 없기 때문
//null
//0