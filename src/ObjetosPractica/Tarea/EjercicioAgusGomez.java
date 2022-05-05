package ObjetosPractica.Tarea;

import ObjetosPractica.Tarea.Model.CuentaAgustinGomez;

import java.util.Scanner;

public class EjercicioAgusGomez {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.print("Monto a ingresar: ");
        double montoIngresado = teclado.nextDouble();
        System.out.print("Monto a retirar: ");
        double montoRetirado = teclado.nextDouble();
        CuentaAgustinGomez cuenta = new CuentaAgustinGomez("Agustin");
        cuenta.setCantidad(2900);
        cuenta.ingresar(montoIngresado);
        System.out.println(cuenta.toString());
        cuenta.retirar(montoRetirado);
        System.out.println(cuenta.toString());
    }
}
