package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String GAMERULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String parityCheckCalculation(int firstRandomNumber) {
        return firstRandomNumber % 2 == 0 ? "yes" : "no";
    }
    public static void parityCheck() {

        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < questionsAndAnswers.length; i++) {
            int[] randomNumbers = Utils.randomNumbers();
            int firstRandomNumber = randomNumbers[0];

            String question = Integer.toString(firstRandomNumber);
            String answer = parityCheckCalculation(firstRandomNumber);
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }
        Engine.game(GAMERULES, questionsAndAnswers, "Question: ");
    }
}


