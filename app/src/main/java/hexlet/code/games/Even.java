package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MAX_RANDOM_NUMBER = 999;
    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void playGame() {
        String[][] qaData = new String[Engine.ROUNDS][2];
        for (String[] qa : qaData) {
            var randomNumber = Utils.getRandomNumber(MAX_RANDOM_NUMBER);
            var question = String.valueOf(randomNumber);
            var answer = randomNumber % 2 == 0 ? "yes" : "no";

            qa[0] = question;
            qa[1] = answer;
        }
        Engine.runGame(RULES, qaData);
    }
}
