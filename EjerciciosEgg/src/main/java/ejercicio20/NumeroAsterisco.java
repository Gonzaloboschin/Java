package ejercicio20;

import java.util.Scanner;

public class NumeroAsterisco {

    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        
        System.out.println("Ingrese un numero: ");
        
        int n = read.nextInt();
        String ast = "";
        
        for (int i = 0; i < n; i++) {
            ast = ast + "*";    
        }
        System.out.println(n + ast);   
        
        
    }
    
}
