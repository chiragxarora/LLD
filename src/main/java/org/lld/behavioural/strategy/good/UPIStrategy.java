package org.lld.behavioural.strategy.good;

public class UPIStrategy implements PaymentStrategy{
    private String upiId;

    public UPIStrategy(String upiId) {
        this.upiId = upiId;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paying via upi with upi id: " + upiId);
    }
}
