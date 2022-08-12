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
public class ClientesDAO {

    /**
     * 
     * @param id
     * @param user
     * @param pass 
     */
    public void registrarCliente(int id, String user, String pass) {
        Statement st;

        try {
            System.out.println("test");
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            st.execute("INSERT INTO cliente (documento, contraseña, puntos, nombre) VALUES (" + id + ", '" + pass + "', 0, '" + user + "')");
            JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error, el usuario no se reggistró " + ex);
        }
    }

    
}
