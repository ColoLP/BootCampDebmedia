package MaxiVilchez.LibrosYRevistas;
/*
Se deben crear 2 libros y 2 revistas . Probar TODOS sus metodos ingresando valores x teclado.
*/

import MaxiVilchez.LibrosYRevistas.Modulos.*;
import java.util.Scanner;


public class MainEjercicio {
    static Scanner teclado = new Scanner(System.in);
    static String titulo;
    static int codigo, anioPublicacion,numeroRevista;
    static boolean prestado;

    public static void main(String[] args) {
        System.out.println("Seleccione producto: \n1-Libro 2-Revista");
        int opcion = teclado.nextInt();
        ingresoDatos();
        if (opcion == 1) {
            libroDatos();
            prestarLibro();
        } else if (opcion == 2) {
            revistaDatos();
            System.out.println("Usted ingreso : " + revistaDatos().toString());
        } else {
            error();
        }
}


    //---------------------metodos para el main----------------------
    static void ingresoDatos(){
        System.out.print("Ingrese el titulo: ");
        String titulo = teclado.nextLine();
        titulo = teclado.nextLine();    //POR QUE NO FUNCIONA SI NO PONGO ESTO DOBLE?? SALTA DE LINEA SIN TOMAR DATOS
        System.out.println("Ingrese el codigo: ");
        int codigo = teclado.nextInt();
        System.out.println("Ingrese el anio de publicacion: ");
        int anioPublicacion = teclado.nextInt();
    }
    static Libro libroDatos() {
        Libro javaForDummies = new Libro(titulo, codigo, anioPublicacion);
        return javaForDummies;
    }

    static Revista revistaDatos(){
        System.out.println("Ingrese el numero de revista: ");
        int numeroRevista = teclado.nextInt();
        Revista genios = new Revista(titulo,codigo,anioPublicacion,numeroRevista);
        return genios;
    }
    static void prestarLibro() {

        System.out.println("Seleccione accion: \n1-Pedir prestado 2-Devolver");
        int accion = teclado.nextInt();
        if (accion==1) {
            if (libroDatos().isPrestado() == false) {
                System.out.println("Esta disponible, le fue prestado " + libroDatos().getTitulo());
                libroDatos().prestar();
            } else {
                System.out.println("No esta disponible");
            }
        } else if (accion==2) {
            if (libroDatos().isPrestado() == true) {
                System.out.println(libroDatos().getTitulo() + " fue devuelto, muchas gracias, vuelva prontos.");
                libroDatos().devolver();
            } else {
                System.out.println("Ya habia sido devuelto");
            }

        } else {
            error();
        }
            System.out.println("Estado de prestamo de " + libroDatos().getTitulo() + " : " + libroDatos().prestado());
    }

    static void error(){
        System.out.println("Ingrese un numero válido");
        System.exit(-1);
    }
}
