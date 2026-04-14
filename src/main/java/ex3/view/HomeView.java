package ex3.view;

import ex3.controller.Controller;
import ex3.dto.ResponseDto;
import ex3.util.Input;
import ex3.Ex3Application;

import java.util.Map;

public class HomeView implements View {     //다른 View들과 간편한 구분
    public void render() {      //override
        homeMenu();     //사용자에게 메뉴를 보여줌
        String cmd = Input.nextLine();      //입력을 기다림
        ResponseDto<Map<String, Object>> response = Controller.homeController(cmd);
        //사용자가 입력한 값이랑 컨트롤러 값이랑 같은지 확인 후 그에 맞는 숫자값(100,400 등)을 받음
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
