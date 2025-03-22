package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int target = 3;
    private static final Scanner scanner = new Scanner(System.in);


    public static void runGame(String gameName, String question, String correct ) {
        Cli.greet();
        System.out.println(gameName);

        int sum = 0;

        while (sum < target) {
            System.out.println("Question: " + question);
            var answer = scanner.next();
            if (correct.equals(answer)) {
                System.out.println("Correct!");
                sum++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correct
                        + "'. \nLet's try again, " + Cli.name);
                break;
            }

            if (sum == target) {
                System.out.println("Congratulation, " + Cli.name + "!");
            }
        }
        scanner.close();
    }
}