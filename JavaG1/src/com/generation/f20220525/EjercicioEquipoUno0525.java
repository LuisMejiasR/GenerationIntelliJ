package com.generation.f20220525;

import java.util.Scanner;

public class EjercicioEquipoUno0525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //solicitar ingreso edad
        //calculos dentro de switch
        //una vez calculada la prima del seguro
        //ingresar otro dato de edad
        //hasta que el usuario ingrese "0" para salir
        //crear variable de la mayoria de edad
        System.out.println("Ingrese opcion:");
        System.out.println("1 18 a 29 \n 2 30 - 49 \n 3 50 - 69 \n 4 más de 70\n 0 para salir");
        int opcion = sc.nextInt();
        int mayoriaEdad = 18;
        if (opcion != 0) {
            do {

                switch (opcion) {
                    case 1://sumar
                        //accion para opcion 1
                        System.out.println("La prima del seguro es 100\n");
                        System.out.println("Ingrese opcion:");
                        System.out.println(" 1 18 a 29 \n 2 30 - 49 \n 3 50 - 69 \n 4 más de 70\n 0 para salir");
                        opcion = sc.nextInt();
                        break;
                    case 2:
                        System.out.println("La prima del seguro es 250\n");
                        System.out.println("Ingrese opcion:");
                        System.out.println(" 1 18 a 29 \n 2 30 - 49 \n 3 50 - 69 \n 4 más de 70\n 0 para salir");
                        opcion = sc.nextInt();
                        break;
                    case 3:
                        System.out.println("La prima del seguro es 400\n");
                        System.out.println("Ingrese opcion:");
                        System.out.println(" 1 18 a 29 \n 2 30 - 49 \n 3 50 - 69 \n 4 más de 70\n 0 para salir");
                        opcion = sc.nextInt();
                        break;
                    case 4:
                        System.out.println("La prima del seguro es 500\n");
                        System.out.println("Ingrese opcion:");
                        System.out.println(" 1 18 a 29 \n 2 30 - 49 \n 3 50 - 69 \n 4 más de 70\n 0 para salir");
                        opcion = sc.nextInt();
                        break;
                    default:
                        System.out.println("Opcion no valida\n");
                        System.out.println("Ingrese opcion:");
                        System.out.println(" 1 18 a 29 \n 2 30 - 49 \n 3 50 - 69 \n 4 más de 70\n 0 para salir");
                        opcion = sc.nextInt();
                        break;
                }
            } while (opcion != 0);
        }

        /* Crear un menu
                System.out.println("");

        int variable = sc.nextInt();
        do {
            System.out.println("");
            variable = sc.nextInt();
        }while(variable < 0 || variable > 4);


        //LEO:

        do{

            do{sout
            scanner
            }while();
            switch
        }while();


        * */


    }
}
