package TomasBou.Animals.main;

import TomasBou.Animals.clases.Animal;
import TomasBou.Animals.clases.Perro;
import TomasBou.Animals.clases.Gato;
import TomasBou.Animals.clases.Vaca;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.InputMismatchException;

public class Principal {

    static Scanner teclado = new Scanner(System.in);



    static int edad;
    static String tipoAnimal;
    static String colorDePelo;
    static String nombre;


    static boolean continuaIngreso=true;

    public static void main(String[] args) {
        ArrayList<Animal>animales=new ArrayList<>();

        while (continuaIngreso){

            elegirAnimal();
            llenarAtributos();

            switch (tipoAnimal){
                case "perro":
                    Perro perro=new Perro(nombre,colorDePelo,edad);
                    perro.hablar();
                    perro.comer();
                    animales.add(perro);
                    break;
                case "gato":
                    Gato gato=new Gato(nombre,colorDePelo,edad);
                    gato.hablar();
                    gato.comer();
                    animales.add(gato);
                    break;
                case "vaca":
                    Vaca vaca=new Vaca(nombre,colorDePelo,edad);
                    vaca.hablar();
                    vaca.comer();
                    animales.add(vaca);
                    break;
            }

            // PREGUNTAR POR continuaIngreso=sigueOnoIngresando()
           continuaIngreso= sigueONoingresando();
        }

        System.out.println("Los animales son :");
        listarAnimales(animales);

    }

    private static void listarAnimales(ArrayList<Animal> animales) {
        for (Animal animal:animales) {
            System.out.println(animal);
        }

    }

    private static boolean sigueONoingresando() {
        boolean sigue=true;
        System.out.print("Desea ingresar otro animal? si/no :");
         String respuesta= teclado.next();
        if (respuesta.equalsIgnoreCase("no")){
            sigue=false;
        }
        return sigue;
    }

    private static void elegirAnimal(){
        System.out.println("Que animal va a crear: Perro, Gato o Vaca?");
        try {
            tipoAnimal = teclado.next();
        } catch (InputMismatchException e) {
            System.out.print("Escriba Perro, Gato o Vaca." + e.getMessage());
            teclado.next();
        }

    }

    private static void llenarAtributos(){

            System.out.println("Cual es su nombre? ");
            try {
                nombre = teclado.next();
            } catch (Exception e) {
                System.out.print("Ingrese un nombre valido : " + e.getMessage());
                nombre = teclado.next();
            }
          System.out.println("Cual es su edad?");
        try {
            edad = teclado.nextInt();
        } catch (Exception e) {
            System.out.print("Ingrese un numero entero: " + e.getMessage());
            edad = teclado.nextInt();
        }

            System.out.println("Cual es su color de pelo?");
            try {
                colorDePelo = teclado.next();
            } catch (Exception except) {
                System.out.print("Ingrese un color valido: " + except.getMessage());
                colorDePelo = teclado.next();
            }


        }


    public static void hablarAnimal(Animal animal){
        animal.hablar();
    }
    public static void comerAnimal(Animal animal){

        animal.comer();
    }

}
