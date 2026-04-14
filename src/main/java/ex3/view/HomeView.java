package ex3.view;

import ex3.controller.Controller;
import ex3.dto.ResponseDto;
import ex3.util.Input;
import ex3.Ex3Application;

import java.util.Map;

public class HomeView implements View {
    public void render() {      //override
        homeMenu();
        String cmd = Input.nextLine();
        ResponseDto<Map<String, Object>> response = Controller.homeController(cmd);
        if (response.getStatus() == 100) {
            Ex3Application.running = false;
            return;
        }
        if (response.getStatus() != 200) {
            homeError(response.getData().get("message").toString());
            return;
        }
    }

    private void homeMenu() {
        System.out.println("======<< HOME >>======");
        System.out.println("1. 계좌생성");
        System.out.println("2. 입금");
        System.out.println("3. 출금");
        System.out.println("4. 계좌조회");
        System.out.println("5. 전체목록");
        System.out.println("6. 거래내역");
        System.out.println("q. 종료");
        System.out.println("======================");
    }

    public void homeError(String message) {
        System.out.println("======<< HOME ERROR >>======");
        System.out.println("오류 내용[ " + message + "]");
        System.out.println("============================");
        System.out.println();
    }
}
