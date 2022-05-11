package debmedia.ejercicios.animales;

import debmedia.ejercicios.animales.models.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String continuar = "Perro";
        ArrayList<Animal> animales = new ArrayList<>();

        while (continuar.equals("Perro") || continuar.equals("Gato") || continuar.equals("Vaca")) {
            switch (continuar) {
                case "Perro" -> {
                    Perro perro = new Perro();
                    try {
                        System.out.print("Ingrese el nombre del perro: ");
                        perro.setNombre(teclado.next());
                        System.out.print("Ingrese el color de pelo del perro: ");
                        perro.setColorDePelo(teclado.next());
                        System.out.print("Ingrese la edad del perro: ");
                        perro.setEdad(teclado.nextInt());
                        if (perro.getEdad() <= 0) {
                            System.out.println("La edad a ingresar debe ser mayor a 0.");
                            System.exit(-1);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Debe ingresar PALABRAS para los campos nombre y color de pelo");
                        System.out.println("Debe ingresar NÚMEROS mayores que 0 para el campo edad");
                        System.exit(-1);
                    }
                    animales.add(perro);
                }
                case "Gato" -> {
                    Gato gato = new Gato();
                    try {
                        System.out.print("Ingrese el nombre del gato: ");
                        gato.setNombre(teclado.next());
                        System.out.print("Ingrese el color de pelo del gato: ");
                        gato.setColorDePelo(teclado.next());
                        System.out.print("Ingrese la edad del gato: ");
                        gato.setEdad(teclado.nextInt());
                        if (gato.getEdad() <= 0) {
                            System.out.println("La edad a ingresar debe ser mayor a 0.");
                            System.exit(-1);
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("Debe ingresar PALABRAS para los campos nombre y color de pelo");
                        System.out.println("Debe ingresar NÚMEROS mayores que 0 para el campo edad");
                        System.exit(-1);
                    }
                    animales.add(gato);
                }
                case "Vaca" -> {
                    Vaca vaca = new Vaca();
                    try {
                        System.out.print("Ingrese el nombre de la vaca: ");
                        vaca.setNombre(teclado.next());
                        System.out.print("Ingrese el color de pelo de la vaca: ");
                        vaca.setColorDePelo(teclado.next());
                        System.out.print("Ingrese la edad de la vaca: ");
                        vaca.setEdad(teclado.nextInt());
                        if (vaca.getEdad() <= 0) {
                            System.out.println("La edad a ingresar debe ser mayor a 0.");
                            System.exit(-1);
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("Debe ingresar PALABRAS para los campos nombre y color de pelo");
                        System.out.println("Debe ingresar NÚMEROS mayores que 0 para el campo edad");
                        System.exit(-1);
                    }
                    animales.add(vaca);
                }
            }
            System.out.println("Ingrese el comando Perro, Gato o Vaca para continuar agregando animales.");
            continuar = teclado.next();
        }

        Iterator<Animal> it = animales.iterator();
        for (int i = 0; i < animales.size(); i++) {
            System.out.println(it.next().toString());
            System.out.println("----------------------------------");
        }


    }


}
