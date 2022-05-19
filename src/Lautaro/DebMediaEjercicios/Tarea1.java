package Lautaro.DebMediaEjercicios;

import java.util.ArrayList;

public class Tarea1 {
    private static int[][] matriz = new int[4][8];


    public static void main(String[] args) {
        cargadeMatriz();
        verMatriz();
        verMayoresoIguales10();
    }

    public static void cargadeMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * (100) + 1);
            }
        }
    }

    public static void verMatriz() {
        System.out.println("Matriz 4x8:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
    public static void verMayoresoIguales10() {
        ArrayList<Integer> listaMayores = new ArrayList<Integer>();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] >= 10) {
                    listaMayores.add(matriz[i][j]);
                }
            }
        }
        System.out.print("Mayores o iguales a 10:");
        System.out.println(listaMayores);
    }

}

