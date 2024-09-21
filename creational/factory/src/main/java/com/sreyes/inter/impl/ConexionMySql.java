package com.sreyes.inter.impl;

import com.sreyes.inter.IConexion;

public class ConexionMySql implements IConexion {

    private String host;
    private int port;
    private String user;
    private String pass;

    public ConexionMySql() {
        this.host = "localhost";
        this.port = 3306;
        this.user = "sebas";
        this.pass = "123";
    }

    @Override
    public void conectar() {
        System.out.println("Conectando a base de datos MySql");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de base de datos MySql");
    }
}
