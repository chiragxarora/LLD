package org.lld.solid.ocp.bad;

public class PaymentProcessor {
    public void processPayment(String paymentMethod, double amount) {
        if(paymentMethod.equals("CreditCard")) {
            System.out.println("Making payment via credit card: " + amount);
        }
        else if(paymentMethod.equals("DebitCard")) {
            System.out.println("Making payment via debit card: " + amount);
        }
        else if(paymentMethod.equals("Paypal")) {
            System.out.println("Making payment via paypal: " + amount);
        }
        else {
            throw new IllegalArgumentException("Unsupported payment method!");
        }
    }
}
