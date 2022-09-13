import java.util.Arrays;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        combineArray(3);
        combineArray(0);
        combineArray(-1);
        combineArray(10);
    }

    private static int[] createArray(int len) {
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            // could be bound to avoid integer overflow
            // arr[i] = random.nextInt(200) - 100;
            arr[i] = random.nextInt();
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private static void combineArray(int len) {
        try {
            int[] arr1 = createArray(len);
            printArray(arr1);
            int[] arr2 = createArray(len);
            printArray(arr2);
            int[] arr3 = new int[len];
            for (int i = 0; i < len; i++) {
                if (arr1[i] > 0 && arr2[i] > 0) {
                    if ((long)arr1[i] + arr2[i] > Integer.MAX_VALUE) {
                        throw new ArithmeticException("Integer overflow!");
                    }
                    arr3[i] = arr1[i] + arr2[i];
                } else if (arr1[i] < 0 && arr2[i] < 0) {
                    if ((long)arr1[i] * arr2[i] > Integer.MAX_VALUE) {
                        throw new ArithmeticException("Integer overflow!");
                    }
                    arr3[i] = arr1[i] * arr2[i];
                } else {
                    arr3[i] = 0;
                }
            }
            printArray(arr3);
        } catch (Exception e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
