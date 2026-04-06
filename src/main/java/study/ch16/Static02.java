//package study.ch16;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Singular;
//
//
//import java.util.Arrays;
//import java.util.Random;
//import java.util.UUID;
//
//@Data
//@AllArgsConstructor
//class User {
//    private Long id;
//    private String username;
//    private String password;
//}
//
//class UserRepository {
//    private final User[] users;
//    private Long lastCreatedId = 0l;    //Long  type = 0l
//
//    public UserRepository() {
//        users = new User[100];
//    }
//
//    public boolean addUser(User user) {
//        boolean isSuccess = false;
//        for (int i = 0; i < users.length; i++) {
//            if (users[i] == null) {
//                user.setId(++lastCreatedId);
//                users[i] = user;
//                isSuccess = true;
//                break;
//            }
//        }
//        if(!isSuccess) {
//            System.out.println("사용자 추가 실패");
//            return isSuccess;       //false
//        }
//        System.out.println("사용자 추가 성공");
//        System.out.println("추가 사용자 정보: " + user);
//        return isSuccess;       //true
//    }
//
//    public User findByUsername(String username) {
//        for (User user : users) {
//            if (user == null) continue;
//            if (user.getUsername().equals(username)) {
//                return user;
//            }
//        }
//        return null;
//    }
//
//    public void printUsers() {
//        System.out.println("사용자 전체 조회");
//        for (User user : users) {
//            System.out.println(user);
//        }
//    }
//}
//
//class UserService {
//    public int signup(String username, String password) {
//        //성공: 200, 실패 400(중복 아이디), 500(공간 부족)
//
//        UserRepository userRepository = new UserRepository();
//        User foundUser = userRepository.findByUsername(username);
//        if (foundUser != null) {
//            return 400;
//        }
//
//        User newUser = new User(0l, username, password);
//        boolean isSuccess = userRepository.addUser(newUser);
//        if(!isSuccess) {
//            return 500;
//        }
//
//        userRepository.printUsers();
//        return 200;
//    }
//}
//
//class UserController{
//    private UserService userService = new UserService();
//
//    public void postMapping(String username, String password) {
//
//        int Status = userService.singup(username, password);
//        switch (Status) {
//            case 200:
//                System.out.println("회원 등록 성공");
//                break;
//            case 400:
//                System.out.println("중복된 사용자 이름입니다.");
//                break;
//            case 500:
//                System.out.println("데이터를 더이상 추가할 수 없습니다.");
//                break;
//        }
//    }
//}
//
//public class Static02 {
//    public static void main(String[] args) {
//        String[] usernames = new String[500];
//        String[] passwords = new String[500];
//        for (int i = 0; i < 500; i++) {
//            Random random = new Random();
//            usernames[i] = "";
//            for (int j = 0; j < 10; j++) {
//                int r = random.nextInt(26) + 97;
//                usernames[i] += (char) r;
//            }
//            usernames[i] += "@gmail.com";
//            passwords[i] = UUID.randomUUID().toString().replaceAll("-", "");
//        }
//
//        System.out.println(Arrays.toString(usernames));
//        System.out.println(Arrays.toString(passwords));
//
//        UserController userController = new UserController();
//        for (int i = 0; i < 500; i++) {
//            userController.postMapping(usernames[i], passwords[i]);
//        }
//    }
//}
//왜 안 되는지

