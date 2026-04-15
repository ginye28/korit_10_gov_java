package ex2.view;

import ex2.Ex2Application;
import ex2.controller.Controller;
import ex2.dto.ResponseDto;
import ex2.util.Input;

import java.util.HashMap;
import java.util.Map;

public class HomeView implements View{     //다른 View들과 간편한 구분

    @Override
    public void render() {
        homeMenu();     //사용자에게 메뉴를 보여줌
        String cmd = Input.nextLine(); //static       //입력을 기다림
        ResponseDto<Map<String, Object>> response = Controller.homeController(cmd);
        //사용자가 입력한 값이랑 컨트롤러 값이랑 같은지 확인 후 그에 맞는 숫자값(100,400 등)을 받음

        if (response.getStatus() == 100) {  //100이면 종료
            Ex2Application.running = false;
            return;
        }
        if (response.getStatus() != 200) {  //200이 아니면 홈에러
            homeError(response.getData().get("message").toString());
            return;
        }
    }
    //1. 계좌 생성
    //2. 계좌 조회   ->   1. 선택  2. 거래내역  3. 입금  4. 출금  b.뒤로가기

    private void homeMenu() {
        Map<String, String> props = new HashMap<>();
        props.put("title", "홈 메뉴");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1. 계좌 생성\n");
        stringBuilder.append("2. 은행 서비스 이용하기\n");
        stringBuilder.append("q. 프로그램 종료\n");
        props.put("body", stringBuilder.toString());
        basicLayout(props);
    }

    public void homeError(String message) {
        Map<String, String> props = new HashMap<>();
        props.put("title", "문제 발견");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("오류 메세지");
        stringBuilder.append(message);
        stringBuilder.append("\n");
        props.put("body", stringBuilder.toString());
        basicLayout(props);
        Input.nextwait();
    }

}
