/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package control.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.JOptionPane;
import modelo.MdlRegistroEmpleado;
import vista.VtnRegistroEmpleado;

/**
 * 
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class CtrRegistroEmpleado implements ActionListener {
       
    private MdlRegistroEmpleado  modelo;
    
    /**
     * 
     * @param aThis 
     */
    public CtrRegistroEmpleado(VtnRegistroEmpleado aThis) {
        modelo = aThis.getMdlRegistro();
    }
  
    /**
     * 
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
       // 
       if(e.getSource()==modelo.getVentana().getCombobox() && modelo.getVentana().getCombobox().getSelectedItem()!=null){
           modelo.buscaIdMultiplex();
       }
       
       // botton de agregar empleado
       if(e.getSource()==modelo.getVentana().getButton()){
           modelo.ingresarEmpleados();           
       }
    }

}
