package Manu.animales.models;

public class Perro extends Animal implements Comer {

    public Perro(int edad, String colorDePelo, String nombre) {
        super(edad, colorDePelo, nombre);

    }

    @Override
    public String toString() {
        return "Perro{" +
                "edad=" + edad +
                ", colorDePelo='" + colorDePelo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void hablar() {
        System.out.println("Guau!");
    }

    @Override
    public void comerCarne() {
        System.out.println("Que rica la carne, guau");
    }

    @Override
    public void comerHierva() {
        System.out.println("No tan rica la verdura che, guau");

    }
}
