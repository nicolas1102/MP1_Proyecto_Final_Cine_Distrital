/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package control.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.MdlReciboBoletas;
import vista.VtnReciboBoletas;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class CtrReciboBoletas implements ActionListener {

    private MdlReciboBoletas mdlReciboBoletas;

    /**
     *
     * @param aThis
     */
    public CtrReciboBoletas(VtnReciboBoletas aThis) {
        mdlReciboBoletas = aThis.getMdlReciboBoletas();
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mdlReciboBoletas.getVentana().pagar()) {
            mdlReciboBoletas.actualizar();
            mdlReciboBoletas.getVentana().mostrarMenu();
        }
    }
}
