package com.sreyes;

import com.sreyes.inter.IConexion;

public class Main {
    public static void main(String[] args) {

        ConexionFabrica fabrica = new ConexionFabrica();

        IConexion cx1 = fabrica.getConexion("MySql");
        cx1.conectar();
        cx1.desconectar();

        IConexion cx2 = fabrica.getConexion("Oracle");
        cx2.conectar();
        cx2.desconectar();

        IConexion cx3 = fabrica.getConexion("PostgreSql");
        cx3.conectar();
        cx3.desconectar();

        IConexion cx4 = fabrica.getConexion("");
        cx4.conectar();
        cx4.desconectar();
    }
}