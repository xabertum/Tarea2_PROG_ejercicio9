/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2_ejercicio9;

import java.util.Scanner;

/**
 *
 * @author mohat
 */
public class Tarea2_Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        int contador = 4;
        int digitos[] = new int[5];

        System.out.println("Introduce el numero: ");
        num = scanner.nextInt();

        while (num > 0) {
            digitos[contador--] = num % 10;
            num /= 10;

        }

        for (int i = 0; i <= 4; i++) {
            
            System.out.print(" " + digitos[i]);
        }
        
        System.out.print("\nEl numero separado en digitos.. :-) ");
    }
}
