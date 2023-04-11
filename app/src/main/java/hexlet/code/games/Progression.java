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
            int step = Utils.generateNumber(MIN, MAXSTEP + MIN);
            int hiddenIndex = Utils.generateNumber(MIN, MAXSTEP + MIN);

            String[] numbers = makeProgression(firstRandomNumber, step, LENGTH);
            String answer = numbers[hiddenIndex];

            numbers[hiddenIndex] = "..";
            String question = String.join(" ", numbers);

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }
        Engine.makeGame(GAMERULES, questionsAndAnswers);
    }
}

