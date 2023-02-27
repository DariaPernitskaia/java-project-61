package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;
public class Progression {
    public static final int MAX = 100;
    public static final int MAXSTEP = 10;
    public static final int LENGTH = 10;
    public static final String GAMERULES = "What number is missing in the progression?";

    public static void arithmeticProgression() {

        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < questionsAndAnswers.length; i++) {

            int firstRandomNumber = (int) (Math.random() * MAX);
            int step = (int) (Math.random() * MAXSTEP);
            int hiddenIndex = (int) (Math.random() * MAXSTEP);

            int[] numbers = new int[LENGTH];
            for (var j = 0; j < LENGTH; j++) {
                numbers[j] = firstRandomNumber + j * step;
            }
            String[] hiddenNumbers = new String[LENGTH];
            for (var j = 0; j < LENGTH; j++) {
                if (j == hiddenIndex) {
                    hiddenNumbers[j] = "..";
                } else {
                    hiddenNumbers[j] = Integer.toString(numbers[j]);
                }
            }
            String question = "Question: " + Arrays.toString(hiddenNumbers)
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", "");
            String answer = Integer.toString(numbers[hiddenIndex]);

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }
        Engine.game(GAMERULES, questionsAndAnswers);
    }
}

