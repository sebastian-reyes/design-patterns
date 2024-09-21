package com.sreyes.inter.impl;

import com.sreyes.inter.IConexion;

public class ConexionPostgreSql implements IConexion {

    private String host;
    private int port;
    private String user;
    private String pass;

    public ConexionPostgreSql() {
        this.host = "localhost";
        this.port = 15043;
        this.user = "postgre";
        this.pass = "45261";
    }

    @Override
    public void conectar() {
        System.out.println("Conectando a base de datos PostgreSql");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de base de datos PostgreSql");
    }
}
