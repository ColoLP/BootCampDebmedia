package Clase6.EjerciciosResueltos;

import java.util.ArrayList;
import java.util.Iterator;

public class Ej1ArrayList {

    /* Recuerden que todo lo que ustedes hicieron funciona y esta perfecto.
       Aca les dejo mi manera de resolverlo y otra manera de reccorer un Array e imprimir
       sus elementos de una manera mas sencilla y con menos lineas de codigo.
    */
    private static ArrayList al = new ArrayList();
    private static int [] arr = new int [10];

    public static void main(String[] args)
    {
        cargoArray();
        mayoresA10();
        imprimoValores();
    }

    private static void imprimoValores() {
        Iterator it = al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    private static void mayoresA10() {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=10)
                al.add(arr[i]);
        }
    }

    private static void cargoArray() {
        // Indica la longitud
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = (int)(Math.random()*100+1);
        }
    }

}
