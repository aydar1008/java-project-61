package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {
    private static final int MIN_PROG_LENGTH = 5;
    private static final int MAX_PROG_LENGTH = 10;
    public static final int MAX_STEP = 10;
    private static final int MAX_RANDOM_NUMBER = 100;
    public static final String RULES = "What number is missing in the progression?";

    public static void playGame() {
        String[][] qaData = new String[Engine.ROUNDS][2];
        for (String[] qa : qaData) {
            var progLength = Utils.getRandomNumber(MIN_PROG_LENGTH, MAX_PROG_LENGTH);
            var step = Utils.getRandomNumber(1, MAX_STEP);
            var searched = Utils.getRandomNumber(0, progLength);
            String[] progression = getProgression(progLength, step);
            var answer = progression[searched];
            progression[searched] = "..";
            var questions = (Arrays.toString(progression))
                    .substring(1, Arrays.toString(progression).length() - 1)
                    .replace(",", "");

            qa[0] = questions;
            qa[1] = answer;
        }
        Engine.runGame(RULES, qaData);
    }

    public static String[] getProgression(int length, int step) {
        String[] progression = new String[length];
        progression[0] = "" + Utils.getRandomNumber(0, MAX_RANDOM_NUMBER);
        for (int j = 1; j < progression.length; j++) {
            progression[j] = Integer.parseInt(progression[j - 1]) + step + "";
        }
        return progression;
    }
}
