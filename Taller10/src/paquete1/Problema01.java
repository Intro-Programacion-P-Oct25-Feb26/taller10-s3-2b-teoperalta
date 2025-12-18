/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    public static void main(String[] args) {
        // Datos iniciales
        boolean[][] asistencia = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}
        };

        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};
        int[] totalAsistencias = new int[estudiantes.length];

        String mensaje = "--- REPORTE FINAL DE ASISTENCIA ---\n";

        for (int fila = 0; fila < asistencia.length; fila++) {
            int contador = 0;
            for (int columna = 0; columna < asistencia[fila].length; columna++) {
                if (asistencia[fila][columna]) {
                    contador++;
                }
            }
            totalAsistencias[fila] = contador;

            mensaje = mensaje + "Estudiante: " + estudiantes[fila]
                    + " | Asistencias: " + totalAsistencias[fila];

            if (totalAsistencias[fila] == 5) {
                mensaje += " ASISTENCIA COMPLETA\n";
            } else {
                mensaje += " ASISTENCIA INCOMPLETA\n";
            }
        }
        System.out.println(mensaje);
    }
}
