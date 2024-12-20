package org.lld.behavioural.strategy.good;

public class Client {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        UPIStrategy upiStrategy = new UPIStrategy("abc@okicici");
        paymentContext.setStrategy(upiStrategy);
        paymentContext.processPayment(50);
        CreditCardStrategy creditCardStrategy = new CreditCardStrategy("93293723929");
        paymentContext.setStrategy(creditCardStrategy);
        paymentContext.processPayment(100);
    }
}
