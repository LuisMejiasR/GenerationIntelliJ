package com.generation;

public class Main {
    public static void main(String[] args) {
        //VARIABLES PRIMITIVAS:
        // se define el tipo de dato al cual pertenecera la variable;
        //tipoDeDato nombreDeVariable = asignación;
        String nombreString = "Luis \n Mejias";
        System.out.println(nombreString);

        //16bit (un solo caracter entre comillas simples)
        char letraA = 'a';

        //Variables numericas (numeros primitivos)
        //32bits
        int numeroInt = 2147483647;
        System.out.println(numeroInt + 10);

        //8bits
        byte numeroByte = 127;
        System.out.println(numeroByte);

        //16bits
        short numeroShort = 32767;
        System.out.println(numeroShort);

        //64bits
        long numeroLong = 2147483647;
        System.out.println(numeroLong);

        //float && double, son para objetos (aceptan decimales);

        //Variable booleana (true || false)
        boolean acepta = true;//false



        int poblacion = 1000;
        System.out.println(poblacion);

        byte edad = 28;
        System.out.println(edad);

        String nombre = "Luis";
        System.out.println(nombre);

        String ocupacion = "G1";
        System.out.println(ocupacion);

        String genero = "Masculino";
        System.out.println(genero);

        //VARIABLES TIPO OBJETO
        System.out.println(nombre.charAt(3));

        //los "String" se comparan con "equals", el "==" se usa para números y boolean
        if(ocupacion.equals("g1")){
            System.out.println("Iguales");
        }else {
            System.out.println("Distintos");
        }
        if (ocupacion.equalsIgnoreCase("G1")) {
            System.out.println("Iguales");
        }else{
            System.out.println("Distintos");
        }
        if (ocupacion.equals("g1".toUpperCase())){
            System.out.println("Son iguales");
        }
        String curso = ""; //variable vacia
        String curso2 = null; //variable null
        // comparar un null siempre se hace con "==";
        if(null == curso2){
            System.out.println("Es null");
        }else{
            System.out.println("Es blanco");
        }

        //Float y Double (distintas a las variables numericas):
        //Un cast es convertir un tipo de dato a otro tipo de dato;
        float altura = (float) 1.94;//1.94f;

        Float peso = 110.5f;

        Float gravedad = Float.parseFloat("9.6");

        //PARSE: convertir String a un tipo de número;
        Integer.parseInt("26");
        Long.parseLong("46546464");
        Float.parseFloat("87.6");
        Double.parseDouble("1234156.56");

        //ejercicio de convertir datos:
        long varLong = 3152;
        //convertir al resto de datos (primitiva a objeto y viceversa)
        //automatica
        //byte>short>int>long>float>double
        int num4 = 18;
        float num4f = num4;
        System.out.println(num4);
        System.out.println(num4f);

        //manual
        //double>float>long>int>short>byte
        Double peso2 = 75.9;
        /*float peso2PF = peso2.floatValue();
        Float peso2F = peso2PF;
        Float peso2F = peso2.floatValue();*/


        Float peso2F = peso2.floatValue(); // camino corto

        //SIMBOLOS: + - * / % (operadores matematicos)
        // == != > >= < <= (operadores de igualdad)
        int dos = 2;
        int tres = 3;
        if(5 == (tres + dos)){
            
        }


    }
}
