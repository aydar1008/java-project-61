package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    private static final Random random = new Random();

    public static void game() {
        var maxNum = 100;
        var gameName = "Find the greatest common divisor of given numbers.";

        String[] questions = new String[3];
        String[] answers = new String[3];
        for (int i = 0; i < questions.length; i++) {
            int num1 = random.nextInt(maxNum);
            int num2 = random.nextInt(maxNum);
            questions[i] = num1 + " " + num2;
            answers[i] = String.valueOf(num1 > num2 ? num1 / num2 : num2 / num1);
        }
        Engine.runGame(gameName, questions, answers);
    }
}
