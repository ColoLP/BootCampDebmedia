package Modelos;

public class Persona {
    //Atributos
    private int edad;
    private String nombre;

    //Constructor
    public Persona(int edad, String equipoDeFutbol) {
        this.edad = edad;
        this.nombre = equipoDeFutbol;
    }

    public Persona() {
    }
    //Setters y getters

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos
    public void cumplirAños(){
        this.edad++;
    }

    @Override
    public String toString() {
        return  "edad=" + this.edad +
                ", nombre='" + this.nombre;
    }
}
