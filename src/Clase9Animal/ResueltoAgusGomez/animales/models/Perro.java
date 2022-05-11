package debmedia.ejercicios.animales.models;

import debmedia.ejercicios.animales.interfaces.Carne;

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
        return"ladra";
    }

    @Override
    public String comerCarne() {
        return "come carne.";
    }

    @Override
    public String toString() {
        return "Nombre del perro: " + this.getNombre() +
                "\nColor de pelo: " + this.getColorDePelo() +
                "\nEdad: " + this.getEdad() +
                "\n" + getNombre() + " " + hablar() + " y " + comerCarne();
    }
}
