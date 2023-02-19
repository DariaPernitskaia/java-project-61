package hexlet.code;

import java.util.Scanner;

public class Even {
    public static int max = 1000;
    public static void parityCheck() {

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Scanner scanner = new Scanner(System.in);

        var correctAnswers = 0;

        while (correctAnswers < 3) {
            int randomNumber = (int) (Math.random() * max);
            char ch = '\'';


            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = scanner.next().toLowerCase();
            if (randomNumber % 2 == 0 && answer.equals("yes") || randomNumber % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                if (!answer.equals("no") && randomNumber % 2 != 0) {
                    System.out.println(ch + answer + ch  + " is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + Greeting.userName + "!");
                    break;
                }
                System.out.println(ch + answer + ch + " is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Greeting.userName + "!");
                break;

            }
            if (correctAnswers == 3) {
                System.out.println("Congratulation, " + Greeting.userName + "!");
            }
        }
    }
}


