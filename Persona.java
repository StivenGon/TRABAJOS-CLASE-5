// Practica 05 Ejercicio 1 
// @author Stiven Gonzalez
// Clase desarrollada de manera asincrónica
public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return edad;
    }
    
    // Instancia
    public void mostrarDatos() {
        System.out.println("Nombre: "+nombre);
    }
}