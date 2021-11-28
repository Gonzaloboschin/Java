package funciones;

// las funciones nos permiten reutilizar codigo

import java.util.Scanner;

public class FuncionesEnJava {
    //el metodo main es el primer metodo que se ejecutara cuando ejectemos la aplicacion
    // este metodo esta dentro de una clase, en este caso llamada FuncionesEnJava
    public static void main(String[] args) {
        //creams la funcion sumar
        //el denominador de accesibilidad lo hacemos publico
       // en el metodo main invocamos la funcion
       // generamos una variable donde asignamos el producto de la funcion
       int resultado = suma(10,10);
        System.out.println(resultado);
        suma(10,10);

        saludoPersonalizado("Gonzalillo querido");
        Scanner leer = new Scanner (System.in);
        String nombre = leer.next();
        saludoPersonalizado(nombre);
        saludoPersonalizado(leer.next());
        
        
    
    
    
    }
        public static int suma(int a, int b){
            // este es el cuerpo de la funcion
            // logica
            int c = a+b;
            // especificamos la variable que nos tiene que devolver
            return c;
        }
        public static void saludoPersonalizado(String nombre){
            System.out.println("Hola "+ nombre + ", como estas?");
            
        }

            
          

}                

    

