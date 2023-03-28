package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Generate;
public class Calc {
    public static final String GAMERULES = "What is the result of the expression?";
    public static final char[] CHARS = {'-', '+', '*'};

    private static int calculation(int firstRandomNumber, int secondRandomNumber, char operator) {
        int answer;

        switch (operator) {
            case '-':
                answer = firstRandomNumber - secondRandomNumber;
                break;
            case '+':
                answer = firstRandomNumber + secondRandomNumber;
                break;
            default:
                answer = firstRandomNumber * secondRandomNumber;
        }
        return answer;
    }
    public static void calculate() {

        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < questionsAndAnswers.length; i++) {
            int[] randomNumbers = Generate.randomNumbers();
            int firstRandomNumber = randomNumbers[0];
            int secondRandomNumber = randomNumbers[1];

            int randomChar = (int) (Math.random() * CHARS.length);
            char operator = CHARS[randomChar];
            String question = "Question: " + firstRandomNumber + " " + operator + " " + secondRandomNumber;
            int answer = calculation(firstRandomNumber, secondRandomNumber, operator);
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = Integer.toString(answer);
        }
        Engine.game(GAMERULES, questionsAndAnswers);
    }
}
