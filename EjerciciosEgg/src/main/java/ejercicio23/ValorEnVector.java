package ejercicio23;

import java.util.Scanner;

public class ValorEnVector {

    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int n = read.nextInt();
        int contador = 0;
        
        double[] vector = new double[n];
        for (int i = 0; i < n; i++) {
            vector[i] = Math.round(Math.random()*10);
            System.out.println(vector[i]);
            
        }
        System.out.println("Ingrese el numero a buscar");
        int num = read.nextInt();
        for (int j = 0; j < n; j++) {
            if (vector[j] == num){
                System.out.println("el numero se encuentra en la posicion " + j+1);
                contador++;
                }
            
            }
        if (contador > 1) {
            System.out.println("El numero se encuentra " + contador + " veces");
        
        }
        else{
            System.out.println("El numero no se repite");
        }    
        

            
           
        
        
        
        
        
        
        
    }
    
}
