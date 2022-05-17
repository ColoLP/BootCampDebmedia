package DebMediaEjercicios;

import java.util.Scanner;

public class Ejerciciojava2 {
    public static void main(String[] args) {
     Scanner teclado=new  Scanner(System.in);
     int cantidad;
        float precio;
        float importe;
        System.out.print("Ingrese los articulos que se llevaran:");
        cantidad=teclado.nextInt();
        System.out.print("Ingrese el valor de cada producto:");
        precio=teclado.nextFloat();
        importe=precio*cantidad;
        System.out.print("El importe total a pagar es:");
        System.out.print(importe);

    }
}
