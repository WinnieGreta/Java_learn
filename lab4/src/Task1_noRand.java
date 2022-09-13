public class Task1_noRand {
    public static void main(String[] args) {
        //using anonymous arrays to check correctness
        checkPrint(new int[] {1, 2, 3});
        checkPrint(new int[] {});
        checkPrint(new int[] {-10, -20, 30});
        checkPrint(new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE});
        checkPrint(new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE});
        checkPrint(new int[] {0, 0, 1, -1});
    }

    private static int countPositive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        return count;
    }

    private static void checkPrint(int[] arr) {
        try {
            int count = countPositive(arr);
            System.out.println(count);
        } catch (Exception e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
