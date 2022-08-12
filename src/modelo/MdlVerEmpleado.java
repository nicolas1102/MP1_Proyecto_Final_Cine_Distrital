/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import control.dao.EmpleadosDAO;
import control.dao.MultiplexesDAO;
import vista.VtnVerEmpleado;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class MdlVerEmpleado {

    private VtnVerEmpleado vtnVerEmpleado;
    private EmpleadosDAO empleadosDAO;

    /**
     *
     * @return
     */
    public VtnVerEmpleado getVentana() {
        if (vtnVerEmpleado == null) {
            vtnVerEmpleado = new VtnVerEmpleado(this);
        }
        return vtnVerEmpleado;
    }

    /**
     *
     */
    public MdlVerEmpleado() {

    }

    /**
     *
     */
    public void iniciar() {
        getVentana().setVisible(true);
    }

    /**
     * metodo para recuperar informacion del empleado y mostrar en pantalla
     *
     * @param usuario
     */
    public void mostrarInfoEmpleado(String usuario) {
        empleadosDAO = new EmpleadosDAO();
        ResultSet rs = empleadosDAO.buscarEmpleadoPorCodigo(usuario);
        int idMultiplex = 0;
        if (rs == null) {
            JOptionPane.showMessageDialog(null, "Empleado no encontrado");
        } else {
            try {
                while (rs.next()) {
                    // busca info de empleado
                    getVentana().getLabel2().setText("Cédula: " + rs.getInt(2));
                    getVentana().getLabel3().setText("Teléfono: " + rs.getString(3));
                    getVentana().getLabel4().setText("Cargo: " + rs.getString(4));
                    getVentana().getLabel5().setText("Salario: " + rs.getString(5));
                    getVentana().getLabel6().setText("Fecha de contratación: " + rs.getString(6));
                    idMultiplex = rs.getInt(7); // id multiplex
                }
            } catch (SQLException ex) {
            }

            // busca nombre de multiplex
            MultiplexesDAO multiplexesDAO = new MultiplexesDAO();
            rs = multiplexesDAO.buscarNombreMultiplex(idMultiplex);
            try {
                while (rs.next()) {
                    // muestra nombre multiplex
                    getVentana().getLabel7().setText("Multiplex: " + rs.getString(1));
                }
            } catch (SQLException ex) {
            }
        }
    }
}
