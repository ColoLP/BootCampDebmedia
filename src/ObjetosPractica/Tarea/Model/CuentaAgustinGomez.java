package ObjetosPractica.Tarea.Model;

import java.util.Scanner;

/*
*Cree una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).
El titular será obligatorio(Si no lo tiene o su valor es null, imprimir error por consola) y la cantidad es opcional.
    • Crea dos constructores que cumpla lo anterior.
    • Crea sus métodos get, set y toString.

Tendrá dos métodos especiales:
    1. ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
    2. retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negatva, la cantidad de la cuenta pasa a ser 0.
    Imprimir por pantalla luego de utilizar ingresar y retirar. Los valores quedan a criterio y ganas de jugar de ustedes.
*
* */
public class CuentaAgustinGomez {

    // Atributos
    private String titular;
    private double cantidad;

    // Constructores


    public CuentaAgustinGomez() {
    }

    public CuentaAgustinGomez(String titular) {
        this.titular = titular;
        if (titular == null) {
            System.out.println("Debe ingresar un titular de cuenta");
            System.exit(-1);
        }
    }

    public CuentaAgustinGomez(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
        if (titular == null) {
            System.out.println("Debe ingresar un titular de cuenta");
            System.exit(-1);
        }
    }

    // Getters y Setters

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // Metodos

    public void ingresar(double montoIngresado) {
        if (montoIngresado > 0) {
            this.cantidad = this.cantidad + montoIngresado;
        }
    }

    public void retirar(double montoRetirado) {
        if ((this.cantidad - montoRetirado) < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = this.cantidad - montoRetirado;
        }
    }

    @Override
    public String toString() {
        return "Cuenta ->" +
                "\nTitular:\t" + getTitular() +
                "\nCantidad:\t$" + getCantidad();
    }

}
