package ejercicio24;

import java.util.Scanner;
import java.util.Random;

public class Vector24 {

    public static void main(String[] args) {
    
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese las dimensiones del vector: ");
        int n = read.nextInt();
        int vector [] = new int[n];
        Random aleatorio = new Random();
        for (int i = 0; i < n; i++) {
            vector[i] = aleatorio.nextInt(99999); 
        }
        
        int c1 = 0, c2 = 0,c3 = 0,c4 = 0, c5 = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i]);
            System.out.print(" - ");
            
        }
        
        
        
        for (int i = 0; i < 10; i++) {
            if (vector[i] > 10) {
                c1++;
            }
            if (vector[i] >= 10 && vector[i] < 100) {
                c2++;
            }
            if (vector[i] >= 100 && vector[i] < 1000) {
                c3++;
            }
            if (vector[i] >= 1000 && vector[i] < 10000) {
                c4++;
            }
            if (vector[i] >= 10000 && vector[i] < 100000) {
                c5++;
            }
            }
        System.out.println("La cantidad de numeros con 1 digito es " + c1);        
        System.out.println("La cantidad de numeros con 2 digitos es " + c2);        
        System.out.println("La cantidad de numeros con 3 digitos es " + c3);        
        System.out.println("La cantidad de numeros con 4 digitos es " + c4);        
        System.out.println("La cantidad de numeros con 5 digitos es " + c5);
        

        }

 
    }
    
    

