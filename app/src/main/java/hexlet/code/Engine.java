package hexlet.code;

import java.security.SecureRandom;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static final SecureRandom RANDOM = new SecureRandom();
    public static final Scanner scanner = new Scanner(System.in);

    public static void runGame(String gameName, String[] questions, String[] answers) {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.println("May I have your name?");
        var name = scanner.next();
        System.out.println("Hello, " + name + "!");

        System.out.println(gameName);

        int sum = 0;
        var i = 0;

        while (sum < ROUNDS) {
            System.out.println("Question: " + questions[i]);
            var answer = scanner.next();
            if (answers[i].equals(answer)) {
                System.out.println("Correct!");
                sum++;
                i++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + answers[i]
                        + "'. \nLet's try again, " + name + "!");
                break;
            }
        }
        if (sum == ROUNDS) {
            System.out.println("Congratulations, " + name + "!");
        }
        scanner.close();
    }
}
