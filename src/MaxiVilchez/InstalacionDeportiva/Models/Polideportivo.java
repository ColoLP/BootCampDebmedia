package EjerciciosResueltos.MaxiVilchez.Models;

import EjerciciosResueltos.MaxiVilchez.Interfaces.IEdificio;
import EjerciciosResueltos.MaxiVilchez.Interfaces.IInstalacionDeportiva;

public class Polideportivo implements IEdificio, IInstalacionDeportiva {
    //Atributos
    private int tipoDeInstalacion;
    private String nombre;
    private double superficieEdif;

    //Constructores

    public Polideportivo(){
        tipoDeInstalacion=0;
        nombre="";
        superficieEdif=0.00;
    }

    public Polideportivo(int tipoDeInstalacion, String nombre, double superficieEdif) {
        this.tipoDeInstalacion = tipoDeInstalacion;
        this.nombre = nombre;
        this.superficieEdif = superficieEdif;
    }

    //Setters & Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSuperficieEdif(double superficieEdif) {
        this.superficieEdif = superficieEdif;
    }

    //getSuperficieEdificio y getTipoInstalacion fueron Overriden.

    //Metodos
    @Override
    public String toString() {
        return "Polideportivo{" +
                "tipoDeInstalacion=" + tipoDeInstalacion +
                ", nombre='" + nombre + '\'' +
                ", superficieEdif=" + superficieEdif +
                '}';
    }

    //Metodos interfaz
    @Override
    public double getSuperficieEdificio() {
        return superficieEdif;
    }

    @Override
    public int getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

}