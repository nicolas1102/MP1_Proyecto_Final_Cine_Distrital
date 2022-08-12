/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package vista;

import modelo.MdlReciboSnacks;
import modelo.MdlSnacks;
import control.logica.CtrSnacks;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import vista.VtnSnacks;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas DiÂ­az
 */
public class VtnSnacks extends javax.swing.JFrame {

    private VtnSnacks vtnSnacks;
    private MdlSnacks mdlSnacks;
    private CtrSnacks ctrSnacks;

    public VtnSnacks(MdlSnacks modelo) {
        this.mdlSnacks = modelo;
        initComponents();
        setLocationRelativeTo(null);
        capturarEventos();
    }

    public CtrSnacks getCtrSnacks() {
        if (ctrSnacks == null) {
            ctrSnacks = new CtrSnacks(this);
        }
        return ctrSnacks;
    }

    public JButton getConfirmar() {
        return jButton1;
    }

    public MdlSnacks getMdlSnacks() {
        return mdlSnacks;
    }
    //Labels
    JLabel[] label = new JLabel[6];

    public JLabel[] getLabel() {
        label[0] = jLabel1;
        label[1] = jLabel2;
        label[2] = jLabel3;
        label[3] = jLabel4;
        label[4] = jLabel5;
        label[5] = jLabel6;
        return label;
    }

    //Spiners
    JSpinner[] spinner = new JSpinner[6];

    public JSpinner[] getSpinner() {
        spinner[0] = jSpinner1;
        spinner[1] = jSpinner2;
        spinner[2] = jSpinner3;
        spinner[3] = jSpinner4;
        spinner[4] = jSpinner5;
        spinner[5] = jSpinner6;
        return spinner;
    }
    //Precios
    JLabel[] precio = new JLabel[6];

    public JLabel[] getPrecio() {
        precio[0] = precio1;
        precio[1] = precio2;
        precio[2] = precio3;
        precio[3] = precio4;
        precio[4] = precio5;
        precio[5] = precio6;
        return precio;
    }

    public void mostrarRecibo() {
        this.setVisible(false);
        MdlReciboSnacks m;
        m = new MdlReciboSnacks();
        m.iniciar(mdlSnacks.getTotal(), mdlSnacks.getIdMultiplex());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        precio6 = new javax.swing.JLabel();
        TiendaSnacks = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        precio2 = new javax.swing.JLabel();
        precio1 = new javax.swing.JLabel();
        precio3 = new javax.swing.JLabel();
        precio4 = new javax.swing.JLabel();
        precio5 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 243, 243));
        jPanel1.setForeground(new java.awt.Color(60, 63, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel9.setText("Cine Distrital");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 220, 60));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/palomitas-de-maiz.png"))); // NOI18N
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 100));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/palomitas-de-maiz.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, -1));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(94, 174, 253));
        jButton1.setText("Proceder la pago");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, 230, 50));

        precio6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        precio6.setForeground(new java.awt.Color(102, 102, 102));
        precio6.setText("$3000");
        jPanel2.add(precio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 50, -1));

        TiendaSnacks.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        TiendaSnacks.setForeground(new java.awt.Color(102, 102, 102));
        TiendaSnacks.setText("Tienda de Snacks");
        jPanel2.add(TiendaSnacks, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 230, 36));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("-");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 310, 30));

        precio2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        precio2.setForeground(new java.awt.Color(102, 102, 102));
        precio2.setText("$6000");
        jPanel2.add(precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 60, -1));

        precio1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        precio1.setForeground(new java.awt.Color(102, 102, 102));
        precio1.setText("$7000");
        jPanel2.add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 60, -1));

        precio3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        precio3.setForeground(new java.awt.Color(102, 102, 102));
        precio3.setText("$5000");
        jPanel2.add(precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 60, 20));

        precio4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        precio4.setForeground(new java.awt.Color(102, 102, 102));
        precio4.setText("$10000");
        jPanel2.add(precio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 60, -1));

        precio5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        precio5.setForeground(new java.awt.Color(102, 102, 102));
        precio5.setText("$2000");
        jPanel2.add(precio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 60, -1));

        jSpinner1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 50, 30));

        jSpinner2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel2.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 50, 30));

        jSpinner3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel2.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 50, 30));

        jSpinner5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel2.add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 50, 30));

        jSpinner4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel2.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 50, 30));

        jSpinner6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel2.add(jSpinner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, 50, 30));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("-");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 340, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("-");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 310, 30));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("-");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 310, 30));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("-");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 300, 30));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("-");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 260, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/sandwich.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 80, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/palomitas-de-maiz (1).png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 80, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/pancho.png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 80, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/reajuste-salarial.png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, 80, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/nachos.png"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 80, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/barra-de-chocolate.png"))); // NOI18N
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, 690));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/Ellipse 209.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 450, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/Union.png"))); // NOI18N
        jLabel17.setText("re");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 0, 1280, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VtnSnacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnSnacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnSnacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnSnacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
    }

    private void capturarEventos() {
        jButton1.addActionListener(getCtrSnacks());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TiendaSnacks;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JLabel precio1;
    private javax.swing.JLabel precio2;
    private javax.swing.JLabel precio3;
    private javax.swing.JLabel precio4;
    private javax.swing.JLabel precio5;
    private javax.swing.JLabel precio6;
    // End of variables declaration//GEN-END:variables
}
