/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author manu
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    public void mostrarInfo() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Especie: "+especie);
        System.out.println("Edad: "+edad+" años");
    }
    
    public void cumplirAnios(int anios) {
        if (anios > 0) {
            edad += anios;
        }
    }
    
}
