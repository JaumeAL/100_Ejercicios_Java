// Programa pide 10 números enteros
//Dará el numero de positivos, de negativos y de ceros.

package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, cantidadPositivos = 0, cantidadNegativos = 0, cantidadCeros = 0;

        System.out.println("---Introduce 10 números---");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número :");
            numero = sc.nextInt();
            if (numero > 0) {
                cantidadPositivos++;
            } else if (numero < 0) {
                cantidadNegativos++;
            } else {
                cantidadCeros++;
            }
        }
        System.out.println("Número de positivos = "+ cantidadPositivos);
        System.out.println("Número de negativos = "+ cantidadNegativos);
        System.out.println("Número de ceros = "+ cantidadCeros);
    }
}