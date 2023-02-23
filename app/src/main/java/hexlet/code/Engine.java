package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static String userName = "";

    public static void welcome() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static void game(String gameRules, String[][] questionsAndAnswers) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(gameRules);

        var correctAnswers = 0;
        char ch = '\'';
        var i = 0;
        while (correctAnswers < 3) {
            String question = questionsAndAnswers[i][0];
            System.out.println(question);
            System.out.print("Your answer: ");
            String answer = scanner.next().toLowerCase();
            if (answer.equals(questionsAndAnswers[i][1])) {
                System.out.println("Correct!");
                i++;
                correctAnswers++;
            } else {
                System.out.print(ch + answer + ch + " is wrong answer ;(. ");
                System.out.println("Correct answer was " + ch + questionsAndAnswers[i][1] + ch + ".");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
            if (correctAnswers == 3) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
