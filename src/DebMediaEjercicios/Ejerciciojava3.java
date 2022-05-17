package DebMediaEjercicios;

import java.util.Scanner;


public class Ejerciciojava3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        int suma, dif, prod, div;
        System.out.print("Ingrese el primer numero:");
        n1= sc.nextInt();
        System.out.print("Ingrese el segundo numero:");
        n2= sc.nextInt();
        suma = n1+n2;
        dif = n1-n2;
        prod = n1*n2;
        div = n1/n2;

        if(n1 > n2)
        System.out.print("El mayor es:" + n1 + "Y la suma es:" + suma + "Su diferencia es:" + dif);

        else if(n2 > n1) {
            System.out.print("El mayor es:" + n2 + "Y el producto es:" + prod + "Su division es:" + div);
            System.out.print("Uno de los numeros es igual al otro");


        }



    }
}
