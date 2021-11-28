package ejercicio21;
import java.util.Scanner;

public class ConversorMoneda {

    public static void main(String[] args) {
     
        Scanner read = new Scanner (System.in);
        
        System.out.println("Ingrese la moneda a la que desea convertir:");
        System.out.println("    1 - Libras");
        System.out.println("    2 - Dolares");
        System.out.println("    3 - Yenes");
        System.out.println("elija la opcion deseada: ");
        
        int n = read.nextInt();
       
        System.out.println("Ingrese la cantidad de Euros: ");
        double eur = read.nextDouble();
        
        
        switch(n){
            case 1:
                System.out.println("son " + (eur*0.86) + " libras ");
                break;
            case 2:
                System.out.println("son " + (eur*1.28611) + " dolares");
                break;
            case 3:    
                System.out.println("son " + (eur*129.852) + " yenes");
                break;
            case 0:
                System.out.println("Muchas gracias!");
                break;
            default:
                System.out.println("Ingrese una opcion correcta");
                break;
            }     
       
   
        }

    }
    

