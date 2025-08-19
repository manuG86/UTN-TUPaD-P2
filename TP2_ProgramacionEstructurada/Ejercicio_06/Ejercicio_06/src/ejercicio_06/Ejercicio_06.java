package ejercicio_06;

import java.util.Scanner;

/**
 *
 * @author manu
 */
public class Ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ejercicio 6: Contador de Positivos, Negativos y Ceros (for)
        
        int num, positivos = 0, negativos = 0, ceros = 0;
        
        for (int cont = 1; cont < 11; cont ++) {
            System.out.println("Ingrese el numero "+ cont);
            num = Integer.parseInt(input.nextLine());
            
            if (num == 0) {
                ceros ++;
            } else if (num > 0) {
                positivos ++;
            } else if (num < 0) {
                negativos ++;
            } else {
                System.out.println("Error. Ingrese un numero valido");
            }
        }
        System.out.println("RESULTADOS:");
        System.out.println("Positivos: "+positivos);
        System.out.println("Negativos: "+negativos);
        System.out.println("Ceros: "+ceros);
        
    }
    
}
