package com.generation.f20220524;

public class CalculoPromedio {
    public static void main(String[] args) {
        //int cantidadNotas = 12;
        //ARREGLO:
        Integer[] notas = {20,50,70,99,70,100,88,77,28,79,33,50};


        int sumaNotas = 0;
        int notasFueraDeRango = 0;

        //como recorrer el arreglo de notas
        for (int i = 0; i < notas.length; i++) {
            //validar la nota
            if (notas[i] < 0 || notas[i] > 100){
                System.out.println("La nota: " + notas[i] + " en la posicion " + (i + 1) + " está fuera de rango");
                notasFueraDeRango++;
            }

            sumaNotas = sumaNotas + notas[i];//accedemos a los valores notas[i];
        }
        //se imprimen el promedio y el número de materias

        System.out.println("El número de materias fue: " + notas.length);
        if(notasFueraDeRango == 0) {//no hay notas fuera de rango;


            //promedio > suma todas las notas / cantidad de notas;
            float promedio = sumaNotas / notas.length;
            System.out.println("\nPromedio del alumno: " + promedio);

            //PUNTO CRITICO:
            //0>=reprobado<=49; 50>=aprobado<=100;
            if (promedio >= 50 && promedio <= 100) {
                System.out.println("Alumno aprobado");
            } else if (promedio >= 0 && promedio < 50) {
                System.out.println("Alumno reprobado");
            } else {
                System.out.println("Error en el promedio, por favor revisar las notas");
            }
        }else {
            System.out.println("Favor revisar notas");
        }


    }
}
