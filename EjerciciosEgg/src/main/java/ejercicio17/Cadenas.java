package ejercicio17;

import java.util.Scanner;

public class Cadenas {

  
    public static void main(String[] args) {
        
        System.out.println(" ------ Dispositivo RS232 ------");
        System.out.println("Los codigos deben comenzar con X y terminar con O"
                + " y no deben tener mas de 5 caracteres.");
        Scanner read = new Scanner (System.in);
        String fde = "&&&&&";
        String code;
        int c1 = 0;
        int c2 = 0;
        
        
        do {
            System.out.println("Ingrese una secuencia ($$$$$ para salir): ");
            code = read.nextLine().toUpperCase();
            if (code.length()<=5 && code.substring(0,1).equals("X") && code.substring(code.length()-1).equals("O")) {  
                System.out.println("Codigo correcto");
                c1 = c1 + 1;
            }
            else    {
                c2 = c2 + 1;
                System.out.println("Codigo erroneo");
            }
            
        } while (!code.equals("&&&&&"));
        
        System.out.println("La cantidad de codigos correctos fueron: " + c1);
        System.out.println("La cantidad de codigos incorrectos fueron: " + c2);
        
        
    }
    
}
