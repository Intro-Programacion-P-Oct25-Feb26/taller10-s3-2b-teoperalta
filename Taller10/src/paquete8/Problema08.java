/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author Usuario iTC
 */
public class Problema08 {

    public static void main(String[] args) {

        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        double[][] dato2 = {{10, 1, 2}, {10, 9, 1}};
        double[][] valorValido = new double[2][3];
        String mensaje = "";
       
        for (int fila = 0; fila < dato1.length; fila++) {
            for (int columna = 0; columna < dato1[fila].length; columna++) {
                if (dato1[fila][columna] < dato2[fila][columna]) {
                    valorValido[fila][columna] = dato1[fila][columna];
                } else {
                    valorValido[fila][columna] = dato2[fila][columna];
                }

                mensaje += String.format("%.0f   ", valorValido[fila][columna]);
            }
            mensaje = mensaje + "\n";
        }

        System.out.println(mensaje);
    }
}
