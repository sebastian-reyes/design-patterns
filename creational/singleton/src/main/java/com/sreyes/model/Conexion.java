package com.sreyes.model;

public class Conexion {

    private static Conexion instance;

    // Con este método privado se evitan crear instancias adicionales mediante operador "new"
    private Conexion() {
    }

    public static Conexion getInstance() {
        if (instance == null) {
            instance = new Conexion();
        }
        return instance;
    }

    // Métodos de prueba
    public void conectar() {
        System.out.println("Conectando a la base de datos");
    }

    public void desconectar() {
        System.out.println("Desconectando de la base de datos");
    }
}
