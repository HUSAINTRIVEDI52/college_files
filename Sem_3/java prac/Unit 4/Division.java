class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

public class Division {
    public static double divide(double numerator, double denominator) throws DivideByZeroException {
        if (denominator == 0) {
            throw new DivideByZeroException("Error: division by zero is not allowed");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        double numerator = 20;
        double denominator = 30;
        try {
            double result = divide(numerator, denominator);
            System.out.println("The result is " + result);
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
