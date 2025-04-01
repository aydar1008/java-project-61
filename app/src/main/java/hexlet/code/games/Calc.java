package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;


public class Calc {
    private static final SecureRandom RANDOM = new SecureRandom();

    public static void playGame() {
        int maxRandomNumber = 10;
        int rounds = 3;
        var gameName = "What is the result of the expression?";
        var operators = "+-*";

        String[] questions = new String[rounds];
        String[] answers = new String[rounds];
        for (int i = 0; i < questions.length; i++) {
            var num1 = RANDOM.nextInt(maxRandomNumber);
            var num2 = RANDOM.nextInt(maxRandomNumber);
            var opIndex = RANDOM.nextInt(operators.length());
            var operator = operators.charAt(opIndex);
            questions[i] = "" + num1 + operator + num2;
            switch (operator) {
                case '+':
                    answers[i] = num1 + num2 + "";
                    break;
                case '-':
                    answers[i] = num1 - num2 + "";
                    break;
                case '*':
                    answers[i] = num1 * num2 + "";
                    break;
                default:
            }
        }
        Engine.runGame(gameName, questions, answers);
    }
}
