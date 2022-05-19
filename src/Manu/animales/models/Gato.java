package Manu.animales.models;

public class Gato extends Animal implements Comer {
    public Gato(int edad, String colorDePelo, String nombre) {
        super(edad, colorDePelo, nombre);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "edad=" + edad +
                ", colorDePelo='" + colorDePelo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void hablar() {
        System.out.println("Miau!");
    }

    @Override
    public void comerCarne() {
        System.out.println("Que rica la carne, miau");
    }

    @Override
    public void comerHierva() {
        System.out.println("No tan rica la verdura che, miau");

    }
}
