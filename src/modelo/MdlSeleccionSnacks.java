/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import control.dao.MultiplexesDAO;
import control.dao.SnacksDAO;
import vista.VtnSeleccionSnacks;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class MdlSeleccionSnacks {

    private VtnSeleccionSnacks vtnSnacks;
    private SnacksDAO snacksDAO;
    private String multiplex;
    private int id = 0;
    private int[] total = new int[6];

    /**
     *
     * @return
     */
    public VtnSeleccionSnacks getVentana() {
        if (vtnSnacks == null) {
            vtnSnacks = new VtnSeleccionSnacks(this);
        }
        return vtnSnacks;
    }

    public MdlSeleccionSnacks() {

    }

    /**
     *
     * @param multiplex
     */
    public void iniciar(String multiplex) {
        getVentana().setVisible(true);
        this.multiplex = multiplex;
        hallarIdMultiplex();
        configurarInfoSnacks();
    }

    /**
     * metodo para recuperacion del id del multiplex seleecionado en la ventana
     * anterior
     */
    public void hallarIdMultiplex() {
        MultiplexesDAO multiplexesDAO = new MultiplexesDAO();
        ResultSet rs = multiplexesDAO.buscarIdMultiplex(multiplex);
        try {
            while (rs.next()) {
                // seleeciona el primer resultado
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
        }
    }

    /**
     * muesta snacks con su informacion
     */
    public void configurarInfoSnacks() {
        snacksDAO = new SnacksDAO();
        ResultSet rs = snacksDAO.comprobarSnacks();
        if (rs == null) {
        } else {
            try {
                int i = 0;
                while (rs.next()) {
                    // muestra informacion de cada snack escontrado
                    getVentana().getLabel()[i].setText(rs.getString(2));
                    getVentana().getPrecio()[i].setText("$" + rs.getInt(3));
                    i++;
                }
            } catch (SQLException ex) {
            }
        }

        // comprobacion de datos de configurarInfoSnacks y configuracion de cantidad maxima que se puede comprar de cada uno
        rs = snacksDAO.comprobarDatosSnacks(id);
        if (rs == null) {
            JOptionPane.showMessageDialog(null, "No hay snacks");
        } else {
            try {
                int i = 0;
                System.out.println(id);
                while (rs.next()) {
                    getVentana().getLabel()[i].setText(getVentana().getLabel()[i].getText() + "   (Disponibles " + rs.getInt(1) + ")");
                    SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, rs.getInt(1), 1);
                    getVentana().getSpinner()[i].setModel(model1);
                    i++;
                }
            } catch (SQLException ex) {
            }
        }
    }

    public int[] getTotal() {
        return total;
    }

    public void confirm() {
        String s;
        for (int i = 0; i < 6; i++) {
            s = getVentana().getSpinner()[i].getValue().toString();
            int cantidad = Integer.parseInt(s);
            total[i] = cantidad;
        }
    }

    public int getIdMultiplex() {
        return id;
    }
}
