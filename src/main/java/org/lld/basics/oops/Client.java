package org.lld.basics.oops;

public class Client {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.AddPaymentMethod("chiragDC", new DebitCard("0123456789", "Chirag Arora"));
        service.AddPaymentMethod("chiragCC", new CreditCard("9876543210", "Chirag Arora"));
        service.AddPaymentMethod("chiragUPI", new Upi("chirag@okhdfcbank"));
        service.MakePayment("chiragUPI");
        service.MakePayment("chiragCC");

    }
}
