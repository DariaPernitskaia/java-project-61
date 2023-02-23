package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {

    public static int max = 100;
    public static int maxStep = 10;
    public static int length = 10;

    public static String gameRules = "What number is missing in the progression?";

    public static void arithmeticProgression() {

        Engine.welcome();

        String[][] questionsAndAnswers = new String[3][2];

        for (var i = 0; i < questionsAndAnswers.length; i++) {


            int firstRandomNumber = (int) (Math.random() * max);
            int step = (int) (Math.random() * maxStep);
            int hiddenIndex = (int) (Math.random() * maxStep);

            int[] numbers = new int[length];
            for (var j = 0; j < length; j++) {
                numbers[j] = firstRandomNumber + j * step;
            }
            String[] hiddenNumbers = new String[length];
            for (var j = 0; j < length; j++) {
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
        Engine.game(gameRules, questionsAndAnswers);
    }
}

