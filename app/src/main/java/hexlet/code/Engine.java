package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static void makeGame(String gameRules, String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!" + "\n" + gameRules);

        char ch = '\'';
        var correctAnswers = 0;
        for (String[] questionAndAnswer : questionsAndAnswers) {
            String question = "Question: " + questionAndAnswer[0];
            System.out.print(question + "\n" + "Your answer: ");
            String answer = scanner.next().toLowerCase();
            if (answer.equals(questionAndAnswer[1])) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.print(ch + answer + ch + " is wrong answer ;(. ");
                System.out.println("Correct answer was " + ch + questionAndAnswer[1] + ch + ".");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            if (correctAnswers == ROUNDS) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}

