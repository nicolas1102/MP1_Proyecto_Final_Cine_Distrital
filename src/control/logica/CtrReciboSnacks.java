/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package control.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.MdlReciboSnacks;
import vista.VtnReciboSnacks;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class CtrReciboSnacks implements ActionListener {

    private MdlReciboSnacks mdlReciboSnacks;

    /**
     * 
     * @param aThis 
     */
    public CtrReciboSnacks(VtnReciboSnacks aThis) {
        mdlReciboSnacks = aThis.getMdlReciboSnacks();
    }

    /**
     * 
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mdlReciboSnacks.getVentana().pagar()) {
            mdlReciboSnacks.actualizarDisponibilidadSnacks();
            mdlReciboSnacks.getVentana().mostrarMenu();
        }
    }
}
