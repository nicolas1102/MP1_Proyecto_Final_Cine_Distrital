/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.SpinnerNumberModel;
import control.dao.SillasDAO;
import control.dao.SnacksDAO;
import vista.VtnReciboSnacks;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class MdlReciboSnacks {

    private VtnReciboSnacks vtnReciboSnacks;
    private int[] cantidad;
    private int multiplex;

    /**
     *
     * @return
     */
    public VtnReciboSnacks getVentana() {
        if (vtnReciboSnacks == null) {
            vtnReciboSnacks = new VtnReciboSnacks(this);
        }
        return vtnReciboSnacks;
    }

    /**
     *
     * @param cantidad
     * @param multiplex
     */
    public void iniciar(int[] cantidad, int multiplex) {
        this.multiplex = multiplex;
        this.cantidad = cantidad;
        getVentana().setVisible(true);
        mostrarRecibo();
    }

    /**
     * genera el recibo
     */
    public void mostrarRecibo() {
        SnacksDAO snacksDAO = new SnacksDAO();
        ResultSet rs = snacksDAO.buscarSnack();

        try {
            int i = 0;
            int total = 0;
            // recorre todos los snacks
            while (rs.next()) {
                // toma el precio del snakc
                int p = Integer.parseInt(rs.getString(2));
                // muestra precio total del snack por la cantidad comprada en pantalla
                getVentana().getEspacios()[i].setText(rs.getString(1) + " (" + cantidad[i] + ") -  $ " + p * cantidad[i]);
                total += p * cantidad[i];
                i++;
            }
            // muestra total en ventana
            getVentana().getPrecio().setText("Total a pagar:   $ " + total);
        } catch (SQLException ex) {
        }
    }

    /**
     * actualiza disponibilidad de snacks con los comprados recientemente
     */
    public void actualizarDisponibilidadSnacks() {
        SnacksDAO SnacksDAO = new SnacksDAO();
        // recupera los registros de los snakcs segun su multiplex
        ResultSet rs = SnacksDAO.comprobarDatosSnacks(multiplex);
        int i = 0;
        try {// segun cada snack, se actualiza su disponibilidad en el multiplex
            while (rs.next()) {
                SnacksDAO a = new SnacksDAO();
                a.actualizarDisponibilidadSnacks(multiplex, rs.getInt(1) - cantidad[i], i + 1);
                i++;
            }
        } catch (SQLException ex) {
        }
    }
}
