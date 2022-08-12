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
public class MultiplexesDAO {

    /**
     *
     * @param Multiplex
     * @return
     */
    public ResultSet buscarIdMultiplex(String Multiplex) {
        Statement st;
        ResultSet rs = null;

        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery("SELECT idmultiplex FROM multiplex where nombre= '" + Multiplex + "'");
        } catch (SQLException ex) {

        }
        return rs;
    }

    /**
     * busca los nombre de todos lo multiplexes
     * @return 
     */
    public ResultSet buscarMultiplex() {
        Statement st;
        ResultSet rs = null;

        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery("SELECT nombre FROM multiplex");
        } catch (SQLException ex) {

        }
        return rs;
    }

    public ResultSet buscarNombreMultiplex(int Multiplex) {
        Statement st;
        ResultSet rs = null;

        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery("SELECT nombre FROM multiplex where idmultiplex= " + Multiplex + "");
        } catch (SQLException ex) {

        }
        return rs;
    }
}
