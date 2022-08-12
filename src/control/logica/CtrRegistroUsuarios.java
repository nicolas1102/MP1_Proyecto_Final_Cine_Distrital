/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package control.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.MdlRegistroUsuarios;
import vista.VtnRegistroUsuarios;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class CtrRegistroUsuarios implements ActionListener {

    private final MdlRegistroUsuarios mdlRegistroUsuarios;
    private int usuario;

    /**
     *
     * @param aThis
     */
    public CtrRegistroUsuarios(VtnRegistroUsuarios aThis) {
        mdlRegistroUsuarios = aThis.getMdlRegistroUsuarios();
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mdlRegistroUsuarios.getVentana().getRegistrar()) {
            mdlRegistroUsuarios.registrarCliente();
        }
    }
}
