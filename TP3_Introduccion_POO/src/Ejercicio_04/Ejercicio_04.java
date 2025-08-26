/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_04;

/**
 *
 * @author manu
 */
public class Ejercicio_04 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gallina g1 = new Gallina("Galli33", 8, 45);
        Gallina g2 = new Gallina("Galla88", 11, 144);
    
        g1.ponerHuevo(1);
        g2.ponerHuevo(2);
        g1.envejecer(3);
        g2.envejecer(5);
        
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}
