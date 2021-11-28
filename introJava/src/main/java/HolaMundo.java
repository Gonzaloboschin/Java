
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gonzalo
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Se crea la variable scanner que se usa para leer datos del usuario    
        Scanner leer = new Scanner(System.in);
        // se crea una variable cadena (string) que lee los datos de usuario
        String nombre;
        // mostramos un mensaje en pantalla
        System.out.println("ingresa tu nombre:");
        // Leemos el nombre ingresado en la variable nombre
        nombre = leer.next();
        //mostramos por consola un saludo personalizado
        System.out.println("hola mundo! Soy " + nombre + " y estoy programando en JAVA");
        
    
    
    }
    
    
}
