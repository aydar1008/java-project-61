package hexlet.code;

import java.security.SecureRandom;

public class Utils {
    public static final SecureRandom RANDOM = new SecureRandom();

    public static int getRandomNumber(int min, int max) {
        return RANDOM.nextInt(max - min) + min;
    }

    public static int getRandomNumber(int max) {
        return RANDOM.nextInt(1, max);
    }
}
