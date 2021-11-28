package ejercicio27;

import java.util.Scanner;

public class MatrizMagica {

    private static int sumadiag1;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int matriz [][] = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int n = 0;
                while (n <= 9 && n >= 1);
                    System.out.println("Numeros del 1 al 9");
                    System.out.println("Ingrese el valor para la fila " + (i+1) + " columna " + (j+1));   
                    matriz[i][j] = sc.nextInt();
                
            }
            
            
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz [i][j]+"]");
            }
            System.out.println(" ");
        }
       
        
        int col [] = new int[3];
        int fila [] = new int[3];
        int diag1 = 0; int diag2 = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                col[i] = col[i] + matriz[j][i];
                fila[i] = fila[i] + matriz[i][j];
                if (i == j){
                    diag1 = diag1 + matriz[j][i];
                }
                if ( i+j == 2){
                    diag2 = diag2 + matriz[i][j];
                }
            }
        }
        int sumacol = 0;
        int sumafila = 0;
        int sumadiag1 = 0;
        int sumadiag2 = 0;
        
        for (int i = 0; i < 3; i++) {
            sumacol = sumacol + col[i];
            sumafila = sumafila + fila[i]; 
            for (int j = 0; j < 3; j++) {
                if (j == i){
                    sumadiag1 = sumadiag1 + matriz [i][j];
                }
                if (j + i == 2){
                    sumadiag2 = sumadiag2 + matriz [i][j];
                }           
            }
        }
                        
               
        if (sumacol == sumafila && (sumafila/3) == sumadiag1 && sumadiag1 == sumadiag2) {
            System.out.println("LA MATRIZ ES MAGICA");
        
        }
        else{
            System.out.println("LA MATRIZ NO ES MAGICA");}
        
    }
    
}
