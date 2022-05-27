package com.generation.f20220526;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ColeccionArrayList {
    public static void main(String[] args) {
        //ArrayList SON DINAMICOS
        //Instancia de clase, definicion de arreglo
        ArrayList<String> colores = new ArrayList<String>();
        ArrayList<Integer> numerosPares = new ArrayList<Integer>();

        //agregar un elemento a la lista
        colores.add("zafiro");
        colores.add("rojo");
        colores.add("azul");

        //si existe un elemento en esa posicion lo desplaza a la derecha
        colores.add(1, "verde");

        //imprimir el contenido (no se necesita el ArrayList)
        System.out.println(colores);

        //acceder a un elemento
        System.out.println(colores.get(2));

        //tamaño del arreglo size()
        System.out.println(colores.size());

        //reemplazar el elemento
        colores.set(1, "Negro");
        System.out.println(colores);

        //quitar un elemento arreglo.remove(posicion)
        colores.remove(1);
        System.out.println(colores);

        //recorrer el arreglo
        for (int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }
        for (String i : colores) {
            System.out.println(i);
        }


        //ordenar el arreglo de forma ascendente
        Collections.sort(colores);
        System.out.println(colores);

        //quitar todos los elementos
        colores.clear();

        numerosPares.add(14);
        numerosPares.add(1);
        numerosPares.add(4);
        numerosPares.add(8);
        numerosPares.add(6);
        numerosPares.add(13);
        System.out.println(numerosPares);
        //ORDENA EL ARREGLO
        Collections.sort(numerosPares);
        System.out.println(numerosPares);

        //NO ORDENA, LO QUE HACE ES VOLTEAR LOS ELEMENTOS
        Collections.reverse(numerosPares);
        System.out.println(numerosPares);

    }
}
