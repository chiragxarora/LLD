package org.lld.behavioural.strategy.bad;

public class PaymentService {
    public void processPayment(String paymentMethod) {
        if(paymentMethod.equals("creditCard")) {
            System.out.println("paying via credit card");
        }
        else if(paymentMethod.equals("debitCard")) {
            System.out.println("paying via debit card");
        }
        if(paymentMethod.equals("upi")) {
            System.out.println("paying via upi");
        }
    }
}
