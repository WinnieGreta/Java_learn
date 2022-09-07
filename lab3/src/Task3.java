public class Task3 {
    public static void main(String[] args) {
        //check if class is working correctly
        printResults(0.5);
        printResults(0.03);
        printResults(0.3);
        printResults(0.25);
        printResults(1);
        printResults(Double.NaN);
        printResults(Double.MAX_VALUE);
        printResults(-3);
    }

    static double calculate(double eps) {
        if (eps <= 0) {
            throw new IllegalArgumentException("param eps = " + eps);
        }
        //little plug in case eps is bigger than first additive
        if (eps > 1) {
            return 0.0;
        }
        double oldSum = 0.0;
        double newSum = 0.0;
        double i = 1;
        //wanted to try do-while loop
        do {
            oldSum = newSum;
            newSum += 1 / (i * i);
            i++;
        } while (Math.abs(newSum - oldSum) >= eps);
        return oldSum;
    }

    static void printResults(double eps) {
        System.out.println("eps:" + eps +" result:");
        try {
            System.out.println(calculate(eps));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }

    }
}
