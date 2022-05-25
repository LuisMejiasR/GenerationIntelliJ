package com.generation.f20220525;

import java.util.Scanner;

public class BucleWhile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //decirle al usuario que hacer:
        System.out.println("Ingrese:\n (0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
        //capturamos la informacion creando una variable
        int opcion = sc.nextInt();
        //validamos si opcion es correcto o incorrecto


        //while valida que la condicion sea verdadera
        while (opcion < 0 || opcion > 4) {
            System.out.println("Ingrese:\n (0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
            opcion = sc.nextInt();
        }
        System.out.println(" fuera del while");

        switch (opcion) {
            case 1:// sumar
                // accion para la opcion 1
                System.out.println("** Suma");
                break;
            case 2:
                System.out.println("** Resta");
                break;
            case 3:
                System.out.println("** Multiplicacion");
                break;
            case 4:// division
                System.out.println("** Division");
                break;
            default:
                System.out.println("opcion invalida");
                break;


        }
    }
}