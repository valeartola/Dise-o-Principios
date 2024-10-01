package org.example.SIngleResponsability;

public class StudentRepository {

    // Método que guarda la información del estudiante en la base de datos
    public void saveToDatabase(Student student) {
        // Lógica para guardar el estudiante en la base de datos
        System.out.println("Guardando estudiante en la base de datos: " + student.getName());
    }

    // Método que carga la información del estudiante desde la base de datos
    public Student loadFromDatabase(String name) {
        // Lógica para cargar el estudiante desde la base de datos
        System.out.println("Cargando estudiante desde la base de datos con nombre: " + name);
        // Retornar un estudiante ficticio para este ejemplo
        return new Student(name, 20);
    }
}
