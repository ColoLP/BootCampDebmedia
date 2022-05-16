package DebMediaEjercicios;


import java.util.Scanner;

public class Ejerciciojava4 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int nota1,nota2,nota3,promedio;
        System.out.print("Ingrese primer nota:");
        nota1=teclado.nextInt();
        System.out.print("Ingrese segunda nota:");
        nota2=teclado.nextInt();
        System.out.print("Ingrese tercera nota:");
        nota3=teclado.nextInt();
        promedio=(nota1+nota2+nota3) /3;

        if (promedio >=8)
        System.out.print("Promocionado");
        else
        System.out.print("No promociona");
    }
}
