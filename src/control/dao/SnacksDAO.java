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
public class SnacksDAO {

    /**
     *
     *
     * @param id
     * @param cantidad
     * @param producto
     */
    public void actualizarDisponibilidadSnacks(int id, int cantidad, int producto) {
        Statement st;
        try {
            System.out.println("Entró");
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            st.execute("UPDATE snacks_multiplex set disponibles= '" + cantidad + "' where multiplex_idmultiplex= " + id + " AND snacks_idsnack = " + producto);
        } catch (SQLException ex) {

        }
    }

    /**
     * retorna los senacks y su respectivo precio
     *
     * @return
     */
    public ResultSet buscarSnack() {
        Statement st;
        ResultSet rs = null;

        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery("SELECT nombre, precio FROM snacks");
        } catch (SQLException ex) {

        }
        return rs;
    }

    /**
     * Recupera todos los egistros de snacks
     *
     * @return
     */
    public ResultSet comprobarSnacks() {
        Statement st;
        ResultSet rs = null;
        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM snacks");

        } catch (SQLException ex) {

        }
        return rs;
    }

    /**
     * comprueba disponibilidad de cada snack
     *
     * @param multi
     * @return
     */
    public ResultSet comprobarDatosSnacks(int multi) {
        Statement st;
        ResultSet rs = null;
        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery("SELECT disponibles FROM snacks_multiplex where multiplex_idmultiplex =" + multi + "");
        } catch (SQLException ex) {

        }
        return rs;
    }
}
