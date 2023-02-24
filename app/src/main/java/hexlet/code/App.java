package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.print("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n");
        System.out.println("5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        String gameNumber = scanner.next();

        if (gameNumber.equals("1")) {
            System.out.println("Welcome to the Brain Games!");
            Cli.askName();
        }
        if (gameNumber.equals("2")) {
            Even.parityCheck();
        }
        if (gameNumber.equals("3")) {
            Calc.calculating();
        }
        if (gameNumber.equals("4")) {
            GCD.commonDivisor();
        }
        if (gameNumber.equals("5")) {
            Progression.arithmeticProgression();
        }
        if (gameNumber.equals("6")) {
            Prime.primeNumber();
        }
        scanner.close();
    }
}
