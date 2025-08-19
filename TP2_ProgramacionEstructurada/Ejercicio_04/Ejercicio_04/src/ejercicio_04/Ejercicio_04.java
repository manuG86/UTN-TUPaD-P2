package ejercicio_04;

import java.util.Scanner;

/**
 *
 * @author manu
 */
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Ejercicio 4:
        int precio;
        char descuento;
        
        System.out.println("Ingrese el precio del producto: ");
        precio = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la categoria del producto (A, B o C): ");
        descuento = input.nextLine().charAt(0);
        
        switch (descuento) {
            case 'A':
                System.out.println("Descuento aplicado: 10%");
                System.out.println("Precio Final: "+ (precio*0.9));
                break;
            case 'B':
                System.out.println("Descuento aplicado: 15%");
                System.out.println("Precio Final: "+ (precio*0.85));
                break;
            case 'C':
                System.out.println("Descuento aplicado: 20%");
                System.out.println("Precio Final: "+ (precio*0.8));
                break;
            default:
                System.out.println("ERROR. Seleccione una categoria: A, B, o C");
        }
        
    }
    
}
