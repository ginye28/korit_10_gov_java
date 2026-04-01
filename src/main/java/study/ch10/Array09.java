package study.ch10;

import study.ch10.entity.Student;

public class Array09 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("진혜정", 80);
        students[1] = new Student("이긴혜정", 90);
        students[2] = new Student("비긴혜정", 100);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }

        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            student.setScore(student.getScore() - 5);
        }

        for (Student student : students) {
            student.setScore(student.getScore() - 5);
        }

        for (Student student : students) {
            System.out.println(student.toString());
        }

        String searchName = "이긴혜정";
        Student foundStudent = null;

        for (int i = 0; i < students.length; i++) {
            if(searchName.equals(students[i].getName())) { //이름 찾기
                foundStudent = students[i];

            }
        }
        if(foundStudent == null) {
            System.out.println("해당 이름의 학생이 존재하지 않습니다.");
            return;
        }
        System.out.println("[ 찾은 학생 정보 ]");
        System.out.println("이름: " + foundStudent.getName());
        System.out.println("점수: " + foundStudent.getScore());
    }
}
