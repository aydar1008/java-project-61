package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final int MAX_RANDOM_NUMBER = 999;

    public static void playGame() {
        var gameName = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < questions.length; i++) {
            questions[i] = String.valueOf(Engine.RANDOM.nextInt(MAX_RANDOM_NUMBER));
            answers[i] = Integer.parseInt(questions[i]) % 2 == 0 ? "yes" : "no";
        }
        Engine.runGame(gameName, questions, answers);
    }
}
