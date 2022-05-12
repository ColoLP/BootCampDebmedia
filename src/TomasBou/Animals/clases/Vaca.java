package TomasBou.Animals.clases;

import TomasBou.Animals.interfaces.ComerHierba;

public class Vaca extends Animal implements ComerHierba{


    public Vaca(String nombre, String colorPelo,int edad) {
        super(nombre,  colorPelo, edad);

    }

    static void  comerHierba() {

        System.out.println("Soy una vaca y comi hierbas");
    }
    @Override
    public void hablar() {

        System.out.println("Muuuu");
    }

    @Override
    public void comer() {
        comerHierba();
    }

    public String toString() {
        return "Vaca -"  + " Nombre: " + this.getNombre()  + " Edad: " + this.getEdad() +  " Color de pelo: " + this.getColorPelo() ;

    }
}
