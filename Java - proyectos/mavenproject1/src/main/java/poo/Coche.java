package poo;

public class Coche {
    
    private int ruedas;
    private int largo;          // en cm
    private int ancho;          // en cm
    private int motor;          // en cv
    private int peso_plataforma;           // kg
    private String color;
    private int  peso_total;
    private boolean asientos_cuero, climatizador;      //inicializamos dos variables en la misma linea
    
    // metodo constructor: es un metodo que da estado inicial al objeto
    // siempre se llama igual que la clase
    
    public Coche (){
        
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600; 
        peso_plataforma = 500;       


    }     
    
    
 /* GETTER
    creamos un unico metodo getter que nos devolvera todas las variables
    */
    
    
    public String dime_datos_generales (){
        return "la plataforma del vehiculo tiene  "+ ruedas + " ruedas" + 
        ". Mide " + largo/1000 + "metros con un ancho de " + ancho +
        " cm y un peso de plataforma de " + peso_plataforma + " kilos";
    }
    
    
    // METODO GETTERS
    
    public String dime_largo (){
        
        /* Como estamos dentro de la misma clase, podemos acceder
        al atributo largo, por mas de que este private
        */
   
        return "el largo del coche es "+largo;
     
    }
    
    public String dime_color (){
        return "el color del vehiculo es: "+color;
    }
    //  METODO SETTER
    /* se encarga de modificar el valor de una propiedad. LLeva el void 
    porque no devuelve dato, a diferencia del getter
    */
    public void establece_color (String color_coche){
        color = color_coche;
        
    }

    public void configura_asientos (String asientos_cuero){
        
        // setter
        if (asientos_cuero.equalsIgnoreCase("Si")) {
            this.asientos_cuero = true;
        }
        else{
            this.asientos_cuero = false;
        }
    }
        // getter
    public String dime_asientos(){
        if (asientos_cuero == true) {
            return "el coche tiene asientos de cuero";
        }
        else{
            return "el coche no tiene asientos de cuero";
        }
    }
    // setter
    public void configura_climatizador (String climatizador){
        if (climatizador.equalsIgnoreCase("Si")) {
            this.climatizador = true;
        }
        else{
            this.climatizador = false;
            
        }
          
    }
    
    public String dime_climatizador (){
        if (climatizador == true) {
            return "el coche incorpora climatizador";
        }
        else{
            return "el coche lleva aire acondicionado";
        }
  
    }
    
    // setter mas getter
    
    public String dime_peso_coche (){
        int peso_carroceria = 500;
        peso_total = peso_plataforma + peso_carroceria;
        if (asientos_cuero = true) {
            peso_total = peso_total + 50;
        if (climatizador = true) {
                peso_total = peso_total + 20;
        }
        return "el peso del coche es " + peso_total;
            
        }
        return null;
    }
    
    // getter
    public int precio_coche (){
        int precio_final = 10000;
        if (asientos_cuero=true) {
            precio_final += 2000;
             }
        if (climatizador = true) {
            precio_final += 1500;
            }
        return precio_final;
    }


    
    
    
    
    
}
