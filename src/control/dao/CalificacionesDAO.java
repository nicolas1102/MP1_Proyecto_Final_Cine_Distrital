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
public class CalificacionesDAO {
    
    /**
     * Hace consulta de las calificacion de la pelicula y hace un promedio con ellas
     * 
     * @param id
     * @return 
     */
    public ResultSet buscarCalificacionPelicula(int id) {
        Statement st;
        ResultSet rs = null;
        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery("select avg(valor) from calificacion where pelicula_idpelicula = " + id);
        } catch (SQLException ex) {

        }
        return rs;
    }

    /**
     * 
     * @param peli
     * @param nota 
     */
    public void calificarPelicula(int peli, int nota) {
        MdlUsuario u = MdlUsuario.crearUsuario("");
        String cliente = u.getUser();
        Statement st;
        ResultSet rs = null;
        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            
            // Verifica si ya hay una calificacion del ciente, en caso afirmativo, actualiza la calificaciones, en canso contrario, ingresa una nueva califiacion
            rs = st.executeQuery("SELECT idcalificacion,valor FROM calificacion where pelicula_idpelicula = " + peli + " and cliente_documento = " + cliente);
            if (rs.next()) {
                int id = rs.getInt(1);
                JOptionPane.showMessageDialog(null, "Cambio correctamente su calificacion de " + rs.getInt(2) + " a " + nota);
                st.execute("UPDATE calificacion set valor= " + nota + " where idcalificacion= " + id);
            } else {
                st.execute("insert into calificacion (valor,pelicula_idpelicula,cliente_documento) values (" + nota + "," + peli + "," + cliente + ")");
                JOptionPane.showMessageDialog(null, "Calificacion de " + nota + " registrada correctamente");
            }
        } catch (SQLException ex) {

        }
    }
}
