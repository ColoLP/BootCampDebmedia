package EjerciciosPrueba;

import java.util.ArrayList;

public class AgustinGomezArrayList {

    private static int[][] matriz = new int[2][5];


    public static void main(String[] args) {
        cargarMatriz();
        mostrarMatriz();
        devolverMayores();
    }

    public static void cargarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * (100) + 1);
            }
        }
    }

    public static void mostrarMatriz() {
        System.out.println("Matriz 2x5:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void devolverMayores() {
        ArrayList<Integer> listaMayores = new ArrayList<Integer>();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] >= 10) {
                    listaMayores.add(matriz[i][j]);
                }
            }
        }
        System.out.print("Los números mayores o iguales a 10 están cargados en la siguiente lista:");
        System.out.println(listaMayores);
    }


}
