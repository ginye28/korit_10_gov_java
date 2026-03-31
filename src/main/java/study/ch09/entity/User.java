package study.ch09.entity;

public class User {
    private String username; //사용자이름-아이디
    private String password; //비밀번호
    private String name; //회원명

    public User(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public User(String username, String password) {
        this(username, password, "공백");
    }

    public User(String username) {
        this(username, "1234", "공백");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name.substring(0, name.length() - 1);
    }

    public void setName(String name) {
        this.name = name + "님";
    }
}
