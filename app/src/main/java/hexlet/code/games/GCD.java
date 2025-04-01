package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public class GCD {
    private static final SecureRandom RANDOM = new SecureRandom();

    public static void playGame() {
        var maxRandomNumber = 100;
        var rounds = 3;
        var gameName = "Find the greatest common divisor of given numbers.";

        String[] questions = new String[rounds];
        String[] answers = new String[rounds];
        for (int i = 0; i < questions.length; i++) {
            int num1 = RANDOM.nextInt(maxRandomNumber);
            int num2 = RANDOM.nextInt(maxRandomNumber);
            questions[i] = num1 + " " + num2;
            answers[i] = String.valueOf(num1 > num2 ? num1 / num2 : num2 / num1);
        }
        Engine.runGame(gameName, questions, answers);
    }
}
