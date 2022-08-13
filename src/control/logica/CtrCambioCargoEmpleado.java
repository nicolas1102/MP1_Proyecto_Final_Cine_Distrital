/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package control.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VtnCambioCargoEmpleado;
import vista.VtnCambioCargoEmpleado;
import modelo.MdlCambioCargoEmpleado;
import modelo.MdlCambioCargoEmpleado;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class CtrCambioCargoEmpleado implements ActionListener {

    private MdlCambioCargoEmpleado modelo;

    public CtrCambioCargoEmpleado(VtnCambioCargoEmpleado aThis) {
        modelo = aThis.getModelo();
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == modelo.getVentana().getButton()) {
            modelo.BuscarEmpleado();
            modelo.Actualizar();
            modelo.getVentana().mostrarMenu();
        }
    }
}
