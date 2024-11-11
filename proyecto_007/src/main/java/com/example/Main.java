// Programa que calcula la media de la nota de los tus exámenes.

package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidad = 0;
        double nota = 0, suma = 0, media = 0;

        System.out.println("Introduce una nota: ");
        nota = sc.nextDouble();

        while (nota > 0) {
            suma = suma + nota;
            cantidad++;
            System.out.println("Introduce otra nota: \n(o num negativo para salir): ");
            nota = sc.nextDouble();
        }
        if (cantidad == 0) {
            System.out.println("No se puede hacer la media");
        } else {
            media = suma / cantidad;
            System.out.println("La media de los " + cantidad + " exámenes es: " + media);
        }

    }
}