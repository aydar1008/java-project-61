package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number end press Enter.
                1. Greet
                2. Even
                3. Calc
                4. Exit""");
        Scanner scChoice = new Scanner(System.in);
        var choice = scChoice.next();
        System.out.println("You choice: " + choice);

        switch (choice) {
            case "1":
                Cli.greet();
            case "2":
                Even.game();
            case "3":
                Calc.game();
        }
    }
}
