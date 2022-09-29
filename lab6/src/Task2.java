import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        selectionSortAss(new byte[] {64, 25, 12, 22, 11});
        selectionSortAss(generateArr(5));
        selectionSortAss(generateArr(-1));
        selectionSortAss(generateArr(0));
        selectionSortAss(generateArr(10));

    }

    private static byte[] selectionSortAss(byte[] arr) {
        try {
            for (int i = 0; i < arr.length - 1; i++) {
                int minPos = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minPos]) {
                        minPos = j;
                    }
                }
                byte temp = arr[i];
                arr[i] = arr[minPos];
                arr[minPos] = temp;
            }
            System.out.println(Arrays.toString(arr));
        } catch (Exception e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
        return arr;
    }

    private static byte[] generateArr (int len) {
        try {
            Random random = new Random();
            byte[] arr = new byte[len];
            random.nextBytes(arr);
            System.out.println(Arrays.toString(arr));
            return arr;
        } catch (Exception e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
        return null;
    }
}
