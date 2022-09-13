import java.util.Arrays;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        findMinPosSum(10);
        findMinPosSum(-10);
        findMinPosSum(0);
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

    private static void findMinPosSum(int len) {
        try {
            int[] arr = createArray(len);
            printArray(arr);
            int minNumber = arr[0];
            int minIndex = 0;
            for (int i = 0; i < len; i ++) {
                if (arr[i] > 0 && arr[i] < minNumber) {
                    minNumber = arr[i];
                    minIndex = i;
                }
            }
            System.out.println(minNumber + " + " + minIndex + " = " + (minIndex + minNumber));
        } catch (Exception e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }

    }

}
