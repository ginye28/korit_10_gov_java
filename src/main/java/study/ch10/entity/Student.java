package study.ch10.entity;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

}
