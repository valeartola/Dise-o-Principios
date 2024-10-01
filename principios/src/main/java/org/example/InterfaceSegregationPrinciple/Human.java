package org.example.InterfaceSegregationPrinciple;

public class Human implements Worker, Eater {
    @Override
    public void work() {
        System.out.println("Humano trabajando");
    }
    @Override
    public void eat() {
        System.out.println("Humano comiendo");
    }
}
