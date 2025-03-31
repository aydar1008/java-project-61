package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public class Prime {
    private static final SecureRandom random = new SecureRandom();

    public static void game() {
        var maxNum = 100;
        var gameName = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[] questions = new String[3];
        String[] answers = new String[3];
        for (int i = 0; i < questions.length; i++) {
            var num = random.nextInt(maxNum);
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
