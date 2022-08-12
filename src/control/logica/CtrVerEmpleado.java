/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package control.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.MdlVerEmpleado;
import vista.VtnVerEmpleado;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class CtrVerEmpleado implements ActionListener {

    private final MdlVerEmpleado mdlVerEmpleado;
    private int usuario;

    public CtrVerEmpleado(VtnVerEmpleado aThis) {
        mdlVerEmpleado = aThis.getMdlVerEmpleado();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mdlVerEmpleado.getVentana().getIniciar()) {
            String c = mdlVerEmpleado.getVentana().getCodigo();
            mdlVerEmpleado.mostrarInfoEmpleado(c);
        }
    }
}
