package study.ch02;

public class Main {
    public static void main(String[] args) {
        String name = "진혜정";
        System.out.println(name);
        // 주석: 소스코드 중간중간 메모를 남길 때 사용(프로그램 실행시 영향을 주지 않음)
        String name2 = /*"진" + "혜" +*/ "정" + 2;
        System.out.println(name2);
        System.out.print("진\t");
        System.out.print("혜");
        System.out.print("정");
    }
}
