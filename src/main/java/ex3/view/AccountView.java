package ex3.view;

import ex3.router.RouterPath;
import ex3.util.Input;
import ex3.router.Routes;

public class AccountView implements View {
    @Override
    public void render() {
        accountMenu();
        String cmd = Input.nextLine();
        if ("b".equals(cmd)) {
            RouterPath.current = Routes.HOME.name();
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
