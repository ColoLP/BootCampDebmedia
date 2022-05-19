package AgusGomez.animales.models;

import AgusGomez.animales.interfaces.Hierba;
import Clase9Animal.ResueltoLucas.Models.Animal;

public class Vaca extends Animal implements Hierba {
    //Constructores

    public Vaca() {
    }

    public Vaca(String colorDePelo, String nombre, int edad) {
        super(colorDePelo, nombre, edad);
    }

    //Métodos
    @Override
    public String hablar() {
        return "muge";
    }

    @Override
    public String comerHierba() {
        return "come hierbas.";
    }

    @Override
    public String toString() {
        return "Nombre de la vaca: " + this.getNombre() +
                "\nColor de pelo: " + this.getColorDePelo() +
                "\nEdad: " + this.getEdad() +
                "\n" + getNombre() + " " + hablar() + " y " + comerHierba();
    }
}
