package org.example.InterfaceSegregationPrinciple;

//Un robot y un humano son trabajadores, ambos trabajan

public interface Worker {
    void work();
}

//Antes de usar ISP
/*
public interface Worker {
    void work();
    void eat();
}

public class HumanWorker implements Worker {
    public void work() {
        System.out.println("Humano trabajando");
    }

    public void eat() {
        System.out.println("Humano comiendo");
    }
}

public class RobotWorker implements Worker {
    public void work() {
        System.out.println("Robot trabajando");
    }

    // El robot no necesita comer, pero está obligado a implementar eat()
    public void eat() {
        throw new UnsupportedOperationException("Los robots no comen");
    }
}
*/
