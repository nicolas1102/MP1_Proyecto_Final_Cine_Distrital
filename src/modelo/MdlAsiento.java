/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package modelo;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import control.dao.SillasDAO;
import control.dao.TicketsDAO;
import vista.VtnSeleccionAsientos;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class MdlAsiento {

    private VtnSeleccionAsientos vtnSeleccionAsientos;
    String tipo;
    int funcion;
    int cantidad;
    int inicial;
    ArrayList<String> listaSillasSeleccionadas = new ArrayList<String>();

    /**
     *
     * @return
     */
    public VtnSeleccionAsientos getVentana() {
        if (vtnSeleccionAsientos == null) {
            vtnSeleccionAsientos = new VtnSeleccionAsientos(this, tipo);
        }
        return vtnSeleccionAsientos;
    }

    /**
     *
     * @param funcion
     * @param tipo
     * @param cantidad
     */
    public void iniciar(int funcion, String tipo, int cantidad) {
        this.tipo = tipo;
        this.funcion = funcion;
        this.cantidad = cantidad;
        this.inicial = cantidad;
        getVentana().setVisible(true);
        setOcupados();
    }

    /**
     * configura botones de sillas si estan ocupadas
     */
    public void setOcupados() {
        // recuperacion de tickets de sillas compradas de la base de datos
        TicketsDAO ticketsDAO = new TicketsDAO();
        ResultSet rs = ticketsDAO.buscarTicketDeSillaOcupada(funcion);
        try {
            // coloreea todas la sillas compradas de rojo y las bloquea
            while (rs.next()) {
                // uso del posicion de silla
                String s = rs.getString(1);
                getVentana().getJbutton(s).setBackground(Color.red);
                getVentana().getJbutton(s).setEnabled(false);
            }
        } catch (SQLException ex) {

        }
    }

    /**
     * 
     * @param s 
     */
    public void seleccionarSilla(String s) {
        Color c = getVentana().getJbutton(s).getBackground();
        Color d = new Color(238, 238, 238);
        // si el color del boton es igual al del fondo (osea que la silla no esta seleecionada) y la cantidad de sillas disponibles para comprar seleccionadas anteriormente es distinta a 0
        if (c.equals(d) && getCantidad() != 0) {
            // pinta a azul
            getVentana().getJbutton(s).setBackground(Color.BLUE);
            // agrega posicion de silla a arrylist de sillas seleecionadas
            listaSillasSeleccionadas.add(getVentana().getJbutton(s).getText());
            // resta cantidad de sillas disponibles para seleccionarSilla
            cantidad--;
            // logica para desbloquear silla
        } else if (c.equals(Color.BLUE)) {
            getVentana().getJbutton(s).setBackground(d);
            // elimina silla del arraylist
            listaSillasSeleccionadas.remove(getVentana().getJbutton(s).getText());
            cantidad++;
            // si ya no se pude seleecionar mas sillas porque se seleeciono la cantidad comprada
        } else if (getCantidad() == 0) {
            JOptionPane.showMessageDialog(null, "No puedes selecionar mas asientos");
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public ArrayList getSeleccionados() {
        return listaSillasSeleccionadas;
    }

    public int getInicial() {
        return inicial;
    }

    public String getTipo() {
        return tipo;
    }

    public int getFuncion() {
        return funcion;
    }

}
