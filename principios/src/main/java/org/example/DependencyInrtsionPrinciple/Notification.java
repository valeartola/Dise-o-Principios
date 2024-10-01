package org.example.DependencyInrtsionPrinciple;


//Modulos de alto nivel no deben depender de modulos de bajo nivel.
// Ambos deben depender de abstracciones
// Abstracciones no deben depender de detalles.
// Los detalles deben depender de abstracciones
// Se trata de evitar que al querer modificar algo general se tengan que cambiar los demas modulos

//En este ejemplo si se quiere agregar otro tipo de notificacion,
// solo se crea el nuevo tipo de notificacion, de slack, de tik tok, no se cambia el modulo notificacion
// ya tenemos una interfaz que se encarga de llamar a cada tipo de notificacion


// Notification (módulo de alto nivel)
public class Notification {
    private MessageService messageService;

    // Constructor con inyección de dependencias
    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String message) {
        messageService.sendMessage(message);  // Dependiendo de la abstracción
    }
}