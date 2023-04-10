package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String GAMERULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX = 100;
    private static final int MIN = 1;
    private static boolean isParity(int firstRandomNumber) {
        return firstRandomNumber % 2 == 0;
    }
    public static void playParityNumberGame() {

        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < questionsAndAnswers.length; i++) {
            int firstRandomNumber = Utils.generateNumber(MIN, MAX);

            String question = Integer.toString(firstRandomNumber);
            boolean parityNumber = isParity(firstRandomNumber);
            String answer = parityNumber ? "yes" : "no";


            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }
        Engine.makeGame(GAMERULES, questionsAndAnswers);
    }
}


