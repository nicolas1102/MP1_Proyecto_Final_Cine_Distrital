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
public class FechasDAO {
    /**
     * Metodo de consulta de las fechas de la pelicual en el multiplex seleccionado
     * 
     * @param multiplex
     * @param pelicula
     * @return 
     */
    public ResultSet buscarFecha(String multiplex,String pelicula){
        Statement st;
        ResultSet rs=null;
        
        try {
            Connection cn = Conexion.getConexion();
            st=cn.createStatement();
            rs=st.executeQuery("select fecha from funcion,multiplex,fechas,horario,pelicula where pelicula_idpelicula=idpelicula and multiplex_idmultiplex=idmultiplex and horario_idhorario=idhorario and fechas_idfecha=idfecha and pelicula.nombre= '"+pelicula+"' and multiplex.nombre='"+multiplex+"' group by fecha order by idfuncion");
        } catch (SQLException ex) {
            
        }
         return rs;   
   }
}
