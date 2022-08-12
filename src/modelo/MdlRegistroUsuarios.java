/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package modelo;

import static java.lang.Integer.parseInt;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import control.dao.ClientesDAO;
import vista.VtnRegistroUsuarios;

/**
 * 
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class MdlRegistroUsuarios {

    private VtnRegistroUsuarios vtnRegistroUsuarios;

    /**
     * 
     * @return 
     */
    public VtnRegistroUsuarios getVentana() {
        if (vtnRegistroUsuarios == null) {
            vtnRegistroUsuarios = new VtnRegistroUsuarios(this);
        }
        return vtnRegistroUsuarios;
    }

    /**
     * 
     */
    public MdlRegistroUsuarios() {

    }

    /**
     * 
     */
    public void iniciar() {
        getVentana().setVisible(true);
    }

    /**
     * 
     */
    public void registrarCliente() {
        ClientesDAO clientesDAO = new ClientesDAO();
        int id = parseInt(getVentana().getCedula().getText());
        String user = getVentana().getNombre().getText();
        String pass = getVentana().getContrasena().getText();
        clientesDAO.registrarCliente(id, user, pass);
        getVentana().setVisible(false);
    }
}
