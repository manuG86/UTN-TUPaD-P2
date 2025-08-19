package ejercicio_13;

/**
 *
 * @author manu
 */
public class Ejercicio_13 {
    
    public static void impresionRecursiva(double precios[],int i) {
        if (i == precios.length) {
            return;
        }
        
        System.out.println(precios[i]);
        
        impresionRecursiva(precios,i+1);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios = {199.99,299.5,149.75,399.0,88.40,12.99};
        
        System.out.println("Precios originales: ");
        impresionRecursiva(precios,0);
        
        precios[1] = 10.50;
        
        System.out.println("Precios modificados: ");
        impresionRecursiva(precios,0);
        
    }
    
}
