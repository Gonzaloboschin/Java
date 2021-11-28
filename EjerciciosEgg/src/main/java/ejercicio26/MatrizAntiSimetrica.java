package ejercicio26;

import java.util.Scanner;
import java.util.Random;

public class MatrizAntiSimetrica {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la dimension de la matriz cuadrada:");
        int n = sc.nextInt();
        Random aleatorio = new Random();
        int matriz [][] = new int [n][n];
        int matrizAntis [][] = new int [n][n];
        
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = aleatorio.nextInt(10);
                System.out.print("["+ matriz [i][j]+"]");
            }
            System.out.println(" ");
        }
        
        System.out.println("MATRIZ ANTISIMETRICA");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizAntis[i][j] = matriz[j][i]*(-1);
                System.out.print("["+ matrizAntis [i][j]+"]");
            }
            System.out.println(" ");
        }
    }
    
}
