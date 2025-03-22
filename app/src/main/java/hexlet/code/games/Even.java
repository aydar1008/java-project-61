package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static void game() {
        Random randomNumber = new Random();
        var maxNum = 999;
        var gameName = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var question = randomNumber.nextInt(maxNum);
        var correct = question % 2 == 0 ? "yes" : "no";

        Engine.runGame(gameName, String.valueOf(question), correct);
    }
}
