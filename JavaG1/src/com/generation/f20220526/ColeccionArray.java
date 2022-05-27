package com.generation.f20220526;

import java.util.Arrays;

public class ColeccionArray {
    public static void main(String[] args) {

        //EN JAVA LOS ARRAYS SON ESTATICOS, FIJOS, NO SE AGREGAN ELEMENTOS.
        String[] colores = {"red", "blue", "yellow", "orange", "black"};
        Integer[] numerosPares = {2, 4, 6, 8, 10, 12};
        int[] primerosNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 0};

        //posicion inicial es cero (0)
        System.out.println(colores[0]);
        System.out.println(colores[0]);
        System.out.println(colores[0]);

        //nombreArray[posicion]--> accediendo al elemento del arreglo en esa posicion
        System.out.println(numerosPares[3]);//8

        numerosPares[3] = 14;//modificando el elemento en esa posicion
        System.out.println(numerosPares[3]);//14

        //numerosPares[5] = 14;//ERROR: FUERA DE INDICE
        //no podemos agregar pos posicion si no existe un elemento

        System.out.println("tamaño array colores " + colores.length);
        System.out.println("tamaño array numeros pares " + numerosPares.length);

        System.out.println(colores);
        System.out.println(numerosPares);
        System.out.println(primerosNumeros.toString());

        //imprimir el contenido del arreglo
        System.out.println(Arrays.toString(colores));
        System.out.println(Arrays.toString(numerosPares));
        System.out.println(Arrays.toString(primerosNumeros));
        //esto nos da un error por alguna razon
        //System.out.println(primerosNumeros));

        //recorrer un arreglo
        for (int i = 0; i < primerosNumeros.length; i++) {
            System.out.print(primerosNumeros[i] + " ");
        }
        System.out.println("\n");
        //foreach estoy escribiendo algo, tipo normal
        for (String i : colores) {
            System.out.println(i);
        }

    }
}
