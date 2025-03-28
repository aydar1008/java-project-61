package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number end press Enter.
                1. Greet
                2. Even
                3. Calc
                4. GCD
                5. Progression
                6. Prime
                7. Exit""");
        Scanner scChoice = new Scanner(System.in);
        var choice = scChoice.next();
        System.out.println("You choice: " + choice);

        switch (choice) {
            case "1":
                Cli.greet();
                break;
            case "2":
                Even.game();
                break;
            case "3":
                Calc.game();
                break;
            case "4":
                GCD.game();
                break;
            case "5":
                Progression.game();
                break;
            case "6":
                Prime.game();
                break;
            default:
        }
    }
}
