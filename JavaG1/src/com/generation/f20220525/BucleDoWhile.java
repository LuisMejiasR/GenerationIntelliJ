package com.generation.f20220525;

import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        // DoWhile
        // a lo menos se ejecutara una vez
        int termino = 8;
        while (termino <= 10) {
            System.out.println("While: el valor de termino es " + termino);
            termino++;
        }
        do {

            System.out.println("DoWhile: el valor de termino es " + termino);
                termino++;
        } while (termino <= 10);*/

        System.out.println("Ingrese:\n (0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");

        int opcion = sc.nextInt();
        do {
            System.out.println("Ingrese:\n (0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
            opcion = sc.nextInt();
        }while(opcion < 0 || opcion > 4);

    }
}
