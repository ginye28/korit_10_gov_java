package study.ch16;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.annotation.processing.Generated;

@Getter
@Setter
@EqualsAndHashCode
@ToString(onlyExplicitlyIncluded = true)
class Student {
    @ToString.Include
    private String name;
    @ToString.Include
    private static String schoolName;

    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static Student creatStudent(String name) {
//        this.name = name;     static에서 name 불가능
        Student student = new Student();
        student.setName(name);
        return student;
    }
}

public class Static01 {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("김유경");

        Student.setSchoolName("경상대학교");
        System.out.println(Student.getSchoolName());

        Student student = new Student();
        student.setName("김유경");
        System.out.println(student);

        Student student2 = Student.creatStudent("권소희");
    }
}
