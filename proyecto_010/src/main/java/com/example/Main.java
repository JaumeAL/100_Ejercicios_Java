// Programa pide 10 números enteros
//Dará la media de los positivos y de negativos.

package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, cantidadPositivos = 0, cantidadNegativos = 0;
        int sumaPositivos = 0, sumaNegativos = 0;
        double mediaPositivos = 0, mediaNegativos = 0;

        System.out.println("---Introduce 10 números enteros---");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número :");
            numero = sc.nextInt();
            if (numero > 0) {
                cantidadPositivos++;
                sumaPositivos = sumaPositivos+numero;
            } else if (numero < 0) {
                cantidadNegativos++;
                sumaNegativos = sumaNegativos+numero;
            } 
        }
        mediaPositivos=sumaPositivos/cantidadPositivos;
        mediaNegativos=sumaNegativos/cantidadNegativos;

        System.out.println("La media de los números positivos es = "+ mediaPositivos);
        System.out.println("La media de los números negativos es = "+ mediaNegativos);

    }
}