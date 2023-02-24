package hexlet.code.games;

import hexlet.code.Engine;
public class Calc {
    public static final int MAX = 100;
    public static final String GAMERULES = "What is the result of the expression?";
    public static void calculating() {

        Engine.welcome();

        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (var i = 0; i < questionsAndAnswers.length; i++) {
            int firstRandomNumber = (int) (Math.random() * MAX);
            int secondRandomNumber = (int) (Math.random() * MAX);

            char[] chars = {'-', '+', '*'};
            int randomChar = (int) (Math.random() * chars.length);
            char operator = chars[randomChar];
            String question = "Question: " + firstRandomNumber + " " + operator + " " + secondRandomNumber;
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
            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = Integer.toString(answer);
        }
        Engine.game(GAMERULES, questionsAndAnswers);
    }
}
