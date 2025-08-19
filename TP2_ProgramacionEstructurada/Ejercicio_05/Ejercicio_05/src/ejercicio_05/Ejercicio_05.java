package ejercicio_05;

import java.util.Scanner;

/**
 *
 * @author manu
 */
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Ejercicio 5: Suma de numeros pares (while)
        
        int num, acumulador = 0;
        
        do {
            System.out.println("Ingrese un numero (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
            
            if (num % 2 == 0) {
                acumulador += num;
            }
        } while (num != 0);
        
        System.out.println("La suma de numeros pares es: "+ acumulador);
        
    }
    
}
