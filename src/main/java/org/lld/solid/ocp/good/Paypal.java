package org.lld.solid.ocp.good;

public class Paypal implements  PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Making payment via Paypal: " + amount);
    }
}
