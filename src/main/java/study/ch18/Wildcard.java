package study.ch18;

import study.ch17.User;

class Person {

}

class Student extends Person {

}

class HighStudent extends Student {

}

public class Wildcard {
    // ? extends Object
    public static void print(SuccessResponse<?> sr) {       //wildcard <?> 뭘 붙여야 좋을지 모를떄
        System.out.println(sr);                             //다운캐스팅 해야함
    }

    //  상한 제한 와일드 카드
    public static void print2(SuccessResponse<? extends Student> sr)  {     //person은 상위 개념이라 X
        System.out.println(sr);         //부모 방향 밑
    }

//    public static void print2(SuccessResponse<? super Student> sr) {
//                      overloading이 안 돼서 x
//    }

    //하한 제한 와일드 카드
    public static void print3(SuccessResponse<? super Student> sr) {
        System.out.println(sr);         //부모 방향 위
    }

    public static void main(String[] args) {
        SuccessResponse<User> sr1 = new SuccessResponse<>(200, User.builder().build());
        SuccessResponse<String> sr2 = new SuccessResponse<>(201, "그냥 문자열");

        Wildcard.print(sr1);
        Wildcard.print(sr2);

//        Wildcard.print2(new SuccessResponse<>(200, new Person())); //상한 제약 걸림
        Wildcard.print2(new SuccessResponse<>(200, new Student()));

        Wildcard.print3(new SuccessResponse<>(201, new Student()));
//        Wildcard.print3(new SuccessResponse<HighStudent>(201, new HighStudent()));  하한 제약 걸림
    }
}
