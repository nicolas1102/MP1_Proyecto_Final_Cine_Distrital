/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package modelo;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SpinnerNumberModel;
import control.dao.FechasDAO;
import control.dao.FuncionesDAO;
import control.dao.HorasDAO;
import control.dao.PeliculasDAO;
import control.dao.CalificacionesDAO;
import control.dao.SillasDAO;
import vista.VtnSeleccionFuncion;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class MdlSeleccionFuncion {

    private VtnSeleccionFuncion vtnFuncion;
    String multiplex;
    int general;
    int preferencial;

    /**
     * 
     * @param multiplex
     * @return 
     */
    public VtnSeleccionFuncion getVentana(String multiplex) {
        if (vtnFuncion == null) {
            vtnFuncion = new VtnSeleccionFuncion(this, multiplex);
        }
        return vtnFuncion;
    }

    /**
     * 
     * @param multiplex 
     */
    public void iniciar(String multiplex) {
        this.multiplex = multiplex;
        getVentana(multiplex).setVisible(true);
        getPelicula(multiplex, 1);
        setFecha();
    }

    /**
     * Metodo para obtener la cantidad de peliculas del multplex de la base de
     * datos
     *
     * @param multiplex
     * @return
     */
    public int getCantidadPeliculasDeMultiplex(String multiplex) {
        int cont = 0;
        PeliculasDAO peliculasDAO = new PeliculasDAO();
        ResultSet rs = peliculasDAO.buscarPelicula(multiplex);
        try {
            while (rs.next()) {
                cont++;
            }
        } catch (SQLException ex) {

        }
        return cont++;
    }

    /**
     * Busca la pelicula que se va a mostrar en pantalla segun su multiplex y el
     * numero de pelicula
     *
     * @param multiplex
     * @param cont
     */
    public void getPelicula(String multiplex, int cont) {
        CalificacionesDAO calificacionesDAO = new CalificacionesDAO();
        PeliculasDAO peliculasDAO = new PeliculasDAO();
        ResultSet rs = peliculasDAO.buscarPelicula(multiplex);
        int c = 1;

        // para guardar datos de la pelicula
        String peli = "";
        int id = 0;
        BufferedImage image = null;

        // carga de datos e imagenes de cada pelicula
        try {
            while (rs.next()) {
                // solo si el c auxiliar es igual al numero de la pelicula, se guarda el nombre de la pelicula, el id y la imagen de la misma
                if (c == cont) {
                    peli = rs.getString(2);
                    id = rs.getInt(3);
                    java.sql.Blob blob = rs.getBlob(1);
                    InputStream in = blob.getBinaryStream();
                    image = ImageIO.read(in);
                }
                c++;// aumenta contador de registros obtenidos de la consulta
            }
        } catch (SQLException | IOException ex) {
            System.out.println("Error al cargar imagenes de la base de datos");
        }

        // muestra de imagen y nombre de pelicula
        getVentana(multiplex).getImagen().setText("");
        getVentana(multiplex).getImagen().setIcon(new ImageIcon(image));
        getVentana(multiplex).getNombrePelicula().setText(peli);

        // consulta a la base de datos de todos las calificaciones con el id de la pelicula y en la misma sentencia opera el promedio de todas estas calificaciones
        ResultSet rs2 = calificacionesDAO.buscarCalificacionPelicula(id);

        try {
            boolean v = true;
            while (rs2.next()) {
                if (rs2.getBigDecimal(1) != null) {
                    v = false;
                    // muestra calificacion mpromedio de la pelicula en pantalla
                    getVentana(multiplex).getCalificacionPelicula().setText("Calificacion: " + (rs2.getBigDecimal(1).setScale(1, RoundingMode.HALF_UP)));
                }
            }

            // en caso de no tener  calificaciones
            if (v == true) {
                getVentana(multiplex).getCalificacionPelicula().setText("No tiene calificacion");
            }
        } catch (SQLException ex) {

        }
    }

    /**
     * metodo para configuara el combo box de la fecha haciendo consulta a la
     * base de datos con los datos del multiplex y la pelicula seleccionada
     */
    public void setFecha() {
        // quita todos los items del combo box de fecha
        getVentana(multiplex).getFecha().removeAllItems();
        FechasDAO b = new FechasDAO();
        // llamado de metodo para consulta de la base de datos
        ResultSet rs = b.buscarFecha(multiplex, getVentana(multiplex).getNombrePelicula().getText());
        try {
            while (rs.next()) {
                // añade items con la informacion consultada de las fechas de las pelicuals segun su multiplez y pelicula
                getVentana(multiplex).getFecha().addItem(rs.getString(1));
            }
        } catch (SQLException ex) {

        }
        getVentana(multiplex).getHora().setEnabled(true);
    }

    /**
     * metodo ppara llamado de consulata para obtener hora de las funcuones
     * segun la pelicula, multiplex y fecha
     */
    public void setHora() {
        // quita todo los items
        getVentana(multiplex).getHora().removeAllItems();

        // hace busqueda de las horas
        HorasDAO b = new HorasDAO();
        ResultSet rs = b.buscarHora(multiplex, getVentana(multiplex).getNombrePelicula().getText(), (String) getVentana(multiplex).getFecha().getSelectedItem());
        try {
            // mientras haya mas datos anade otro iten al combo box de la hora con la hora del registro
            while (rs.next()) {
                getVentana(multiplex).getHora().addItem(rs.getString(1));
            }
        } catch (SQLException ex) {

        }
        getVentana(multiplex).getTipo().setEnabled(true);
    }

    /**
     * configuracion para actualizacion del combobox de cantidad de sillas por
     * tipo de sillas
     */
    public void setTipoSilla() {
        getVentana(multiplex).getTipo().removeAllItems();
        SillasDAO sillasDAO = new SillasDAO();

        // busqueda de cantidad de sillas generales
        ResultSet rs = sillasDAO.buscarTipoSilla(multiplex, getVentana(multiplex).getNombrePelicula().getText(), (String) getVentana(multiplex).getFecha().getSelectedItem(), "General", (String) getVentana(multiplex).getHora().getSelectedItem());
        try {
            while (rs.next()) {
                general = rs.getInt(1);
                general = 40 - general;
                // muestra esultado en combo box de tipo de silla
                getVentana(multiplex).getTipo().addItem("General (" + general + " disponibles)");
            }
        } catch (SQLException ex) {

        }

        // busqueda de candtidad de sillas preferenciales
        rs = sillasDAO.buscarTipoSilla(multiplex, getVentana(multiplex).getNombrePelicula().getText(), (String) getVentana(multiplex).getFecha().getSelectedItem(), "Preferencial", (String) getVentana(multiplex).getHora().getSelectedItem());
        try {
            while (rs.next()) {
                preferencial = rs.getInt(1);
                preferencial = 20 - preferencial;
                // muestra esultado en combo box de tipo de silla
                getVentana(multiplex).getTipo().addItem("Preferencial (" + preferencial + " disponibles)");
            }
        } catch (SQLException ex) {

        }
        getVentana(multiplex).getSpNumeroSillas().setEnabled(true);
    }

    /**
     * configura el spiner de cantidad de sillas
     */
    public void setSpCantidadSillas() {
        // segun el tipo de sillas seleecionado
        if (getVentana(multiplex).getTipo().getSelectedItem().equals("General (" + general + " disponibles)")) {
            if (general >= 10) {
                SpinnerNumberModel model1 = new SpinnerNumberModel(1, 1, 9, 1);
                getVentana(multiplex).getSpNumeroSillas().setModel(model1);
            } else {
                SpinnerNumberModel model1 = new SpinnerNumberModel(1, 1, general, 1);
                getVentana(multiplex).getSpNumeroSillas().setModel(model1);
            }
        } else if (getVentana(multiplex).getTipo().getSelectedItem().equals("Preferencial (" + preferencial + " disponibles)")) {
            if (preferencial >= 10) {
                SpinnerNumberModel model1 = new SpinnerNumberModel(1, 1, 9, 1);
                getVentana(multiplex).getSpNumeroSillas().setModel(model1);
            } else {
                SpinnerNumberModel model1 = new SpinnerNumberModel(1, 1, general, 1);
                getVentana(multiplex).getSpNumeroSillas().setModel(model1);
            }
        }
    }

    /**
     * retorna el tipo de asitneo
     *
     * @return
     */
    public String getTipoAsiento() {
        if (getVentana(multiplex).getTipo().getSelectedItem().equals("General (" + general + " disponibles)")) {
            return "General";
        } else if (getVentana(multiplex).getTipo().getSelectedItem().equals("Preferencial (" + preferencial + " disponibles)")) {
            return "Preferencial";
        }
        return null;
    }

    /**
     * busca la funcion seleecionada en pantalla
     *
     * @return
     */
    public int getFuncion() {
        FuncionesDAO b = new FuncionesDAO();
        ResultSet rs = b.buscarFuncion(multiplex, getVentana(multiplex).getNombrePelicula().getText(), (String) getVentana(multiplex).getFecha().getSelectedItem(), (String) getVentana(multiplex).getHora().getSelectedItem());
        int funcion = 0;
        try {
            while (rs.next()) {
                funcion = rs.getInt(1);
            }
        } catch (SQLException ex) {

        }
        return funcion;
    }
}
