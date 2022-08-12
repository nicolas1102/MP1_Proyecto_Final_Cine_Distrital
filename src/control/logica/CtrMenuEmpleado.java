/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package control.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.MdlUsuario;
import vista.VtnMenuEmpleado;
import modelo.MdlMenuEmpleado;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class CtrMenuEmpleado implements ActionListener {

    private MdlMenuEmpleado modelo;

    /**
     *
     * @param aThis
     */
    public CtrMenuEmpleado(VtnMenuEmpleado aThis) {
        modelo = aThis.getMdlMenuEmpleado();
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // distintos botones de la vetnaana
        // ventana para venta de snacks
        if (e.getSource() == modelo.getVentana().getBotonSnacks()) {
            modelo.getVentana().mostrarSnacks(modelo.buscarMultiplexDelEmpleado());
            // ventana para registro de cliente
        } else if (e.getSource() == modelo.getVentana().getBotonRegistro()) {
            modelo.getVentana().mostrarRegistro();
        } else if (e.getSource() == modelo.getVentana().getBotonSeleccion()) {
            int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del cliente"));
            if (modelo.buscarCliente(cedula) == 0) {
                JOptionPane.showMessageDialog(null, "No se encontró el cliente.");
                // si el ususario si esta registrado
            } else {
                MdlUsuario u = MdlUsuario.crearUsuario("" + modelo.buscarCliente(cedula));
                u.desLoggear();
                u = MdlUsuario.crearUsuario("" + modelo.buscarCliente(cedula));
                // muesttra la siguiente ventana para seleccion de sillas
                modelo.getVentana().MostrarSeleccion(modelo.buscarMultiplexDelEmpleado());
            }
        }
    }
}
