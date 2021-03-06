package TomasBou.Animals.clases;

import TomasBou.Animals.interfaces.ComerCarne;

public class Perro extends Animal implements ComerCarne {


    public Perro(String nombre, String colorPelo,int edad) {
        super(nombre,  colorPelo, edad);


    }

    static void  comerCarne() {
        System.out.println("Soy un perro y comi carne");
        System.out.println("Estaba rico la ensalada de carne");
        System.out.println("Detesto los vegetales");
    }

    @Override
    public void hablar() {

        System.out.println("Guag Guau");
        System.out.println("hrRHRHRHRHRHRHRIRQHI");
        System.out.println("Arranca con fuerza.");
    }

    @Override
    public void comer() {

        comerCarne();
    }

    public String toString() {
        return "Perro -"  + " Nombre: " + this.getNombre()  + " Edad: " + this.getEdad() +  " Color de pelo: " + this.getColorPelo() ;

    }

}
