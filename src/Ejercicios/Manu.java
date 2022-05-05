package Ejercicios;
/*
MANU
      - Tarea:
       - Cargar Nombre y Sueldo de 5 empleados por teclado.
       - Imprimir maximo, minimo y promedio salarial.

 */

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Manu {
    private static Scanner teclado = new Scanner(System.in);
    private static String[] nombres = new String[4]; //vector tipo string
    private static float[] sueldos = new float[4]; //vector tipo float


    public static void main(String[] args) {
        ingresoVectores();
        maximosYMinimos();
    }

    public static String convertir(double val){
        Locale.setDefault(Locale.US);
        DecimalFormat num = new DecimalFormat("#,###.00");
        return num.format(val);
    }

    private static void maximosYMinimos() {
        int max = 0;
        int min = 0;
        float minimoSueldo = sueldos[0];
        float maximoSueldo = sueldos[0];
        float suma = 0;
        float promedio = 0;

        for(int i = 0; i < nombres.length; i++){
            if (sueldos[i] >= maximoSueldo){
                max = i;
                maximoSueldo = sueldos[i];
            }
            if (sueldos[i] <= minimoSueldo){
                min = i;
                minimoSueldo = sueldos[i];
            }
            suma = suma + sueldos[i];
        }
        promedio = suma / sueldos.length;

        System.out.print("El sueldo mas alto es de: " + nombres[max]);
        System.out.println(" con " + maximoSueldo);

        System.out.print("El sueldo mas bajo es de: " + nombres[min]);
        System.out.println(" con " + minimoSueldo);

        System.out.println("El sueldo promedio es de: " + promedio);
    }

    private static void ingresoVectores() {
        for(int i = 0; i < nombres.length; i++){
            System.out.print("Ingrese nombre: ");
            nombres[i] = teclado.next();
            System.out.print("Ingrese sueldo: ");
            sueldos[i] = teclado.nextFloat();
        }
    }

}
