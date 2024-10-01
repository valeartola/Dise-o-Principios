package org.example.DependencyInrtsionPrinciple;

public class TikTokService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando notificacion con el mensaje: " + message);
    }
}