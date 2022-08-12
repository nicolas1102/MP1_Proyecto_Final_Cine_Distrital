/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package control.logica;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.MdlAsiento;
import vista.VtnSeleccionAsientos;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class CtrAsientos implements ActionListener {

    private MdlAsiento mdlAsiento;

    /**
     *
     * @param aThis
     */
    public CtrAsientos(VtnSeleccionAsientos aThis) {
        mdlAsiento = aThis.getMdlAsiento();
    }

    /**
     * Control de acciones de los objetos de la ventana
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == mdlAsiento.getVentana().confirmar()) {
            // si no se ha seleecionado la cantidad de sillas compradas
            if (mdlAsiento.getCantidad() != 0) {
                JOptionPane.showMessageDialog(null, "tiene " + mdlAsiento.getCantidad() + " asientos sin seleccionar");
                // en caso afirmativa da paso a la ventana de recibo
            } else {
                mdlAsiento.getVentana().mostrarRecibo(mdlAsiento.getFuncion(), mdlAsiento.getSeleccionados(), mdlAsiento.getTipo(), mdlAsiento.getInicial());
            }
            // toma el comando del boton de silla seleecionada
        } else {
            mdlAsiento.seleccionarSilla(e.getActionCommand());
        }
    }

}
