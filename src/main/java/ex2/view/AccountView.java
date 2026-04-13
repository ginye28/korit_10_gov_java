package ex2.view;

import ex2.router.RouterPath;
import ex2.router.Routes;
import ex2.util.Input;

public class AccountView implements View {

    @Override
    public void render() {
        accountMenu();
        String cmd = Input.nextLine();
        if ("b".equals(cmd)) {
            RouterPath.current = Routes.HOME.name(); //name은 HOME을 문자열로 가지고 옴 (toString)
            return;
        }
    }

    private void accountMenu() {
        System.out.println("======<< ACCOUNT >>======");
        System.out.println("1. 계좌생성");
        System.out.println("b. 뒤로가기");
        System.out.println("======================");
        System.out.println();
    }
}
