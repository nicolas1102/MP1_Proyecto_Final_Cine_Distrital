/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import control.dao.PeliculasDAO;
import control.dao.CalificacionesDAO;
import control.dao.ClientesDAO;
import control.dao.TicketsDAO;
import vista.VtnCalificarPelicula;

/**
 * 
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class MdlCalificarPelicula {

    private VtnCalificarPelicula vtnCalificar;

    /**
     * 
     * @return 
     */
    public VtnCalificarPelicula getVentana() {
        if (vtnCalificar == null) {
            vtnCalificar = new VtnCalificarPelicula(this);
        }
        return vtnCalificar;
    }

    /**
     * 
     */
    public void iniciar() {
        getVentana().setVisible(true);
        buscarPeliculas();
    }

    /**
     * metodo busca las peliculas que ha visto el cliente
     */
    public void buscarPeliculas() {
        TicketsDAO ticketsDAO = new TicketsDAO();
        ResultSet rs = ticketsDAO.buscarPeliculasCliente();
        try {
            while (rs.next()) {
                getVentana().getCombobox().addItem(rs.getString(1));
            }
        } catch (SQLException ex) {

        }
    }

    /**
     * metodo para ingresar calificacion de pelicula
     */
    public void calificarPelicula() {
        PeliculasDAO i = new PeliculasDAO();
        ResultSet rs = i.buscarIdPelicula((String) getVentana().getCombobox().getSelectedItem());
        try {
            int id = 0;
            // toma el id de la pelicula seleecionada
            while (rs.next()) {
                id = rs.getInt(1);
            }
            
            // ingresa calificacion
            CalificacionesDAO calificacionesDAO = new CalificacionesDAO();
            String calificacion = getVentana().getSpinner().getValue().toString();
            int nota = Integer.parseInt(calificacion);
            calificacionesDAO.calificarPelicula(id, nota);
        } catch (SQLException ex) {

        }

    }
}
