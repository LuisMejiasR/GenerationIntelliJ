package com.generation.f20220531.manager;

import com.generation.f20220531.Cliente;

import java.util.List;

public class ClienteManager {

    //funcion simple
    //recorrer el arreglo e imprimir

    public void recorrerArregloCliente (List<Cliente> listaClientes){
        //foreach para recorrer todos los elementos del arreglo "lista de clientes"
        for (Cliente clientesEnLaLista : listaClientes) {

            //identificar número de cliente
            int i = 1;
            System.out.println("Datos cliente "+ i++ +":");

            System.out.println("Nombre: " + clientesEnLaLista.getNombreCliente());
            System.out.println("Correo: " + clientesEnLaLista.getCorreo());
            System.out.println("Id: " + clientesEnLaLista.getId());
            System.out.println("Rut: " + clientesEnLaLista.getRut());

        }
    }

}
