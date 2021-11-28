
package ejercicio05;

import java.util.Scanner;

public class EquivalenciaDeTemperaturas {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la temperatura en grados celsious: ");
        double tempc = sc.nextDouble();
        double tempf = 32 + ((9*tempc) / 5 );
        System.out.println("la temperatura en Fahrenheit es: " + tempf);
        
        
    }
    
}
