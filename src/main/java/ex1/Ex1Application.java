package ex1;

import ex1.util.InputUtil;
import ex1.view.MainView;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
//
public class Ex1Application {
    public static void main(String[] args) throws IOException {
//        Map<String, List<Long>> resultMap
        List<Boolean> b = new ArrayList<>();
//
        for (int i = 0; i < 100; i++) {
            Scanner sc = new Scanner(new StringReader("100"));      //키보드 입력을 받기 위한 스캐너 객체 생성
            long t1 = System.nanoTime();
            if (sc.hasNextInt()) sc.nextInt();
            long t2 = System.nanoTime();

            long t3 = System.nanoTime();
            InputUtil.nextInt();
            long t4 = System.nanoTime();

            b.add(t2-t1 > t4-t3);
        }
        System.out.println("scanner:" + b.stream().filter(bb -> bb).count());
        System.out.println("scanner:" + b.stream().filter(bb -> !bb).count());

        System.out.println("[ 학생관리 프로그램 실행 ]");
        boolean flag = true;

        //라인 한 줄 읽을때 Buffered 사용하는 게 더 나음
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/"));
//        String data = bufferedReader.readLine();
//        System.out.println("data: " + data);

//        while (flag) {      //true (if문) . flag (switch문)
//            MainView.getInstance().run();       //메인뷰에서 인스턴스에 있는 run을 가지고 옴
//            System.out.print("입력: ");           //ln을 빼고 같은 줄에서 작성
//            String cmd = scanner.nextLine();     // 입력한 줄을 문자열로 읽어와 cmd 변수에 저장
                        //bufferedReader.readLine(); 사용 가능

//            더 성능 좋음 buffer
//            List<Integer> ints = InputUtil.nextInts();
//            int cmd = InputUtil.nextInt();
//            String cmd = scanner.nextLine();  이 줄 지우고

//            if (cmd == 1) {
//
//            } else if (cmd == 2) {
//
//            } else if (cmd == 3) {
//                // 숫자와 cmd(작성)가 같으면 (문자열 비교 ==대신 equals)
//            } else if (cmd == 4) {
//
//            } else if (cmd == 5) {
//
//            } else if (cmd == 6) {
//                break;                              //루프 탈출
//            } else {
//                System.out.println("다시 입력하세요.");        //숫자 1~6외에 출력
//            }

//            if ("1".equals(cmd)) {
//
//            } else if ("2".equals(cmd)) {
//
//            } else if ("3".equals(cmd)) {
//                                                    // 숫자와 cmd(작성)가 같으면 (문자열 비교 ==대신 equals)
//            } else if ("4".equals(cmd)) {
//
//            } else if ("5".equals(cmd)) {
//
//            } else if ("6".equals(cmd)) {
//                break;                              //루프 탈출
//            } else {
//                System.out.println("다시 입력하세요.");        //숫자 1~6외에 출력
//            }
//
//            switch (cmd) {
//                case "1" :
//                    break;
//                case "2" :
//                    break;
//                case "3" :
//                    break;
//                case "4" :
//                    break;
//                case "5" :
//                    break;
//                case "6" :
//                    flag = false;
//                    break;          //continue
//                default:
//                    System.out.println("다시 입력하세요.");
//            }
//        }

        System.out.println("[ 학생관리 프로그램 종료 ]");
    }
}
