package study.ch08;

public class OBJ03 {
    public static void main(String[] args) {
        class Student {
            String name;
            int age;

            Student(String name, int age) {
                System.out.println("학생 생성");
                this.name = name;
                this.age = age;
            }
        }

        Student s1 = new Student("진혜정", 21);
        Student s2 = new Student("wls혜정", 22);
    }
}
