/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package control.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.MdlSeleccionFuncion;
import vista.VtnSeleccionFuncion;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class CtrSeleccionFuncion implements ActionListener {

    private MdlSeleccionFuncion mdlFuncion;
    String multiplex;
    int cont = 1;

    public CtrSeleccionFuncion(VtnSeleccionFuncion aThis, String multiplex) {
        mdlFuncion = aThis.getMdlFuncion();
        this.multiplex = multiplex;
        // para bloquear boton de siguiente en caso de no haber mas peliculas en el multplex
        if (cont >= mdlFuncion.getCantidadPeliculasDeMultiplex(multiplex)) {
            mdlFuncion.getVentana(multiplex).siguiente().setEnabled(false);
        }
    }

    /**
     * Logica de los objetos de la ventana
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        // -----  bloqueo y desbloqueo de botones de control de peliculas -----
        if (cont == 1) {
            mdlFuncion.getVentana(multiplex).anterior().setEnabled(false);
        }

        if (cont > 1) {
            mdlFuncion.getVentana(multiplex).anterior().setEnabled(true);
        }

        if (cont == mdlFuncion.getCantidadPeliculasDeMultiplex(multiplex)) {
            mdlFuncion.getVentana(multiplex).siguiente().setEnabled(false);
        }

        if (cont < mdlFuncion.getCantidadPeliculasDeMultiplex(multiplex)) {
            mdlFuncion.getVentana(multiplex).siguiente().setEnabled(true);
        }
        
        // onfiguracion de demas objetos de la ventana
        
        /**
         * Toma evento de si se seleeciono el boton de siguiente o anterior
         * pelicula
         */
        if (e.getSource() == mdlFuncion.getVentana(multiplex).anterior()) {
            cont--; // actualiza contador de pelicua
            mdlFuncion.getPelicula(multiplex, cont);
            mdlFuncion.setFecha();
        } else if (e.getSource() == mdlFuncion.getVentana(multiplex).siguiente()) {
            cont++;// actualiza contador de pelicua
            mdlFuncion.getPelicula(multiplex, cont);
            mdlFuncion.setFecha();
        }

        /**
         * metodo para actualizacion de combobox de las horas segun la pelicula,
         * fehca y el multiplex seleccionado
         */
        if (e.getSource() == mdlFuncion.getVentana(multiplex).getFecha()) {
            mdlFuncion.setHora();
        }

        /**
         * metodo para actualizacion de combobox del tipo de silla segun la
         * pelicula, hora, fecha y el multiplex seleccionado
         */
        if (e.getSource() == mdlFuncion.getVentana(multiplex).getHora()) {
            mdlFuncion.setTipoSilla();
        }

        /**
         * logica del spinner de cantidad de sillas posibles para ocmprar
         */
        if ((e.getSource() == mdlFuncion.getVentana(multiplex).getTipo()) && (mdlFuncion.getVentana(multiplex).getTipo().getSelectedItem() != null)) {
            mdlFuncion.setSpCantidadSillas();
        }

        // logica para confirmacion de funcion y paso a seleccionar sillas
        if (e.getSource() == mdlFuncion.getVentana(multiplex).btnSeleccionarSillas()) {
            // busca el numero de la funcion segun toda la informacion seleecionada en todos los demas objetos
            int funcion = mdlFuncion.getFuncion();
            // toma el tipo de asiento seleccionado en el combo box
            String tipoAsiento = mdlFuncion.getTipoAsiento();
            // si el tipo de asiento es distinto de ninguno da paso a la ventana de seleccionar asientos
            if (tipoAsiento != null) {
                // inicia ventana de mostrar asientos
                mdlFuncion.getVentana(multiplex).mostrarVtnSillas(funcion, tipoAsiento);
            } else {
                System.out.println("No hay asientos");
            }
        }

    }

}
