package com.generation.f20220527;

public class Auto {
    //ATRIBUTOS
    private String color;
    private String modelo;
    private String marca;
    private Double velocidad;

    //CONSTRUCTORES
        //constructor vacio
    public Auto() {
    }

        //construtores con parametros

    public Auto(String color, String modelo, String marca, Double velocidad) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.velocidad = velocidad;
    }


    //ACCESADORES Y MUTADORES (get y set)


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    //METODOS O FUCNIONES (se escriben a mano, son personalizadas)
    public void aumentarVelocidad(){
        this.velocidad = 10d;
    }






}
