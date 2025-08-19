package ejercicio_12;

/**
 *
 * @author manu
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios = {199.99,299.5,149.75,399.0,88.40,12.99};
        
        for (int i=0; i < precios.length ; i++) {
            System.out.println("Precios originales:");
            System.out.println("Precio " +(i+1)+ ": $" +precios[i]);
        }
        System.out.println("------------------------------");
        
        precios[1] = 10.50;
        
        for (int i=0; i < precios.length ; i++) {
            System.out.println("Precios modificados:");
            System.out.println("Precio " +(i+1)+ ": $" +precios[i]);
        }
        
        
    }
    
}
