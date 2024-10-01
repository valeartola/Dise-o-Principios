package org.example.InterfaceSegregationPrinciple;

public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot trabajando");
    }
    // No es necesario implementar eat() ya que no aplica a los robots
    // Si no, habria que crear el metodo eat y ponerle que devuelva una excepcion
}