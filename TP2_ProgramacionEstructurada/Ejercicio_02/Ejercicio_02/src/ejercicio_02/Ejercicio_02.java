package ejercicio_02;

import java.util.Scanner;

/**
 *
 * @author manu
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ejercicio 2: Determinar el mayor de tres numeros
        
        int num, mayor = 0;
        
               for (int cont = 1 ; cont <= 3 ; cont++) {
            System.out.println("Ingrese un número (" +cont+ "):");
            num = Integer.parseInt(input.nextLine());
            if (num >= mayor) {
                mayor = num;
            }
        }
        
        System.out.println("El mayor es: "+mayor);
        
    }
    
}
