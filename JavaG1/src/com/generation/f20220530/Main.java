package com.generation.f20220530;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Alumno> listaAlumnos = new ArrayList<Alumno>();

        //INSTANCIA DE UNA CLASE
        Alumno alumno = new Alumno(); //Constructor vacio, para asignar luego
        Alumno alumno2 = new Alumno("Luis","Mejias",28,"G1");//constructor con parametros

        //System.out.println(alumno.getNombre());
        //System.out.println(alumno2.getNombre());

        //SETTER
        alumno.setNombre("Leonardo");
        //System.out.println(alumno.getNombre());

        // crear tantas instancias como miembros del equipo existan
        // asignar los datos a las instancias
        //imprimir los valores

        Alumno alumno01 = new Alumno("Luis","Mejias",28,"G1");
        Alumno alumno02 = new Alumno("Leonardo","Utreras",26,"G1");
        Alumno alumno03 = new Alumno("Mary","Aedo",18,"G1");
        Alumno alumno04 = new Alumno("Francisco","Perez",26,"G1");
        Alumno alumno05 = new Alumno("Francisco","Cid",25,"G1");
        Alumno alumno06 = new Alumno("Ignacio","Romero",23,"G1");

        //AGREGAMOS LOS ATRIBUTOS A LA LISTA
        listaAlumnos.add(alumno01);
        listaAlumnos.add(alumno02);
        listaAlumnos.add(alumno03);
        listaAlumnos.add(alumno04);
        listaAlumnos.add(alumno05);
        listaAlumnos.add(alumno06);


        /* UN MENÚ PARA UN EJERCICIO
        System.out.println("*****************************");
        System.out.println("****** DATOS EQUIPO 1 *******");
        System.out.println("*****************************");
        System.out.println("\nNombres - Apellidos - Edad - Sección:\n");
        System.out.println(alumno01.getNombre()+ " - " + alumno01.getApellido()+ " - " + alumno01.getEdad()+" - " + alumno01.getCurso());
        System.out.println(alumno02.getNombre()+ " - " + alumno02.getApellido()+ " - " + alumno02.getEdad()+" - " + alumno02.getCurso());
        System.out.println(alumno03.getNombre()+ " - " + alumno03.getApellido()+ " - " + alumno03.getEdad()+" - " + alumno03.getCurso());
        System.out.println(alumno04.getNombre()+ " - " + alumno04.getApellido()+ " - " + alumno04.getEdad()+" - " + alumno04.getCurso());
        System.out.println(alumno05.getNombre()+ " - " + alumno05.getApellido()+ " - " + alumno05.getEdad()+" - " + alumno05.getCurso());
        System.out.println(alumno06.getNombre()+ " - " + alumno06.getApellido()+ " - " + alumno06.getEdad()+" - " + alumno06.getCurso());
        */

        System.out.println(alumno01.toString());

        //RESPUESTA DEL PROFE (se agrega la ArrayList y la List):

        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println(listaAlumnos.get(i).getNombre());
            System.out.println(listaAlumnos.get(i).getApellido());
        }

        for (Alumno objAlumno: listaAlumnos) {
            System.out.println(objAlumno.getNombre());
            System.out.println(objAlumno.getCurso());

        }

    }
}
