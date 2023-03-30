package hexlet.code.games;
import hexlet.code.Utils;
import hexlet.code.Engine;

public class Prime {
    public static final String GAMERULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static boolean isPrime(int firstRandomNumber) {
        int count = 0;
        for (int j = 1; j <= firstRandomNumber; j++) {
            if (firstRandomNumber > 1 && firstRandomNumber % j == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }
    public static void primeNumber() {

        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < questionsAndAnswers.length; i++) {

            int[] randomNumbers = Utils.randomNumbers();
            int firstRandomNumber = randomNumbers[0];

            String question = Integer.toString(firstRandomNumber);
            boolean primeNumber = isPrime(firstRandomNumber);
            String answer = primeNumber ? "yes" : "no";
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }
        Engine.game(GAMERULES, questionsAndAnswers, "Question: ");
    }
}
