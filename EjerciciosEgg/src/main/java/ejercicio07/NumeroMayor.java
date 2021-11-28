package ejercicio07;

import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        System.out.println("iNGRESE UN NUMERO: ");
        int num1 = read.nextInt();
        System.out.println("INGRESE OTRO NUMERO: ");
        int num2 = read.nextInt();
        if (num1 < num2)
        {
            System.out.println("El numero mas grande es: " + num2 );
        }
        else
        {
            System.out.println("El numero mas grande es:" + num1);
        }
    }
    
}
