/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package control.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.MdlSnacks;
import vista.VtnSnacks;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class CtrSnacks implements ActionListener {

    private final MdlSnacks mdlSnacks;
    private int usuario;

    /**
     * 
     * @param aThis 
     */
    public CtrSnacks(VtnSnacks aThis) {
        mdlSnacks = aThis.getMdlSnacks();
    }

    /**
     * 
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mdlSnacks.getVentana().getConfirmar()) {
            mdlSnacks.confirm();
            // paso a la ventana de recibo
            mdlSnacks.getVentana().mostrarRecibo();
        }
    }
}
