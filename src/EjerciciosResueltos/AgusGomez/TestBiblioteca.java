package EjerciciosResueltos.AgusGomez;

import EjerciciosResueltos.AgusGomez.Models.Libros;
import EjerciciosResueltos.AgusGomez.Models.Revistas;

import java.util.Scanner;

public class TestBiblioteca {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese datos del primer libro:");
        System.out.println("Ingresa el nombre de un libro (1): ");
        String nombreLib1 = teclado.nextLine();
        System.out.println("Ingrese el código del libro elegido: ");
        int codigoLib1 = teclado.nextInt();
        System.out.println("Ingrese el año de publicación del libro elegido: ");
        int anoLib1 = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Ingrese datos del segundo libro:");
        System.out.println("Ingresa el nombre de un libro (2): ");
        String nombreLib2 = teclado.nextLine();
        System.out.println("Ingrese el código del libro elegido: ");
        int codigoLib2 = teclado.nextInt();
        System.out.println("Ingrese el año de publicación del libro elegido: ");
        int anoLib2 = teclado.nextInt();
        teclado.nextLine();


        System.out.println("Ingrese datos de la primera revista:");
        System.out.println("Ingresa el nombre de una revista (1): ");
        String nombreRev1 = teclado.nextLine();
        System.out.println("Ingrese el código de la revista elegida: ");
        int codigoRev1 = teclado.nextInt();
        System.out.println("Ingrese el año de publicación de la revista elegida: ");
        int anoRev1 = teclado.nextInt();
        System.out.println("Ingrese el número de la revista elegida:");
        int numRev1 = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Ingrese datos de la segunda revista:");
        System.out.println("Ingresa el nombre de una revista (2): ");
        String nombreRev2 = teclado.nextLine();
        System.out.println("Ingrese el código de la revista elegida: ");
        int codigoRev2 = teclado.nextInt();
        System.out.println("Ingrese el año de publicación de la revista elegida: ");
        int anoRev2 = teclado.nextInt();
        System.out.println("Ingrese el número de la revista elegida:");
        int numRev2 = teclado.nextInt();

        Libros libro1 = new Libros(nombreLib1, codigoLib1, anoLib1);
        Libros libro2 = new Libros(nombreLib2, codigoLib2, anoLib2);

        Revistas rev1 = new Revistas(nombreRev1, codigoRev1, anoRev1, numRev1);
        Revistas rev2 = new Revistas(nombreRev2, codigoRev2, anoRev2, numRev2);

        libro1.devuelveAnoLibro();
        libro2.devuelveCodigoLibro();
        rev1.devuelveAnoRev();
        rev2.devuelveCodigoRev();

        System.out.println();

        libro1.presta();
        libro2.devuelve();

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(rev1.toString());
        System.out.println(rev2.toString());

    }
}
