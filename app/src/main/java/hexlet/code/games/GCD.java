package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void playGame() {
        var gameName = "Find the greatest common divisor of given numbers.";

        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < questions.length; i++) {
            int num1 = Engine.RANDOM.nextInt(1, MAX_RANDOM_NUMBER);
            int num2 = Engine.RANDOM.nextInt(1, MAX_RANDOM_NUMBER);
            questions[i] = num1 + " " + num2;
            answers[i] = String.valueOf(num1 > num2 ? num1 / num2 : num2 / num1);
        }
        Engine.runGame(gameName, questions, answers);
    }
}
