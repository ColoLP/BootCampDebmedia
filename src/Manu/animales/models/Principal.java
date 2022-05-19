package Manu.animales.models;

import Manu.animales.models.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    static int tipoAnimal, edad, voluntad = 0;
    static String nombre, colorDePelo;
    static ArrayList<Animal> zoo = new ArrayList<>();
    static boolean seguirSumando = true;

    public static void main(String[] args) {
        while(voluntad==0){
            elegirAnimal();
            ingresarAtributos();
            crearAnimal();

            while(seguirSumando){
                Scanner teclado = new Scanner(System.in);
                System.out.print("Quiere sumar un nuevo animal al ZOO? Si (0) o No (1): ");
                try {
                    seguirSumando = false;

                    voluntad = teclado.nextInt();

                } catch(Exception e){
                    System.out.println("Debe especificar con numeros: Si (0) o No (1)");
                    seguirSumando = true;
                    teclado.nextLine();
                }
                if(voluntad!=0 && voluntad!=1){
                    seguirSumando = true;
                }
                }
            seguirSumando = true;
        }

        System.out.println(zoo.toString());

    }

    private static void crearAnimal() {
        if(tipoAnimal==0){
            Animal perro = new Perro(edad, colorDePelo, nombre);
            System.out.println("Ha nacido un nuevo PERRO llamado " + nombre);
            hablarAnimal(perro);
            System.out.println("Alimentando...");
            comerAnimal(perro);
            zoo.add(perro);
            System.out.println(zoo.size());
        }else if (tipoAnimal==1){
            Animal gato = new Gato(edad, colorDePelo, nombre);
            System.out.println("Ha nacido un nuevo GATO llamado " + nombre);
            hablarAnimal(gato);
            System.out.println("Alimentando...");
            comerAnimal(gato);
            zoo.add(gato);
        }else {
            Animal vaca = new Vaca(edad, colorDePelo, nombre);
            System.out.println("Ha nacido una nueva VACA llamado " + nombre);
            hablarAnimal(vaca);
            System.out.println("Alimentando...");
            comerAnimal(vaca);
            zoo.add(vaca);
        }
    }

    private static void ingresarAtributos() {
        Scanner teclado = new Scanner(System.in);
        boolean continuarNombre = true;
        while (continuarNombre){
        System.out.print("Indique el nombre del animal: ");
        try {
            continuarNombre = false;
            nombre = teclado.next();
        } catch(Exception e){
            System.out.println("El nombre del animal debe estar compuesto de letras.");
            continuarNombre = true;
            teclado.nextLine();
        }
    }
        boolean continuarColorDePelo = true;
        while (continuarColorDePelo){
            System.out.print("Indique el color de pelo del animal: ");
            try {
                continuarColorDePelo = false;
                colorDePelo = teclado.next();
            } catch(Exception e){
                System.out.println("El color de pelo del animal debe estar compuesto de letras.");
                continuarColorDePelo = true;
                teclado.nextLine();
            }
        }
        boolean continuarEdad = true;
        while (continuarEdad){
            System.out.print("Indique la edad del animal: ");
            try {
                continuarEdad = false;
                edad = teclado.nextInt();

            } catch(Exception e){
                System.out.println("La edad del animal deben ser numeros.");
                continuarEdad = true;
                teclado.nextLine();
            }
            if(edad<0){
                continuarEdad = true;
            }
        }
    }

    private static void elegirAnimal() {

        Scanner teclado = new Scanner(System.in);
        boolean animalIncorrecto = true;

        do{
            try {
                System.out.print("Especifique con una letra el tipo de animal a elegir entre Perro (0), Gato (1) o Vaca (2): ");
                animalIncorrecto = false;
                tipoAnimal = teclado.nextInt();

            } catch(Exception e){
                System.err.println("Debe elegir entre Perro (0), Gato (1) o  (2)");

                animalIncorrecto = true;
                teclado.nextLine();
            }
            if(tipoAnimal<0 || tipoAnimal>2){
                animalIncorrecto = true;
                System.out.println("Debe elegir entre Perro (0), Gato (1) o Vaca (2)");
            }

        } while (animalIncorrecto);
    }

    private static void hablarAnimal(Animal a){

        a.hablar();
    }

    private static void comerAnimal(Animal a){
        if(a.getClass()==Vaca.class){
            ((Vaca) a).comerHierva();
        }else if(a.getClass()==Perro.class || a.getClass()==Gato.class){
            ((Comer) a).comerCarne();
            //que onda esto? quiero hacer 'a.comerCarne()' pero me da error y sugiere lo escrito arriba
        }
    }
}
