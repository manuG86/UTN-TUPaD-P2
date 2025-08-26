/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author manu
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota m = new Mascota();
        m.nombre = "Firulai";
        m.especie = "Perro callejero";
        m.edad = 7;
        
        m.mostrarInfo();
        System.out.println("\nPasan 3 años\n");
        m.cumplirAnios(3);
        m.mostrarInfo();
    }
    
}
