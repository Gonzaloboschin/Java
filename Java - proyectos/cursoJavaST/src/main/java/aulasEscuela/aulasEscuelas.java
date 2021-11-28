/*
Sabiendo la cantidad de bancos de cada aula, el usuario deberá ingresar la cantidad
de alumnos inscriptos para cursar tercer grado y el sistema deberá determinar qué aula 
es la indicada para la cantidad ingresada. La escuela ya sabe que la máxima capacidad
de sus aulas es de 40 alumnos, por lo tanto, la cantidad de alumnos inscriptos que 
ingresa el usuario siempre será un número menor o igual a 40. 

Las 3 aulas deben quedar ocupadas según los datos ingresados

*/

package aulasEscuela;

import java.util.Scanner;

public class aulasEscuelas {

    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in).useDelimiter("\n");
        int cantAlumnos = 0;
        
        String option1 = "";
        String option2 = "";
        
        int dispoSalaAzul = 40;
        int dispoSalaVerde = 35;
        int dispoSalaAmarilla = 30;

        
        System.out.println(" ------ LLENADO DE AULAS ------- ");
        System.out.println("Capacidades de aulas");
        System.out.println("    - Azul " +dispoSalaAzul);
        System.out.println("    - Verde "+ dispoSalaVerde);
        System.out.println("    - Amarilla "+ dispoSalaAmarilla);
        
        do {
            
            do {
                System.out.println("Ingrese la canatidad de alumnos: ");
                cantAlumnos = read.nextInt();
                System.out.println("La cantidad ingresada fue de "+ cantAlumnos +" alumnos");
                System.out.println("¿Es correcto?(S/N) ");
                option1 = read.next();
            } while (option1.equalsIgnoreCase("n"));
            option1 = "";
            
            if (cantAlumnos > 40 ) {
                System.out.println("La capacidad maxima de un aula es de 40");
            }
            if (cantAlumnos < 0) {
                System.out.println("Ingrese una cantidad correcta!");
            }
            if (cantAlumnos > 35 && cantAlumnos <= 40) {
                if (cantAlumnos < dispoSalaAzul) {
                    do {
                        System.out.println(cantAlumnos + " Agregados a aula azul");
                        dispoSalaAzul = dispoSalaAzul - cantAlumnos;
                        break;
                    } while (dispoSalaAzul >= 1);
                } else {
                    System.out.println("Ingrese una cantidad menor");
                }
                if (dispoSalaAzul < 1) {
                    System.out.println("Ingrese una cantidad menor");
                }
            }    
            if (cantAlumnos > 30 && cantAlumnos <= 35) {
                if (cantAlumnos < dispoSalaVerde) {
                    do {
                        System.out.println(cantAlumnos + " Agregados a aula verde");
                     dispoSalaVerde = dispoSalaVerde - cantAlumnos;
                        break;
                    } while (cantAlumnos != 0 && dispoSalaVerde >= 1);
                } else {
                    System.out.println("Ingrese una cantidad menor");
                }
                if (dispoSalaVerde < 1) {
                    System.out.println("Ingrese una cantidad menor");
                }
            }
            if (cantAlumnos > 1 && cantAlumnos <= 30) {
                if (cantAlumnos < dispoSalaAmarilla) {
                    do {
                        System.out.println(cantAlumnos + " Agregados a aula amarilla");
                        dispoSalaAmarilla = dispoSalaAmarilla - cantAlumnos;
                        break;
                    } while (dispoSalaAmarilla >= 1);  
                } else {
                    System.out.println("Ingrese una cantidad menor");
                }
                if (dispoSalaAmarilla < 1) {
                    System.out.println("Ingrese una cantidad menor");
                }
            }
            cantAlumnos = 0;
            
            System.out.println(" ---- DISPONIBILIDAD DE AULAS ---- ");
            System.out.println("Aula Azul " + dispoSalaAzul);
            System.out.println("Aula Verde " + dispoSalaVerde);
            System.out.println("Aula Amarilla " + dispoSalaAmarilla);
            
        System.out.println("¿Desea seguir ingresando alumnos?(s/n)");
        option2 = read.next();
        } while (option2.equalsIgnoreCase("s"));
        
        System.out.println("MUCHAS GRACIAS!");
 
        
    }
    
}
