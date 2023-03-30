package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Arrays;
public class Progression {
    public static final int MAXSTEP = 10;
    public static final int LENGTH = 10;
    public static final String GAMERULES = "What number is missing in the progression?";
    private static int[] arithmeticProgressionCalculation(int firstRandomNumber, int step, int length) {
        int[] numbers = new int[length];
        for (var j = 0; j < length; j++) {
            numbers[j] = firstRandomNumber + j * step;
        }
        return numbers;
    }
    public static void arithmeticProgression() {

        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < questionsAndAnswers.length; i++) {

            int[] randomNumbers = Utils.randomNumbers();
            int firstRandomNumber = randomNumbers[0];
            int step = (int) (Math.random() * MAXSTEP);
            int hiddenIndex = (int) (Math.random() * MAXSTEP);

            int[] numbers = arithmeticProgressionCalculation(firstRandomNumber, step, LENGTH);

            String[] hiddenNumbers = new String[LENGTH];
            for (var j = 0; j < LENGTH; j++) {
                if (j == hiddenIndex) {
                    hiddenNumbers[j] = "..";
                } else {
                    hiddenNumbers[j] = Integer.toString(numbers[j]);
                }
            }

            String question = Arrays.toString(hiddenNumbers)
                    .replace("[", "").replace("]", "")
                    .replace(",", "");
            String answer = Integer.toString(numbers[hiddenIndex]);

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }
        Engine.game(GAMERULES, questionsAndAnswers, "Question: ");
    }
}

