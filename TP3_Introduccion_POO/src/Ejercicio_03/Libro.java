/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author manu
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    // constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    public void setAnioPublicacion(int anioNuevo) {
        if (anioNuevo>1900 && anioNuevo<=2025) {
            anioPublicacion = anioNuevo;
        } else {
            System.out.println("Intento de ingreso de año incorrecto");
        }
    }
    
}
