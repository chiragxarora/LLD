package org.lld.solid.dip.bad;

public class NotificationService {   // High level service
    EmailService emailService;   // Low level service
    SMSService smsService;   // Low level service

    public NotificationService() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    public void notifyByEmail() {
        emailService.sendEmail("hello email");
    }

    public void notifyBySMS() {
        smsService.sendSMS("hello sms");
    }

    /*
    Problems:
    1. Tight coupling: Notification service is tightly tied to email/sms service.
        We cannot easily replace or extend the notification service without making changes
        to high level module.
    2. Flexibility: Violates Open Closed Principle: Cannot simply add a new notification service
    3. Ripple Effect of changes: Any change to sms/email service can break notification service.
        If more classes are composed of email/sms service, then it'll be complex to verify changes
        in each of them.
     */
}
