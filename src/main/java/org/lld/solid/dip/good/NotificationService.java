package org.lld.solid.dip.good;

public class NotificationService {
    NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public void notify(String message) {
        notificationChannel.send(message);
    }
}
