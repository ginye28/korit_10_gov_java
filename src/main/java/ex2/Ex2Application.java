package ex2;

import ex2.controller.Controller;
import ex2.dto.ResponseDto;
import ex2.router.RouterPath;
import ex2.router.Routes;
import ex2.util.Input;
import ex2.view.HomeView;

import java.util.Map;

public class Ex2Application {
    public static boolean running = true;

    public static void main(String[] args) {
        System.out.println("프로그램 실행");
        while (running) {
            Routes.valueOf(RouterPath.current).getView().render();
        }
        System.out.println("프로그램 종료");
    }
}
