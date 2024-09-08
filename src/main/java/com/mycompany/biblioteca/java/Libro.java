package com.mycompany.biblioteca.java;

public class Libro extends Publicacion{
    // TODO: Aquí va el código que inicializa tu aplicación.

    private String autor;
    private int numeroPaginas;
    
    
    public Libro(String titulo, int anioPublicacion, String autor, int numeroPaginas) {
        super(titulo, anioPublicacion);
        
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        
    }
    // TODO: Aquí va el código que inicializa tu aplicación.
    
    @Override
    public String mostrarInfo(){
        
        return super.mostrarInfo()+"\nautor: "+autor + "\nNumero de paginas: "+numeroPaginas ;
    }
    
    
    
}
