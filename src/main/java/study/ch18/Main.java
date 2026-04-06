package study.ch18;

import extend.Dog;
import study.ch17.User;

public class Main {
    public static void main(String[] args) {
        ErrorResponse er = new ErrorResponse(400, User.builder().build());

        User user = (User) er.getBody();            //아래랑 같은 내용
        System.out.println(user.getUsername());

        System.out.println(((User)er.getBody()).getUsername());     //object라서 다운캐스팅을 해야함

        SuccessResponse<User> sr = new SuccessResponse<>(200, User.builder().build());
        User user2 = sr.getBody();                      //제네릭
        System.out.println(user2.getUsername());        //다운캐스팅 X

        ErrorResponse.print(User.builder().username("test").password("1234").build());
        ErrorResponse.print(10);
        ErrorResponse.print("문자열 데이터");

        String result = ErrorResponse.print2(100, "반환 데이터");
        System.out.println(result);

        SuccessResponse<String> sr2 = new SuccessResponse<>(200, "성공");
        SuccessResponse<Integer> sr3 = new SuccessResponse<>(200, 100000);      //int X
        Integer i = sr3.getBody();
        SuccessResponse<Double> sr4 = new SuccessResponse<>(200, 100000.0);
        SuccessResponse<Character> sr5 = new SuccessResponse<>(200, 'a');
        SuccessResponse<Boolean> sr6 = new SuccessResponse<>(200, true);
    }
}
