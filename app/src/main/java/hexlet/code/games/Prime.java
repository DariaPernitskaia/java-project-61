package hexlet.code.games;
import hexlet.code.Utils;
import hexlet.code.Engine;

public class Prime {
    private static final String GAMERULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX = 100;
    private static final int MIN = 1;
    private static boolean isPrime(int firstRandomNumber) {
        if (firstRandomNumber <= 1) {
            return false;
        }
        int count = 0;
        for (int j = 1; j <= firstRandomNumber; j++) {
            if (firstRandomNumber % j == 0) {
                count++;
            }
        }
        return count == 2;
    }
    public static void playPrimeNumberGame() {

        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < questionsAndAnswers.length; i++) {

            int firstRandomNumber = Utils.generateNumber(MIN, MAX);

            String question = Integer.toString(firstRandomNumber);
            boolean primeNumber = isPrime(firstRandomNumber);
            String answer = primeNumber ? "yes" : "no";
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }
        Engine.makeGame(GAMERULES, questionsAndAnswers);
    }
}
