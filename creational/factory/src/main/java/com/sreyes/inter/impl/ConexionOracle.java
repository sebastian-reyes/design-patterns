package com.sreyes.inter.impl;

import com.sreyes.inter.IConexion;

public class ConexionOracle implements IConexion {

    private String host;
    private int port;
    private String user;
    private String pass;

    public ConexionOracle() {
        this.host = "localhost";
        this.port = 8080;
        this.user = "admin";
        this.pass = "345";
    }

    @Override
    public void conectar() {
        System.out.println("Conectando a base de datos Oracle");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de base de datos Oracle");
    }
}
