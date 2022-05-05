package Clase8.Models;

public abstract class Lista {

    public class Nodo {
        int info;
        Nodo sig;
    }

    protected Nodo raiz;

    public abstract void insertar(int x);

    public abstract int extraer(int x);

    public void imprimir() {
        Nodo reco = raiz;
        while (reco != null) {
            System.out.print(reco.info + " ");
            reco = reco.sig;
        }
        System.out.println();
    }
}
