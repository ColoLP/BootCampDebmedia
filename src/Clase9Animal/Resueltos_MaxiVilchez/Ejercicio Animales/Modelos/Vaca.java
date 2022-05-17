package Modelos;

import Interfaces.Herbivoro;

public class Vaca extends Animales implements Herbivoro {

      //Constructores
    public Vaca(String sonido, boolean hambre, String colorDePelo, String nombre, int edad) {
        super(sonido, hambre, colorDePelo, nombre, edad);

    }

    //Metodos
    @Override
    public void hablar() {
       System.out.println(this.getSonido());
    }

    @Override
    public void comerHierba() {
        setHambre(false);
    }

    @Override
    public String toString() {
        return "Vaca " + "\n" +
                "Nombre: " + this.getNombre() + "\n" +
                "Hace " + this.getSonido() + "\n" +
                "Edad: " + this.getEdad() + "\n" +
                "Color de pelo: " + this.getColorDePelo() + "\n" +
                "Tiene hambre? " + this.isHambre() + "\n";
    }
}
