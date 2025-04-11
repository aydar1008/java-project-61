package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void runGame(String rules, String[][] qaData) {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.println("May I have your name?");
        var name = SCANNER.next();
        System.out.println("Hello, " + name + "!");

        System.out.println(rules);

        for (String[] qa : qaData) {
            System.out.println("Question: " + qa[0]);
            var answer = SCANNER.next();
            if (!qa[1].equals(answer)) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + qa[1]
                        + "'. \nLet's try again, " + name + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + name + "!");

        SCANNER.close();
    }
}
