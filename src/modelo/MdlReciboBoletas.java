/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import control.dao.SillasDAO;
import control.dao.FuncionesDAO;
import control.dao.TicketsDAO;
import vista.VtnReciboBoletas;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class MdlReciboBoletas {

    private VtnReciboBoletas vtnReciboBoletas;
    private int funcion;
    int cantidad;
    private ArrayList asientos;
    private String tipo;

    /**
     *
     * @param funcion
     * @param asientos
     * @param tipo
     * @param cantidad
     */
    public void iniciar(int funcion, ArrayList asientos, String tipo, int cantidad) {
        this.cantidad = cantidad;
        this.funcion = funcion;
        this.asientos = asientos;
        this.tipo = tipo;
        getVentana().setVisible(true);
        crearRecibo();
    }

    /**
     *
     * @return
     */
    public VtnReciboBoletas getVentana() {
        if (vtnReciboBoletas == null) {
            vtnReciboBoletas = new VtnReciboBoletas(this);
        }
        return vtnReciboBoletas;
    }

    /**
     * Metodo para la creacion de recibo
     */
    public void crearRecibo() {
        // muestra posicion de sillas compradas en pantalla
        getVentana().getSillas().setText("Sillas:  " + asientos);

        // consulta de funcion seleccionada anteriormente para obtener datos exactos de lamisma
        FuncionesDAO funcionesDAO = new FuncionesDAO();
        ResultSet rs = funcionesDAO.buscarFuncionRecibo(funcion);
        try {
            while (rs.next()) {
                // mostrar informacion de funcion en ventana
                getVentana().getSala().setText("Sala:  " + rs.getInt(1) + "  " + rs.getString(2));
                getVentana().getFecha().setText("Fecha:  " + rs.getString(3));
                getVentana().getHora().setText("Hora:  " + rs.getString(4));
                getVentana().getPelicula().setText("Pelicula:  " + rs.getString(5));
            }
        } catch (SQLException ex) {

        }

        // calculo de precio de sillas
        int precio = 0;
        if (tipo.equals("General")) {
            precio = cantidad * 11000;
        } else if (tipo.equals("Preferencial")) {
            precio = cantidad * 15000;
        }
        // mostrar precion en ventana
        getVentana().getPrecio().setText("Precio a pagar:  " + precio);
    }

    /**
     * Metodo para ingreso de sillas compradas a base de datos
     */
    public void actualizar() {
        TicketsDAO ticketsDAO = new TicketsDAO();
        // for segun la cantidad de sillas seleccionadas anteriormente
        for (int i = 0; i < asientos.size(); i++) {
            // busqueda de registros segun la posicion guardadea en el arraylist
            SillasDAO sillaDAO = new SillasDAO();
            ResultSet rs = sillaDAO.buscarSilla((String) asientos.get(i));
            int s = 0;
            try {
                while (rs.next()) {
                    s = rs.getInt(1);
                }
            } catch (SQLException ex) {
            }

            // actualiza la silla
            ticketsDAO.actualizarSilla(funcion, s);
        }
        JOptionPane.showMessageDialog(null, "Pago realizado correctamente");
    }

}
