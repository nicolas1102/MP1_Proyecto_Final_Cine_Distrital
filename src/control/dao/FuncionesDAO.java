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
public class FuncionesDAO {

    /**
     * Metodos para busqueda de la funcion seleecionada en ventana
     * 
     * @param multiplex
     * @param pelicula
     * @param fecha
     * @param hora
     * @return 
     */
    public ResultSet buscarFuncion(String multiplex, String pelicula, String fecha, String hora) {
        Statement st;
        ResultSet rs = null;

        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery("select idfuncion from funcion,multiplex,fechas,horario,pelicula where pelicula_idpelicula=idpelicula and multiplex_idmultiplex=idmultiplex and horario_idhorario=idhorario and fechas_idfecha=idfecha and fecha = '" + fecha + "' and pelicula.nombre='" + pelicula + "' and multiplex.nombre='" + multiplex + "' and hora='" + hora + "'");
        } catch (SQLException ex) {

        }
        return rs;
    }

    public ResultSet buscarFuncionRecibo(int funcion) {
        Statement st;
        ResultSet rs = null;

        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery("select numsala,multiplex.nombre,fecha,hora,pelicula.nombre from funcion,multiplex,fechas,horario,pelicula where pelicula_idpelicula=idpelicula and multiplex_idmultiplex=idmultiplex and horario_idhorario=idhorario and fechas_idfecha=idfecha and idfuncion = " + funcion);
        } catch (SQLException ex) {

        }
        return rs;
    }
}
