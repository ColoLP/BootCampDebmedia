package DebMediaEjercicios;
//Programa para factorear numero ingresado
import java.util.Scanner;

public class SegundaTandaEjercicio2 {
    public static void main(String[] args) {
        int num, factorial = 1;

        if(args.length > 0) {
            num = Integer.parseInt(args[0]);
        } else {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Introduce un número: ");
            num = entrada.nextInt();
        }

        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + num +  " es: " + factorial);
    }

    }

