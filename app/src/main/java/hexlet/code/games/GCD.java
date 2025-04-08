package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void playGame() {
        var gameName = "Find the greatest common divisor of given numbers.";

        String[][] qaData = new String[Engine.ROUNDS][2];
        for (String[] qa : qaData) {
            int num1 = Utils.getRandomNumber(MAX_RANDOM_NUMBER);
            int num2 = Utils.getRandomNumber(MAX_RANDOM_NUMBER);
            var question = num1 + " " + num2;
            while (num2 != 0) {
                int temp = num2;
                num2 = num1 % num2;
                num1 = temp;
            }
            var answer = String.valueOf(num1);

            qa[0] = question;
            qa[1] = answer;
        }
        Engine.runGame(gameName, qaData);
    }
}
