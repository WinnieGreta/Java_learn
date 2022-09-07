//task 1 of 1st variant
public class Task1 {
    public static void main(String[] args) {
        //check if class is working correctly
        printResults(1,2);
        printResults(10, 10);
        printResults(20, 20);
        printResults(3, 2);
        printResults(40, 0);
        printResults(30, -1);
        printResults(3, Double.NaN);
        printResults(Double.NaN, 2);
        printResults(10, Double.MAX_VALUE);
        printResults(3, Double.MIN_VALUE);
    }

    static double calculate(double k, double m) {
        if (k < 1 || k > 30 || Double.isNaN(k)) {
            throw new IllegalArgumentException("param k = " + k);
        }
        if (m < 0 || Double.isNaN(m)) {
            throw new IllegalArgumentException("param m = " + m);
        }
        //had to initialize result so that it could be visible outside for loop
        double result = 0;
        
        for (int i = 1; i <= k; i ++) {
            //the actual calculations
            if (i == 1) {
                result = Math.sqrt(m / i) * Math.sin(m * i);
            } else {
                result += Math.sqrt(m / i) * Math.sin(m * i);
            }
        }
        return result;
    }

    static void printResults(double k, double m) {
        System.out.println("k:" + k + " m:" + m + " result:");
        try {
            System.out.println(calculate(k, m));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
