package tp4_poo_ii;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author manu
 */
public class Empleado {
    private static int contadorIds = 100;
    private static Set<Integer> idsUsados = new HashSet<>();
    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    // constructor con todos los parametros
    public Empleado(int id, String nombre, String puesto, double salario) {
        // Encontre esta solucion para que no se repitan los ids, agregando los usados a un Set, pero lo dejo comentado ya que es algo mas avanzado a los conceptos que vimos.
        if (idsUsados.contains(id)) {
            throw new IllegalArgumentException("El ID " + id + " ya está en uso.");
        }
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        Empleado.totalEmpleados++;
        idsUsados.add(id);
    }
    
    // constructor solo con nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = generarId();
        this.nombre = nombre;
        this.puesto = puesto;
        Empleado.totalEmpleados++;
    }
    
    // Metodos
    
    private int generarId() {
        while (idsUsados.contains(contadorIds)) {
            contadorIds++;
        }
        idsUsados.add(contadorIds);
        return contadorIds++;
    }
    
    public void actualizarSalario(double porcentaje) {
        salario = salario * (1 + porcentaje / 100);
    }
    
    public void actualizarSalario(int montoFijo) {
        salario = salario + montoFijo;
    }
    
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
}
