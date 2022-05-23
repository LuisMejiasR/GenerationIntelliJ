package com.generation.f20220523;

public class Ejercicio1 {
    public static void main(String[] args) {
        //calculo area y calculo del perimetro
        //crear variables que permitan a futuro pasarle de manera dinamica valores
        //variables estaticas:


        //formula area triangulo a = (altura * base) / 2;
        float alturaTri = 4f;
        float baseTri = 5.24f;
        int dos = 2;
        float radioCir = 4.4587f;
        float PI = 3.14f;

        //impresion
        System.out.println("************************");
        System.out.println("****CALCULO DEL AREA****");
        System.out.println("************************");
        //formula

        System.out.println("El area de un triangulo es " + ((alturaTri * baseTri)/ dos));
        System.out.println("");
        System.out.println("");
        System.out.println("");


        //formula perimetro circulo
        //impresion
        System.out.println("************************");
        System.out.println("**CALCULO DE PERIMETRO**");
        System.out.println("************************");
        //formula = 2 * pi * radio
        System.out.println("El perimetro de un circulo es " + (dos * PI * radioCir));


    }
}
