package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MAX_RANDOM_NUMBER = 999;

    public static void playGame() {
        var gameName = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] qaData = new String[Engine.ROUNDS][2];
        for (String [] qa : qaData) {
            var question = String.valueOf(Utils.getRandomNumber(MAX_RANDOM_NUMBER));
            var answer = Integer.parseInt(question) % 2 == 0 ? "yes" : "no";

            qa[0] = question;
            qa[1] = answer;
        }
        Engine.runGame(gameName, qaData);
    }
}
