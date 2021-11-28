package ejercicio16;

import java.util.Scanner;

public class NumerosPositivos {

    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese 20 numeros: ");
        double sum = 0;
        
        for (int i = 0; i < 21; i++) {
            System.out.println("Ingrese un numero, faltan " + (20 - i) + " numeros");
            double n = read.nextInt();
            if (n > 0) {
                sum = sum + n;
            }
            else{
                if (n < 0) {
                    sum = sum + n;
                    sum = sum - n;
                }
            }
            if (n == 0) {
                System.out.println("Se capturo el numero cero");
                break;
            }
            else    {
                System.out.println("La suma de los numeros ingresados es: " + sum);
                
            }
        }
        
    }
    
}
