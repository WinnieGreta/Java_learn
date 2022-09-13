import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        calculatePositive(10);
        calculatePositive(10);
        calculatePositive(10);
        calculatePositive(0);
        calculatePositive(-1);
        calculatePositive(-10);
    }

    private static int[] createArray(int len) {
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private static void calculatePositive(int len) {
        try {
            int[] arr = createArray(len);
            printArray(arr);
            int count = 0;
            for (int i : arr) {
                if (i > 0) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (Exception e) {
            System.out.println("EXCEPTION! len = " + e.getMessage());
        }
    }
}
