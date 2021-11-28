package ejercicio12;

import java.util.Scanner;     

public class TipoMotor {

    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese la opcion que desee: ");
        int tipoMotor = read.nextInt();
        if (tipoMotor >= 1 && tipoMotor <= 4)   {
            switch (tipoMotor)  {
                case 1:
                    System.out.println("La bomba es una bomba de agua");
                    break;
                case 2:
                    System.out.println("La bomba es una bomba de gasolia");
                    break;                  
                case 3:
                    System.out.println("La bomba es una bomba de hormigon");
                    break;
                case 4:
                    System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;                    
                default:
                    System.out.println("No exite un valor valido para dicha bomba");
            }
        
        }
        
    }
    
}
