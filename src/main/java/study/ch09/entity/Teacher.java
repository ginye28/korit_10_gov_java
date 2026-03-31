package study.ch09.entity;

public class Teacher {
    private String name;
    private int age;
    private int 월급;

    public Teacher() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int get월급() {
        return 월급;
    }

    public void set월급(int 월급) {
        this.월급 = 월급;
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
        this.월급 = 100000;
    }

    void printInfo() {
        System.out.println("선생님 이름: " + name);
        System.out.println("선생님 나이: " + age);
    }

    public void 월급계산(int 세전월급) {
        this.월급 = (int) (세전월급 - 세전월급 * 0.1);
    }
}
