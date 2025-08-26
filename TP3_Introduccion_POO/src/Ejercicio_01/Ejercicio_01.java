/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author manu
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        e1.nombre = "Jorge";
        e1.apellido = "Perez";
        e1.curso = "Matematicas";
        e1.calificacion = 5;
        
        System.out.println("\nInformacion original: \n");
        e1.mostrarInfo();
        e1.subirCalificacion(3);
        System.out.println("\nModifico calificacion subiendo 3 puntos: \n");
        e1.mostrarInfo();
        e1.bajarCalificacion(1);
        System.out.println("\nModifico calificacion bajando 1 punto: \n");
        e1.mostrarInfo();
    }
    
}
