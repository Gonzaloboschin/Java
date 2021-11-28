package ejercicio06;

import java.util.Scanner;
import java.lang.*;


public class OperacionesMatematicas {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese un numero entero: ");
        int num = sc.nextInt();
        System.out.println("el doble del numero es: " + (num*2));
        System.out.println("el triple del numero es: " + (num*3));
        System.out.println("la raiz cuadrada del numero es: " + math.sqrt(num));
    }
    
}
