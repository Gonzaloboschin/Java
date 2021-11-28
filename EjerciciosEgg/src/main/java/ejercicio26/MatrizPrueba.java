package ejercicio26;

import java.util.Scanner;

public class MatrizPrueba {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese las dimensiones de la matriz: ");
        int n = sc.nextInt();
        int matriz1 [][] = new int [n][n];
        int matriz2 [][] = new int [n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el valor para la fila " + (i+1) + " columna " + (j+1));
                matriz1[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz1[i][j]+ "]");
                
            }
            System.out.println(" ");
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz2[i][j] = matriz1[j][i];      
            }
        }
        int cont =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (- matriz1[i][j] == matriz2[j][i]) {
                    cont++;
                }
            }
        }
        
        if (n*n == cont) {
            System.out.println("SON MATRICES ANTISIMETRICAS");   
        }
        else{
            System.out.println("NO SON MATRICES ANTISIMETRICAS");
        }
        
    }
    
}
