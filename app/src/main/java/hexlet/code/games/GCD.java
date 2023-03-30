package hexlet.code.games;
import hexlet.code.Utils;
import hexlet.code.Engine;

public class GCD {
    public static final String GAMERULES = "Find the greatest common divisor of given numbers.";
    private static int commonDivisorCalculation(int firstRandomNumber, int secondRandomNumber) {
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
    public static void commonDivisor() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < questionsAndAnswers.length; i++) {
            int[] randomNumbers = Utils.randomNumbers();
            int firstRandomNumber = randomNumbers[0];
            int secondRandomNumber = randomNumbers[1];

            String question = firstRandomNumber + " " + secondRandomNumber;
            int answer = commonDivisorCalculation(firstRandomNumber, secondRandomNumber);
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = Integer.toString(answer);
        }
        Engine.game(GAMERULES, questionsAndAnswers, "Question: ");
    }
}

