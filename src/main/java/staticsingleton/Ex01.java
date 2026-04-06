package staticsingleton;

class Counter {
    static int count = 0;
    String name;

    Counter(String name) {
        this.name = name;
        count++;
    }
}

public class Ex01 {
    public static void main(String[] args) {
        Counter c1 = new Counter("A");
        Counter c2 = new Counter("B");
        Counter c3 = new Counter("C");
        System.out.println(Counter.count);
        System.out.println(c1.count);
    }
}

//3
//3