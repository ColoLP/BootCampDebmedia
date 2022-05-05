package EjerciciosPrueba;

import java.util.ArrayList;
import java.util.Random;

public class ManuArrayList {
    public static void main(String[] args) {
        MatrizFiltrada();
    }
    private static void MatrizFiltrada() {
        int [][] matriz = new int[5][2];
        int filas = matriz.length;
        int columnas = matriz[0].length;

        //Cargar datos en matriz
        for (int i = filas-1; 0 <= i ; i--){
            for (int j = columnas-1; 0 <= j; j--){
                Random objGenerator = new Random();
                matriz[i][j] = objGenerator.nextInt(100);
            }
        }

        //Imprimir matriz
        System.out.println("La matriz aleatoria es:");
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        //Filtro <10
        ArrayList<Integer> listaFiltro = new ArrayList<Integer>();
        for (int i = filas-1; 0 <= i ; i--){
            for (int j = columnas-1; 0 <= j; j--){
                if (matriz[i][j] >= 10){
                    listaFiltro.add(matriz[i][j]);
                }
            }
        }
        System.out.print("Mayores a 10: ");
        System.out.println(listaFiltro);
    }

}
