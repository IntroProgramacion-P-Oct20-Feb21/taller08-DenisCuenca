/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taller008;

import java.util.Scanner;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Problema04 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        double suma = 0;
        int n;
        int i = 0;
        int iteraccion;
        double n2;
        System.out.println("Ingrese el valor de 'n' (valor entero): ");
        n = entrada.nextInt();
        if (n > 0) {
            for (iteraccion = 1; iteraccion <= n; iteraccion++) {
                n2 = Math.pow(-1.0,i) / (Math.pow(2.0, i)+1);
                suma = suma + n2;
            }
            System.out.printf("El resultado de la operación es: %.2f\n", suma);
        } else {
            System.out.printf("Error número menor a cero\nIntente de nuevo\n\n");
        }
    }

}
