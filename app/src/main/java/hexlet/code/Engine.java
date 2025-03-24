package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int target = 3;
    private static final Scanner scanner = new Scanner(System.in);


    public static void runGame(String gameName, String[] questions, String[] answers ) {
        Cli.greet();
        System.out.println(gameName);

        int sum = 0;
        var i = 0;

        while (sum < target) {
            System.out.println("Question: " + questions[i]);
            var answer = scanner.next();
            if (answers[i].equals(answer)) {
                System.out.println("Correct!");
                sum++;
                i++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + answers[i]
                        + "'. \nLet's try again, " + Cli.name);
                break;
            }
        }
        if (sum == target) {
            System.out.println("Congratulation, " + Cli.name + "!");
        }
        scanner.close();
    }
}