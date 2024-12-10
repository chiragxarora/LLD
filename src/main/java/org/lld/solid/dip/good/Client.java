package org.lld.solid.dip.good;

public class Client {
    public static void main(String[] args) {
        NotificationService emailNotification = new NotificationService(new EmailService());
        emailNotification.notify("Your order has been shipped!");

        NotificationService smsNotification = new NotificationService(new SMSService());
        smsNotification.notify("Your order has been shipped!");

        // Adding new notification service using anonymous inner class
        NotificationService whatsappNotification = new NotificationService(new NotificationChannel() {
            @Override
            public void send(String message) {
                System.out.println("Sending whatsapp! " + message);
            }
        });
        whatsappNotification.notify("Your order has been shipped!");
    }
}
