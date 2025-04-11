package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MAX_RANDOM_NUMBER = 100;
    public static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playGame() {
        String[][] qaData = new String[Engine.ROUNDS][2];
        for (String[] qa : qaData) {
            var num = Utils.getRandomNumber(MAX_RANDOM_NUMBER);
            var question = String.valueOf(num);
            var answer = isPrime(num) ? "yes" : "no";

            qa[0] = question;
            qa[1] = answer;
        }
        Engine.runGame(RULES, qaData);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else if (num == 2) {
            return true;
        } else if (num % 2 == 0) {
            return false;
        } else {
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
