/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema06 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][]  matriz = new int [5][6];
        int[][] matrizResultante = new int [5][6];
        int valor;
        
        System.out.println("Ingrese el valor entero:");
        valor = entrada.nextInt();
        for (int fila = 0; fila < matriz.length;fila++){
            for (int columna = 0; columna < matriz[fila].length;columna++){
                System.out.println("Ingrese el  valor para la matriz");
                matriz[fila][columna] = entrada.nextInt();
            }
        }
        for 
    }

}
