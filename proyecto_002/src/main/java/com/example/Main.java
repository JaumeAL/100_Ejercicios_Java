//Programa que calcula precios:
//Si compras menos de 10 trozos de tarta= 5€ cada una
//Si compras de 10 a 20 trozos de tarta = 4,5€ cada una
//Si compras mas de 20 trozos de tarta = 4€ cada una

package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int trozos = 0;
        double precio = 0;

        do {
            System.out.println("¿Cuantos trozos de tarta deseas comprar? ");
            trozos = sc.nextInt();
    
            if (trozos > 0 && trozos < 10) {
                precio = trozos * 5;
                System.out.println("Total a pagar = " + precio);
            } else if (trozos >= 10 && trozos < 20) {
                precio = trozos * 4.5;
                System.out.println("Total a pagar = " + precio);
            } else if (trozos >= 20){
                precio = trozos * 4;
                System.out.println("Total a pagar = " + precio);
            }else{
                System.out.println("Ingresa un numero valido");
            }

        } while (trozos != 0);



    }
}