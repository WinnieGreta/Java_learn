import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        bubbleSortAss(new byte[]{5, 1, 4, 2, 0});
        bubbleSortAss(generateArr(4));
        bubbleSortAss(generateArr(-1));
        bubbleSortAss(generateArr(0));
        bubbleSortAss(generateArr(20));

    }

    private static byte[] bubbleSortAss(byte[] arr) {
        int swaps;
        try {
            int len = arr.length - 1;
            // in the middle of sorting stops if no new swaps needed
            do {
                swaps = 0;
                for (int i = 0; i < len; i++) {
                    if (arr[i] > arr[i + 1]) {
                        byte temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        swaps++;
                    }
                }
                // makes it faster as the last element is in fact sorted
                len--;
            } while (swaps != 0);
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
