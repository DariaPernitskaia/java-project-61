package hexlet.code.games;

import hexlet.code.Engine;
public class Even {
    public static int max = 1000;

    public static String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void parityCheck() {

        Engine.welcome();

        String[][] questionsAndAnswers = new String[3][2];

        for (var i = 0; i < questionsAndAnswers.length; i++) {
            int randomNumber = (int) (Math.random() * max);

            String question = "Question: " + randomNumber;
            String answer = randomNumber % 2 == 0 ? "yes" : "no";
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }
        Engine.game(gameRules, questionsAndAnswers);
    }
}


