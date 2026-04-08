package study.ch21.Ex;

import java.io.FileReader;
import java.io.IOException;

public class Ex07 {

    /*public static String*/
    static void readFile(String path) throws IOException {  //IOE는 없는 파일이나 접근 못하는 파일에 접근하는 경우
        FileReader fileReader = new FileReader(path);       //파일리더 경로 초기화
        fileReader.close();                                 //파일리더 닫기
        // FileReader 생성
    }

    public static void main(String[] args) {
        // main에서 호출 시 try-catch

        try {
            readFile("text1.txt");         //리드파일 txet1.txt
        } catch (IOException e) {          //파일에 접근하지 못 하는 경우
            System.out.println("파일 읽기 실패: " + e.getMessage());      //sout
        }
    }
}
