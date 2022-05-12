package TomasBou.Animals.clases;

import java.util.Scanner;
public abstract class  Animal {

    Scanner teclado = new Scanner(System.in);

    String nombre;
    String colorPelo;
    int edad;

//CONSULTAR POR EL MANEJO DE ERRORES
public Animal(String nombre, String colorPelo,int edad) {
//    InputMismatchException except = new InputMismatchException();

    this.nombre = nombre;
    if (edad<30){
        System.out.print("No puede ingresar un numero negativo");
    } else {
        this.edad=edad;
    }
    this.colorPelo = colorPelo;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean deseaContinuar(){
        boolean desea=false;
        String continua;
        System.out.print("Desea continuar? si/no");
        continua=teclado.next();
        if (continua.equalsIgnoreCase("si")){
            desea=true;

        }

        return desea;
    }



    public abstract void hablar();
    public abstract void comer();



}
