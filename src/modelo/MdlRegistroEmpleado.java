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
import vista.VtnRegistroEmpleado;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class MdlRegistroEmpleado {

    private int idMultiplex;

    private VtnRegistroEmpleado vtnRegistro;

    /**
     * 
     */
    public void Iniciar() {
        getVentana().setVisible(true);
        buscarMultiplex();
    }

    /**
     * 
     * @return 
     */
    public VtnRegistroEmpleado getVentana() {
        if (vtnRegistro == null) {
            vtnRegistro = new VtnRegistroEmpleado(this);
        }
        return vtnRegistro;
    }

    /**
     * metodo para buscar el nombre de todos los multiplexes
     */
    public void buscarMultiplex() {

        MultiplexesDAO multiplexesDAO = new MultiplexesDAO();
        ResultSet rs = multiplexesDAO.buscarMultiplex();
        try {
            while (rs.next()) {
                // agrega nombres multiplexes al combobox
                getVentana().getCombobox().addItem(rs.getString(1));
            }
        } catch (SQLException ex) {

        }
    }

    /**
     * busca el id del multiplex seleccionado
     */
    public void buscaIdMultiplex() {
        MultiplexesDAO m = new MultiplexesDAO();
        ResultSet rs = m.buscarIdMultiplex((String) getVentana().getCombobox().getSelectedItem());
        try {
            while (rs.next()) {
                idMultiplex = rs.getInt(1);
                System.out.println(idMultiplex);
            }
        } catch (SQLException ex) {

        }
    }

    /**
     * ingreso de empleado a base de datos
     */
    public void ingresarEmpleados() {
        if (getVentana().getCodigo().getText().equals("") || getVentana().getFecha().getText().equals("") || getVentana().getSalario().getText().equals("") || getVentana().getCargo().getText().equals("") || getVentana().getTelefono().getText().equals("") || getVentana().getCedula().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No deje espacios en blanco");
        } else {
            EmpleadosDAO empleadosDAO = new EmpleadosDAO();
            int codigo = Integer.parseInt(getVentana().getCodigo().getText());
            int cedula = Integer.parseInt(getVentana().getCedula().getText());
            int telefono = Integer.parseInt(getVentana().getTelefono().getText());
            String cargo = getVentana().getCargo().getText();
            int salario = Integer.parseInt(getVentana().getSalario().getText());
            String fecha = getVentana().getFecha().getText();
            empleadosDAO.ingresarEmpleado(codigo, cedula, telefono, cargo, salario, fecha, idMultiplex);
            getVentana().mostrarMenu();
        }
    }
}
