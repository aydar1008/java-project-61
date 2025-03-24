package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void game() {
        Random random = new Random();
        var maxNum = 50;
        var gameName = "What is the result of the expression?";
        var operators = "+-*";

        String[] questions = new String[3];
        String[] answers = new String[3];
        for (int i = 0; i < questions.length; i++) {
            var num1 = random.nextInt(maxNum);
            var num2 = random.nextInt(maxNum);
            var opIndex = random.nextInt(operators.length());
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