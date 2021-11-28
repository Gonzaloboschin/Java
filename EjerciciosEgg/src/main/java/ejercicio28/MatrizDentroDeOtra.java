package ejercicio28;

import java.util.Scanner;
import java.util.Random;

public class MatrizDentroDeOtra {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        Random random = new Random ();
        
        int matrizM [][] = new int [10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = random.nextInt(99);
            }
        }
        System.out.println("MATRIZ M DE 10 X 10");
        for (int [] fila: matrizM) {
            String aux = "";
            for (int elemento : fila) {
                aux = aux + " " + elemento;   
            }
            System.out.println(aux);
        }
        
        int suma2 = 0 ;
        System.out.println("Ingrese los elementos de la matriz P de 3 X 3");
        System.out.println("solo valores entre 0 y 99: ");
        int matrizP [][] = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print("M["+i+"]["+j+"]:");
                    matrizP [i][j] = sc.nextInt();
                    if (matrizP [i][j] >= 0 && matrizP [i][j] <= 100) {
                        suma2 = suma2 + matrizP [i][j];
                    }
                } while (matrizP [i][j] < 0 || matrizP [i][j] > 100);
            }
        }
        System.out.println("MATRIZ P DE 3 X 3");
        for (int [] fila : matrizP) {
            String aux = "";
            for (int elemento : fila ) {
                aux = aux + " " + elemento;
            }
            System.out.println(aux);
        }
        int suma1 = 0; 
        int k = 0;
        int l = 0;
        int a = 0;
        int b = 0;
                
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrizM [i][j] == matrizP [k][l]) {
                    for (k = i; k < i+3; k++) {
                        for (l = j; l < j+3; l++) {
                            if (matrizM [k][l] == matrizP [a][b]) {
                                suma1 = suma1 + matrizP [a][b];
                                System.out.print("["+k+"]["+l+"] ");
                            }
                            else{
                                suma1 = 0;
                            }
                            b++;
                        }
                        System.out.println("");
                        a++;
                        b = 0;
                    }
                    k=0;
                    l=0;
                    a=0;
                    b=0;
                            
                }
            }
            
        }
        
        if (suma1 == suma2) {
            System.out.println("La matriz P de 3x3 esta dentro de la matriz M de 10x10");
        
        }
        else{
            System.out.println("La matriz P no se encuentra dentro de la matriz M");
        }
            
    }
    
}
