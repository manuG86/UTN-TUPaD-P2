package ejercicio_07;

import java.util.Scanner;

/**
 *
 * @author manu
 */
public class Ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ejercicio 7: Validaciond de nota entre 1 y 10
        
        int nota;
        
        do {
            System.out.println("Ingrese una nota (0-10): ");
            nota = Integer.parseInt(input.nextLine());
            if (nota >=0 && nota <=10) {
                System.out.println("Nota guardada correctamente.");
            } else {
                System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        
        
    }
    
}
