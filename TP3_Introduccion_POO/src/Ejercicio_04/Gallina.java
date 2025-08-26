/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_04;

/**
 *
 * @author manu
 */
public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallina(String idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }
    
    public void ponerHuevo(int huevos) {
        if (huevos > 0) {
            huevosPuestos += huevos;
        }
    }
    
    public void envejecer(int anios) {
        if (anios > 0) {
            edad += anios;
        }
    }
    
    public void mostrarEstado() {
        System.out.println("ID: "+idGallina);
        System.out.println("Edad: "+edad);
        System.out.println("Huevos Puestos: "+huevosPuestos);
    }
    
}
