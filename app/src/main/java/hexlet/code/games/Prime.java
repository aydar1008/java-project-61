package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public class Prime {
    private static final SecureRandom RANDOM = new SecureRandom();

    public static void playGame() {
        int maxRandomNumber = 100;
        var rounds = 3;
        var gameName = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[] questions = new String[rounds];
        String[] answers = new String[rounds];
        for (int i = 0; i < questions.length; i++) {
            var num = RANDOM.nextInt(maxRandomNumber);
            questions[i] = String.valueOf(num);

            boolean isPrime = true;
            if (num <= 1) {
                isPrime = false;
            } else if (num == 2) {
                isPrime = true;
            } else if (num % 2 == 0) {
                isPrime = false;
            } else {
                for (int j = 3; j <= Math.sqrt(num); j += 2) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            answers[i] = isPrime ? "yes" : "no";
        }
        Engine.runGame(gameName, questions, answers);
    }
}
