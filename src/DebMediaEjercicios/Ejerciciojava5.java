package DebMediaEjercicios;

import java.util.Scanner;

public class Ejerciciojava5 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int num1;
        System.out.print("Ingrese un valor entero de 1 o 2 digitos:");
        num1=teclado.nextInt();
        if(num1<10){
            System.out.print("Tiene un digito");}
        else
            System.out.print("Tiene dos digitos");
    }
}
