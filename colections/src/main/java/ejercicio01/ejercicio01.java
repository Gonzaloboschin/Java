/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList
*/
package ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;


public class ejercicio01 {


    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in).useDelimiter("\n");
        ArrayList <String> raza = new ArrayList();
        String option = "";
        
        do {
            System.out.println("Ingrese una raza de perro: ");
            raza.add(read.next());
            System.out.println("¿Desea ingresar otra raza?(S/N)");
            option = read.next().toLowerCase();
        } while (option.equals("s"));
        
        System.out.println("GRACIAS");
        System.out.println("Las razas fueron agregadas correctamente");
        System.out.println("Desea ver las razas ingresadas?(S/N)");
        option = read.next().toLowerCase();
        
        if (option.equals("s")) {
            for (String aux : raza) {
                System.out.println(aux);
            }
        }else{
        System.out.println("MUCHAS GRACIAS!");    
        }
            

        
        
    }
        
        
        
    
    
}
