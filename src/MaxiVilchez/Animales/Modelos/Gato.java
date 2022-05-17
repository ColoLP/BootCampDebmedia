package Modelos;

import Interfaces.Carnivoro;

public class Gato extends Animales implements Carnivoro {

    //Constructores
    public Gato(String sonido, boolean hambre, String colorDePelo, String nombre, int edad) {
        super(sonido, hambre, colorDePelo, nombre, edad);

    }

    //Metodos
    @Override
    public void hablar() {
        System.out.println(this.getSonido());
    }

    @Override
    public void comerCarne() {
        setHambre(false);
    }
    @Override
    public String toString() {
        return "Gato " + "\n" +
                "Nombre: " + this.getNombre() + "\n" +
                "Hace " + this.getSonido() + "\n" +
                "Edad: " + this.getEdad() + "\n" +
                "Color de pelo: " + this.getColorDePelo() + "\n" +
                "Tiene hambre? " + this.isHambre() + "\n";
    }

}
