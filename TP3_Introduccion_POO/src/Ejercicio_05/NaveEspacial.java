/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_05;

/**
 *
 * @author manu
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private boolean despego;
    
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }
    
    public void despegar() {
        if (despego == false) {
            despego = true;
        }
    }
    
    public void recargarCombustible(int cantidad) {
        if (combustible+cantidad <= 150) {
            combustible += cantidad;
        } else if (combustible+cantidad > 150) {
            System.out.println("No se puede cargar mas del limite (maximo: 150)");
        } else {
            System.out.println("Error al intentar cargar");
        }
    }
    
    public void avanzar(int distancia) {
        if (despego == true && combustible > 50) {
            System.out.println("La nave ha avanzado "+distancia+" kms.");
        } else {
            System.out.println("Tienes "+combustible+" unidades de combustible, necesitas mas de 50 para avanzar.");
        }
    }
    
    public void mostrarEstado() {
        System.out.println("-".repeat(50));
        System.out.println("Estado de la Nave: "+nombre);
        System.out.println("Combustible: "+combustible+" unidades");
    }
}
