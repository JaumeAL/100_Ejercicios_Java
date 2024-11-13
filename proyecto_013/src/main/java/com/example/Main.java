//Mostrar sueldo maximo por ventana emergente.

package com.example;

import javax.swing.JOptionPane; //para la ventana emmergente

public class Main {
    public static void main(String[] args) {
        // Variables
        int cantidadSueldos = 0, sueldo = 0, sueldoMaximo = 0;
        boolean primerSueldo = false;

        // Convertimos a Int el valor que se introduce ya que por defecto se detecta como String
        cantidadSueldos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos sueldos quieres calcular?"));
        for (int i = 1; i <= cantidadSueldos; i++) {
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Inoduce el " + (i) + "º sueldo"));

            if (primerSueldo == false) {
                sueldoMaximo = sueldo;
                primerSueldo = true;
            }
            if (sueldo > sueldoMaximo) {
                sueldoMaximo = sueldo;
            }
        }
        // Mensaje por pantalla emergente
        JOptionPane.showMessageDialog(null, "El sueldo máximo es: " + sueldoMaximo);

    }
}