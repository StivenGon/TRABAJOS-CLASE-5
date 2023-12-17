// Practica 05 Ejercicio 1 
// @author Stiven Gonzalez
// Clase desarrollada de manera asincrónica
public class AppEstudiantePersona {
    
    public static void main(String[] args) {
        
        Estudiante e = new Estudiante (" Luis García", 20);
        Persona p = new Persona (" Marta Gómez", 20);

        // Invocación de instancias
        e.mostrarDatos();
        p.mostrarDatos();
    }
}
