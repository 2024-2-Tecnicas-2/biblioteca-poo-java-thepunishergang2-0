package com.mycompany.biblioteca.java;

public class Revista extends Publicacion{
    // TODO: Aquí va el código que inicializa tu aplicación.
    
private int numeroRevista;
private String nombreRevista;

    public Revista(String titulo, int anioPublicacion,int numeroRevista,String nombreRevista) {
        super(titulo, anioPublicacion); 
        this.nombreRevista = nombreRevista;
        this.numeroRevista = numeroRevista;
    }

    @Override
    public String mostrarInfo(){
        return super.mostrarInfo()+"\nNombre Revista: "+nombreRevista + "\nNumero Revista : "+numeroRevista ;
    }
    
}
