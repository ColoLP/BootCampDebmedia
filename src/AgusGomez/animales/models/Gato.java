package AgusGomez.animales.models;

import AgusGomez.animales.interfaces.Carne;

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
        return "Maullo, por que soy un gato";
    }

    @Override
    public String comerCarne() {
        return "come carne roja y salmon rosado.";
    }

    @Override
    public String toString() {
        return "Nombre del gato: " + this.getNombre() +
                "\nColor de pelo: " + this.getColorDePelo() +
                "\nEdad: " + this.getEdad() +
                "\n" + getNombre() + " " + hablar() + " y " + comerCarne();
    }
}
