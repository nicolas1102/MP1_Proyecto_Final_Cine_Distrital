/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package modelo;

import control.dao.InicioDAO_Cliente;
import control.dao.InicioDAO_Admin;
import control.dao.InicioDAO_Empleado;
import vista.VtnInicioSesion;
import control.dao.InicioDAO;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class MdlInicioSesion {

    private VtnInicioSesion vtnInicioSesion;

    // STRATEGY 
    private InicioDAO inicioDAO;

    // Uso SINGLETON
    /**
     * Se instancia la ventana correspondiente al modelo
     *
     * @return
     */
    public VtnInicioSesion getVentana() {
        if (vtnInicioSesion == null) {
            vtnInicioSesion = new VtnInicioSesion(this);
        }
        return vtnInicioSesion;
    }

    /**
     * Control
     */
    public MdlInicioSesion() {

    }

    /**
     * Instanciar la ventana y hacerla visible
     */
    public void iniciar() {
        getVentana().setVisible(true);

    }

    // STRATEGY  --------------------------------------------------------
    public int getCliente(String usuario, String contraseña) {
        inicioDAO = new InicioDAO_Cliente();
        return inicioDAO.comprobarUsuario(usuario, contraseña);
    }

    public int getAdmin(String usuario, String contraseña) {
        inicioDAO = new InicioDAO_Admin();
        return inicioDAO.comprobarUsuario(usuario, contraseña);
    }

    public int getEmpleado(String usuario, String contraseña) {
        inicioDAO = new InicioDAO_Empleado();
        return inicioDAO.comprobarUsuario(usuario, contraseña);
    }
}
