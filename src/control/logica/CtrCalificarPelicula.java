/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package control.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VtnCalificarPelicula;
import modelo.MdlCalificarPelicula;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class CtrCalificarPelicula implements ActionListener {

    private MdlCalificarPelicula mdlCalificar;

    /**
     *
     * @param aThis
     */
    public CtrCalificarPelicula(VtnCalificarPelicula aThis) {
        mdlCalificar = aThis.getMdlCalificar();
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mdlCalificar.getVentana().getBoton()) {
            mdlCalificar.getVentana().volverMenu();
        }
        if (e.getSource() == mdlCalificar.getVentana().getBotonCalificar()) {
            mdlCalificar.calificarPelicula();
        }
    }
}
