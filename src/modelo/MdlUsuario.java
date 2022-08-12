/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package modelo;

/**
 * 
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class MdlUsuario {
    
    private static String user=null;
    
    
    private MdlUsuario(String u){
        user=u;
    }
    
    public static MdlUsuario crearUsuario(String u){
        if(user==null){
            return new MdlUsuario(u);
        }
        return new MdlUsuario(user);
    }
    
    public void desLoggear(){
        user=null;
    }
    
    public String getUser(){
        return user;
    }
    
}