//
//package study.ch16;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//import java.util.Arrays;
//import java.util.Random;
//import java.util.UUID;
//
//@Data
//@AllArgsConstructor
//class User {
//    private Long id;
//    private String username;
//    private String password;
//}
//
//class UserRepository {
//    private final User[] users;
//    private Long lastCreatedId = 0l;
//
//    public UserRepository(User[] users) {
//        this.users = users;
//    }
//
////    public UserRepository() {
////        users = new User[100];
////    }
//
//    public boolean addUser(User user) {
//        boolean isSuccess = false;
//        for (int i = 0; i < users.length; i++) {
//            if (users[i] == null) {
//                user.setId(++lastCreatedId);
//                users[i] = user;
//                isSuccess = true;
//                break;
//            }
//        }
//        if (!isSuccess) {
//            System.out.println("사용자 추가 실패");
//            return isSuccess;
//        }
//        System.out.println("사용자 추가 성공");
//        System.out.println("추가된 사용자 정보: " + user);
//        return isSuccess;
//    }
//
//    public User findByUsername(String username) {
//        for (User user : users) {
//            if (user == null) continue;
//            if (user.getUsername().equals(username)) {
//                return user;
//            }
//        }
//        return null;
//    }
//
//    public void printUsers() {
//        System.out.println("사용자 전체 조회");
//        for (User user : users) {
//            System.out.println(user);
//        }
//    }
//}
//
//class UserService {
//    UserRepository userRepository = new UserRepository(new User[100]);  //Repository 수정으로 new User[100]
//
//    public UserService(UserRepository userRepository) {     //  추가 내용
//        this.userRepository = userRepository;               //  의존성 높아짐
//    }                                                       //  repository를 불러옴
//
//    public int signup(String username, String password) {
//        // 성공: 200, 실패: 400(중복 아이디), 500(공간부족)
//
//        User foundUser = userRepository.findByUsername(username);
//        if (foundUser != null) {
//            return 400;
//        }
//
//        User newUser = new User(0l, username, password);
//        boolean isSuccess = userRepository.addUser(newUser);
//        if (!isSuccess) {
//            return 500;
//        }
//
//        userRepository.printUsers();
//        return 200;
//    }
//}
//
//class UserController {
//    private UserService userService = new UserService(new UserRepository(new User[100]));
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    public void postMapping(String username, String password) {
//
//        int status = userService.signup(username, password);
//        switch (status) {
//            case 200:
//                System.out.println("회원 등록 성공");
//                break;
//            case 400:
//                System.out.println("중복된 사용자 이름입니다.");
//                break;
//            case 500:
//                System.out.println("데이터를 더이상 추가할 수 없습니다.");
//        }
//    }
//}
//
//public class Static02 {
//    public static void main(String[] args) {
//        String[] usernames = new String[500];
//        String[] passwords = new String[500];
//        for (int i = 0; i < 500; i++) {
//            Random random = new Random();
//            usernames[i] = "";
//            for (int j = 0; j < 10; j++) {
//                int r = random.nextInt(26) + 97;
//                usernames[i] += (char) r;
//            }
//            usernames[i] += "@gmail.com";
//            passwords[i] = UUID.randomUUID().toString().replaceAll("-", "");
//        }
//
//        System.out.println(Arrays.toString(usernames));
//        System.out.println(Arrays.toString(passwords));
//
//        User[] users = new User[100];
//        UserRepository userRepository = new UserRepository(users);
//        UserService userService = new UserService(userRepository);
//
//        UserController userController = new UserController(new UserService(new UserRepository(new User[100])));
//        for (int i = 0; i < 500; i++) {
//            userController.postMapping(usernames[i], passwords[i]);
//        }
//
//    }
//}

//controller부터가 아니라 배열부터 만들어짐


package study.ch16;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Random;
import java.util.UUID;

@Data
@AllArgsConstructor
class User {
    private Long id;
    private String username;
    private String password;
}

class UserRepository {
    private final User[] users;
    private Long lastCreatedId = 0l;

    public UserRepository(User[] users) {
        this.users = users;
    }

//    public UserRepository() {
//        users = new User[100];
//    }

    public boolean addUser(User user) {
        boolean isSuccess = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                user.setId(++lastCreatedId);
                users[i] = user;
                isSuccess = true;
                break;
            }
        }
        if (!isSuccess) {
            System.out.println("사용자 추가 실패");
            return isSuccess;
        }
        System.out.println("사용자 추가 성공");
        System.out.println("추가된 사용자 정보: " + user);
        return isSuccess;
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (user == null) continue;
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public void printUsers() {
        System.out.println("사용자 전체 조회");
        for (User user : users) {
            System.out.println(user);
        }
    }
}

class UserService {
    private UserRepository userRepository; /*= new UserRepository(new User[100])*/;  //Repository 수정으로 new User[100]

    public UserService(UserRepository userRepository) {     //  추가 내용
        this.userRepository = userRepository;               //  의존성 높아짐
    }                                                       //  repository를 불러옴

    public int signup(String username, String password) {
        // 성공: 200, 실패: 400(중복 아이디), 500(공간부족)

        User foundUser = userRepository.findByUsername(username);
        if (foundUser != null) {
            return 400;
        }

        User newUser = new User(0l, username, password);
        boolean isSuccess = userRepository.addUser(newUser);
        if (!isSuccess) {
            return 500;
        }

        userRepository.printUsers();
        return 200;
    }
}

class UserController {
    private UserService userService = new UserService(new UserRepository(new User[100]));

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void postMapping(String username, String password) {

        int status = userService.signup(username, password);
        switch (status) {
            case 200:
                System.out.println("회원 등록 성공");
                break;
            case 400:
                System.out.println("중복된 사용자 이름입니다.");
                break;
            case 500:
                System.out.println("데이터를 더이상 추가할 수 없습니다.");
        }
    }
}

public class Static02 {
    public static void main(String[] args) {
        String[] usernames = new String[500];
        String[] passwords = new String[500];
        for (int i = 0; i < 500; i++) {
            Random random = new Random();
            usernames[i] = "";
            for (int j = 0; j < 10; j++) {
                int r = random.nextInt(26) + 97;
                usernames[i] += (char) r;
            }
            usernames[i] += "@gmail.com";
            passwords[i] = UUID.randomUUID().toString().replaceAll("-", "");
        }

        System.out.println(Arrays.toString(usernames));
        System.out.println(Arrays.toString(passwords));

        User[] users = new User[100];
        UserRepository userRepository = new UserRepository(users);
        UserService userService = new UserService(userRepository);

        UserController userController = new UserController(new UserService(new UserRepository(new User[100])));
        for (int i = 0; i < 500; i++) {
            userController.postMapping(usernames[i], passwords[i]);
        }

    }
}