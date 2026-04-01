package study.ch10;

public class Array02 {
    public static void main(String[] args) {
        int[] iArr = { 1, 2, 3, 4, 5 };
        char[] cArr = {'a', 'b', 'c'};
        boolean[] bArr = {true, false, true, false};
        double[] dArr = {1.0, 3.14, 5.5};
        String[] sArr = {"진혜정", "이긴혜정", "비긴혜정"};

        class Student {
            private String name;

            Student() {
            }

            Student(String name) {
                this.name = name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        Student[] students = {
                new Student("진혜정"),
                new Student("이긴혜정"),
                new Student("비긴혜정")
        };

        Student[] students2 = { new Student(), new Student(), new Student()};
        students2[0].setName("진혜정");
        students2[1].setName("이긴혜정");
        students2[2].setName("비긴혜정");

    }
}
