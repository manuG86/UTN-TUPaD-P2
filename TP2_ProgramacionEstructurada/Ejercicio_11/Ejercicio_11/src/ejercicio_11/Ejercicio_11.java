package ejercicio_11;

import java.util.Scanner;

/**
 *
 * @author manu
 */
public class Ejercicio_11 {
    static double descuento = 0.10;
    
    public static double calcularDescuentoEspecial(double precio) {
        double descuentoEspecial = precio * descuento;
        return descuentoEspecial;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioProducto;
        
        System.out.println("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        System.out.println("El descuento especial aplicado es: " + descuento*100 + "%.");
        System.out.println("El precio final con descuento es: " + (precioProducto-calcularDescuentoEspecial(precioProducto)));
        
    }
    
}
