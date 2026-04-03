package study.ch13;

abstract class Person {
    private String lastName;
    private String firstName;

    public abstract void showName();
    public void showName2() {

    }
}

interface Person2 {
    public String lastName = "";
    public String firstName = "";

    public abstract void showName();

    public default void showName2() {

    }
}

class Student extends Person {
    @Override
    public void showName() {

    }
}

//class Student2 extends Person2 {
//    @Override
//    public void showName() {
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Person p1 = new Student();      //추상클래스
//        Person2 p2 = new Student2();    //인터페이스
//    }
//}
