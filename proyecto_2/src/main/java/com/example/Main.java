//Programa que calcula precios:
//Si compras menos de 10 porciones de tarta= 5€ cada una
//Si compras de 10 a 20 porciones de tarta = 4,5€ cada una
//Si compras mas de 20 porciones de tarta = 4€ cada una

package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int porciones = 0;
        double precio = 0;

        do {
            System.out.println("¿Cuantas porciones de tarta deseas comprar? ");
            porciones = sc.nextInt();
    
            if (porciones > 0 && porciones < 10) {
                precio = porciones * 5;
                System.out.println("Total a pagar = " + precio);
            } else if (porciones >= 10 && porciones < 20) {
                precio = porciones * 4.5;
                System.out.println("Total a pagar = " + precio);
            } else if (porciones >= 20){
                precio = porciones * 4;
                System.out.println("Total a pagar = " + precio);
            }else{
                System.out.println("Ingresa un numero valido");
            }

        } while (porciones != 0);



    }
}