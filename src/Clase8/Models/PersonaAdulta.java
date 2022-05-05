package Clase8.Models;

public class PersonaAdulta {
    private String nombre;
    private int edad;


    public PersonaAdulta(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        if (edad < 18)
            throw new Exception("No es adulta la persona " + nombre + " porque tiene " + edad + " años.");
        this.edad = edad;
    }

    public void fijarEdad(int edad) throws Exception {
        if (edad < 18)
            throw new Exception("No es adulta la persona " + nombre + " porque tiene " + edad + " años.");
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println(nombre + " - " + edad);
    }
}
