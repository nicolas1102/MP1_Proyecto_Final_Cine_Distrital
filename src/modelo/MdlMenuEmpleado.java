/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import control.dao.EmpleadosDAO;
import control.dao.InicioDAO_Cliente;
import control.dao.MultiplexesDAO;
import vista.VtnMenuEmpleado;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class MdlMenuEmpleado {

    private VtnMenuEmpleado vtnMenuEmpleado;
    private int id;

    /**
     *
     * @return
     */
    public VtnMenuEmpleado getVentana() {
        if (vtnMenuEmpleado == null) {
            vtnMenuEmpleado = new VtnMenuEmpleado(this);
        }
        return vtnMenuEmpleado;
    }

    /**
     *
     * @param id
     */
    public void iniciar(int id) {
        this.id = id;
        getVentana().setVisible(true);
        buscarMultiplexDelEmpleado();
    }

    /**
     *
     * @param cedula
     * @return
     */
    public int buscarCliente(int cedula) {
        InicioDAO_Cliente inicioDAO_Cliente = new InicioDAO_Cliente();
        int ced = inicioDAO_Cliente.buscarCliente(cedula);
        return ced;
    }

    /**
     * busca el nombre del multiplex de donde trabaja el empleado
     *
     * @return
     */
    public String buscarMultiplexDelEmpleado() {
        // busca el cosigo del multiples de lempleado
        EmpleadosDAO empleadosDAO = new EmpleadosDAO();
        ResultSet rs = empleadosDAO.buscarEmpleadoPorCodigo("" + id);
        int multi = 0;
        try {
            while (rs.next()) {
                // toma solo el ultimo dato del registro de empleado
                multi = rs.getInt(7);
            }
        } catch (SQLException ex) {

        }

        // busca el nombre del multiplex segun el cpdigo encontrado anteriormente
        MultiplexesDAO multiplexesDAO = new MultiplexesDAO();
        rs = multiplexesDAO.buscarNombreMultiplex(multi);
        String nombreM = null;
        try {
            while (rs.next()) {
                nombreM = rs.getString(1);
            }
        } catch (SQLException ex) {

        }
        return nombreM;
    }
}
