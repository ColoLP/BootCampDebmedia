package AgusGomez.animales.models;

import AgusGomez.animales.interfaces.Carne;
import Clase9Animal.ResueltoLucas.Models.Animal;

public class Perro extends Animal implements Carne {
    //Constructores


    public Perro() {
    }

    public Perro(String colorDePelo, String nombre, int edad) {
        super(colorDePelo, nombre, edad);
    }

    //Métodos
    @Override
    public String hablar() {
        return"el perro ladra";
    }

    @Override
    public String comerCarne() {
        return "come carne y pollo.";
    }

    @Override
    public String toString() {
        return "Nombre del perro: " + this.getNombre() +
                "\nColor de pelo: " + this.getColorDePelo() +
                "\nEdad: " + this.getEdad() +
                "\n" + getNombre() + " " + hablar() + " y " + comerCarne();
    }
}
