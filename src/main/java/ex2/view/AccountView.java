package ex2.view;

import ex2.Ex2Application;
import ex2.controller.Controller;
import ex2.dto.ResponseDto;
import ex2.entity.Account;
import ex2.router.RouterPath;
import ex2.router.Routes;
import ex2.util.Input;
import ex2.view.component.Table;

import java.lang.reflect.Field;
import java.util.*;

public class AccountView implements View {

    private Account currentAccount;

    @Override
    public void render() {
        if (currentAccount == null) {
            ResponseDto<?> accountListResponse = Controller.getAccountListController();
            if (accountListResponse.getStatus() == 400) {
                accountError(accountListResponse.getData().toString());
                RouterPath.current = Routes.HOME.name();
                return;
            }
            selectAccount((List<Account>) accountListResponse.getData());
            System.out.println("======<< 계좌 ID선택 >>======");
            int selectedId = Integer.parseInt(Input.nextLine());
            ResponseDto<?> response = Controller.selectAccountController(selectedId);
            if (response.getStatus() == 400) {
                accountError(response.getData().toString());
                return;
            }
            currentAccount = (Account) response.getData();
        }

        accountMenu();
        String cmd = Input.nextLine();
        ResponseDto<?> menuResponse = Controller.accountMenuController(cmd);
        if (menuResponse.getStatus() == 100) {
            RouterPath.current = Routes.HOME.name();
            return;
        }
        if (menuResponse.getStatus() == 400) {
            accountError(menuResponse.getData().toString());
        }
    }

    public void accountError(String message) {
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

    private void selectAccount(List<Account> accountList) {
        Map<String, String> props = new HashMap<>();
        props.put("title","계좌 목록");

        List<List<Object>> rows =  accountList.stream().map(account -> {
            List<Object> fileds = new ArrayList<>();
            Field[] fieldArray = account.getClass().getDeclaredFields();

            for (Field field : fieldArray) {
                try {
                    field.setAccessible(true);  //리플렉션 private을 접근을 풀 수 있음
                    fileds.add(field.get(account));
                } catch (IllegalAccessException e) {}
            }
            return fileds;
        }).toList();
        
        props.put("body", new Table(List.of("ID", "AccountNo", "Owner", "Balance"), rows).getTable());
        basicLayout(props);
    }

    private void accountMenu() {
        Map<String, String> props = new HashMap<>();
        props.put("title", String.format("선택계좌: %s", currentAccount.getAccountNo()));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1. 거래내역조회\n");
        stringBuilder.append("2. 입금\n");
        stringBuilder.append("3. 출금\n");
        stringBuilder.append("b. 뒤로가기\n");
        props.put("body", stringBuilder.toString());
        basicLayout(props);
    }
}
