package Ejercicios;

import java.util.Scanner;

public class AgustinGomez {

    private static String nombres[] = new String[3];
    private static double sueldos[] = new double[3];
    private static Scanner teclado;


    public static void main(String[] args) {
        cargarDatos();
        devolverMayor();
        devolverMenor();
        calcularPromedio();
    }

    public static void cargarDatos(){
        teclado = new Scanner(System.in);
        for (int i = 0; i < nombres.length; i++){
            System.out.print("Ingrese un nombre: ");
            nombres[i] = teclado.next();
            System.out.print("Ingrese el sueldo: ");
            sueldos[i] = teclado.nextDouble();
        }
    }

    public static void devolverMayor(){
        double sueldoMax = sueldos[0];
        String nombreMax = "";

        for(int i = 0; i < sueldos.length; i++){
            if (sueldos[i] > sueldoMax){
                sueldoMax = sueldos[i];
                nombreMax = nombres[i];
            }
        }
        System.out.println("El sueldo máximo corresponde a " + nombreMax + " : " + sueldoMax);
    }

    public static void devolverMenor(){
        double sueldoMin = sueldos[0];
        String nombreMin = "";

        for(int i = 0; i < sueldos.length; i++){
            if (sueldos[i] < sueldoMin ){
                sueldoMin = sueldos[i];
                nombreMin = nombres[i];
            }
        }
        System.out.println("El sueldo mínimo corresponde a " + nombreMin + " : " + sueldoMin);
    }

    public static void calcularPromedio(){
        double promedioSalarial = 0;
        double sumaSueldos = 0;

        for (int i = 1; i < sueldos.length; i++){
            sumaSueldos += sueldos[i];
        }

        promedioSalarial = sumaSueldos/sueldos.length;

        System.out.println("El promedio salarial es: " + promedioSalarial);
    }

}
