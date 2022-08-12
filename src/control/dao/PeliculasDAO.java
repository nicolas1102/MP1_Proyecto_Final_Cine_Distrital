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
import javax.swing.JOptionPane;
import modelo.MdlUsuario;


/**
 * 
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class PeliculasDAO {

    /**
     * busca el id de la pelicula seleccionada
     * 
     * @param peli
     * @return 
     */
    public ResultSet buscarIdPelicula(String peli) {
        Statement st;
        ResultSet rs = null;

        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery("SELECT idpelicula FROM pelicula where nombre= '" + peli + "'");
        } catch (SQLException ex) {

        }
        return rs;
    }

    /**
     * busca peliculas de la base de datos
     * 
     * @param multiplex
     * @return 
     */
    public ResultSet buscarPelicula(String multiplex) {
        Statement st;
        ResultSet rs = null;

        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery("select imagen,pelicula.nombre,idpelicula from funcion,multiplex,pelicula where pelicula_idpelicula=idpelicula and multiplex_idmultiplex=idmultiplex and multiplex.nombre = '" + multiplex + "' group by imagen order by idpelicula");
        } catch (SQLException ex) {

        }
        return rs;
    }

}
