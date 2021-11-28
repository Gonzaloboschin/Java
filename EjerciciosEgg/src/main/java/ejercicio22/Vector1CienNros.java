package ejercicio22;

public class Vector1CienNros {

    public static void main(String[] args) {
       
        int [] vector = new int [100];
        int i,j = 0;
        
        for (i = (vector.length-1); i >= 0; i--) {
            vector[j]=i;
            j++;
        }
        String aux = "";
        for (int elemento : vector) {
            aux = aux +"["+ elemento + "]";
        }
        System.out.println(aux);
    }
    
}
