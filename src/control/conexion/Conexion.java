/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package control.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 * 
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class Conexion {

    private static Connection cn = null;
    private String driver;
    private String url;
    private String usuario;
    private String password;

    /**
     * 
     */
    private Conexion() {

        String url = "jdbc:mysql://localhost:3306/cinedistritaldb";
        String driver = "com.mysql.jdbc.Driver";
        String usuario = "root";
        String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url, usuario, password);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión");
        }
    }

    // SINGLETON - retorna una unica instancia de la conexion
    public static Connection getConexion() {
        if (cn == null) {
            new Conexion();
        }

        return cn;
    }
}
