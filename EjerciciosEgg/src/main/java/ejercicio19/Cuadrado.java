package ejercicio19;

import java.util.Scanner;

public class Cuadrado {

    public static void main(String[] args) {
       
        Scanner read = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese la dimension del cuadrado: ");
        int dim = read.nextInt();
        System.out.println("");
        
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                    
                if (i == 0 || i == dim-1 || j == 0 || j == dim-1 ) {
                    System.out.print("*");
                   
                }
                if (j>0 && j < dim - 1 && i !=0 && i != dim - 1 ) {
                    System.out.print(" ");
                }
               
            }
            System.out.println(""); 
            
        }
        
        
    }
    
}
