// Programa que multiplica todos los primeros 10 números impares (1x3x5x7x9...)

package com.example;

public class Main {
    public static void main(String[] args) {
        long producto = 1;

        for (int i = 1; i < 20; i += 2) {
            producto = producto * i;
        }
        System.out.println("El producto de los 10 primeros números impares es : " + producto);

    }
}