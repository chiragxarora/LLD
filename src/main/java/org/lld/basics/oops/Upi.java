package org.lld.basics.oops;

public class Upi implements PaymentMethod {
    private String upiId;

    public Upi(String upiId) {
        this.upiId = upiId;
    }

    public String getUpiId() {
        return upiId;
    }

    @Override
    public boolean Pay() {
        System.out.println("making payment via UPI!");
        return true;
    }
}
