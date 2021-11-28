package ejercicio25;

import java.util.Scanner;
import java.util.Random;

public class MatrizCuadradaYTrans {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int matriz[][] = new int[4][4];
        int matrizTrans[][] = new int[4][4];
        Random aleatorio = new Random();
        
        
        System.out.println(" MATRIZ CUADRADA DE LADO 4 ");
        System.out.println(" ");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = aleatorio.nextInt(100);
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println(" ");
        }
        
        System.out.println("MATRIZ TRANSPUESTA");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizTrans[i][j] = matriz [j][i];
                System.out.print("["+matrizTrans[i][j]+"]");
            }
            System.out.println(" ");
        }
        
        
        
        
        
        
        
    }
    
}
