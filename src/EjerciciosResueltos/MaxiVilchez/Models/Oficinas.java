package EjerciciosResueltos.MaxiVilchez.Models;

import EjerciciosResueltos.MaxiVilchez.Interfaces.IEdificio;

public class Oficinas implements IEdificio {

    //Atributos
    private int numeroOficinas;
    private double superficieEdif;

    //Constructores

    public Oficinas(){
        numeroOficinas=0;
        superficieEdif=0.00;
    }

    public Oficinas(int numeroOficinas, double superficieEdif) {
        this.numeroOficinas = numeroOficinas;
        this.superficieEdif = superficieEdif;
    }

    //Setters & Getters

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public void setSuperficieEdif(double superficieEdif) {
        this.superficieEdif = superficieEdif;
    }

    //Metodos

    @Override
    public String toString() {
        return "Oficinas{" +
                "numeroOficinas=" + numeroOficinas +
                ", superficieEdif=" + superficieEdif +
                '}';
    }

    //Metodos interfaz
    @Override
    public double getSuperficieEdificio() {
        return superficieEdif;
    }

}
