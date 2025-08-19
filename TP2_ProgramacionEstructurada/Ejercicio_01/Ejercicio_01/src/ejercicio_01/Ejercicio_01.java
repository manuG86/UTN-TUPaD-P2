package ejercicio_01;

import java.util.Scanner;

/**
 *
 * @author manu
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 1: Verificacion de Año Bisiesto
        
        Scanner input = new Scanner(System.in);
        int anio = 0;
        
        System.out.println("Ingrese un año: ");
        anio = Integer.parseInt(input.nextLine());
        
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0 )) {
            System.out.println("El año "+anio+" es bisiesto.");
        } else {
            System.out.println("El año "+anio+" no es bisiesto.");
        }
        
    }
    
}
