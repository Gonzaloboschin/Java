/*
Escribir el código y las pruebas de escritorio para realizar la búsqueda del 
nombre de un cliente en un vector que contiene 5 clientes en total. El cliente
a buscar será ingresado por pantalla por el usuario. El algoritmo deberá 
devolver, en caso de que ese nombre exista, la posición en donde se encuentra 
dicho cliente dentro del vector.
*/

package buscarCliente;

import java.util.ArrayList;
import java.util.Scanner;

public class buscarCliente {

    public static void main(String[] args) {
        
        ArrayList <String> clientes = new ArrayList();
        String option = "";
        Scanner read = new Scanner (System.in).useDelimiter("\n");
        int i = 0;
        clientes.add("Juan");
        clientes.add("Martin");
        clientes.add("Julieta");
        clientes.add("Sol");
        clientes.add("Sofia");
        
        System.out.println(clientes);
        
        do {
            System.out.println("Ingrese el nombre del cliente: ");
            String cliente = read.next();
            for (String aux : clientes) {
                i += i;
                if (aux.equalsIgnoreCase(cliente)) {
                    int n = clientes.indexOf(aux)+1;
                    System.out.println("Se encuentra en la posicion " + n);
                    
                }
                //System.out.println(aux);
            }
            System.out.println("¿Desea buscar otro cliente? (S/N)");
            option = read.next();
        } while (option.equalsIgnoreCase("s"));

        System.out.println("Muchas gracias!");
        
    }
    
}
