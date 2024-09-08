package com.mycompany.biblioteca.java;

public class Publicacion {

    // TODO: Aquí va el código de tu clase
    private String titulo;
    private int anioPublicacion;

    public Publicacion(String titulo, int anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }
    
    public String mostrarInfo(){
        return "Titulo: "+ titulo+"\nAño publicacion: "+anioPublicacion;
        
    }
    
    
}
