/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author manu
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Ingrese un numero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese otro numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.print("Dados los numeros: " + num1 + " y " + num2 + ": \n");
        System.out.print("Suma: " + (num1 + num2) + "\n");
        System.out.print("Resta: " + (num1 - num2) + "\n");
        System.out.print("Multiplicacion: " + (num1 * num2) + "\n");
        System.out.print("Division: " + (num1 / num2) + "\n");
    }
    
}
