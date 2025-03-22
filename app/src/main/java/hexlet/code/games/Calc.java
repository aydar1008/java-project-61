package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void game() {
        Random randomNumber = new Random();
        var maxNum = 50;
        var gameName = "What is the result of the expression?";
        var operators = "+-*";
        var num1 = randomNumber.nextInt(maxNum);
        var num2 = randomNumber.nextInt(maxNum);
        var opIndex = randomNumber.nextInt(operators.length());
        var operator = operators.charAt(opIndex);
        var question = "" + num1 + operator + num2;
        int correct = 0;

        switch (operator) {
            case '+':
                correct = num1 + num2;
                break;
            case '-':
                correct = num1 - num2;
                break;
            case '*':
                correct = num1 * num2;
                break;
            default:
        }
        Engine.runGame(gameName, question, String.valueOf(correct));

    }
}

