package ejercicio10;

import java.util.Scanner;

public class FraseOchoLetras {

    public static void main(String[] args) {
    
    Scanner read = new Scanner(System.in);
    System.out.println("Ingrese una frase: ");
    String sentence = read.next();
    if (sentence.length() != 8) {           // .length es un contador de espacios de un string
        System.out.println("INCORRECTO");
    }
    else {
        System.out.println("CORRECTO");
    }    
    }
    
}
