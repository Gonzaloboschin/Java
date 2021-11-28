package ejercicio13;

import java.util.Scanner;

public class ValidarNotas {


    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        int note;
        do {
            note = read.nextInt();
            if (note > 0 && note <= 10){
                 System.out.println("La nota ingresada es correcta");
            break;
            }
            else{
                System.out.println("La nota ingresada es incorrecta");
            }
        } while (note> 0 || note <= 10);
        
    }
    
}
