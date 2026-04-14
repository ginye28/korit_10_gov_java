package ex3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDto<T> {
    private int status;     //성공 여부 숫자(ex. 100, 200, 400)
    private T data;     //결과 데이터 객체
}