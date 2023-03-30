package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Calc {
    public static final String GAMERULES = "What is the result of the expression?";
    public static final char[] CHARS = {'-', '+', '*'};

    private static int calculation(int firstRandomNumber, int secondRandomNumber, char operator) {
        int answer;
        if (operator == '-') {
            answer = firstRandomNumber - secondRandomNumber;
        } else if (operator == '+') {
            answer = firstRandomNumber + secondRandomNumber;
        } else {
            answer = firstRandomNumber * secondRandomNumber;
        }
        return answer;
    }
    public static void calculate() {

        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < questionsAndAnswers.length; i++) {
            int[] randomNumbers = Utils.randomNumbers();
            int firstRandomNumber = randomNumbers[0];
            int secondRandomNumber = randomNumbers[1];

            int randomChar = (int) (Math.random() * CHARS.length);
            char operator = CHARS[randomChar];
            String question = firstRandomNumber + " " + operator + " " + secondRandomNumber;
            int answer = calculation(firstRandomNumber, secondRandomNumber, operator);
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = Integer.toString(answer);
        }
        Engine.game(GAMERULES, questionsAndAnswers, "Question: ");
    }
}
