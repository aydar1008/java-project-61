package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number end press Enter.
                1. Greet
                2. Even
                3. Exit""");
        Scanner scChoice = new Scanner(System.in);
        var choice = scChoice.next();
        System.out.println("You choice: " + choice);

        if (choice.equals("1")) {
            Cli.greet();
        } else if (choice.equals("2")) {
            Cli.greet();
            Even.game();
        }
    }
}
