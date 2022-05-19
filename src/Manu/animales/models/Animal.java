package Manu.animales.models;

public abstract class Animal {
    int edad;
    String colorDePelo;
    String nombre;

    public Animal(int edad, String colorDePelo, String nombre) {
        this.colorDePelo = colorDePelo;
        this.edad = edad;
        this.nombre = nombre;
    }

    //metodo abstracto.
    abstract public void hablar();


}
