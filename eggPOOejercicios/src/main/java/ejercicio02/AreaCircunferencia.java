package ejercicio02;

import java.util.Scanner;

public class AreaCircunferencia {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Circunferencia c1 = new Circunferencia(0,0,0);
        System.out.println("Ingrese el radio de la circunferencia (en m2): ");
        c1.setRadio(sc.nextDouble());
        c1.area();
        c1.perimetro();
        System.out.println("El area de la circunferencia es: "+c1.getArea());
        System.out.println("El perimetro de la circunferencia es: "+c1.perimetro);
        
    }
    
}
