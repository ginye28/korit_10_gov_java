package study.ch16;

import lombok.AllArgsConstructor;
import lombok.Getter;

//내부 클래스   (클래스 안에 들어있는 클래스 BB)
class AA {

    @Getter
    @AllArgsConstructor
    static class BB {
        private String name;
    }

    @Getter
    @AllArgsConstructor
    class CC {
        private String text;
    }

}

public class Static04 {
    public static void main(String[] args) {
        AA a = new AA();
        AA.BB b = new AA.BB("이름");  //B에 접근이 가능하도록 static을 붙임

        AA.CC c = (new AA()).new CC("문자열");      //static을 안 붙이고 new 생성
        AA.CC c2 = a.new CC("문자열");

        b.getName();
        c.getText();
    }
}
