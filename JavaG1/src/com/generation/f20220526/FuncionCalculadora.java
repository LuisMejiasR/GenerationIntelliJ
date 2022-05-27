package com.generation.f20220526;

public class FuncionCalculadora {
    public static void main(String[] args) {
        //objetivo, crear la calculadora
        //funciones para cada uno de los metodos
        //ingreso de dos números
        //5 funciones para llamar a main:
        //suma, resta, division, multiplicacion, modulo (pares o impares)

        //elevar o potencia
        double numeroElevado = Math.pow(4.5, 1);
        System.out.println(numeroElevado);

        //redondear al entero mayor (hacia arriba)
        double enteroMayor = Math.ceil(numeroElevado);
        System.out.println(enteroMayor);

        //redondear al entero menor (hacia abajo)
        double enteroMenor = Math.floor(numeroElevado);
        System.out.println(enteroMenor);

        //redondeo
        double enteroRedondeado = Math.round(numeroElevado);
        System.out.println(enteroRedondeado);

        //numeros aleatorios
        //genera numeros entre >= 0.0 && < 1.0 (nunca 1)
        double aleatorio = Math.random();
        System.out.println(aleatorio);

        //numeros aleatorios entre 0 y 10

        double num010 = Math.random() * 10;
        System.out.println(num010);

        //numeros aleatorios entre 2 y 8

        double num28 = (Math.random() * (8 - 2) + 2);
        System.out.println(Math.abs(num28));
        System.out.println(Math.round(num28));
        System.out.println(Math.floor(num28));

        //numeros aleatorios entre 2 y 8
        double numNormal = 100;
        int negativo = -1;
        double numNeg = (negativo * numNormal);

        double numResultado = (Math.random() * (100 - numNeg) + numNeg);
        System.out.println(numResultado);

    }

}