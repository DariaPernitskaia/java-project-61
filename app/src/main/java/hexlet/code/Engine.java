package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static void game(String gameRules, String[][] questionsAndAnswers, String makeQuestion) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!" + "\n" + gameRules);

        char ch = '\'';
        var i = 0;
        for (var correctAnswers = 0; correctAnswers < ROUNDS; correctAnswers++) {
            String question = makeQuestion + questionsAndAnswers[i][0];
            System.out.print(question + "\n" + "Your answer: ");
            String answer = scanner.next().toLowerCase();
            if (answer.equals(questionsAndAnswers[i][1])) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.print(ch + answer + ch + " is wrong answer ;(. ");
                System.out.println("Correct answer was " + ch + questionsAndAnswers[i][1] + ch + ".");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}

