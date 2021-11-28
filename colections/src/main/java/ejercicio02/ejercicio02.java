/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada
*/



package ejercicio02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ejercicio02 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        ArrayList <String> raza = new ArrayList();
        String option = "";
        String option1 = "";
        String option2 = "";
        
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
        System.out.println("-------------");
        
        System.out.println("Desea eliminar alguna raza? (s/n)");
        option = read.next().toLowerCase();
        do {
            System.out.println("¿Que raza desea eliminar?");
            String eliminar = read.next().toLowerCase();
            Iterator <String> it = raza.iterator();
            while(it.hasNext()){
                String aux = it.next();
                if (aux.equalsIgnoreCase(eliminar)) {
                    it.remove();
                    System.out.println("La raza "+aux+" se elimino correctamente");
                    option = "";
                }
                if (aux != eliminar) {
                    System.out.println("No se encontro la raza");
                    option = "";
                }
                
            }
        } while (option.equalsIgnoreCase("s"));
        
        Collections.sort(raza);
        System.out.println(raza.toString());
        
    }
}