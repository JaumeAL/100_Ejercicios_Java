//Programa que recoje las venatas mayores o iguales a 1000€ en un mes

package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ventas[] = new double[30];
        int contador = 0;
        int j = 0;

        System.out.println("Ingresa las 30 ventas del mes: ");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Venta dia " + (i + 1));
            ventas[i] = sc.nextDouble();
        }

        System.out.println("Ventas iguales o superiores a mil son: ");

        while (j < 30) {
            if (ventas[j] >= 1000) {
                System.out.println(ventas[j]);
                contador++;
            }
            j++;
        }

        System.out.println("Un total de " + contador + " dias del mes.");
    }
}