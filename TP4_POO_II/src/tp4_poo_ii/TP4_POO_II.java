/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_poo_ii;

/**
 *
 * @author manu
 */
public class TP4_POO_II {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primero imprimo el total de empleados:
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
        
        // Instanciamos 4 objetos, 2 con cada constructor
        Empleado Jorge = new Empleado("Jorge", "Recepcion");
        Empleado Marcela = new Empleado(205, "Marcela", "Gerente", 150000.00);
        Empleado Luis = new Empleado(206, "Luis", "Gerente", 150000.00);
        Empleado Ana = new Empleado("Ana", "Creador de contenido");
        
        // Actualizamos los salarios de Jorge y Ana con un monto fijo ya que tienen 0 por defecto.
        System.out.println(Jorge);
        Jorge.actualizarSalario(85000);
        Ana.actualizarSalario(88000);
        
        System.out.println(Jorge);
        System.out.println(Marcela);
        System.out.println(Luis);
        System.out.println(Ana);
        
        // Actualizo el salario de marcela en un 10% y muestro el objeto nuevamente
        Marcela.actualizarSalario(10.00);
        System.out.println(Marcela);
        
        // Muestro el total de empleados actual, luego de haber creado empleados con ambos constructores, se ve que todos suman a la cantidad de la variable de Clase y no de las instancias
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
        
    }
    
}
