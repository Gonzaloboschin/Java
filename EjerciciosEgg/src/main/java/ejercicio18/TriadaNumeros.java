package ejercicio18;

import java.util.Scanner;

public class TriadaNumeros {

    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        String n1;
        String n2;
        String n3;
        
        for (int i = 0; i < 10; i++) {
            n1 = String.valueOf(i);
            for (int j = 0; j < 10; j++) {
                n2 = String.valueOf(j);
                for (int k = 0; k < 10; k++) {
                    n3 = String.valueOf(k);
                        n1 = n1.replace("3", "E");
                        n2 = n2.replace("3", "E");
                        n3 = n3.replace("3", "E");
                    
                            System.out.println(n1 + " - " + n2 + " - " + n3);
                            
                }
                
            }
            
        }
    }
    
}
