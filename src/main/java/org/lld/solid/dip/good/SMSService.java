package org.lld.solid.dip.good;

public class SMSService implements NotificationChannel{
    @Override
    public void send(String message) {
        System.out.println("Sending sms! " + message);
    }
}
