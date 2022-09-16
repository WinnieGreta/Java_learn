import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        getTransposed(new int[][] {{1,2},{1,2}});
        getTransposed(new int[][] {{0,1,1,1},{2,0,1,1},{2,2,0,1},{2,2,2,0}});
        getTransposed(new int[][] {{1,2,3,4}, {5,6,7,8}});
        getTransposed(generateMatrix(3,4));
        getTransposed(generateMatrix(0,0));
        getTransposed(generateMatrix(-1,3));

    }

    private static int[][] getTransposed(int[][] matrix) {
        try {
            if (matrix != null) {
                System.out.println(Arrays.deepToString(matrix));
            }
            int[][] matrixTr = new int[matrix[0].length][matrix.length];
            for(int i = 0; i < matrix[0].length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    matrixTr[i][j] = matrix[j][i];
                }
            }
            System.out.println(Arrays.deepToString(matrixTr));
            return matrixTr;
        } catch (Exception e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
        return null;
    }

    // let's deal with repeated generators later
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
