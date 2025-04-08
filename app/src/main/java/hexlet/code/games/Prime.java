package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void playGame() {
        var gameName = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] qaData = new String[Engine.ROUNDS][2];
        for (String[] qa : qaData) {
            var num = Utils.getRandomNumber(MAX_RANDOM_NUMBER);
            var question = String.valueOf(num);

            boolean isPrime = true;
            if (num <= 1) {
                isPrime = false;
            } else if (num == 2) {
                isPrime = true;
            } else if (num % 2 == 0) {
                isPrime = false;
            } else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            var answer = isPrime ? "yes" : "no";

            qa[0] = question;
            qa[1] = answer;
        }
        Engine.runGame(gameName, qaData);
    }
}
