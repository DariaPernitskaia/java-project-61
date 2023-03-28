package hexlet.code.games;
import hexlet.code.Generate;
import hexlet.code.Engine;

public class Prime {
    public static final String GAMERULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static String primeNumberCalculation(int firstRandomNumber) {
        String answer;
        int count = 0;
        for (int j = 1; j <= firstRandomNumber; j++) {
            if (firstRandomNumber > 1 && firstRandomNumber % j == 0) {
                count++;
            }
        }
        if (count == 2) {
            answer = "yes";
        } else {
            answer = "no";
        }
        return answer;
    }
    public static void primeNumber() {

        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < questionsAndAnswers.length; i++) {

            int[] randomNumbers = Generate.randomNumbers();
            int firstRandomNumber = randomNumbers[0];

            String question = "Question: " + firstRandomNumber;
            String answer = primeNumberCalculation(firstRandomNumber);
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }
        Engine.game(GAMERULES, questionsAndAnswers);
    }
}
