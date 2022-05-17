package DebMediaEjercicios;

public class SegundaTandaEjercicio4 {
    public static void main(String[] args) {
            int i=args.length;
            while (i > 0) {
                int j=args[i-1].length();
                while (j > 0) {

                    System.out.print(args[i-1].charAt(j-1));
                    j--;
                }
                System.out.print(" ");
                i--;
            }
            System.out.println();
}
}

