import Interfaces.Carnivoro;
import Interfaces.Herbivoro;
import Modelos.*;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;



public class Principal {
    static int opcion, edad;
    static String sonido, colorDePelo, nombre;
    static boolean hambre,continua=true,continua1=true;
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Animales> listaAnimales = new ArrayList<>();

    public static void main(String[] args) {
        while(continua1) {

            elegirAnimal();
            llenarAtributos();

            switch (opcion) {
                case 1:
                    Perro p1 = new Perro(sonido, hambre, colorDePelo, nombre, edad);
                    System.out.println("Le damos comida a " + p1.getNombre());
                    comerAnimal(p1);
                    hablarAnimal(p1);
                    System.out.println("(Dice gracias)"+"\n---------\n" +"Agrego : " + p1.toString());
                    listaAnimales.add(p1);
                    break;

                case 2:
                    Gato g1 = new Gato(sonido, hambre, colorDePelo, nombre, edad);
                    System.out.println("Le damos comida a " + g1.getNombre());
                    comerAnimal(g1);
                    hablarAnimal(g1);
                    System.out.println("(Dice gracias)"+"\n---------\n" +"Agrego : " + g1.toString());
                    listaAnimales.add(g1);
                    break;

                case 3:
                    Vaca v1 = new Vaca(sonido, hambre, colorDePelo, nombre, edad);
                    System.out.println("Le damos comida a " + v1.getNombre());
                    comerAnimal(v1);
                    hablarAnimal(v1);
                    System.out.println("(Dice gracias)"+"\n---------\n" + "Agrego: " + v1.toString());
                    listaAnimales.add(v1);
                    break;

                default:
                    System.out.println("Ingrese 1,2 o 3");
                    System.exit(-1);
            }
            System.out.println("Desea agregar otro animal? 1-Si, otro numero-NO");
            try {
                opcion = teclado.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Ingrese un numero entero");
            }
            if (opcion!=1 ) {
                continua1 = false;
            }
        }
        System.out.println("Los animales ingresados son: ");
        Iterator<Animales> iteradorLista = listaAnimales.iterator();
        Object listaIterando;
        while(iteradorLista.hasNext()){
            listaIterando = iteradorLista.next();
            System.out.println(listaIterando.toString());
        }
    } // fin del main

    private static void elegirAnimal(){
        System.out.println("Elija animal: 1-Perro 2-Gato 3-Vaca");
        try {
            opcion = teclado.nextInt();
        } catch (InputMismatchException except) {
            System.out.print("Elija una opcion valida." + except.getMessage());
            teclado.next();
        }
        if (opcion<1 || opcion>3){
            System.out.println("Error.Ingrese 1,2 o 3");
            System.exit(-1);
        }
    }

    private static void llenarAtributos(){
        continua=true;
        while(continua) {

            System.out.println("Cual es su nombre? ");
            try {
                nombre = teclado.next();
            } catch (InputMismatchException except) {
                System.out.print("Ingrese un nombre valido. Vuelva a empezar " + except.getMessage());
                System.exit(-1);
            }
            System.out.println("Que sonido hace? ");
            try {
                sonido = teclado.next();
            } catch (InputMismatchException except) {
                System.out.print("Ingrese un sonido valido. Vuelva a empezar " + except.getMessage());
                System.exit(-1);
            }
            System.out.println("Cual es su color de pelo?");
            try {
                colorDePelo = teclado.next();
            } catch (InputMismatchException except) {
                System.out.print("Ingrese un color valido. Vuelva a empezar " + except.getMessage());
                System.exit(-1);
            }
            System.out.println("Cual es su edad?");
            try {
                edad = teclado.nextInt();
            } catch (InputMismatchException except) {
                System.out.print("Ingrese un numero entero. Vuelva a empezar " + except.getMessage());
                System.exit(-1);
            }
            continua=false;
            }
        }

    private static void hablarAnimal(Animales a){
        a.hablar();
    }

    private static void comerAnimal(Animales a){
        if (a.getClass() == Perro.class || a.getClass() == Gato.class){
            ((Carnivoro) a).comerCarne();
        } else if (a.getClass() == Vaca.class){
            ((Herbivoro) a).comerHierba();
        }
    }
}
