/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author manu
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    int calificacion;
    
    public void mostrarInfo() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Curso: "+curso);
        System.out.println("Calificacion: "+calificacion);
    }
    
    public void subirCalificacion(int puntos) {
        if (puntos > 0) {
            calificacion += puntos;
        }
    }
    
    public void bajarCalificacion(int puntos) {
        if (puntos > 0) {
            calificacion -= puntos;
        }
    }
}
