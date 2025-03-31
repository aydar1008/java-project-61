package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static  String name;

    public static void greet() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println("Hello, " + name);
    }
}
