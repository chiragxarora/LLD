package org.lld.solid.ocp.good;

public class DebitCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Making payment via Credit Card: " + amount);
    }
}
