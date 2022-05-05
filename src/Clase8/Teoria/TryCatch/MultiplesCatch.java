package Clase8.Teoria.TryCatch;
/*
    Podemos definir varios bloques catch para un solo bloque try.
    Es común que en un bloque try haya más de un método que pueda elevar excepciones o inclusive un mismo método puede generar más de un tipo de excepción.

    Luego podemos disponer una sintaxis de try/catch:

    try {
    [instrucciones 1]
    } catch([excepción 1]) {
    [instrucciones 2]
    }
    catch([excepción 2]) {
    [instrucciones 3]
    }
    catch([excepción n]) {
    [instrucciones n]
    }
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplesCatch {

    //Realizar la carga de 2 enteros por teclado, mostrar el resultado de dividir el primero por el segundo.

    public static void main(String[] ar) {
        Scanner teclado = new Scanner(System.in);
        try {
            int num1, num2;
            System.out.print("Ingrese primer valor entero (dividendo):");
            num1 = teclado.nextInt();
            System.out.print("Ingrese segundo valor entero (divisor):");
            num2 = teclado.nextInt();
            int resu = num1 / num2;
            System.out.print("La división de " + num1 + " / " + num2 + " es " + resu);
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente números enteros");
        } catch (ArithmeticException ex) {
            System.out.println("No se puede dividir por cero");
        } catch (Exception ex){
            System.out.println("Nose que sucedio" + ex);
        }
    }

}
