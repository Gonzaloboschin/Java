package ejercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno_servicio {
    
    Scanner read = new Scanner (System.in).useDelimiter("\n");
    ArrayList <String> alumnos_nombre = new ArrayList();
    ArrayList <Integer> alumnos_notas = new ArrayList();
    String option = "";
    
    public ArrayList<String> agregarAlumno(){
        do {
            System.out.println("Ingrese el nombre del alumno: ");
            alumnos_nombre.add(read.next());     
            System.out.println("¿Desea agregar otro alumno?");
            option = read.next().toLowerCase();
        } while (option.equals("s"));
        return alumnos_nombre;
    
    }
    
    public Integer alumnos_notas(String alumno){
        alumnos_notas.clear();
        System.out.println("Ingrese la primer nota");
        alumnos_notas.add(read.nextInt());
        System.out.println("Ingrese la segunda nota");
        alumnos_notas.add(read.nextInt());
        System.out.println("Ingrese la tercer nota");
        alumnos_notas.add(read.nextInt());
        int suma = 0;
        
        for (Integer aux : alumnos_notas) {
            suma += aux;
        }
        //System.out.println(alumnos_notas.size());
        System.out.println(alumnos_notas);
        int promedio = suma/alumnos_notas.size();
        System.out.println("PROMEDIO: "+promedio);
        return promedio;        
    }
    
    public ArrayList<Integer> alumnos_promedio (Integer nota){
        ArrayList <Integer> promedio = new ArrayList();
        promedio.add(nota);
        return promedio;
        
    }
    
   
}
