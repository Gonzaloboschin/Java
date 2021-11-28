package ejercicio14;

import java.util.Scanner;

public class SumandoNumeros {


    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese el limite superior: ");
        int limit = read.nextInt();
        int sum = 0;
        do {
            System.out.println("Ingrese un numero");
            int num = read.nextInt();
            sum = sum + num;
        } while (sum < limit);   
        
        System.out.println("Has alcanzado el limite");
    }
    
}
