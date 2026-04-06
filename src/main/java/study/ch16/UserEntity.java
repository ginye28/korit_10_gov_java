package study.ch16;

import lombok.*;

//class UserBuilder {
//    private String username;
//    private String password;
//    private String name;
//    private String email;
//
//    public  UserEntity build() {
//        return  new UserEntity(username, password, name, email);
//    }
//
//    //builder의 인스턴스 매서드
//    public UserBuilder username(String username) {
//        this.username = username;
//        return this;
//    }
//
//    public UserBuilder password(String password) {
//        this.password = password;
//        return this;
//    }
//
//    public UserBuilder name(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public UserBuilder email(String email) {
//        this.email = email;
//        return this;
//    }
//}


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    private String username;
    private String password;
    private String name;
    private String email;

    static class UserBuilder {
        private String username;
        private String password;
        private String name;
        private String email;

        public  UserEntity build() {
            return  new UserEntity(username, password, name, email);
        }

        //builder의 인스턴스 매서드
        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }
    }

    public static UserBuilder builder() {
        return /*new UserEntity Static으로 안 넣어도 됨*/new UserBuilder();
    }
}
