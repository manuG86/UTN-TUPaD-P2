package ejercicio_09;
import java.util.Scanner;
/**
 *
 * @author manu
 */
public class Ejercicio_09 {
    double costoEnvio;
    public static double calcularCostoEnvio(double peso, String zona) {
        double precioZona;
        
        if (zona.equalsIgnoreCase("Nacional")) {
            precioZona = 5.00;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            precioZona = 10.00;
        } else {
            System.out.println("Zona Invalida. Se asignara costo 0.");
            precioZona = 0.0;
        }
        return peso*precioZona;
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double precio, peso, costoEnvio, total;
        String zona;
        
        System.out.println("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese el peso del paquete en kg: ");
        peso = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese la zona de envio (Nacional/Internacional): ");
        zona = input.nextLine();
        
        // Llamamos a los metodos
        costoEnvio = calcularCostoEnvio(peso, zona);
        total = calcularTotalCompra(precio, costoEnvio);
        
        //Mostramos resultados
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar: " + total);
    }
    
}
