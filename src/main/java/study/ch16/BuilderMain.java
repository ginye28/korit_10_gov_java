package study.ch16;

import lombok.Builder;

@Builder
class UserEntity2 {
    private String username;
    private String password;
}

public class BuilderMain {
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity("aaa", "1234", "진혜정", "aaa@gmail.com");
        UserEntity userEntity2 = new UserEntity("aaa", null, null, "aaa@gmail.com");
        UserEntity userEntity3 = new UserEntity();
        userEntity3.setUsername("bbb");
        UserEntity userEntity4 = UserEntity.builder()
                .username("ccc")
                .password("1111")
                .name("진혜정")
                .email("aaa@gmail.com")
                .build();
    }
}
