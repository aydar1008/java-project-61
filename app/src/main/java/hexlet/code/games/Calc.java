package hexlet.code.games;

import hexlet.code.Engine;


public class Calc {
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void playGame() {
        var gameName = "What is the result of the expression?";
        var operators = "+-*";

        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < questions.length; i++) {
            var num1 = Engine.RANDOM.nextInt(MAX_RANDOM_NUMBER);
            var num2 = Engine.RANDOM.nextInt(MAX_RANDOM_NUMBER);
            var opIndex = Engine.RANDOM.nextInt(operators.length());
            var operator = operators.charAt(opIndex);
            questions[i] = num1 + " " + operator + " " + num2;
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
