package com.generation.f20220524;

public class CalculoPromedio {
    public static void main(String[] args) {
        //int cantidadNotas = 12;
        //ARREGLO:
        Integer[] notas = {20,50,67,99,10,0,88,77,58,79,33,50};


        int sumaNotas = 0;
        //como recorrer el arreglo de notas
        for (int i = 0; i < notas.length; i++) {
            sumaNotas = sumaNotas + notas[i];//accedemos a los valores notas[i];
        }
        System.out.println("Suma de notas: " + sumaNotas);
        //promedio > suma todas las notas / cantidad de notas;
        float promedio = sumaNotas / notas.length;
        System.out.println("Promedio del alumno: " + promedio);

        //PUNTO CRITICO:
        //0>=reprobado<=49; 50>=aprobado<=100;
        if(promedio >= 50 && promedio <= 100){
            System.out.println("Alumno aprobado");
        }else if(promedio >= 0 && promedio < 50){
            System.out.println("Alumno reprobado");
        }else {
            System.out.println("Error en el promedio, por favor revisar las notas");
        }

    }
}
