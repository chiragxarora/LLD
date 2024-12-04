package org.lld.solid.ocp.good;

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);  // Runtime polymorphism
    }
}
