package DebMediaEjercicios;

import java.util.Scanner;

public class EjercicioClase4 {
    private static String[] nombres = new String[4];
    private static float[] sueldos = new float[4];
    private static Scanner teclado = new Scanner(System.in);

        public static void main(String[] args) {

            ingresodeVectores();
            int min = 0;
            int max = 0;
            float minimoSueldo = sueldos[0];
            float maximoSueldo = 0;
            float suma = 0;
            float promedioSueldo = 0;

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
            promedioSueldo = suma / sueldos.length;
            System.out.print("El sueldo mas alto es del empleado: " + nombres[max]);
            System.out.println(" con " + sueldos[max]);
            System.out.print("El sueldo mas bajo es del empleado: " + nombres[min]);
            System.out.println(" con " + sueldos[min]);
            System.out.println("El sueldo promedio es de: " + promedioSueldo);

        }
        private static void ingresodeVectores() {
            for(int i = 0; i < nombres.length; i++){
                System.out.print("Ingresar nombre del empleado: ");
                nombres[i] = teclado.next();
                System.out.print("Ingresar sueldo del empleado: ");
                sueldos[i] = teclado.nextFloat();




            }
        }

    }


