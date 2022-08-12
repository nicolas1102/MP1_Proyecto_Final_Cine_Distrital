/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package control.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.VtnMenuCliente;
import modelo.MdlMenuCliente;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class CtrMenuCliente implements ActionListener {

    private MdlMenuCliente mdlMenuCliente;

    public CtrMenuCliente(VtnMenuCliente aThis) {
        mdlMenuCliente = aThis.getMdlMenuCliente();
    }

    /**
     * gestiona la logica de los botones de la ventana del control
     * 
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // opciones de la ventana menu
        if (e.getSource() == mdlMenuCliente.getVentana().ComprarBoletos()) {
            mdlMenuCliente.getVentana().mostrarVtnFuncion();
        } else if (e.getSource() == mdlMenuCliente.getVentana().ComprarSnacks()) {
            mdlMenuCliente.getVentana().mostrarVtnSnacks();
        } else if (e.getSource() == mdlMenuCliente.getVentana().Calificar()) {
            boolean estado = mdlMenuCliente.validarEstado();
            if (estado == false) {
                JOptionPane.showMessageDialog(null, "Compre boletos en alguna pelicula para poder calificarla");
            } else {
                mdlMenuCliente.getVentana().mostrarVtnCalificacion();
            }
        }
    }

}
