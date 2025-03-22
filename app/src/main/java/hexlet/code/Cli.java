package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String name;

    public static void greet() {
        System.out.println("\nWelcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        name = scanner.next();
        System.out.println("Hello, " + name);
        //scanner.close();
    }
}
