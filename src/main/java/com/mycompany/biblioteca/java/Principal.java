package com.mycompany.biblioteca.java;

public class Principal {
    public static void main(String[] args) {
        // TODO: Aquí va el código que inicializa tu aplicación.
        
        Libro libro1 = new Libro("Changua", 2022, "Punisher", 250);
        System.out.println(libro1.mostrarInfo());
        
        Revista revista1 = new Revista("Mondongo", 2024,10,"Punisher Magazine");
        System.out.println(revista1.mostrarInfo());
        
        Revista revs = new Revista("Mondongo", 2024,10,"Punisher Magazine");
        System.out.println(revs.mostrarInfo());
    }
}
