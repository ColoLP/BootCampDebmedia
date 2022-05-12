package TomasBou.Animals.clases;

import TomasBou.Animals.interfaces.ComerCarne;

public class Gato extends Animal implements ComerCarne {


    public Gato(String nombre, String colorPelo,int edad) {
        super( nombre,  colorPelo,edad);

    }

    static void  comerCarne() {

        System.out.println("Soy un gato y comi carne");
    }

    @Override
    public void hablar() {

        System.out.println("Miaau Miaau");
    }

    @Override
    public void comer() {
        comerCarne();
    }

    public String toString() {
        return "Gato -"  + " Nombre: " + this.getNombre()  + " Edad: " + this.getEdad() +  " Color de pelo: " + this.getColorPelo() ;

    }
}
