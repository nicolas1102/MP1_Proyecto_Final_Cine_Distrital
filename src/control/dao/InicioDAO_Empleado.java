/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package control.dao;

import control.conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class InicioDAO_Empleado implements InicioDAO {

    /**
     * 
     * @param usuario
     * @param contraseña
     * @return 
     */
    public int comprobarUsuario(String usuario, String contraseña) {
        Statement st;
        ResultSet rs;
        int Empleado = 0;

        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery("SELECT codigo FROM empleados where cedula =" + usuario + " and codigo =" + contraseña);
            while (rs.next()) {

                Empleado = rs.getInt(1);
            }
        } catch (SQLException ex) {
            
        }
        return Empleado;
    }
}
