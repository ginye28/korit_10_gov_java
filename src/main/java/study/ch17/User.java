package study.ch17;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder    //all을 가지고 있음
//@NoArgsConstructor
//@AllArgsConstructor       No를 쓰는 경우 All을 적어줘야 함
public class User {
    private Long id;
    private String username;
    private String password;
}
