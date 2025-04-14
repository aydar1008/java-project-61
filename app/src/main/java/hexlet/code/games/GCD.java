package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MAX_RANDOM_NUMBER = 100;
    public static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void playGame() {


        String[][] qaData = new String[Engine.ROUNDS][2];
        for (String[] qa : qaData) {
            int num1 = Utils.getRandomNumber(MAX_RANDOM_NUMBER);
            int num2 = Utils.getRandomNumber(MAX_RANDOM_NUMBER);
            var question = num1 + " " + num2;
            var answer = String.valueOf(gcd(num1, num2));

            qa[0] = question;
            qa[1] = answer;
        }
        Engine.runGame(RULES, qaData);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
