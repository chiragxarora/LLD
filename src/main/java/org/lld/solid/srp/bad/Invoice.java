package org.lld.solid.srp.bad;

public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    // Additional functionality
    public  void generateInvoice() {
        System.out.println("Invoice generated & printed for amount " + amount);
    }

    public void saveToDatabase() {
        System.out.println("Saving the invoice to database");
    }

    public void sendEmailNotification() {
        System.out.println("Sending email notification for invoice");
    }
}
