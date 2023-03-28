package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generate;

public class Even {
    public static final String GAMERULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void parityCheck() {

        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < questionsAndAnswers.length; i++) {
            int[] randomNumbers = Generate.randomNumbers();
            int firstRandomNumber = randomNumbers[0];

            String question = "Question: " + firstRandomNumber;
            String answer = firstRandomNumber % 2 == 0 ? "yes" : "no";
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }
        Engine.game(GAMERULES, questionsAndAnswers);
    }
}


