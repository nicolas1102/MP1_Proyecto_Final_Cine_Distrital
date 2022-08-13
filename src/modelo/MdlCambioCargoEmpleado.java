/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import control.dao.EmpleadosDAO;
import control.dao.MultiplexesDAO;
import vista.VtnCambioCargoEmpleado;
import vista.VtnCambioCargoEmpleado;

/**
 * 
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class MdlCambioCargoEmpleado {
    
    private int Codigo = 0;
    private VtnCambioCargoEmpleado Vista ;
    
    public void Iniciar(){
        getVentana().setVisible(true);
    }
    public VtnCambioCargoEmpleado getVentana() {
        if (Vista == null) {
            Vista = new VtnCambioCargoEmpleado(this);
        }
        return Vista;
    }
    
    public int getCodigo(){
        return Codigo;
    }
    
    public void Actualizar(){
        
        if(Codigo==0){
            JOptionPane.showMessageDialog(null, "no encontrado");
        }else{
            EmpleadosDAO m = new EmpleadosDAO();
            m.actualizarEmpleado(Codigo, getVentana().getCargo().getText());
        }
    }
        
    public void BuscarEmpleado(){
        
        if("".equals(getVentana().getCodigo().getText()) || "".equals(getVentana().getCodigo().getText())){
            
            JOptionPane.showMessageDialog(null, "No deje campos vacios");
        }else{
       
        System.out.println(Integer.parseInt(getVentana().getCodigo().getText()));
        EmpleadosDAO empleadoDAO = new EmpleadosDAO();
        ResultSet rs = empleadoDAO.buscarEmpleado(Integer.parseInt(getVentana().getCodigo().getText()));
        
        try{
            while(rs.next()){
              
                Codigo = rs.getInt(1);
            }
        }
        catch(SQLException ex){
            
        }
        }
        
    }
    
}
