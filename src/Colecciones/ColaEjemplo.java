package Colecciones;

import java.util.LinkedList;
import java.util.Queue;

    // FIFO = First In First Out
public class ColaEjemplo {
    public static void main(String[] args) {
        Queue<String> cola1 = new LinkedList<String>();
        System.out.println("Insertamos tres elementos en la cola: juan, ana y luis");
        cola1.add("juan");
        cola1.add("ana");
        cola1.add("luis");
        System.out.println("Cantidad de elementos en la cola:" + cola1.size());
        System.out.println("Extraemos un elemento de la cola:" + cola1.poll());
        System.out.println("Cantidad de elementos en la cola:" + cola1.size());
        System.out.println("Consultamos el primer elemento de la cola sin extraerlo:" + cola1.peek());
        System.out.println("Cantidad de elementos en la cola:" + cola1.size());
        System.out.println("Extraemos uno a un cada elemento de la cola mientras no este vacía:");
        while (!cola1.isEmpty())
            System.out.print(cola1.poll() + "-");
        System.out.println();

        Queue<Integer> cola2 = new LinkedList<Integer>();
        cola2.add(70);
        cola2.add(120);
        cola2.add(6);
        System.out.println("Imprimimos la cola de enteros");
        for (Integer elemento : cola2)
            System.out.print(elemento + "-");
        System.out.println();
        System.out.println("Borramos toda la cola");
        cola2.clear();
        System.out.println("Cantidad de elementos en la cola de enteros:" + cola2.size());
    }
}
