/* realizar la multiplicacion de un vector, por una matriz

 dada un vector 1*N y una matriz N*M,el resultado del producto es 1*M

 Ejeplo: vector 1*2 * matriz 2*3 = prodcuto 1*3
  v =[3,5] * m = [4,8,6] = |3*4+5*2 , 3*6+5*7| = [22,29,53]
         [2,1,7]
*/        
          
package vectoresymatrices;

import java.util.Scanner;

public class productoVectorMatriz {


    public static void main(String[] args, String i) {
        
// declaramos un arreglo
        int[] vector;
        // le damos un valor inicial (0 para enteros)
        vector = new int [2];
        // hacemos los dos pasos en una linea
        int[] producto =  new int[2];
        
// declaracion y creacion de una matriz   
// declaracion e inicializacion con valores predeterminados
        int [][] matriz = {{4,8,6},{4,8,6}};
        
// declaracion de arreglos de tipo generico
        
        System.out.println("Ingrese los valores del vector, del tamaño: " + vector.length + ": ");
        Scanner leer = new Scanner (System.in);
        // int = 0 porque los subindices de los arreglos den Java inician en cero
        for (int i = 0; i < vector.length; i++);
        
            System.out.println("v["+i+"]= ");
            vector[i] = leer.nextInt();
            
            
 
    
    }
}
