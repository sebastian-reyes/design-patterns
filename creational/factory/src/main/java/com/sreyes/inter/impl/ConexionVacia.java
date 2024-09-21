package com.sreyes.inter.impl;

import com.sreyes.inter.IConexion;

public class ConexionVacia implements IConexion {

    @Override
    public void conectar() {
        System.out.println("No se especificó proveedor");
    }

    @Override
    public void desconectar() {
        System.out.println("No se especificó proveedor");
    }
}
