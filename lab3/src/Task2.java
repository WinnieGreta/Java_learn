public class Task2 {
    public static void main(String[] args) {
        //check if class is working correctly
        printResults(1,1);
        printResults(4, 2);
        printResults(20, 20);
        printResults(3, 2);
        printResults(-5, 0);
        printResults(30, -1);
        printResults(3, Double.NaN);
        printResults(Double.NaN, 2);
        printResults(10, Double.MAX_VALUE);
        printResults(3, Double.MIN_VALUE);
    }

    static double calculate(double t, double i) {
        if (i < 1) {
            throw new IllegalArgumentException("param i = " + i);
        }
        double result = 0;
        if (i == 1) {
            sqrtIsLegal(t);
            result = Math.sqrt(t);
        } else if (i == 2) {
            sqrtIsLegal(t);
            result = 1/Math.sqrt(t);
        } else {
            for (int k = 1; k <= i; k++) {
                if (k == 1) {
                    result = k * t;
                } else {
                    result += k * t;
                }
            }
        }
        return result;
    }

    static void printResults(double t, double i) {
        System.out.println("t:" + t + " i:" + i + " result:");
        try {
            System.out.println(calculate(t, i));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

    static void sqrtIsLegal (double t) {
        if (t < 0) {
           throw new IllegalArgumentException("param t = " + t);
        }
    }
}
