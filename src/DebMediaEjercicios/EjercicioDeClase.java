package DebMediaEjercicios;


import java.util.Scanner;

public class EjercicioDeClase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ladoCuadrado;
        int perimetro;
        System.out.print("Ingresar lado del cuadrado");
        ladoCuadrado = teclado.nextInt();
        perimetro = ladoCuadrado * 4;
        System.out.print("El perimetro del cuadrado es ");
        System.out.print(perimetro);



    }
}