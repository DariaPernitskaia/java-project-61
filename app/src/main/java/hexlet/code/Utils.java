package hexlet.code;

public class Utils {
    public static final int MAX = 100;
    public static int[] randomNumbers() {
        int[] randomNumbers = new int[2];
        randomNumbers[0] = (int) (Math.random() * MAX);
        randomNumbers[1] = (int) (Math.random() * MAX);
        return randomNumbers;
    }
}
