package ejercicio15;

import java.util.Scanner;

public class Calculadora {


    public static void main(String[] args) {
        System.out.println("CALCULADORA:");
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese el primer numero: ");
        double num1 = read.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        double num2 = read.nextInt();
        
        int sel1 = 0;
    
        do {
            System.out.println("Elija que operacion desea realizar");
            System.out.println("MENU");
            System.out.println("1 - SUMAR");
            System.out.println("2 - RESTAR");
            System.out.println("3 - MULTIPLICAR");
            System.out.println("4 - DIVIDIR");
            System.out.println("5 - SALIR");
            System.out.println("Elija una opcion:");
            sel1 = read.nextInt();
            
            switch (sel1){

                case 1:
                    System.out.println("El resultado de la suma es: " + (num1 + num2) );
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + (num1 - num2));
                    break;
                case 3:    
                    System.out.println("El resultado de la multiplicacion es: " + (num1 * num2));
                    break;
                case 4:    
                    System.out.println("El resultado de la division es: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir?");
                    String sel2 = read.next().toLowerCase();
                    if (sel2.equals("s")){
                        sel1 = 7;
                    break;    
                    }
                    
                    default:
                        System.out.println("Intente con una opcion correcta!");
                        break;
            }

        } while (sel1 < 6);
        System.out.println("Muchas gracias! ");
    


    }
}