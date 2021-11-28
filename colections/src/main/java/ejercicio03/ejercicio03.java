/*
Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Despues de ese bluce tendremos el siguiente método en la clase Alumno:
Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final
de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main.
*/

package ejercicio03;

import java.util.Scanner;

public class ejercicio03 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in).useDelimiter("\n");
        Alumno_servicio as = new Alumno_servicio();
        
        as.agregarAlumno();
        
        String option = "";
        
        do {
            for (String aux : as.alumnos_nombre) {
                System.out.println("Alumno: "+aux);
                as.alumnos_notas(aux);
                as.alumnos_notas.forEach(a -> {
                    as.alumnos_promedio(a);
                });
            }
        } while (option.equals("s"));                         
        System.out.println(as);
    }
    
}
