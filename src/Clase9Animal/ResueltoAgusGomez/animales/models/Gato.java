package Clase9Animal.ResueltoAgusGomez.animales.models;

import debmedia.ejercicios.animales.interfaces.Carne;

public class Gato extends Animal implements Carne {
    //Constructores

    public Gato() {
    }

    public Gato(String colorDePelo, String nombre, int edad) {
        super(colorDePelo, nombre, edad);
    }

    //Métodos
    @Override
    public String hablar() {
        return "Hago miau, por que soy un gato";
    }

    @Override
    public String comerCarne() {
        return "come carne roja y salmon.";
    }

    @Override
    public String toString() {
        return "Nombre del gato: " + this.getNombre() +
                "\nColor de pelo: " + this.getColorDePelo() +
                "\nEdad: " + this.getEdad() +
                "\n" + getNombre() + " " + hablar() + " y " + comerCarne();
    }
}
