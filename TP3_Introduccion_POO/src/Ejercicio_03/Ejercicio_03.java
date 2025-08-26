/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author manu
 */
public class Ejercicio_03 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro("El jilguero", "Donna Tart", 0);
        
        // libro1.setAnioPublicacion("dos mil diez"); NO COMPILA
        libro1.setAnioPublicacion(1554);
        libro1.setAnioPublicacion(2013);
        
        System.out.println("Autor: "+libro1.getAutor());
        System.out.println("Titulo: "+libro1.getTitulo());
        System.out.println("Año de publicacion: "+libro1.getAnioPublicacion());
        
    }
    
}