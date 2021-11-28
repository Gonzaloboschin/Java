package ejercicio09;

import java.util.Scanner;
        
public class FrasesIdenticas {

    public static void main(String[] args) {
        
        Scanner sent = new Scanner (System.in);
        System.out.println("Ingrese una frase: ");
        String sentence = sent.next();
        if (sentence.equals("eureka")){
            System.out.println("CORRECTO");
        }
        else {
            System.out.println("INCORRECTO");
        }
        
        
        
    }
    
}
