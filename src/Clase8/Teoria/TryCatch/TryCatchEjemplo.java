package Clase8.Teoria.TryCatch;
/*
    Java dispone de un mecanismo de capturar (catch) ciertos tipos de errores que solo pueden ser detectados en tiempo de ejecución del programa.

    Los ejemplos más comunes que podemos nombrar de excepciones:

    Tratar de convertir a entero un String que no contiene valores numéricos.
    Tratar de dividir por cero.
    Abrir un archivo de texto inexistente o que se encuentra bloqueado por otra aplicación.
    Conectar con un servidor de bases de datos que no se encuentra activo.
    Acceder a subíndices de vectores y matrices fuera de rango.
    La captura de excepciones nos permite crear programas mucho más robustos y tolerante a fallas
    que ocurren en escasas situaciones, pero en caso que se presenten disponemos de un algoritmo alternativo
    para reaccionar a dicha situación evitando que el programa finalice su ejecución.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchEjemplo {
    public static void main(String[] ar) {
        // Ejecucion de programa sin TryCatch.
        /*
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un valor entero:");
        num = teclado.nextInt();
        int cuadrado = num * num;
        System.out.print("El cuadrado de " + num + " es " + cuadrado);


        Scanner teclado = new Scanner(System.in);
        int num;
        try {
            System.out.print("Ingrese un valor entero:");
            num = teclado.nextInt();
            int cuadrado = num * num;
            System.out.print("El cuadrado de " + num + " es " + cuadrado);
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente un número entero." + ex);
        }

/*
        Scanner teclado = new Scanner(System.in);
        int num;
        boolean continua = true;

        while(continua){
            try {
                continua = false;
                System.out.print("Ingrese un valor entero:");
                num = teclado.nextInt();
                int cuadrado = num * num;
                System.out.print("El cuadrado de " + num + " es " + cuadrado);
            } catch (InputMismatchException ex) {
                System.out.println("Debe ingresar obligatoriamente un número entero.");
                teclado.next();
                continua = true;
            }
        }*/
    }
}
