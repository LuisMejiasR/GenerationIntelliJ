package com.generation.f20220525;

import java.util.Scanner;

public class ejercicioequipo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        * Escribe un programa que solicite el valor inferior y superior de un rango.
        >>aqui se piden los rangos entre los cuales vamos a evaluar.
        * */
        int rangoMenor = 0;
        int rangoMayor = 0;

        System.out.println("Ingrese un rango menor y un rango menor");


        do {
            System.out.println("Ingrese el rango menor");
            rangoMenor = sc.nextInt();

            System.out.println("Ingrese el rango mayor");
            rangoMayor = sc.nextInt();
        }while(rangoMayor < rangoMenor);//= true se repite


        /*
        Validar si los valores son correctos o no.*/

        System.out.println("fuera de while");
        Integer[] numerosTotales = {0};
        //int numerosTotales = 0;
        int numerosUsuario = 0;

        do {
            System.out.println("Por favor introduce una lista de numeros:");
            numerosUsuario = sc.nextInt();


        }while (numerosUsuario != 0);


        /*
        >>
        Ejemplo :
        inferior= 10; superior= 50; es correcto,
        inferior= 30; superior= 10; incorrecto, volver a pedir el rango inferior.

        A continuación se van introduciendo números hasta que introduzcamos el 0. 


        Ejemplo : 11,4,23,10,54; 33,10,77;0;


        Cuando termine el programa dará las siguientes informaciones:

        La suma de los números que están dentro del rango.
        variable acumuladora
        Cuantos números están fuera del rango.
        variable acumuladora + 1
        Informa cuantos números son igual a los valore del rango.
        variable acumuladora

        ** Aplicar el uso de If,  While, Do while, variables booleanas y acumuladoras y Scanner para la captura de datos
        */
    }
}
