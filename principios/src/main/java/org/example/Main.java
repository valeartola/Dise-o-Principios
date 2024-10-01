package org.example;

import org.example.DependencyInersionPrinciple.EmailService;
import org.example.DependencyInersionPrinciple.MessageService;
import org.example.DependencyInersionPrinciple.Notification;
import org.example.DependencyInersionPrinciple.SMSService;
import org.example.DependencyInersionPrinciple.TikTokService;
import org.example.Liskov.*;
import org.example.OpenClosed.Circle;
import org.example.OpenClosed.Rectangle;
import org.example.OpenClosed.Shape;
import org.example.SIngleResponsability.Student;
import org.example.SIngleResponsability.StudentRepository;
import org.example.InterfaceSegregationPrinciple.Human;
import org.example.InterfaceSegregationPrinciple.Eater;
import org.example.InterfaceSegregationPrinciple.Robot;
import org.example.InterfaceSegregationPrinciple.Worker;


public class Main {
    public static void main(String[] args) {
        //Open Closed
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 3.0);

        System.out.println("Área del círculo: " + circle.area());
        System.out.println("Área del rectángulo: " + rectangle.area());

        //Liskov
        Flyable flyingBird = new FlyingBird();
        Aguila aguila = new Aguila();

        aguila.fly();
        flyingBird.fly(); // Salida: El pájaro está volando

        // Los pingüinos no vuelan, por lo tanto no usamos la interfaz Flyable
        Penguin penguin = new Penguin();
        System.out.println("Los pingüinos no pueden volar");

        //Single Responsability
        Student student = new Student("Juan", 22);

        // Crear instancia del repositorio
        StudentRepository repository = new StudentRepository();

        // Guardar el estudiante en la base de datos
        repository.saveToDatabase(student);

        // Cargar un estudiante desde la base de datos
        Student loadedStudent = repository.loadFromDatabase("Juan");
        System.out.println("Estudiante cargado: " + loadedStudent.getName() + ", Edad: " + loadedStudent.getAge());

        //ISP
        // Trabajador humano que trabaja Y COME
        Human human = new Human();
        human.work();
        human.eat();

        // Trabajador robot que solo trabaja
        Robot robot = new Robot();
        robot.work();

        //DIP
        // Usando el servicio de email
        MessageService emailService = new EmailService();
        Notification notificationWithEmail = new Notification(emailService);
        notificationWithEmail.sendNotification("Hola por email!");

        // Usando el servicio de SMS
        MessageService smsService = new SMSService();
        Notification notificationWithSMS = new Notification(smsService);
        notificationWithSMS.sendNotification("Hola por SMS!");

        // Usando el servicio de TikTok
        MessageService TikTokService = new TikTokService();
        Notification notificationWithTikTok = new Notification(TikTokService);
        notificationWithSMS.sendNotification("Hola por Tik Tok!");



    }

}


