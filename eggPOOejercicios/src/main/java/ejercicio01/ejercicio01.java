package ejercicio01;

import java.util.Scanner;

public class ejercicio01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        Libro book1 = new Libro (null, null, 0, null);
        
        System.out.println("Ingrese el codigo ISBN:");
        book1.ISBN = sc.next();
        
        System.out.println("Ingrese el autor del libro: ");
        book1.autor = sc.next();
        
        System.out.println("Ingrese el titulo del libro: ");
        book1.titulo = sc.next();
        
        System.out.println("Ingrese el numero de paginas del libro: ");
        book1.nropaginas = sc.nextInt();
        
        
        
        System.out.println("Codigo ISBN: "+ book1.ISBN);
        System.out.println("Titulo: "+ book1.titulo);
        System.out.println("Autor: " + book1.autor);
        System.out.println("Cantidad de paginas: " + book1.nropaginas);
        
        
    }
    
}
