package staticsingleton;

class AppConfig {
    private static AppConfig instance;
    private String appName;
    private String version;

    private AppConfig() {}

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public void setAppName(String name) {
        this.appName = name;
    }
    public String getAppName() {
        return appName;
    }
    public void setVersion(String v) {
        this.version = v;
    }

    public void printConfig() {
        System.out.println(appName + " v" + version);
    }
}

public class Ex11 {
}
