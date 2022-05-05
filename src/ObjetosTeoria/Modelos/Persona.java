package ObjetosTeoria.Modelos;

import ObjetosTeoria.IMedidas;
import ObjetosTeoria.IRoberto;

public class Persona implements IMedidas, IRoberto {

    // Atributos
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private int cantExtremidades;

    // Constructor
    public Persona() {
        this.cantExtremidades = 4;
    }

    public Persona(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = 36587412;
    }

    // Getters y Setters
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantExtremidades() {
        return cantExtremidades;
    }

    public void setCantExtremidades(int cantExtremidades) {
        this.cantExtremidades = cantExtremidades;
    }

    // Metodos
    public void addEdadIfDniExists(int dni, int edad){
        if(this.dni == dni){
            this.edad += edad;
        }
    }

    public static String holaSoyLucas(){

        return "Hola Soy Lucas Galetti";
    }

    public static void main(String[] args) {
        Persona lucas = new Persona(3685021,"Lucas","Galetti");
    }

    public double getPesoPor10() {
        return this.cantExtremidades * 40;
    }

    @Override
    public double getPesoMenos10(int algo) {
        return 0;
    }

    @Override
    public String getNombreRoberto() {
        return "Soy Roberto";
    }
}
