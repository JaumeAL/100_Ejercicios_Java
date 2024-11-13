// Muestra cantidad de aprobados, suspendidos, excelentes... de tus 10 alumnos

package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variables:
        int excelente = 0, notable = 0, aprobado = 0, suspendido = 0;
        double nota = 0;
        
        System.out.println("---Introduce las notas de tus alumnos---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Nota del " + (i + 1) + "º Alumno: ");
            nota = sc.nextDouble();

            if (nota >= 9 && nota <= 10) {
                excelente++;
            } else if (nota >= 7 && nota <= 8) {
                notable++;
            } else if (nota >= 5 && nota <= 6) {
                aprobado++;
            } else {
                suspendido++;
            }

        }
        // Mostrar datos en pnatalla
        System.out.println("Alumnos excelentes: "+excelente+" :)");
        System.out.println("Alumnos notables: "+notable+" :|");
        System.out.println("Alumnos aprobados: "+aprobado+" :/");
        System.out.println("Alumnos suspendidos: "+suspendido+" :(");


    }
}