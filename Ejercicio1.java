import java.util.Scanner;

public class Ejercicio1 {
    /*
     *Ejercicio 1 bootcamp construccion de software

     * */

    public static void main(String args[]) {

        cuadrado();

    }


    // Funciones:

    // Imprimir un cuadrado.
    public static void cuadrado() {

        Scanner scan = new Scanner(System.in);
        int c, height = 0;

        System.out.print("Dibujar tres figuras Geomatricas: Cuadrado, Piramide y Rombo de altura n:");
        height = scan.nextInt();
        double total = Math.pow(height, 2);

        for(c = 0; c < total; c++) {
            System.out.print('*');
            if(c % height == 0) {
                System.out.println();
            } 
        }
        triangulo(height);
    }
    // /Imprimir cuadtrado //

    // Imprimir triangulo //
    public static void triangulo(int height) {

        System.out.println();

        int row, espacio = 0;
        int col = 0;

        for(row = 1; row <= height; row++) {
            for(espacio = (height - row); espacio >= 1; espacio--) {
                System.out.print(" ");
            }
            for(col = 1; col <= (2 * row)-1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        rombo(height);
    }
    // / Imprimir Triangulo //
    //
    // Imprimir Rombo //
    
    public static void rombo(int height) {
    
        System.out.println();

        int row, espacio = 0;
        int col = 0;

        for(row = 1; row <= height; row++) {
            for(espacio = (height - row); espacio >= 1; espacio--) {
                System.out.print(" ");
            }
            for(col = 1; col <= (2 * row)-1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(row = 1; row <= height; row++) {
            for(espacio = (height - row); espacio >= 1; espacio--) {
                System.out.print("*");
            }
            for(col = 1; col <= (2 * row)-1; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
