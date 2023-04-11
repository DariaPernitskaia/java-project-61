package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.Calculation;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String gameNumber = scanner.next();

        switch (gameNumber) {
            case "1":
                System.out.println("Welcome to the Brain Games!");
                Cli.askName();
                break;
            case "2":
                Even.playParityNumberGame();
                break;
            case "3":
                Calculation.playCalcGame();
                break;
            case "4":
                GCD.playCommonDivisorGame();
                break;
            case "5":
                Progression.playProgressionGame();
                break;
            case "6":
                Prime.playPrimeNumberGame();
                break;
            default:
                throw new RuntimeException("Unknown input: " + gameNumber);
        }
        scanner.close();
    }
}
