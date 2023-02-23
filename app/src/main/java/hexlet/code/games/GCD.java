package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    public static int max = 100;

    public static String gameRules = "Find the greatest common divisor of given numbers.";

    public static void commonDivisor() {

        Engine.welcome();

        String[][] questionsAndAnswers = new String[3][2];

        for (var i = 0; i < questionsAndAnswers.length; i++) {
            int firstRandomNumber = (int) (Math.random() * max);
            int secondRandomNumber = (int) (Math.random() * max);

            String question = "Question: " + firstRandomNumber + " " + secondRandomNumber;
            int answer = 1;
            int j;
            for (j = Math.min(firstRandomNumber, secondRandomNumber); j > 1; j--) {
                if (firstRandomNumber % j == 0 && secondRandomNumber % j == 0) {
                    answer = j;
                    break;
                }
            }
            if (firstRandomNumber == 0 || secondRandomNumber == 0) {
                answer = Math.max(firstRandomNumber, secondRandomNumber);
            }
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = Integer.toString(answer);
        }
        Engine.game(gameRules, questionsAndAnswers);
    }
}

