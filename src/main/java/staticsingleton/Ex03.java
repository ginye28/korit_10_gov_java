package staticsingleton;

class Student {
    String name;
    int Id;
    private static int nextId = 1;

    Student(String name) {
        this.name = name;
        this.Id = nextId++;
    }

    static int getStudentCount() {
        return nextId - 1;
    }
}

public class Ex03 {
}
