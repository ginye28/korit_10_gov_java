package study.ch22;

class HomeButton implements ButtonClick {
    @Override
    public void onClick() {
        System.out.println("홈으로 이동");
    }
}

class BackButton implements ButtonClick {

    @Override
    public void onClick() {
        System.out.println("뒤로 이동");
    }
}

class LoginButton implements ButtonClick {
    @Override
    public void onClick() {
        System.out.println("로그인 요청");
    }
}

public class ButtonMain {                                               //interface 안에 onClick 추상 메서드 하나여서 람다식이 가능함
    public static void main(String[] args) {
        ButtonClick btn1 = new HomeButton();
        ButtonClick btn2 = new BackButton();
        ButtonClick btn3 = new LoginButton();
        ButtonClick btn4 = new ButtonClick() {
            @Override
            public void onClick() {
                System.out.println("로그인 요청");
            }
        };
        //                                                                람다식
        ButtonClick btn5 = () -> System.out.println("로그인 요청");      //ButtonClick이 주가 됨. 정의와 동시에 객체 생성
                                                                        //줄인게 아니라 사용 용도가 다름
        btn1.onClick();
        btn2.onClick();
        btn3.onClick();
        btn4.onClick();
    }
}
