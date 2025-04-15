package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {
    private static final int MAX_RANDOM_NUMBER = 100;
    public static final String RULES = "What is the result of the expression?";

    public static void playGame() {
        var operators = "+-*";

        String[][] qaData = new String[Engine.ROUNDS][2];
        for (String[] qa : qaData) {
            var num1 = Utils.getRandomNumber(MAX_RANDOM_NUMBER);
            var num2 = Utils.getRandomNumber(MAX_RANDOM_NUMBER);
            var operatorIndex = Utils.getRandomNumber(operators.length());
            var operator = operators.charAt(operatorIndex);
            var question = num1 + " " + operator + " " + num2;
            var answer = String.valueOf(calculate(num1, num2, operator));

            qa[0] = question;
            qa[1] = answer;
        }
        Engine.runGame(RULES, qaData);
    }

    public static int calculate(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return  a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            default:
                throw new RuntimeException("Unexpected operator");
        }
    }
}
