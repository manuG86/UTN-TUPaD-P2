package ejercicio_03;

import java.util.Scanner;

/**
 *
 * @author manu
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ejercicio 3: 
        
        int edad;
        
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        if (edad < 12) {
            System.out.println("Eres un niño.");
        } else if (edad >= 12 && edad < 18) {
            System.out.println("Eres un adolescente.");
        } else if (edad >= 18 && edad < 59) {
            System.out.println("Eres un adulto.");
        } else if (edad >= 60) {
            System.out.println("Eres un adulto mayor.");
        } else {
            System.out.println("Ingrese un numero entero positivo.");
        }
        
    }
    
}
