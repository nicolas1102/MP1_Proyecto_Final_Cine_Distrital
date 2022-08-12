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
import javax.swing.JOptionPane;
import control.conexion.Conexion;
import control.conexion.Conexion;

/**
 * 
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class EmpleadosDAO {

    public void actualizarEmpleado(int codigo, String cargo) {

        Statement st;

        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            st.execute("UPDATE empleados set cargo= '" + cargo + "' where codigo= " + codigo);
            JOptionPane.showMessageDialog(null, "Cargo actualizado correctamente.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El cargo no fue actualizado");
        }
    }

    public ResultSet buscarEmpleado(int Codigo) {
        Statement st;
        ResultSet rs = null;

        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery("SELECT codigo FROM empleados where codigo= " + Codigo + "");
        } catch (SQLException ex) {

        }
        return rs;
    }

    /**
     * Ingresa empleado a base de datos
     * 
     * @param codigo
     * @param cedula
     * @param telefono
     * @param cargo
     * @param salario
     * @param fecha
     * @param multiplex 
     */
    public void ingresarEmpleado(int codigo, int cedula, int telefono, String cargo, int salario, String fecha, int multiplex) {

        Statement st;

        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            st.execute("INSERT INTO empleados (codigo, cedula, telefono, cargo, salario, fecha_contratacion, multiplex_idmultiplex) values (" + codigo + "," + cedula + "," + telefono + ",'" + cargo + "'," + salario + ",'" + fecha + "'," + multiplex + ")");
            JOptionPane.showMessageDialog(null, "Empleado añadido correctamente ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en ingreso de datos " + ex);
        }
    }

    /**
     * busca empleado con el codigo
     * 
     * @param usuario
     * @return 
     */
    public ResultSet buscarEmpleadoPorCodigo(String usuario) {
        Statement st;
        ResultSet rs = null;

        try {
            Connection cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM empleados where codigo =" + usuario + "");

        } catch (SQLException ex) {

        }
        return rs;
    }
}
