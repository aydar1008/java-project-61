package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {
    private static final int MIN_PROG_LENGTH = 5;
    private static final int MAX_PROG_LENGTH = 10;
    public static final int MAX_STEP = 10;
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void playGame() {
        var gameName = "What number is missing in the progression?";

        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < questions.length; i++) {
            var progLength = Engine.RANDOM.nextInt(MIN_PROG_LENGTH, MAX_PROG_LENGTH);
            var step = Engine.RANDOM.nextInt(1, MAX_STEP);
            var searched = Engine.RANDOM.nextInt(0, progLength);

            String[] progression = new String[progLength];
            progression[0] = "" + Engine.RANDOM.nextInt(0, MAX_RANDOM_NUMBER);
            for (int j = 1; j < progression.length; j++) {
                progression[j] = Integer.parseInt(progression[j - 1]) + step + "";
            }

            answers[i] = progression[searched];
            progression[searched] = "..";
            questions[i] = (Arrays.toString(progression))
                    .substring(1, Arrays.toString(progression).length() - 1)
                    .replaceAll(",", "");
        }
        Engine.runGame(gameName, questions, answers);
    }
}
