package org.lld.behavioural.strategy.good;

public class CreditCardStrategy implements PaymentStrategy{
    String cardNo;

    public CreditCardStrategy(String cardNo) {
        this.cardNo = cardNo;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paying via credit card with card no: " + cardNo);
    }
}
