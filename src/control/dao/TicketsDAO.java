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
import modelo.MdlUsuario;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class TicketsDAO {

    /**
     * actualiza silla comprada en tabla ticket
     *
     * @param funcion
     * @param asiento
     */
    public void actualizarSilla(int funcion, int asiento) {
        MdlUsuario u = MdlUsuario.crearUsuario("");
        String cliente = u.getUser();
        Statement st;
        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            st.execute("insert into ticket (asiento_idasiento,funcion_idfuncion,cliente_documento) values (" + asiento + "," + funcion + "," + cliente + ")");
        } catch (SQLException ex) {

        }
    }

    /**
     * consulta de silla ocupada
     *
     * @param funcion
     * @return
     */
    public ResultSet buscarTicketDeSillaOcupada(int funcion) {
        Statement st;
        ResultSet rs = null;

        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery("select posicion from asiento,ticket,funcion where funcion_idfuncion=idfuncion and asiento_idasiento=idasiento and idfuncion=" + funcion);
        } catch (SQLException ex) {

        }
        return rs;
    }

    /**
     *
     * @return
     */
    public ResultSet buscarPeliculasCliente() {
        MdlUsuario u = MdlUsuario.crearUsuario("");
        String x = u.getUser();
        Statement st;
        ResultSet rs = null;
        System.out.println("" + x);
        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery("select nombre, idpelicula from ticket,funcion,pelicula where pelicula_idpelicula = idpelicula and funcion_idfuncion = idfuncion and cliente_documento = " + x + " group by nombre");
        } catch (SQLException ex) {

        }
        return rs;
    }
}
