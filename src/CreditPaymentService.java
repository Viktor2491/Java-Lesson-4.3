public class CreditPaymentService {
    public double calculate(double a, double b, double c) {
        double mountlyRate = b / 100 / 12;
        double x = Math.pow((1 + mountlyRate), c);
        double result = a * ( ( mountlyRate * x ) / ( x - 1 ) );
        return result;
    }
}
