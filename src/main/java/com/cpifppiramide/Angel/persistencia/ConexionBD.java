package com.cpifppiramide.Angel.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static Connection conexion;

    public static Connection getConexion() throws SQLException {

        if (conexion == null) {
            conexion = DriverManager.getConnection("jdbc:mysql://actividad2.cvisiaw68v76.us-east-1.rds.amazonaws.com/restaurante", System.getenv("USUARIO"), System.getenv("PASSWORD"));
            System.out.println("Base de datos conectada correctamente.");
        }
        return conexion;
    }
}
