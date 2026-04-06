package staticsingleton;

class GameConfig {
    static final int Max_LEVEL = 99;
    static final int MIN_LEVEL = 1;
    static final double EXP_RATE = 1.5;

    private GameConfig() {}

    static boolean isValidLevel(int level) {
        return level >=MIN_LEVEL && level <= Max_LEVEL;
    }
}

public class Ex05 {
}
