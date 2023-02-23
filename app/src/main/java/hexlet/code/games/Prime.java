package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'";
    public static int max = 1000;
    public static void primeNumber() {
        Engine.welcome();

        String[][] questionsAndAnswers = new String[3][2];

        for (var i = 0; i < questionsAndAnswers.length; i++) {


            int firstRandomNumber = (int) (Math.random() * max);

            String question = "Question: " + firstRandomNumber;
            String answer;
            int count = 0;
            for (int j = 1; j <= firstRandomNumber; j++) {
                if (firstRandomNumber > 1 && firstRandomNumber % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                answer = "yes";
            } else {
                answer = "no";
            }
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }
        Engine.game(gameRules, questionsAndAnswers);
    }
}
