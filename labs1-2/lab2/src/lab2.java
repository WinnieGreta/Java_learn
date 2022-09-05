import java.util.Scanner;

public class lab2 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Choose your fighter!");
        String taskNumberStr = myObj.nextLine();
        int taskNumber = 0;

        try {
            taskNumber = Integer.parseInt(taskNumberStr);
        } catch (Exception e) {
            System.out.println("Put in a number");
            return;
        }

        switch (taskNumber) {
            case 1:
                task1(parametersIn());
                break;
            case 2:
                task2(parametersIn());
                break;
            case 3:
                task3(parametersIn());
                break;
            default:
                System.out.println("Task number should be 1 to 3");
        }
    }

    private static double parseToDouble(String str) throws Exception {
        double num;
        try {
            num = Double.parseDouble(str);
        } catch (Exception e) {
            System.out.println("Put in a number next time");
            throw new Exception("Put in a number next time");
        }
        return num;
    }

    private static double[] parametersIn() {
        Scanner myObj = new Scanner(System.in);
        try {
            System.out.print("a = ");
            double a = parseToDouble(myObj.nextLine());
            System.out.print("b = ");
            double b = parseToDouble(myObj.nextLine());
            System.out.print("c = ");
            double c = parseToDouble(myObj.nextLine());
            System.out.print("d = ");
            double d = parseToDouble(myObj.nextLine());
            double[] arr = {a, b, c, d};
            return arr;
        } catch (Exception e) {
            double[] arr = {};
            return arr;
        }
    }

    private static void task1(double[] arr) {
        if (arr.length < 4) {
            return;
        }
        double result;
        double a = arr[0];
        double b = arr[1];
        double c = arr[2];
        double d = arr[3];

        result = Math.sqrt(Math.abs(Math.sin(a) - 4 * Math.log10(b) / Math.pow(c, d)));

        if (!Double.isNaN(result)) {
            System.out.println("result = " + result);
        } else {
            System.out.println("These parameters won't work!");
        }
    }

    private static void task2(double[] arr) {
        if (arr.length < 4) {
            return;
        }
        double result;
        double a = arr[0];
        double b = arr[1];
        double c = arr[2];
        double d = arr[3];

        result = (Math.exp(a) + 3 * Math.log10(c)) / (Math.sqrt(Math.pow(b, c))) * Math.abs(Math.atan(d));

        if (!Double.isNaN(result)) {
            System.out.println("result = " + result);
        } else {
            System.out.println("These parameters won't work!");
        }
    }

    private static void task3(double[] arr) {
        if (arr.length < 4) {
            return;
        }
        double result;
        double a = arr[0];
        double b = arr[1];
        double c = arr[2];
        double d = arr[3];

        result = Math.pow(2 * Math.sin(a) + Math.cos(Math.abs(b * Math.sqrt(c))), d);

        if (!Double.isNaN(result)) {
            System.out.println("result = " + result);
        } else {
            System.out.println("These parameters won't work!");
        }
    }


}
