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
public class HorasDAO {
    /**
     * busqueda de horas segun multiplex, peliculas y fechas
     * 
     * @param multiplex
     * @param pelicula
     * @param fecha
     * @return 
     */
    public ResultSet buscarHora(String multiplex,String pelicula,String fecha){
        Statement st;
        ResultSet rs=null;
        
        try {
            Connection cn = Conexion.getConexion();
            st=cn.createStatement();
            rs=st.executeQuery("select hora from funcion,multiplex,fechas,horario,pelicula where pelicula_idpelicula=idpelicula and multiplex_idmultiplex=idmultiplex and horario_idhorario=idhorario and fechas_idfecha=idfecha and pelicula.nombre= '"+pelicula+"' and fecha='"+fecha+"' and multiplex.nombre='"+multiplex+"' group by hora order by idfuncion");
        } catch (SQLException ex) {
            
        }
         return rs;   
   }
}
