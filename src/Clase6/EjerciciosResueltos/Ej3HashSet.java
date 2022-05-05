package Clase6.EjerciciosResueltos;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/*
* Ejercicio 4: uso de HashSet
  Reglas de bolas de dos colores: cada apuesta en la bola de dos colores consta de 6 números de bolas rojas
* y 1 número de bolas azules. El número de bola roja se selecciona del 1 al 33; el número de bola azul se selecciona del 1 al 16;
* genere aleatoriamente un número de bola de doble color. (Requiere que no se repita el mismo número de color)
* */

public class Ej3HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int i = 0;
        while(i<6)
        {
            Random rand = new Random();
            int randNum = rand.nextInt(33)+1;
            if(!hs.contains(randNum))
            {
                hs.add(randNum);
                i++;
            }
        }
        boolean flag = true;
        while(flag)
        {
            Random blue = new Random();
            int blueNum = blue.nextInt(16)+1;
            if(!hs.contains(blueNum))
            {
                hs.add(blueNum);
                flag = false;
            }
        }
        Iterator it = hs.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
