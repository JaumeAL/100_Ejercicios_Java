//Programa gestión de facturas para empresa de venta de arena por kilo
//Muesta ganancias totales ,kilos vendidos y cantidad de ventas mayores a mil.

package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kilos = 0, totalKilo = 0, facturasMil = 0;
        int[] codigos = new int[4]; // Solo contará 4 ventas, a no ser que se modifice el valor
        float precio = 0, importeFactura = 0, total = 0;

        for (int i = 0; i < codigos.length; i++) {
            System.out.print((i + 1) + "º Ingresa el código ");
            codigos[i] = sc.nextInt();
            System.out.print("Ingresa la cantidad de kilos ");
            kilos = sc.nextInt();
            System.out.print("Ingresa el precio ");
            precio = sc.nextInt();
            System.out.println("--------------");
            // operaciones
            importeFactura = precio * kilos;
            total = total + importeFactura;

            totalKilo = totalKilo + kilos; // cantidad de kilos
            // condiciones
            if (importeFactura >= 1000) {
                facturasMil++;// Cantidad de facturas emitedas amyores a 1000
            }
        }
        System.out.println("Info de ventas: ");
        System.out.println("Cantidad de kilos vendidos: " + totalKilo);
        System.out.println("Ganancias totales: " + total);
        System.out.println("Cantidad facturas mayores de mill: " + facturasMil);
    }
}