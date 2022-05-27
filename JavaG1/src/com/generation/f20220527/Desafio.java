package com.generation.f20220527;

import java.util.HashMap;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //crear un menu de comida (mostrarselo)
        //solicitar al usuario que elija el plato
        //imprimimos el plato
        //pedir al usuario que elija
        System.out.println("Por favor elija una de las 3 opciones de nuestro menú");



        HashMap menuComida = new HashMap();
        menuComida.put("Plato 1", "Caracoquesos");
        menuComida.put("Plato 2", "Lomo Saltado");
        menuComida.put("Plato 3", "Tostadas con huevo frito");
        System.out.println(menuComida);




    }
}