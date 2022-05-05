package Clase8.Models;

import Clase8.Teoria.TryCatch.PilaVaciaException;

public class Pila {

    class Nodo {
        int info;
        Nodo sig;
    }

    private Nodo raiz;

    public Pila() {
        raiz = null;
    }

    public void insertar(int x) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = x;
        if (raiz == null) {
            nuevo.sig = null;
            raiz = nuevo;
        } else {
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }

    public int extraer() throws PilaVaciaException {
        if (raiz != null) {
            int informacion = raiz.info;
            raiz = raiz.sig;
            return informacion;
        } else {
            throw new PilaVaciaException("No hay mas elementos en la pila");
        }
    }

    public boolean vacia() {
        return raiz == null;
    }

    public static void main(String[] ar) {
        Pila pila1 = new Pila();
        pila1.insertar(10);
        pila1.insertar(40);
        pila1.insertar(3);
        try {
            while (!pila1.vacia())
                System.out.println("Extraemos de la pila:" + pila1.extraer());
            System.out.println("Extraemos de la pila:" + pila1.extraer());
        } catch (PilaVaciaException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
