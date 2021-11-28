package ejercicio02;

public class Circunferencia {
    
    // creamos las variables para el main 
    
    private double radio;
    private double area;
    public double perimetro;
    
    // Creamos el constructor
    
    public Circunferencia (double radio, double area, double perimetro){
        
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
}

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return area;
    }
    // creamos el metodo area
    public double area(){
        area = 3.1416*radio*radio;
        return area;
    }
    
    public double perimetro () {
        perimetro = 2 * 3.1416 * radio;
        return perimetro;
        
    }
    
}
