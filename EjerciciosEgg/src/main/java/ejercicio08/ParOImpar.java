package ejercicio08;

import java.util.Scanner;

public class ParOImpar {

    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        int num = read.nextInt();
        if(num % 2 == 0){
            System.out.println("el numero es par");
        }
        else{
            System.out.println("el numero es impar"); 
        }
        
    }
    
}
