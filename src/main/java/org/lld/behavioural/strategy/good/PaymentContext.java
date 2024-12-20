package org.lld.behavioural.strategy.good;

public class PaymentContext {
    PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy s) {
        strategy = s;
    }
    public void processPayment(int amount) {
        if(strategy != null) {
            strategy.pay(amount);  // runtime polymorphism
        }
    }

}
