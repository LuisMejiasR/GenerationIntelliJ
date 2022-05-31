package com.generation.f20220531;

import com.generation.f20220531.manager.ClienteManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //arreglo de clientes
        List<Cliente> listaClientes = new ArrayList<>();
        int opcion = 0;

        //instancia de cliente
        /*Cliente cliente1 = new Cliente();
        cliente1.setId(123);
        cliente1.setNombreCliente("Ignacio");
        cliente1.setRut("123456-0");*/

        do {
            //excepciones
            Cliente clienteDatosDinamicos = new Cliente();//nueva instancia

            System.out.println("Ingrese el id de cliente:");
            //Integer idCliente = sc.nextInt();
            String idString = sc.nextLine();

            try {
                Integer idCliente = Integer.parseInt(idString);
                clienteDatosDinamicos.setId(idCliente);


                //sc.nextLine();

                System.out.println("Ingrese el nombre de cliente:");
                String nombreCliente = sc.nextLine();
                clienteDatosDinamicos.setNombreCliente(nombreCliente);

                System.out.println("Ingrese el rut de cliente:");
                String rut = sc.nextLine();
                clienteDatosDinamicos.setRut(rut);

                System.out.println("Ingrese el correo de cliente:");
                String correoCliente = sc.nextLine();
                clienteDatosDinamicos.setCorreo(correoCliente);

                /*Integer division = 100 / 0;
                System.out.println(division);*/

            } catch (ArithmeticException ae) {
                System.out.println("Error al dividir por cero");
            } catch (NumberFormatException nfe) {
                System.out.println("No puede ingresar una letra como identificador " + nfe);
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error, contacte al administrador " + e);
            }
            //agreagar el cliente a la lista:
            listaClientes.add(clienteDatosDinamicos);

            do {
                //mensaje para preguntar al usuario si desea agregar más clientes:
                System.out.println("¿Desea ingresar un nuevo cliente?\n (1) si \n (0) no");
                //captura de dato, la variable se crea fuera del scope
                opcion = sc.nextInt();
            } while (opcion < 0 || opcion > 1);
            sc.nextLine();


        } while (opcion == 1);

        //acceder a un metodo de otra clase
        ClienteManager cm = new ClienteManager();//se instancia la clase y se importa desde el otro package
        cm.recorrerArregloCliente(listaClientes); //le pasamos la lista de clientes que creamos arriba


    }

}
