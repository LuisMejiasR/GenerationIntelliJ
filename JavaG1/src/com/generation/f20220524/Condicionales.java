package com.generation.f20220524;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // validar la mayoria de edad;
        //establecer el punto critico --> 18 años;
        int mayoriaEdad = 18;

        //solicitar el ingreso de edad
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt(); //capturando el ingreso por consola

        if(edad >= mayoriaEdad){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("No esta permitido su ingreso");
        }


    }
}
