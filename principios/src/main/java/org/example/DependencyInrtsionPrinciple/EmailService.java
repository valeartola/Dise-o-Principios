package org.example.DependencyInrtsionPrinciple;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando email con el mensaje: " + message);
    }
}


//Sin aplicar DIP
/*
// EmailService.java
public class EmailService {
    public void sendEmail(String message) {
        System.out.println("Enviando email con el mensaje: " + message);
    }
}

// SMSService.java
public class SMSService {
        System.out.println("Enviando SMS con el mensaje: " + message);
    }
}

// Notification.java (módulo de alto nivel)
public class Notification {
    private EmailService emailService;
    private SMSService smsService;

    public Notification() {
        this.emailService = new EmailService();  // Dependencia directa
        this.smsService = new SMSService();      // Dependencia directa
    }

    public void sendNotification(String message) {
        emailService.sendEmail(message);  // Solo puede enviar email
        smsService.sendSMS(message);      // Solo puede enviar SMS
    }
}
*/
