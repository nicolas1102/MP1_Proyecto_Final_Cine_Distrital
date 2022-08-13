/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package vista;

import modelo.MdlSeleccionFuncion;
import modelo.MdlSeleccionSillas;
import control.logica.CtrSeleccionFuncion;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class VtnSeleccionFuncion extends javax.swing.JFrame {

    private VtnSeleccionFuncion vtnFuncion;
    private final MdlSeleccionFuncion mdlFuncion;
    private CtrSeleccionFuncion ctrFuncion;
    String multiplex;

    /**
     *
     * @param mdlFuncion
     * @param multiplex
     */
    public VtnSeleccionFuncion(MdlSeleccionFuncion mdlFuncion, String multiplex) {
        this.multiplex = multiplex;
        this.mdlFuncion = mdlFuncion;
        initComponents();
        setLocationRelativeTo(null);
        capturarEventos();
        agregarIconosBotones();
        btnAnteriorPelicula.setEnabled(false);
        cbHoras.setEnabled(false);
        cbTipoSilla.setEnabled(false);
        spNumeroSillas.setEnabled(false);
    }

    /**
     *
     * @return
     */
    public CtrSeleccionFuncion getCtrFuncion() {
        if (ctrFuncion == null) {
            ctrFuncion = new CtrSeleccionFuncion(this, multiplex);
        }
        return ctrFuncion;
    }

    /**
     * agrega captua de eventos
     */
    private void capturarEventos() {
        btnSeleccionarSillas.addActionListener(getCtrFuncion());
        btnSiguientePelicula.addActionListener(getCtrFuncion());
        btnAnteriorPelicula.addActionListener(getCtrFuncion());
        cbFechas.addActionListener(getCtrFuncion());
        cbHoras.addActionListener(getCtrFuncion());
        cbTipoSilla.addActionListener(getCtrFuncion());
    }

    /**
     * iniciacion de ventana para eleccion de assientos
     *
     * @param f
     * @param a
     */
    public void mostrarVtnSillas(int funcion, String tipoSilla) {
        this.setVisible(false);
        MdlSeleccionSillas mdlAsiento;
        mdlAsiento = new MdlSeleccionSillas();
        // toma la cantidad de sillas seleecionadas
        int cantidadSillas = Integer.parseInt(spNumeroSillas.getValue().toString());
        // inicia modelo
        mdlAsiento.iniciar(funcion, tipoSilla, cantidadSillas);
    }

    public void agregarIconosBotones() {
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Img/izquierda.jpg"));
        Icon icon1 = new ImageIcon(imagen1.getImage().getScaledInstance(btnAnteriorPelicula.getWidth(), btnAnteriorPelicula.getHeight(), Image.SCALE_DEFAULT));
        btnAnteriorPelicula.setIcon(icon1);
        
        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/Img/derecha.jpg"));
        Icon icon2 = new ImageIcon(imagen2.getImage().getScaledInstance(btnSiguientePelicula.getWidth(), btnSiguientePelicula.getHeight(), Image.SCALE_DEFAULT));
        btnSiguientePelicula.setIcon(icon2);
    }

    public MdlSeleccionFuncion getMdlFuncion() {
        return mdlFuncion;
    }

    public JButton anterior() {
        return btnAnteriorPelicula;
    }

    public JButton siguiente() {
        return btnSiguientePelicula;
    }

    public JButton btnSeleccionarSillas() {
        return btnSeleccionarSillas;
    }

    public JLabel getImagen() {
        return jLabel1;
    }

    public JLabel getNombrePelicula() {
        return jLabel2;
    }

    public JLabel getCalificacionPelicula() {
        return jLabel7;
    }

    public JComboBox getFecha() {
        return cbFechas;
    }

    public JComboBox getHora() {
        return cbHoras;
    }

    public JComboBox getTipo() {
        return cbTipoSilla;
    }

    public JSpinner getSpNumeroSillas() {
        return spNumeroSillas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSiguientePelicula = new javax.swing.JButton();
        btnAnteriorPelicula = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbFechas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbHoras = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbTipoSilla = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        spNumeroSillas = new javax.swing.JSpinner();
        btnSeleccionarSillas = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
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
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 220, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/palomitas-de-maiz.png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 100));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/palomitas-de-maiz.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("pelicula");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("pelicula");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, -1, -1));

        jLabel1.setText("pelicula");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 210, 280));

        btnSiguientePelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguientePeliculaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSiguientePelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 70, 50));

        btnAnteriorPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorPeliculaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAnteriorPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 70, 50));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Cambiar Pelicula");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        cbFechas.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        cbFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFechasActionPerformed(evt);
            }
        });
        jPanel2.add(cbFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 210, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Seleccione hora");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        cbHoras.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        cbHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHorasActionPerformed(evt);
            }
        });
        jPanel2.add(cbHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 210, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("Seleccione Tipo de Silla");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        cbTipoSilla.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        cbTipoSilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoSillaActionPerformed(evt);
            }
        });
        jPanel2.add(cbTipoSilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 210, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Seleccione numero de sillas");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        spNumeroSillas.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel2.add(spNumeroSillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 210, 30));

        btnSeleccionarSillas.setBackground(new java.awt.Color(204, 255, 255));
        btnSeleccionarSillas.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btnSeleccionarSillas.setForeground(new java.awt.Color(94, 174, 253));
        btnSeleccionarSillas.setText("Seleccionar Sillas");
        btnSeleccionarSillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarSillasActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeleccionarSillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 280, 50));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setText("Seleccione la fecha");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, 570));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/Ellipse 209.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 450, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/Union.png"))); // NOI18N
        jLabel17.setText("re");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 0, 1280, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFechasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFechasActionPerformed

    private void btnSeleccionarSillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarSillasActionPerformed

    }//GEN-LAST:event_btnSeleccionarSillasActionPerformed

    private void cbHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHorasActionPerformed

    private void cbTipoSillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoSillaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbTipoSillaActionPerformed

    private void btnSiguientePeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguientePeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiguientePeliculaActionPerformed

    private void btnAnteriorPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnteriorPeliculaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnteriorPelicula;
    private javax.swing.JButton btnSeleccionarSillas;
    private javax.swing.JButton btnSiguientePelicula;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbFechas;
    private javax.swing.JComboBox<String> cbHoras;
    private javax.swing.JComboBox<String> cbTipoSilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JSpinner spNumeroSillas;
    // End of variables declaration//GEN-END:variables
}
