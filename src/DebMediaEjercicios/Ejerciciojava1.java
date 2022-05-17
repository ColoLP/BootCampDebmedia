package DebMediaEjercicios;

import java.util.Scanner;

public class Ejerciciojava1 {public static void main(String[] ar) {
    Scanner teclado=new Scanner(System.in);
    int num1,num2,num3,num4,suma,promedio;
    System.out.print("Ingrese primer valor:");
    num1=teclado.nextInt();
    System.out.print("Ingrese segundo valor:");
    num2=teclado.nextInt();
    System.out.print("Ingrese tercer valor:");
    num3=teclado.nextInt();
    System.out.print("Ingrese cuarto valor:");
    num4=teclado.nextInt();
    suma=num1 + num2 + num3 + num4;
    promedio=suma/4;
    System.out.print("La suma de los cuatro numeros es:");
    System.out.println(suma);
    System.out.print("El promedio es:");
    System.out.print(promedio); } }
