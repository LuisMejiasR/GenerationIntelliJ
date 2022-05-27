package com.generation.f20220527;

public class Alumno {
    //ATRIBUTOS
    private String Nombres;
    private String Apellidos;
    private int edad;
    private Double notas;

    //CONSTRUCTORES

        //constructor vacio
    public Alumno() {
    }

        //constructor con parametros
    public Alumno(String nombres, String apellidos, int edad, Double notas) {
        Nombres = nombres;
        Apellidos = apellidos;
        this.edad = edad;
        this.notas = notas;
    }


    //MODIFICADORES O MUTADORES

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getNotas() {
        return notas;
    }

    public void setNotas(Double notas) {
        this.notas = notas;
    }


    //FUNCIONES



}
