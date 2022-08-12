/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import control.dao.ClientesDAO;
import control.dao.MultiplexesDAO;
import control.dao.TicketsDAO;
import vista.VtnMenuCliente;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class MdlMenuCliente {

    private VtnMenuCliente vtnMenuCliente;
    private Boolean estado;

    public VtnMenuCliente getVentana() {
        if (vtnMenuCliente == null) {
            vtnMenuCliente = new VtnMenuCliente(this);
        }
        return vtnMenuCliente;
    }

    public void iniciar() {
        getVentana().setVisible(true);
        buscarMultiplex();
    }

    /**
     * Hace una consulta SQL a la base de datos para recuperar registros de los
     * multiplexes existentes
     */
    private void buscarMultiplex() {
        MultiplexesDAO multiplexesDAO = new MultiplexesDAO();
        ResultSet rs = multiplexesDAO.buscarMultiplex();
        try {
            // recorre todos los registros drecuperados de la base de datos
            while (rs.next()) {
                // añade el nombre del multiplex al combo box de multiplexes
                getVentana().getCombobox().addItem(rs.getString(1));
            }
        } catch (SQLException ex) {

        }
    }

    /**
     *
     * @return
     */
    public Boolean validarEstado() {
        TicketsDAO ticketDAO = new TicketsDAO();
        ResultSet rs = ticketDAO.buscarPeliculasCliente();
        try {
            if (rs.next()) {
                estado = true;
            } else {
                estado = false;
            }
        } catch (SQLException ex) {

        }
        return estado;
    }

}
