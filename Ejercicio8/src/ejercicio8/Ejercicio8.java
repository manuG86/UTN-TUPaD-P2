/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author manu
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1, num2;

        System.out.print("Ingrese un numero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese un numero (menor al anterior para dividirlo): ");
        num2 = Integer.parseInt(input.nextLine());
        System.out.println("Resultado: " + (num1/num2));
        
        double num3, num4;

        System.out.print("Ingrese un numero: ");
        num3 = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese un numero (menor al anterior para dividirlo): ");
        num4 = Double.parseDouble(input.nextLine());
        System.out.println("Resultado: " + (num3/num4));
    }
    
}
