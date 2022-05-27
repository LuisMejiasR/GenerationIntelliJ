package com.generation.f20220526;

import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        //NO SE PUEDE CREAR UN METODO DENTRO DE OTRO METODO

        //Funciones
        //los nombres de la funcion se escribe con minuscula la primera letra
        //4 tipos diferentes de funciones
        //void: no retornan nada, solo ejecutan el código
        //2 que retornan
        //2 que no retornan

        saludo();
        //System.out.println(obtenerEdad());
        calculoSumaPares(true, 23, "33", 44L, "Sumar");


        int edad = obtenerEdad();//transformando un Integer a un int
        System.out.println(edad);

        boolean mayorOMenor = validarMayorEdad(edad);
        if (mayorOMenor){
            System.out.println("Puede ingresar al curso");
        }else{
            System.out.println("No tiene la edad suficiente para acceder al curso");
        }
    }

    //accesador tipoDeRetorno nombreDeLaFuncion(parametros a recibir)
    public static void calculoSumaPares(boolean verdad, int numero1, String numero2, Long numero3, String accion) {
        Integer num2 = Integer.parseInt(numero2);
        System.out.println(numero1 + numero3 + num2 );
    }

    public static void saludo() {
        //solicitar el ingreso de datos
        System.out.println("Bueno dias");
    }

    //FUNCIONES QUE RETORNAN UN TIPO DE DATOS
    //se agrega el static solo para poder acceder al metodo
    public static Integer obtenerEdad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        Integer edad = sc.nextInt();

        return edad;//retornar el contenido de la variable edad

    }

    public static Boolean validarMayorEdad(Integer edad) {

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
            return true;
        } else {
            System.out.println("Es menor de edad");
            return false;
        }


        //return true; //false
    }

}
