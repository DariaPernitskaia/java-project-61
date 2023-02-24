package hexlet.code.games;

import hexlet.code.Engine;
public class Even {
    public static final int MAX = 1000;
    public static final String GAMERULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void parityCheck() {

        Engine.welcome();

        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < questionsAndAnswers.length; i++) {
            int randomNumber = (int) (Math.random() * MAX);

            String question = "Question: " + randomNumber;
            String answer = randomNumber % 2 == 0 ? "yes" : "no";
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }
        Engine.game(GAMERULES, questionsAndAnswers);
    }
}


