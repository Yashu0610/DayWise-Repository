package java8casestudy;

interface Payment {
    default void logTransaction() {
        System.out.println("Transaction logged.");
    }
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        logTransaction();
        System.out.println("Paid " + amount + " via UPI");
    }
}

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        Payment payment = new UPI();
        payment.pay(999);
    }
}
