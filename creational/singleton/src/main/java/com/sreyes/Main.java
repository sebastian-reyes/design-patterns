package com.sreyes;

import com.sreyes.model.Conexion;

public class Main {
    public static void main(String[] args) {
        /*
           Se evita hacer instaciar de esta manera
           Conexion c = new Conexion();
        */
        Conexion c = Conexion.getInstance();
        c.conectar();
        c.desconectar();

        // Verificacion para saber si c está instanciado de Conexion
        boolean respuesta = c instanceof Conexion;
        System.out.println(respuesta);

        /*
        Tener en cuenta que Spring gestiona sus beans como Singleton por defecto
         */
    }
}