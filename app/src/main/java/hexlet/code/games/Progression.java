package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;
import java.util.Arrays;

public class Progression {
    private static final SecureRandom random = new SecureRandom();

    public static void game() {
        var gameName = "What number is missing in the progression?";

        String[] questions = new String[3];
        String[] answers = new String[3];
        for (int i = 0; i < questions.length; i++) {
            var progLength = random.nextInt(5, 10);
            var step = random.nextInt(1, 10);
            var searched = random.nextInt(0, progLength);

            String[] progression = new String[progLength];
            progression[0] = "" + random.nextInt(0, 100);
            for (int j = 1; j < progression.length; j++) {
                progression[j] = Integer.parseInt(progression[j - 1]) + step + "";
            }

            answers[i] = progression[searched];
            progression[searched] = "..";
            questions[i] = (Arrays.toString(progression)).substring(1, Arrays.toString(progression).length() - 1);
        }
        Engine.runGame(gameName, questions, answers);
    }
}
