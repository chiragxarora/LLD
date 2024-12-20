package org.lld.behavioural.strategy.bad;

public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("creditCard");
        paymentService.processPayment("upi");
    }
}
