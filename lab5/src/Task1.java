import java.util.Arrays;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        minElementInLargestColumn(new int[][]{{1, 2, 3}, {2, 3, 1}, {-10, -3, -2}});
        minElementInLargestColumn(new int[][]{{7, 5, 42, 0}, {2, -30, 13, 900}, {-10, 3, 2, -1}});
        minElementInLargestColumn(generateMatrix(5, 2));
        minElementInLargestColumn(generateMatrix(2, 5));
        minElementInLargestColumn(generateMatrix(-1, 2));

    }

    private static int minElementInLargestColumn(int[][] matrix) {
        int minInMax = Integer.MAX_VALUE;
        try {
            if (matrix != null) {
                System.out.println(Arrays.deepToString(matrix));
            }
            // assume the matrix is rectangular
            int maxAbsSumColumn = 0;
            int maxAbsSum = 0;

            for (int i = 0; i < matrix[0].length; i++) {
                int absSum = 0;
                for (int j = 0; j < matrix.length; j++) {
                    absSum += Math.abs(matrix[j][i]);
                }
                if (maxAbsSum < absSum) {
                    maxAbsSum = absSum;
                    maxAbsSumColumn = i;
                }
            }

            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][maxAbsSumColumn] < minInMax) {
                    minInMax = matrix[i][maxAbsSumColumn];
                }
            }
            System.out.println(minInMax);
        } catch (Exception e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
        return minInMax;
    }

    //just some cute generator to check the program
    private static int[][] generateMatrix(int row, int col) {
        try {
            if (row < 0 || col < 0) {
                throw new IllegalArgumentException("Some imaginary matrix you got here");
            }
            Random random = new Random();
            int[][] matrix = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = random.nextInt(200) - 100;
                }
            }
            return matrix;
        } catch (Exception e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
        return null;
    }
}
