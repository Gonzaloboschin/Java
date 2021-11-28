package errores;

public class EjemploErrores {

    public static void main(String[] args) {
        int acumulador = 0;
        
        for (int i = 0; i < 10; i++) {
            acumulador = acumulador;
        }
        System.out.println(acumulador);
    }
    
    
    
    public static int suma(int a, int b){
        
        int c = a + b;
        return c;
    }
    
    public static void saludoPersonalizado (String nombre){
        System.out.println("hola "+nombre+"!, como estas?");
    }    
        
        
    
    
}
