package ejercicio_08;

import java.util.Scanner;

/**
 *
 * @author manu
 */
public class Ejercicio_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ejercicio 8: 
        
        double PrecioBase, Impuesto, Descuento;

        System.out.println("Ingrese el precio base del producto: ");
        PrecioBase = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese el impuesto en porcentaje (Ej: 10 para 10%): ");
        Impuesto = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese el descuento en porcentaje (Ej: 5 para 5%): ");
        Descuento = Double.parseDouble(input.nextLine());

        // Llamada al método
        double PrecioFinal = calcularPrecioFinal(PrecioBase, Impuesto, Descuento);

        System.out.println("El precio final es " + PrecioFinal);

        input.close();
    }

        static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
    }
}