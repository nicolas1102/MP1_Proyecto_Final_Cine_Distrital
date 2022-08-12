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
import modelo.MdlUsuario;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class SillasDAO {

    /**
     * busca sillas segun la posicion ingresasda
     *
     * @param asiento
     * @return
     */
    public ResultSet buscarSilla(String asiento) {
        Statement st;
        ResultSet rs = null;

        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery("select idasiento from asiento where posicion='" + asiento + "'");
        } catch (SQLException ex) {

        }
        return rs;
    }

    /**
     * consulata de
     *
     * @param multiplex
     * @param pelicula
     * @param fecha
     * @param asiento
     * @param hora
     * @return
     */
    public ResultSet buscarTipoSilla(String multiplex, String pelicula, String fecha, String asiento, String hora) {
        Statement st;
        ResultSet rs = null;

        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery("select count(*) from asiento,ticket,funcion,multiplex,fechas,horario,pelicula where pelicula_idpelicula=idpelicula and multiplex_idmultiplex=idmultiplex and horario_idhorario=idhorario and fechas_idfecha=idfecha and funcion_idfuncion=idfuncion and asiento_idasiento=idasiento and tipo_asiento='" + asiento + "' and fecha = '" + fecha + "' and pelicula.nombre='" + pelicula + "' and multiplex.nombre='" + multiplex + "' and hora='" + hora + "'");
        } catch (SQLException ex) {

        }
        return rs;
    }
}
