package Manu.animales.models;

import Manu.animales.models.*;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Perro perro = new Perro();
        hablarAnimal(perro);
        Gato gato = new Gato();
        hablarAnimal(gato);
        Vaca vaca = new Vaca();
        hablarAnimal(vaca);

        Scanner teclado = new Scanner(System.in);
        int tipoAnimal;
        System.out.print("Especifique con una letra el tipo de animal a elegir entre Perro (0), Gato (1) o Vaca (2): ");
        tipoAnimal = teclado.nextInt();

        //testear que sea 0, 1 o 2

        //asignar animal elegido

        //pedir por consola atributos del elegido colorDePelo, nombre, edad. usar tryCatch para asegurarse que sean String
        //y error para cuando la edad sea negativa

        //permitir agregar varios animales (opcion continuar)

        //sumarlos a un array e imprimirlo


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
