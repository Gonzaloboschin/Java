package ejercicio01;

// creamos la clase

public class Libro {
    
//    creamos los atributos de la clase libro
    
    public String ISBN;
    public String titulo;
    public String autor;
    public int nropaginas;
    
//    creamos el constructor vacio
    
    public Libro (){  
    }
    public Libro (String ISBN, String titulo, int nropaginas, String autor){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.nropaginas = nropaginas;
        this.autor = autor;
        
    }
    
    
}
