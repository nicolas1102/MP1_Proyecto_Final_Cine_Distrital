/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package vista;

import modelo.MdlCambiarCargo;
import control.logica.CtrCambiarCargo;
import javax.swing.JButton;
import javax.swing.JTextField;
import modelo.MdlInicioSesion;

/**
 * 
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class VtnCambiarEmpleado extends javax.swing.JFrame {
    
    private final MdlCambiarCargo modelo;
    private CtrCambiarCargo control;

    public VtnCambiarEmpleado(MdlCambiarCargo modelo) {
        this.modelo = modelo;
        initComponents();
        setLocationRelativeTo(null);
        CapturarEventos();
    }
    
    public MdlCambiarCargo getModelo() {
        return modelo;
    }
    
    public CtrCambiarCargo getControl() {
        if(control == null){
            control = new CtrCambiarCargo(this);
        }
        return control;
    }
    
    public JButton getButton(){
        return btnCambiarCargoEmpleado;
    }
    
    public JTextField getCodigo(){
        return txtCodigoEmpleado;
    }
    public JTextField getCargo(){
        return txtCargo;
    }
    
    public void CapturarEventos(){
        
        btnCambiarCargoEmpleado.addActionListener(getControl());
    }
    
    public void mostrarMenu(){
        this.setVisible(false);

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCambiarCargoEmpleado = new javax.swing.JButton();
        txtCodigoEmpleado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrarSesion.setBackground(new java.awt.Color(51, 51, 51));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 200, 50));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setText("Cine Distrital");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 220, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/palomitas-de-maiz.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 100));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Avatar_Container.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 110, 70));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(73, 80, 87));
        jLabel8.setText("Menu Administrador");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 280, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cerrar-sesion (1).png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 80, 80));

        txtCargo.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoActionPerformed(evt);
            }
        });
        jPanel2.add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 270, 40));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Cargo nuevo:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, 30));

        btnCambiarCargoEmpleado.setBackground(new java.awt.Color(204, 255, 255));
        btnCambiarCargoEmpleado.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnCambiarCargoEmpleado.setForeground(new java.awt.Color(94, 174, 253));
        btnCambiarCargoEmpleado.setText("Cambiar");
        btnCambiarCargoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarCargoEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(btnCambiarCargoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 174, 40));

        txtCodigoEmpleado.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtCodigoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(txtCodigoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 270, 40));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("Codigo de empleado:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 740, 510));

        jPanel1.setBackground(new java.awt.Color(244, 243, 243));
        jPanel1.setForeground(new java.awt.Color(60, 63, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/Ellipse 209.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 450, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/Union.png"))); // NOI18N
        jLabel4.setText("re");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 0, 1280, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEmpleadoActionPerformed

    private void txtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoActionPerformed

    private void btnCambiarCargoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarCargoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCambiarCargoEmpleadoActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MdlInicioSesion mdlInicioSesion;
        mdlInicioSesion = new MdlInicioSesion();
        mdlInicioSesion.iniciar();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarCargoEmpleado;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCodigoEmpleado;
    // End of variables declaration//GEN-END:variables
}
