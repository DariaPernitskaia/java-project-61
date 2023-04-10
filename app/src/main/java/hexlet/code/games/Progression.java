package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final String GAMERULES = "What number is missing in the progression?";
    private static final int MAXSTEP = 10;
    private static final int LENGTH = 10;
    private static final int MAX = 100;
    private static final int MIN = 1;
    private static String[] makeProgression(int firstRandomNumber, int step, int length) {
        String[] numbers = new String[length];
        for (var j = 0; j < length; j++) {
            numbers[j] = Integer.toString(firstRandomNumber + j * step);
        }
        return numbers;
    }
    public static void playProgressionGame() {

        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < questionsAndAnswers.length; i++) {

            int firstRandomNumber = Utils.generateNumber(MIN, MAX);
            int step = (int) (Math.random() * MAXSTEP);
            int hiddenIndex = (int) (Math.random() * MAXSTEP);

            String[] numbers = makeProgression(firstRandomNumber, step, LENGTH);

            String[] hiddenNumbers = new String[LENGTH];
            for (var j = 0; j < LENGTH; j++) {
                if (j == hiddenIndex) {
                    hiddenNumbers[j] = "..";
                } else {
                    hiddenNumbers[j] = numbers[j];
                }
            }

            String question = String.join(" ", hiddenNumbers);
            String answer = numbers[hiddenIndex];

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }
        Engine.makeGame(GAMERULES, questionsAndAnswers);
    }
}

