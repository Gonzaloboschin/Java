/* EXPECTED significa que esta esperando el punto y coma final
Diferenciar entre cadenas y caracteres.
 */
package ejemplo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // TIPOS DE DATOS -> DEFINIR 
        
        int numEnt = 0; // variable de tipo entero, la inicializamos en la misma linea
        double numReal = 0; // variable de tipo real. el punto identifica los numeros con decimales        
        String cadena = "hola mundo"; //  variable tipo CADENA 
        char caracter = 'A'; // Caracteres no llevan comillas, porq eso seria para cadenas 
        boolean logico = false; // pueden ser true o fals, variable de tipo LOGICO

        // oara usar un nuevo delimitador de palabra usamos el siguiente codigo
        
        Scanner leer = new Scanner(System.in).useDelimiter("/n");

        // ESCRIBIR atajo ->(escribo sout y toco tabulador)
        
        System.out.println("el texto que quiero mostrar " + cadena);

        /* el scanner se llamara leer, y el lo va a leer
        el scanner hay que importarlo */
        
        System.out.println("ingresa una palabra!");
        String palabra = leer.next(); //leer CADEBA
        System.out.println("la palabra  es: " + palabra);

        // lo que leamos se guardara en la variable de tipo string llamada palabra
        System.out.println("ingrese un numero entero");
        int num = leer.nextInt();
        System.out.println("el numero es " + num);

        System.out.println("ingrese un real");
        numReal = leer.nextDouble();
        System.out.println("el numero es " + numReal);

        System.out.println("ingrese un valor booleano");
        logico = leer.nextBoolean();
        System.out.println("el boleano es: " + logico);

        System.out.println("ingresar un caracter");
        caracter = leer.next().charAt(0); // para leer caracteres en distintas posiciones
        System.out.println("el caracter es: " + caracter);

    }

}
