package ejercicio04;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class FraseEnMayusculas {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase");
        String frase = sc.next();
        System.out.println("La frase es " + toUpperCase(frase));
        System.out.println("la frase en minusculas es: " + toLowerCase(frase));
        
        
    }
    
}
