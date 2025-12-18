/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
     
        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}
        };

        int totalMenores = 0;
        int[] adultosPorFamilia = new int[edades.length];
        String mensaje = " REPORTE DE INTEGRANTES POR FAMILIA \n";

        mensaje = mensaje + String.format("Familia - Cantidad Adultos" + "\n");

        for (int fila = 0; fila < edades.length; fila++) {
            int contadorAdultos = 0;

            for (int columna = 0; columna < edades[fila].length; columna++) {
         
                if (edades[fila][columna] < 18) {
                    totalMenores++;
                } else {
               
                    contadorAdultos++;
                }
            }
           
            adultosPorFamilia[fila] = contadorAdultos;
            mensaje = mensaje + String.format("Familia %d: %d adultos"
                    + " registrados\n", (fila + 1),
                    adultosPorFamilia[fila]);
        }

    
        mensaje = mensaje + "Total de menores de edad: " + totalMenores;

        System.out.println(mensaje);
    }
}
