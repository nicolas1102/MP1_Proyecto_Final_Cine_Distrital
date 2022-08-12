/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package control.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VtnCalificar;
import modelo.MdlCalificar;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class CtrCalificar implements ActionListener {

    private MdlCalificar mdlCalificar;

    /**
     *
     * @param aThis
     */
    public CtrCalificar(VtnCalificar aThis) {
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
