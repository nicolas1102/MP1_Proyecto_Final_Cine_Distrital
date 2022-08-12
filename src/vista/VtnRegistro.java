/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package vista;

import modelo.MdlRegistro;
import control.logica.CtrRegistro;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class VtnRegistro extends javax.swing.JFrame {

    private final MdlRegistro mdlRegistro;
    private CtrRegistro ctrRegistro;

    /**
     *
     * @param modelo
     */
    public VtnRegistro(MdlRegistro modelo) {
        this.mdlRegistro = modelo;
        initComponents();
        setLocationRelativeTo(null);
        CapturarEventos();
    }

    /**
     * 
     * @return 
     */
    public MdlRegistro getMdlRegistro() {
        return mdlRegistro;
    }

    /**
     * 
     * @return 
     */
    public CtrRegistro getCtrRegistro() {
        if (ctrRegistro == null) {
            ctrRegistro = new CtrRegistro(this);
        }
        return ctrRegistro;
    }

    /**
     * 
     */
    public void CapturarEventos() {
        btnGuardarCambios.addActionListener(getCtrRegistro());
        cbMultiplexes.addActionListener(getCtrRegistro());
    }

    public void mostrarMenu() {
        this.setVisible(false);
    }

    public JComboBox getCombobox() {
        return cbMultiplexes;
    }

    public JButton getButton() {
        return btnGuardarCambios;
    }

    public JTextField getCodigo() {
        return txtCodigo;
    }

    public JTextField getCedula() {
        return txtCedula;
    }

    public JTextField getTelefono() {
        return txtTelefono;
    }

    public JTextField getCargo() {
        return txtCargo;
    }

    public JTextField getSalario() {
        return txtSalario;
    }

    public JTextField getFecha() {
        return txtFecha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnGuardarCambios = new javax.swing.JButton();
        cbMultiplexes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel9.setText("Cine Distrital");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 220, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/palomitas-de-maiz.png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 100));

        btnGuardarCambios.setBackground(new java.awt.Color(204, 255, 255));
        btnGuardarCambios.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btnGuardarCambios.setForeground(new java.awt.Color(94, 174, 253));
        btnGuardarCambios.setText("Guardar Cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 316, -1));

        cbMultiplexes.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        cbMultiplexes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMultiplexesActionPerformed(evt);
            }
        });
        jPanel2.add(cbMultiplexes, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 140, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("Multiplex de Trabajo:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 190, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Fecha de Contratación:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Salario:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 85, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setText("Cargo:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 85, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Teléfono:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 85, 29));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("Cedula");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 85, 29));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("Código:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 85, 36));

        txtFecha.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 140, -1));

        txtSalario.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });
        jPanel2.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 140, -1));

        txtCargo.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoActionPerformed(evt);
            }
        });
        jPanel2.add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 140, -1));

        txtTelefono.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 140, -1));

        txtCedula.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 140, -1));

        txtCodigo.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 140, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/palomitas-de-maiz.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Avatar_Container.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 130, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 740, 510));

        jPanel1.setBackground(new java.awt.Color(244, 243, 243));
        jPanel1.setForeground(new java.awt.Color(60, 63, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/Ellipse 209.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 450, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/Union.png"))); // NOI18N
        jLabel14.setText("re");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 0, 1280, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed

    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed

    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed

    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed

    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoActionPerformed

    }//GEN-LAST:event_txtCargoActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed

    }//GEN-LAST:event_txtSalarioActionPerformed

    private void cbMultiplexesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMultiplexesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMultiplexesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGuardarCambios;
    private javax.swing.JComboBox<String> cbMultiplexes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField txtCargo;
    public javax.swing.JTextField txtCedula;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtFecha;
    public javax.swing.JTextField txtSalario;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
