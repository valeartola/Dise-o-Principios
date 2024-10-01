package org.example.SIngleResponsability;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}



/*
//Si yo lo hago asi, la clase estudiante manejando la info del estudiante
// y las operaciones con la base de datos
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Método que guarda la información del estudiante en la base de datos
    public void saveToDatabase() {
        // Lógica para guardar el estudiante en la base de datos
        System.out.println("Guardando estudiante en la base de datos.");
    }

    // Método que carga la información del estudiante desde la base de datos
    public void loadFromDatabase() {
        // Lógica para cargar el estudiante desde la base de datos
        System.out.println("Cargando estudiante desde la base de datos.");
    }
}
*/