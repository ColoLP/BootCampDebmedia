package EjerciciosPrueba;

import java.util.ArrayList;
import java.util.Random;

public class TomasArrayList {

    private static ArrayList<Integer> mayores = new ArrayList<>();

    public static void main(String[] args) {
        Random rd = new Random();
        int matriz[][]=new int[5][2];
        System.out.println("Lleno la matriz");
        llenarMatriz(rd, matriz);
        System.out.println("Los mayores son : ");
        mayoresDeDiez(matriz);
    }

    private static void mayoresDeDiez(int[][] matriz) {
        for (int i = 0; i< matriz.length; i++){
            for (int j = 0; j< matriz[j].length; j++){
                int actual=matriz[i][j];
                if(actual>=40){
                    mayores.add(actual);
                    System.out.println(actual);
                }
            }
        }
    }

    private static void llenarMatriz(Random rd, int[][] matriz) {
        for (int i = 0; i< matriz.length; i++){
            for (int j = 0; j< matriz[j].length; j++){
                int numeroAleatorio = rd.nextInt(100);
                matriz[i][j]= numeroAleatorio;
                System.out.println("Ingreso "+numeroAleatorio);

            }
        }
    }
}
