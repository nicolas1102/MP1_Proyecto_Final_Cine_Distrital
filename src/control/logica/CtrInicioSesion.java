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
import vista.VtnInicioSesion;
import modelo.MdlInicioSesion;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class CtrInicioSesion implements ActionListener {

    private MdlInicioSesion mdlInicioSesion;

    public CtrInicioSesion(VtnInicioSesion aThis) {
        mdlInicioSesion = aThis.getMdlInicioSesion();
    }

    private int usuario;
    /**
     * funcion que maneja los eventos generados en vista inicio sesion
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mdlInicioSesion.getVentana().getIniciar()) {
            // obtiene el documento del cliente/admin/empleado registrado
            usuario = mdlInicioSesion.getCliente(mdlInicioSesion.getVentana().getUsuario(), mdlInicioSesion.getVentana().getContraseña());
            // si distinto de 0 es porque la persona registrada es un cliente ya que si se encontraron las credenciales buscadas en la base de datos
            if (usuario != 0) {
                mdlInicioSesion.getVentana().mostrarMenuCliente(); // mostrar menu del cliente si se esta registrado
                MdlUsuario mdlUsuario = MdlUsuario.crearUsuario(mdlInicioSesion.getVentana().getUsuario());
            } else {
                // busqueda del Administrador en la tabla empleados en caso de que no se haya encontrado cliente
                usuario = mdlInicioSesion.getAdmin(mdlInicioSesion.getVentana().getUsuario(), mdlInicioSesion.getVentana().getContraseña());
                if (usuario != 0) {
                    mdlInicioSesion.getVentana().mostrarMenuAdmin();
                } else {
                // busqueda del empleado en la tabla empleados en caso de que no se haya encontrado administrador
                    usuario = mdlInicioSesion.getEmpleado(mdlInicioSesion.getVentana().getUsuario(), mdlInicioSesion.getVentana().getContraseña());
                    if (usuario != 0) {
                        mdlInicioSesion.getVentana().mostrarMenuEmpleado();
                        // en el caso de no encontrar el usuario en ninguna de las tablas improme mensaje
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario no encontrado, mi pex");
                    }
                }
            }
        } else if (e.getSource() == mdlInicioSesion.getVentana().getRegistro()) {
            mdlInicioSesion.getVentana().mostrarRegistro();
        }
    }
}
