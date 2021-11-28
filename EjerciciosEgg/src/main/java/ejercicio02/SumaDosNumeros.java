package ejercicio02;

import java.util.Scanner;

public class SumaDosNumeros {

    public static void main(String[] args) {
              
        Scanner teclado = new Scanner (System.in);
       
        System.out.println("Introduzca el primer valor que desee sumar: ");
        int num1 = teclado.nextInt(); 

        System.out.println("Introduzca el segundo valor que desee sumar: ");
        int num2 = teclado.nextInt();
       
        int suma = num1 + num2;
        
        System.out.println("La suma de " + num1 + " más " + num2 + " es " + suma + "." );
         
                   
       
    }
    
}
