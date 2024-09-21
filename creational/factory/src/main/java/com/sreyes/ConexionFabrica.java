package com.sreyes;

import com.sreyes.inter.IConexion;
import com.sreyes.inter.impl.ConexionMySql;
import com.sreyes.inter.impl.ConexionOracle;
import com.sreyes.inter.impl.ConexionPostgreSql;
import com.sreyes.inter.impl.ConexionVacia;

public class ConexionFabrica {
    public IConexion getConexion(String motor) {
        if (motor == null) {
            return new ConexionVacia();
        }
        if (motor.equalsIgnoreCase("MySql")) {
            return new ConexionMySql();
        } else if (motor.equalsIgnoreCase("Oracle")) {
            return new ConexionOracle();
        } else if (motor.equalsIgnoreCase("PostgreSql")) {
            return new ConexionPostgreSql();
        }
        return new ConexionVacia();
    }
}
