package Lautaro.DebMediaEjercicios;

import java.util.Scanner;

public class EjercicioDeClase4 {
    public static void main(String[] args) {
        int H,M,S;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca hora: ");
        H =  sc.nextInt();
        System.out.print("Introduzca minutos: ");
        M =  sc.nextInt();
        System.out.print("Introduzca segundos: ");
        S =  sc.nextInt();
        if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60)
            System.out.println("Hora correcta");
        else
            System.out.println("Hora incorrecta");
    }
}
