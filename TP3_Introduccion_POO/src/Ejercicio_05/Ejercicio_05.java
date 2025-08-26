/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_05;

/**
 *
 * @author manu
 */
public class Ejercicio_05 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NaveEspacial NV1 = new NaveEspacial("Millennium Falcon", 50);
        
        NV1.despegar();
        NV1.avanzar(20);
        NV1.recargarCombustible(25);
        NV1.avanzar(18);
        NV1.mostrarEstado();
    }
}
