//same as Task3 but with for loop instead of do-while
public class Task3_for {
    public static void main(String[] args) {
        //check if class is working correctly
        printResults(0.5);
        printResults(0.03);
        printResults(0.3);
        printResults(0.25);
        printResults(3);
        printResults(Double.NaN);
        printResults(Double.MAX_VALUE);
        printResults(-3);
    }

    static double calculate(double eps) {
        if (eps <= 0) {
            throw new IllegalArgumentException("param eps = " + eps);
        }
        double oldSum = eps + 1;
        double newSum = 0.0;
        //i has to parsed to double so that newSum calculates correctly
        for (int i = 1; Math.abs(newSum - oldSum) >= eps; i++){
            oldSum = newSum;
            newSum += 1 / ((double)i * i);
        }
        return oldSum;
    }

    static void printResults(double eps) {
        System.out.println("eps:" + eps + " result:");
        try {
            System.out.println(calculate(eps));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }

    }
}
