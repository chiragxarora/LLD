package org.lld.solid.srp.good;

public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    // Additional functionality
    public  void generateInvoice() {
        System.out.println("Invoice generated & printed for amount " + amount);
    }
}
