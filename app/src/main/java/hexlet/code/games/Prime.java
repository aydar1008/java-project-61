package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void playGame() {
        var gameName = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < questions.length; i++) {
            var num = Engine.RANDOM.nextInt(MAX_RANDOM_NUMBER);
            questions[i] = String.valueOf(num);

            boolean isPrime = true;
            if (num <= 1) {
                isPrime = false;
            } else if (num == 2) {
                isPrime = true;
            } else if (num % 2 == 0) {
                isPrime = false;
            } else {
                for (int j = 2; j < num; j++) {
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
