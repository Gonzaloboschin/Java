package ejercicio11;

import java.util.Scanner;

public class ValidarPrimerLetra {


    public static void main(String[] args) {
       
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese una fase: ");
        String sentence = read.nextLine();
        if (sentence.substring(0,1).equalsIgnoreCase("A"))    {
            System.out.println("CORRECTO");
        }
        else    {
            System.out.println("INCORRECTO");
        }
    }           
    
}
