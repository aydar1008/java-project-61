package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void game() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random randomNumber = new Random();
        Scanner scanner = new Scanner(System.in);
        var sum = 0;

        while (sum < 3) {
            var number = randomNumber.nextInt(999);
            System.out.println("Question: " + number);
            var answer = scanner.next();
            var correct = number % 2 == 0 ? "yes" : "no";

            if (answer.equals(correct)) {
                System.out.println("Correct!");
                sum += 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correct +
                        "'. \nLet's try again, " + Cli.name);
                break;
            }

            if (sum == 3) {
                System.out.println("Congratulation, " + Cli.name + "!");
            }
        }
        scanner.close();
    }
}