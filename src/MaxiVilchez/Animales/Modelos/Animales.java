package Modelos;

import java.util.InputMismatchException;

public abstract class Animales {
    //Atributos
    private String sonido;
    private boolean hambre;
    private String colorDePelo;
    private String nombre;
    private int edad;

    //Constructor
    public Animales(String sonido, boolean hambre, String colorDePelo, String nombre, int edad) {
        InputMismatchException except = new InputMismatchException();
        this.sonido = sonido;
        this.hambre = hambre;
        this.colorDePelo = colorDePelo;
        this.nombre = nombre;
        if (edad<0){
            System.out.print("No puede ingresar numeros negativos"+ except.getMessage());
        } else {
            this.edad=edad;
        }
    }

    //Setters and getters
    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public boolean isHambre() {
        return hambre;
    }

    public void setHambre(boolean hambre) {
        this.hambre = hambre;
    }

    public String getColorDePelo() {
        return colorDePelo;
    }

    public void setColorDePelo(String colorDePelo) {
        this.colorDePelo = colorDePelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodo
    public void hablar(){
        System.out.println(this.sonido);
    }

}
