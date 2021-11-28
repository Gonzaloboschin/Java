package poo;

import javax.swing.*;

public class Uso_Coche {

    public static void main(String[] args) {
        
        /*  ahora para crear los objetos, INSTANCIAMOS la clase
        Abajo instanciamos la clase Coche. 
        Renault es un ejemplar de clase Coche
        */
        // llamamos al constructor
        Coche micoche = new Coche();
        
        // accedemos al setter
        
        micoche.establece_color(JOptionPane.showInputDialog("Introduce el color"));
        System.out.println(micoche.dime_color());
        System.out.println(micoche.dime_datos_generales());
        micoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
        System.out.println(micoche.dime_asientos());
        micoche.configura_climatizador(JOptionPane.showInputDialog("tiene climatizador?"));
        System.out.println(micoche.dime_climatizador());
        System.out.println(micoche.dime_peso_coche());
        System.out.println("el precio final del coche es: "+micoche.precio_coche());
    }
    
}
