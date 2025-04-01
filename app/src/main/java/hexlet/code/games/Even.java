package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public class Even {
    private static final SecureRandom RANDOM = new SecureRandom();

    public static void playGame() {
        var maxRandomNumber = 999;
        var rounds = 3;
        var gameName = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[] questions = new String[rounds];
        String[] answers = new String[rounds];
        for (int i = 0; i < questions.length; i++) {
            questions[i] = String.valueOf(RANDOM.nextInt(maxRandomNumber));
            answers[i] = Integer.parseInt(questions[i]) % 2 == 0 ? "yes" : "no";
        }
        Engine.runGame(gameName, questions, answers);
    }
}
