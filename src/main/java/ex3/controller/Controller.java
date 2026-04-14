package ex3.controller;

import ex3.dto.ResponseDto;

import java.util.HashMap;
import java.util.Map;

public class Controller {
    public static ResponseDto<Map<String, Object>> homeController(String selectedMenu) {
        ResponseDto<Map<String, Object>> responseDto = new ResponseDto<>(200, new HashMap<>());
        Map<String, Object> errorMap = null;
        try {
            if ("1".equals(selectedMenu)) {

            } else if ("2".equals(selectedMenu)) {

            } else if ("3".equals(selectedMenu)) {

            } else if ("4".equals(selectedMenu)) {

            } else if ("5".equals(selectedMenu)) {

            } else if ("6".equals(selectedMenu)) {
                responseDto.setStatus(100);
            } else {
                throw new RuntimeException("해당 입력 값은 유효하지 않습니다. 다시 입력하세요.");
            }
        } catch (RuntimeException e) {
            errorMap = Map.of(
                    "message", e.getMessage()
            );
            responseDto = new ResponseDto<>(400, errorMap);
        }
        return responseDto;
    }
}
