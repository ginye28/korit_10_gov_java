package ex3;

import ex3.router.RouterPath;
import ex3.router.Routes;

public class Ex3Application {
    public static boolean running = true;   //무한루프

    public static void main(String[] args) {
        System.out.println("프로그램 실행");
        while (running) {                   //
            Routes.valueOf(RouterPath.current).getView().render();
//            RouterPath.current == 현재 사용자가 머물고 있는 위치(HOME, ACCOUNT)
        }
        System.out.println("프로그램 종료");
    }
}
