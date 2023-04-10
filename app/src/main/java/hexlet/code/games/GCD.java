package hexlet.code.games;
import hexlet.code.Utils;
import hexlet.code.Engine;

public class GCD {
    private static final String GAMERULES = "Find the greatest common divisor of given numbers.";
    private static final int MAX = 100;
    private static final int MIN = 10;
    private static int findCommonDivisor(int firstRandomNumber, int secondRandomNumber) {
        //единица будет всегда НОД в случае, если отстутсвует другой НОД
        int answer = 1;
        int j;
        for (j = Math.min(firstRandomNumber, secondRandomNumber); j > 1; j--) {
            if (firstRandomNumber % j == 0 && secondRandomNumber % j == 0) {
                answer = j;
                break;
            }
        }
        if (firstRandomNumber == 0 || secondRandomNumber == 0) {
            answer = Math.max(firstRandomNumber, secondRandomNumber);
        }
        return answer;
    }
    public static void playCommonDivisorGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < questionsAndAnswers.length; i++) {
            int firstRandomNumber = Utils.generateNumber(MIN, MAX);
            int secondRandomNumber = Utils.generateNumber(MIN, MAX);

            String question = firstRandomNumber + " " + secondRandomNumber;
            int answer = findCommonDivisor(firstRandomNumber, secondRandomNumber);
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = Integer.toString(answer);
        }
        Engine.makeGame(GAMERULES, questionsAndAnswers);
    }
}

