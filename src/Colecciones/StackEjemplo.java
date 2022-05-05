package Colecciones;

import java.util.Stack;

public class StackEjemplo {

    //LIFO = Last In First Out

    public static void main(String[] args) {
        // Este tipo de dato se puede decir que es una Lista LIFO(Last In First Out)
        Stack<String> pila1 = new Stack<String>();
        System.out.println("Insertamos 3 elementos a la lista: ");
        pila1.add("Roberto");
        pila1.push("Carla");
        pila1.add("Anastasio");
        System.out.println("Cantidad de elementos en la pila:" + pila1.size());
        System.out.println("Extraemos un elemento de la pila:" + pila1.pop());
        System.out.println("Cantidad de elementos en la pila:" + pila1.size());
        System.out.println("Consultamos el primer elemento de la pila sin extraerlo:" + pila1.peek());
        System.out.println("Cantidad de elementos en la pila:" + pila1.size());
        System.out.println("Extraemos uno a un cada elemento de la pila mientras no este vacía:");
        while (!pila1.isEmpty())
            System.out.print(pila1.pop() + "-");
        System.out.println();

        Stack<Integer> pila2 = new Stack<Integer>();
        pila2.push(70);
        pila2.push(120);
        pila2.push(6);
        System.out.print("La cantidad de elementos de la pila es: " +  pila2.size());
        System.out.println("Borramos toda la pila");
        pila2.clear();
        System.out.println("Cantidad de elementos en la pila de enteros:" + pila2.size());
    }
}
