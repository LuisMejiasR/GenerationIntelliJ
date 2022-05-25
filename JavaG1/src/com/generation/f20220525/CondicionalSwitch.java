package com.generation.f20220525;

import java.util.Scanner;

public class CondicionalSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //menu
        System.out.println("Ingrese opcion:");
        System.out.println("1 18 a 29 \n 2 30 - 49 \n 3 50 - 69 \n 4 más de 70\n 0 para salir");
        int opcion = sc.nextInt();
        //PEDIR LAS VARIABLES AQUI, FUERA DEL SWITCH
        switch (opcion) {
            case 1://sumar
                //accion para opcion 1
                System.out.println("100");
                break;
            case 2:
                System.out.println("250");
                break;
            case 3:
                System.out.println("400");
                break;
            case 4:
                System.out.println("500");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        System.out.println("Fuera del Switch");

    }
}
