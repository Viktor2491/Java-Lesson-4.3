public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double amount = 1000000;
        double rate = 9.99;
        double loanTerm = 12;
        double payment = service.calculate(amount, rate, loanTerm);
        double monthlyPayment = Math.round(payment);
        System.out.println("Ваш ежемесячный платеж будет:");
        System.out.print(monthlyPayment +  "рублей");
    }
}