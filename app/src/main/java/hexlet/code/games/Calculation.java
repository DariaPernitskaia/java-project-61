package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculation {
    private static final String GAMERULES = "What is the result of the expression?";
    private static final char[] CHARS = {'-', '+', '*'};
    private static final int MAX = 20;
    private static final int MIN = 1;

    private static int calculate(int firstRandomNumber, int secondRandomNumber, char operator) {
        int answer;
        switch (operator) {
            case '-':
                answer = firstRandomNumber - secondRandomNumber;
                break;
            case '+':
                answer = firstRandomNumber + secondRandomNumber;
                break;
            case '*':
                answer = firstRandomNumber * secondRandomNumber;
                break;
            default:
                throw new RuntimeException("Unknown input: " + operator);
        }
        return answer;
    }
    public static void playCalcGame() {

        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < questionsAndAnswers.length; i++) {
            int firstRandomNumber = Utils.generateNumber(MIN, MAX);
            int secondRandomNumber = Utils.generateNumber(MIN, MAX);

            int randomChar = (int) (Math.random() * CHARS.length);
            char operator = CHARS[randomChar];
            String question = firstRandomNumber + " " + operator + " " + secondRandomNumber;
            int answer = calculate(firstRandomNumber, secondRandomNumber, operator);
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = Integer.toString(answer);
        }
        Engine.makeGame(GAMERULES, questionsAndAnswers);
    }
}
