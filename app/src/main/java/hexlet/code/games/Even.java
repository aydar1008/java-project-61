package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    private static final Random random = new Random();

    public static void game() {
        var maxNum = 999;
        var gameName = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[] questions = new String[3];
        String[] answers = new String[3];
        for (int i = 0; i < questions.length; i++) {
            questions[i] = String.valueOf(random.nextInt(maxNum));
            answers[i] = Integer.parseInt(questions[i]) % 2 == 0 ? "yes" : "no";
        }
        Engine.runGame(gameName, questions, answers);
    }
}
