/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package control.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import control.conexion.Conexion;

/**
 * 
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class InicioDAO_Cliente implements InicioDAO {

    /**
     * 
     */
    public InicioDAO_Cliente() {

    }

    /**
     * 
     * @param usuario
     * @param contraseña
     * @return 
     */
    public int comprobarUsuario(String usuario, String contraseña) {
        Statement st;
        ResultSet rs;
        int cliente = 0;

        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery("SELECT documento FROM cliente where documento =" + usuario + " and contraseña =" + contraseña);
            while (rs.next()) {

                // toma el primer campo del registro
                cliente = rs.getInt(1);
            }
        } catch (SQLException ex) {

        }
        return cliente;
    }

    /**
     * 
     * @param usuario
     * @return 
     */
    public int buscarCliente(int usuario) {
        Statement st;
        ResultSet rs;
        int cliente = 0;

        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery("SELECT documento FROM cliente where documento =" + usuario);
            while (rs.next()) {

                cliente = rs.getInt(1);
            }
        } catch (SQLException ex) {

        }
        return cliente;
    }
}
