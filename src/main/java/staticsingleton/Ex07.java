package staticsingleton;

class Parent {
    void greet() { System.out.println("Parent"); }
}

class Child extends Parent {
    void greet() { System.out.println("Child"); }
}

public class Ex07 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.greet();
    }
}


//class가 static 이라서 override가 안 됨