package org.lld.solid.ocp.good;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(new CreditCard(),23.5);
        paymentProcessor.processPayment(new DebitCard(),23.5);
        paymentProcessor.processPayment(new Paypal(),23.5);
    }
}
