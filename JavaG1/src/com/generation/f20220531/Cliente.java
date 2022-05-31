package com.generation.f20220531;

import java.util.List;

public class Cliente {
    //atributos
    private String rut;
    private Integer id;
    private List<Integer> numerosVenta;
    private String nombreCliente;
    private String correo;

    public void modificarAtributo(){
        rut = "123456789-0";
        this.nombreCliente="Luis";
    }

    //constructores

    public Cliente() {
    }

    public Cliente(String rut, Integer id, List<Integer> numerosVenta, String nombreCliente, String correo) {
        this.rut = rut;
        this.id = id;
        this.numerosVenta = numerosVenta;
        this.nombreCliente = nombreCliente;
        this.correo = correo;
    }

    //get y set

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Integer> getNumerosVenta() {
        return numerosVenta;
    }

    public void setNumerosVenta(List<Integer> numerosVenta) {
        this.numerosVenta = numerosVenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    //funciones


}
