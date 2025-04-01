package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void runGame(String gameName, String[] questions, String[] answers) {
        Cli.greet();
        System.out.println(gameName);

        Scanner scanner = new Scanner(System.in);
        int rounds = 3;
        int sum = 0;
        var i = 0;

        while (sum < rounds) {
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
        if (sum == rounds) {
            System.out.println("Congratulation, " + Cli.name + "!");
        }
        scanner.close();
    }
}
