/*
    Created on : 22 jul. 2022, 20:19:49
    Author     : Miguel Londono, Nicolas Diaz, Daniel Paez
    Project: Proyecto Final de Modelos de Programacion I
 */
package vista;

import modelo.MdlAsiento;
import modelo.MdlReciboBoletas;
import control.logica.CtrAsientos;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author Miguel Londono
 * @author Daniel Paez
 * @author Nicolas Di­az
 */
public class VtnSeleccionAsientos extends javax.swing.JFrame {

    private VtnSeleccionAsientos vtnSeleccionAsientos;
    private final MdlAsiento mdlAsiento;
    private CtrAsientos ctrAsientos;

    /**
     * 
     * @param modelo
     * @param tipoSilla 
     */
    public VtnSeleccionAsientos(MdlAsiento modelo, String tipoSilla) {
        this.mdlAsiento = modelo;
        initComponents();
        setLocationRelativeTo(null);
        capturarEventos();
        
        // bloquear todos los botones
        if (tipoSilla == "General") {
            jButtonE1.setEnabled(false);
            jButtonE2.setEnabled(false);
            jButtonE3.setEnabled(false);
            jButtonE4.setEnabled(false);
            jButtonE5.setEnabled(false);
            jButtonE6.setEnabled(false);
            jButtonE7.setEnabled(false);
            jButtonE8.setEnabled(false);
            jButtonE9.setEnabled(false);
            jButtonE10.setEnabled(false);
            jButtonF1.setEnabled(false);
            jButtonF2.setEnabled(false);
            jButtonF3.setEnabled(false);
            jButtonF4.setEnabled(false);
            jButtonF5.setEnabled(false);
            jButtonF6.setEnabled(false);
            jButtonF7.setEnabled(false);
            jButtonF8.setEnabled(false);
            jButtonF9.setEnabled(false);
            jButtonF10.setEnabled(false);
        } else {
            jButtonA1.setEnabled(false);
            jButtonA2.setEnabled(false);
            jButtonA3.setEnabled(false);
            jButtonA4.setEnabled(false);
            jButtonA5.setEnabled(false);
            jButtonA6.setEnabled(false);
            jButtonA7.setEnabled(false);
            jButtonA8.setEnabled(false);
            jButtonA9.setEnabled(false);
            jButtonA10.setEnabled(false);
            jButtonB1.setEnabled(false);
            jButtonB2.setEnabled(false);
            jButtonB3.setEnabled(false);
            jButtonB4.setEnabled(false);
            jButtonB5.setEnabled(false);
            jButtonB6.setEnabled(false);
            jButtonB7.setEnabled(false);
            jButtonB8.setEnabled(false);
            jButtonB9.setEnabled(false);
            jButtonB10.setEnabled(false);
            jButtonC1.setEnabled(false);
            jButtonC2.setEnabled(false);
            jButtonC3.setEnabled(false);
            jButtonC4.setEnabled(false);
            jButtonC5.setEnabled(false);
            jButtonC6.setEnabled(false);
            jButtonC7.setEnabled(false);
            jButtonC8.setEnabled(false);
            jButtonC9.setEnabled(false);
            jButtonC10.setEnabled(false);
            jButtonD1.setEnabled(false);
            jButtonD2.setEnabled(false);
            jButtonD3.setEnabled(false);
            jButtonD4.setEnabled(false);
            jButtonD5.setEnabled(false);
            jButtonD6.setEnabled(false);
            jButtonD7.setEnabled(false);
            jButtonD8.setEnabled(false);
            jButtonD9.setEnabled(false);
            jButtonD10.setEnabled(false);
        }

    }

    /**
     * 
     */
    public void capturarEventos() {
        jButtonE1.addActionListener(getCtrAsientos());
        jButtonE2.addActionListener(getCtrAsientos());
        jButtonE3.addActionListener(getCtrAsientos());
        jButtonE4.addActionListener(getCtrAsientos());
        jButtonE5.addActionListener(getCtrAsientos());
        jButtonE6.addActionListener(getCtrAsientos());
        jButtonE7.addActionListener(getCtrAsientos());
        jButtonE8.addActionListener(getCtrAsientos());
        jButtonE9.addActionListener(getCtrAsientos());
        jButtonE10.addActionListener(getCtrAsientos());
        jButtonF1.addActionListener(getCtrAsientos());
        jButtonF2.addActionListener(getCtrAsientos());
        jButtonF3.addActionListener(getCtrAsientos());
        jButtonF4.addActionListener(getCtrAsientos());
        jButtonF5.addActionListener(getCtrAsientos());
        jButtonF6.addActionListener(getCtrAsientos());
        jButtonF7.addActionListener(getCtrAsientos());
        jButtonF8.addActionListener(getCtrAsientos());
        jButtonF9.addActionListener(getCtrAsientos());
        jButtonF10.addActionListener(getCtrAsientos());
        jButtonA1.addActionListener(getCtrAsientos());
        jButtonA2.addActionListener(getCtrAsientos());
        jButtonA3.addActionListener(getCtrAsientos());
        jButtonA4.addActionListener(getCtrAsientos());
        jButtonA5.addActionListener(getCtrAsientos());
        jButtonA6.addActionListener(getCtrAsientos());
        jButtonA7.addActionListener(getCtrAsientos());
        jButtonA8.addActionListener(getCtrAsientos());
        jButtonA9.addActionListener(getCtrAsientos());
        jButtonA10.addActionListener(getCtrAsientos());
        jButtonB1.addActionListener(getCtrAsientos());
        jButtonB2.addActionListener(getCtrAsientos());
        jButtonB3.addActionListener(getCtrAsientos());
        jButtonB4.addActionListener(getCtrAsientos());
        jButtonB5.addActionListener(getCtrAsientos());
        jButtonB6.addActionListener(getCtrAsientos());
        jButtonB7.addActionListener(getCtrAsientos());
        jButtonB8.addActionListener(getCtrAsientos());
        jButtonB9.addActionListener(getCtrAsientos());
        jButtonB10.addActionListener(getCtrAsientos());
        jButtonC1.addActionListener(getCtrAsientos());
        jButtonC2.addActionListener(getCtrAsientos());
        jButtonC3.addActionListener(getCtrAsientos());
        jButtonC4.addActionListener(getCtrAsientos());
        jButtonC5.addActionListener(getCtrAsientos());
        jButtonC6.addActionListener(getCtrAsientos());
        jButtonC7.addActionListener(getCtrAsientos());
        jButtonC8.addActionListener(getCtrAsientos());
        jButtonC9.addActionListener(getCtrAsientos());
        jButtonC10.addActionListener(getCtrAsientos());
        jButtonD1.addActionListener(getCtrAsientos());
        jButtonD2.addActionListener(getCtrAsientos());
        jButtonD3.addActionListener(getCtrAsientos());
        jButtonD4.addActionListener(getCtrAsientos());
        jButtonD5.addActionListener(getCtrAsientos());
        jButtonD6.addActionListener(getCtrAsientos());
        jButtonD7.addActionListener(getCtrAsientos());
        jButtonD8.addActionListener(getCtrAsientos());
        jButtonD9.addActionListener(getCtrAsientos());
        jButtonD10.addActionListener(getCtrAsientos());
        btnConfirmar.addActionListener(getCtrAsientos());
    }

    public CtrAsientos getCtrAsientos() {
        if (ctrAsientos == null) {
            ctrAsientos = new CtrAsientos(this);
        }
        return ctrAsientos;
    }

    /**
     * metodo para iniciar ventana de recibo y terminar compra
     * 
     * @param funcion
     * @param listaSillasSeleccionadas
     * @param tipo
     * @param cantidad 
     */
    public void mostrarRecibo(int funcion, ArrayList listaSillasSeleccionadas, String tipo, int cantidad) {
        // oculta ventana
        this.setVisible(false);
        MdlReciboBoletas mdlReciboBoletas;
        mdlReciboBoletas = new MdlReciboBoletas();
        mdlReciboBoletas.iniciar(funcion, listaSillasSeleccionadas, tipo, cantidad);
    }

    /**
     * 
     * @param s
     * @return 
     */
    public JButton getJbutton(String s) {
        switch (s) {
            case "A1":
                return jButtonA1;
            case "A2":
                return jButtonA2;
            case "A3":
                return jButtonA3;
            case "A4":
                return jButtonA4;
            case "A5":
                return jButtonA5;
            case "A6":
                return jButtonA6;
            case "A7":
                return jButtonA7;
            case "A8":
                return jButtonA8;
            case "A9":
                return jButtonA9;
            case "A10":
                return jButtonA10;
            case "B1":
                return jButtonB1;
            case "B2":
                return jButtonB2;
            case "B3":
                return jButtonB3;
            case "B4":
                return jButtonB4;
            case "B5":
                return jButtonB5;
            case "B6":
                return jButtonB6;
            case "B7":
                return jButtonB7;
            case "B8":
                return jButtonB8;
            case "B9":
                return jButtonB9;
            case "B10":
                return jButtonB10;
            case "C1":
                return jButtonC1;
            case "C2":
                return jButtonC2;
            case "C3":
                return jButtonC3;
            case "C4":
                return jButtonC4;
            case "C5":
                return jButtonC5;
            case "C6":
                return jButtonC6;
            case "C7":
                return jButtonC7;
            case "C8":
                return jButtonC8;
            case "C9":
                return jButtonC9;
            case "C10":
                return jButtonC10;
            case "D1":
                return jButtonD1;
            case "D2":
                return jButtonD2;
            case "D3":
                return jButtonD3;
            case "D4":
                return jButtonD4;
            case "D5":
                return jButtonD5;
            case "D6":
                return jButtonD6;
            case "D7":
                return jButtonD7;
            case "D8":
                return jButtonD8;
            case "D9":
                return jButtonD9;
            case "D10":
                return jButtonD10;
            case "E1":
                return jButtonE1;
            case "E2":
                return jButtonE2;
            case "E3":
                return jButtonE3;
            case "E4":
                return jButtonE4;
            case "E5":
                return jButtonE5;
            case "E6":
                return jButtonE6;
            case "E7":
                return jButtonE7;
            case "E8":
                return jButtonE8;
            case "E9":
                return jButtonE9;
            case "E10":
                return jButtonE10;
            case "F1":
                return jButtonF1;
            case "F2":
                return jButtonF2;
            case "F3":
                return jButtonF3;
            case "F4":
                return jButtonF4;
            case "F5":
                return jButtonF5;
            case "F6":
                return jButtonF6;
            case "F7":
                return jButtonF7;
            case "F8":
                return jButtonF8;
            case "F9":
                return jButtonF9;
            case "F10":
                return jButtonF10;
            default:
                return null;
        }
    }

    public MdlAsiento getMdlAsiento() {
        return mdlAsiento;
    }

    public JButton confirmar() {
        return btnConfirmar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButtonF10 = new javax.swing.JButton();
        jButtonE10 = new javax.swing.JButton();
        jButtonE9 = new javax.swing.JButton();
        jButtonF9 = new javax.swing.JButton();
        jButtonF8 = new javax.swing.JButton();
        jButtonE8 = new javax.swing.JButton();
        jButtonE7 = new javax.swing.JButton();
        jButtonF7 = new javax.swing.JButton();
        jButtonF6 = new javax.swing.JButton();
        jButtonE6 = new javax.swing.JButton();
        jButtonE5 = new javax.swing.JButton();
        jButtonF5 = new javax.swing.JButton();
        jButtonF4 = new javax.swing.JButton();
        jButtonE4 = new javax.swing.JButton();
        jButtonE3 = new javax.swing.JButton();
        jButtonF3 = new javax.swing.JButton();
        jButtonF2 = new javax.swing.JButton();
        jButtonE2 = new javax.swing.JButton();
        jButtonE1 = new javax.swing.JButton();
        jButtonF1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonD10 = new javax.swing.JButton();
        jButtonC10 = new javax.swing.JButton();
        jButtonC9 = new javax.swing.JButton();
        jButtonD9 = new javax.swing.JButton();
        jButtonD8 = new javax.swing.JButton();
        jButtonC8 = new javax.swing.JButton();
        jButtonD7 = new javax.swing.JButton();
        jButtonC7 = new javax.swing.JButton();
        jButtonD6 = new javax.swing.JButton();
        jButtonC6 = new javax.swing.JButton();
        jButtonD5 = new javax.swing.JButton();
        jButtonC5 = new javax.swing.JButton();
        jButtonD4 = new javax.swing.JButton();
        jButtonC4 = new javax.swing.JButton();
        jButtonD3 = new javax.swing.JButton();
        jButtonC3 = new javax.swing.JButton();
        jButtonD2 = new javax.swing.JButton();
        jButtonD1 = new javax.swing.JButton();
        jButtonC1 = new javax.swing.JButton();
        jButtonC2 = new javax.swing.JButton();
        jButtonB1 = new javax.swing.JButton();
        jButtonB2 = new javax.swing.JButton();
        jButtonB3 = new javax.swing.JButton();
        jButtonB5 = new javax.swing.JButton();
        jButtonB6 = new javax.swing.JButton();
        jButtonB7 = new javax.swing.JButton();
        jButtonB8 = new javax.swing.JButton();
        jButtonB9 = new javax.swing.JButton();
        jButtonB10 = new javax.swing.JButton();
        jButtonA10 = new javax.swing.JButton();
        jButtonA9 = new javax.swing.JButton();
        jButtonA8 = new javax.swing.JButton();
        jButtonA7 = new javax.swing.JButton();
        jButtonA6 = new javax.swing.JButton();
        jButtonA5 = new javax.swing.JButton();
        jButtonA4 = new javax.swing.JButton();
        jButtonB4 = new javax.swing.JButton();
        jButtonA3 = new javax.swing.JButton();
        jButtonA2 = new javax.swing.JButton();
        jButtonA1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel9.setText("Cine Distrital");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 220, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/palomitas-de-maiz.png"))); // NOI18N
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 100, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 100));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/palomitas-de-maiz.png"))); // NOI18N
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Avatar_Container.png"))); // NOI18N
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 130, -1));

        btnConfirmar.setBackground(new java.awt.Color(204, 255, 255));
        btnConfirmar.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(94, 174, 253));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel4.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, 190, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 140, 650, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Pantalla");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        jButtonF10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonF10.setText("F10");
        jButtonF10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonF10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 570, 60, 60));

        jButtonE10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonE10.setText("E10");
        jButtonE10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonE10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonE10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, 60, 60));

        jButtonE9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonE9.setText("E9");
        jButtonE9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonE9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonE9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, 60, 60));

        jButtonF9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonF9.setText("F9");
        jButtonF9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonF9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 570, 60, 60));

        jButtonF8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonF8.setText("F8");
        jButtonF8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonF8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 60, 60));

        jButtonE8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonE8.setText("E8");
        jButtonE8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonE8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonE8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 60, 60));

        jButtonE7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonE7.setText("E7");
        jButtonE7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonE7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonE7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 60, 60));

        jButtonF7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonF7.setText("F7");
        jButtonF7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonF7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 570, 60, 60));

        jButtonF6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonF6.setText("F6");
        jButtonF6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonF6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, 60, 60));

        jButtonE6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonE6.setText("E6");
        jButtonE6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonE6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonE6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 60, 60));

        jButtonE5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonE5.setText("E5");
        jButtonE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonE5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonE5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 60, 60));

        jButtonF5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonF5.setText("F5");
        jButtonF5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, 60, 60));

        jButtonF4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonF4.setText("F4");
        jButtonF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 60, 60));

        jButtonE4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonE4.setText("E4");
        jButtonE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonE4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonE4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 60, 60));

        jButtonE3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonE3.setText("E3");
        jButtonE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonE3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 60, 60));

        jButtonF3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonF3.setText("F3");
        jButtonF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 60, 60));

        jButtonF2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonF2.setText("F2");
        jButtonF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 60, 60));

        jButtonE2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonE2.setText("E2");
        jButtonE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonE2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 60, 60));

        jButtonE1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonE1.setText("E1");
        jButtonE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonE1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 60, 60));

        jButtonF1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonF1.setText("F1");
        jButtonF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonF1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 60, 60));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Preferencial");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, -1, 40));

        jButtonD10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonD10.setText("D10");
        jButtonD10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonD10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonD10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 60, 60));

        jButtonC10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonC10.setText("C10");
        jButtonC10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonC10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 60, 60));

        jButtonC9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonC9.setText("C9");
        jButtonC9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonC9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 60, 60));

        jButtonD9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonD9.setText("D9");
        jButtonD9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonD9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonD9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 60, 60));

        jButtonD8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonD8.setText("D8");
        jButtonD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonD8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonD8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 60, 60));

        jButtonC8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonC8.setText("C8");
        jButtonC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonC8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 60, 60));

        jButtonD7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonD7.setText("D7");
        jButtonD7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonD7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonD7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 60, 60));

        jButtonC7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonC7.setText("C7");
        jButtonC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonC7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 60, 60));

        jButtonD6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonD6.setText("D6");
        jButtonD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonD6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonD6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 60, 60));

        jButtonC6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonC6.setText("C6");
        jButtonC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 60, 60));

        jButtonD5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonD5.setText("D5");
        jButtonD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonD5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonD5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 60, 60));

        jButtonC5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonC5.setText("C5");
        jButtonC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 60, 60));

        jButtonD4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonD4.setText("D4");
        jButtonD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonD4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 60, 60));

        jButtonC4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonC4.setText("C4");
        jButtonC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 60, 60));

        jButtonD3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonD3.setText("D3");
        jButtonD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonD3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 60, 60));

        jButtonC3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonC3.setText("C3");
        jButtonC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 60, 60));

        jButtonD2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonD2.setText("D2");
        jButtonD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonD2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 60, 60));

        jButtonD1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonD1.setText("D1");
        jButtonD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonD1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 60, 60));

        jButtonC1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonC1.setText("C1");
        jButtonC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 60, 60));

        jButtonC2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonC2.setText("C2");
        jButtonC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 60, 60));

        jButtonB1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonB1.setText("B1");
        jButtonB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 60, 60));

        jButtonB2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonB2.setText("B2");
        jButtonB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 60, 60));

        jButtonB3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonB3.setText("B3");
        jButtonB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 60, 60));

        jButtonB5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonB5.setText("B5");
        jButtonB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 60, 60));

        jButtonB6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonB6.setText("B6");
        jButtonB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 60, 60));

        jButtonB7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonB7.setText("B7");
        jButtonB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonB7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 60, 60));

        jButtonB8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonB8.setText("B8");
        jButtonB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonB8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 60, 60));

        jButtonB9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonB9.setText("B9");
        jButtonB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonB9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 60, 60));

        jButtonB10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonB10.setText("B10");
        jButtonB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 60, 60));

        jButtonA10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonA10.setText("A10");
        jButtonA10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonA10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 60, 60));

        jButtonA9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonA9.setText("A9");
        jButtonA9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonA9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 60, 60));

        jButtonA8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonA8.setText("A8");
        jButtonA8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonA8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 60, 60));

        jButtonA7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonA7.setText("A7");
        jButtonA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 60, 60));

        jButtonA6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonA6.setText("A6");
        jButtonA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 60, 60));

        jButtonA5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonA5.setText("A5");
        jButtonA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 60, 60));

        jButtonA4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonA4.setText("A4");
        jButtonA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 60, 60));

        jButtonB4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonB4.setText("B4");
        jButtonB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonB4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 60, 60));

        jButtonA3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonA3.setText("A3");
        jButtonA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 60, 60));

        jButtonA2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonA2.setText("A2");
        jButtonA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 60, 60));

        jButtonA1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonA1.setText("A1");
        jButtonA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 60, 60));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("General");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Asientos");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 32));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 980, 700));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/Ellipse 209.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 460, -1, -1));

        jPanel3.setBackground(new java.awt.Color(244, 243, 243));
        jPanel3.setForeground(new java.awt.Color(60, 63, 65));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/Union.png"))); // NOI18N
        jLabel17.setText("re");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 0, 1280, 720));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonA6ActionPerformed
        //seleccion(jButtonA6,"A6");
    }//GEN-LAST:event_jButtonA6ActionPerformed

    private void jButtonB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB6ActionPerformed
        //seleccion(jButtonB6,"B6");
    }//GEN-LAST:event_jButtonB6ActionPerformed

    private void jButtonC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonC6ActionPerformed
        //seleccion(jButtonC6,"C6");
    }//GEN-LAST:event_jButtonC6ActionPerformed

    private void jButtonD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonD6ActionPerformed
        //seleccion(jButtonD6,"D6");
    }//GEN-LAST:event_jButtonD6ActionPerformed

    private void jButtonE6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonE6ActionPerformed
        //seleccion(jButtonE6,"E6");
    }//GEN-LAST:event_jButtonE6ActionPerformed

    private void jButtonF6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF6ActionPerformed
        //seleccion(jButtonF6,"F6");
    }//GEN-LAST:event_jButtonF6ActionPerformed

    private void jButtonB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB3ActionPerformed
        //seleccion(jButtonB3,"B3");
    }//GEN-LAST:event_jButtonB3ActionPerformed

    private void jButtonB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB4ActionPerformed
        //seleccion(jButtonB4,"B4");
    }//GEN-LAST:event_jButtonB4ActionPerformed

    private void jButtonA10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonA10ActionPerformed
        //seleccion(jButtonA10,"A10");
    }//GEN-LAST:event_jButtonA10ActionPerformed

    private void jButtonB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB1ActionPerformed
        //seleccion(jButtonB1,"B1");
    }//GEN-LAST:event_jButtonB1ActionPerformed

    private void jButtonC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonC1ActionPerformed
        //seleccion(jButtonC1,"C1");
    }//GEN-LAST:event_jButtonC1ActionPerformed

    private void jButtonC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonC4ActionPerformed
        //seleccion(jButtonC4,"C4");
    }//GEN-LAST:event_jButtonC4ActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void jButtonA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonA1ActionPerformed
        //seleccion(jButtonA1,"A1");
    }//GEN-LAST:event_jButtonA1ActionPerformed

    private void jButtonA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonA2ActionPerformed
        //seleccion(jButtonA2,"A2");
    }//GEN-LAST:event_jButtonA2ActionPerformed

    private void jButtonA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonA3ActionPerformed
        //seleccion(jButtonA3,"A3");
    }//GEN-LAST:event_jButtonA3ActionPerformed

    private void jButtonA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonA4ActionPerformed
        //seleccion(jButtonA4,"A4");
    }//GEN-LAST:event_jButtonA4ActionPerformed

    private void jButtonA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonA5ActionPerformed
        //seleccion(jButtonA5,"A5");
    }//GEN-LAST:event_jButtonA5ActionPerformed

    private void jButtonA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonA7ActionPerformed
        //seleccion(jButtonA7,"A7");
    }//GEN-LAST:event_jButtonA7ActionPerformed

    private void jButtonA8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonA8ActionPerformed
        //seleccion(jButtonA8,"A8");
    }//GEN-LAST:event_jButtonA8ActionPerformed

    private void jButtonA9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonA9ActionPerformed
        //seleccion(jButtonA9,"A9");
    }//GEN-LAST:event_jButtonA9ActionPerformed

    private void jButtonB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB2ActionPerformed
        //seleccion(jButtonB2,"B2");
    }//GEN-LAST:event_jButtonB2ActionPerformed

    private void jButtonB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB5ActionPerformed
        //seleccion(jButtonB5,"B5");
    }//GEN-LAST:event_jButtonB5ActionPerformed

    private void jButtonB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB7ActionPerformed
        //seleccion(jButtonB7,"B7");
    }//GEN-LAST:event_jButtonB7ActionPerformed

    private void jButtonB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB8ActionPerformed
        //seleccion(jButtonB8,"B8");
    }//GEN-LAST:event_jButtonB8ActionPerformed

    private void jButtonB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB9ActionPerformed
        //seleccion(jButtonB9,"B9");
    }//GEN-LAST:event_jButtonB9ActionPerformed

    private void jButtonB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonB10ActionPerformed
        //seleccion(jButtonB10,"B10");
    }//GEN-LAST:event_jButtonB10ActionPerformed

    private void jButtonC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonC2ActionPerformed
        //seleccion(jButtonC2,"C2");
    }//GEN-LAST:event_jButtonC2ActionPerformed

    private void jButtonC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonC3ActionPerformed
        //seleccion(jButtonC3,"C3");
    }//GEN-LAST:event_jButtonC3ActionPerformed

    private void jButtonC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonC5ActionPerformed
        //seleccion(jButtonC5,"C5");
    }//GEN-LAST:event_jButtonC5ActionPerformed

    private void jButtonC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonC7ActionPerformed
        //seleccion(jButtonC7,"C7");
    }//GEN-LAST:event_jButtonC7ActionPerformed

    private void jButtonC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonC8ActionPerformed
        //seleccion(jButtonC8,"C8");
    }//GEN-LAST:event_jButtonC8ActionPerformed

    private void jButtonC9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonC9ActionPerformed
        //seleccion(jButtonC9,"C9");
    }//GEN-LAST:event_jButtonC9ActionPerformed

    private void jButtonC10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonC10ActionPerformed
        //seleccion(jButtonC10,"C10");
    }//GEN-LAST:event_jButtonC10ActionPerformed

    private void jButtonD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonD1ActionPerformed
        //seleccion(jButtonD1,"D1");
    }//GEN-LAST:event_jButtonD1ActionPerformed

    private void jButtonD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonD2ActionPerformed
        //seleccion(jButtonD2,"D2");
    }//GEN-LAST:event_jButtonD2ActionPerformed

    private void jButtonD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonD3ActionPerformed
        //seleccion(jButtonD3,"D3");
    }//GEN-LAST:event_jButtonD3ActionPerformed

    private void jButtonD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonD4ActionPerformed
        //seleccion(jButtonD4,"D4");
    }//GEN-LAST:event_jButtonD4ActionPerformed

    private void jButtonD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonD5ActionPerformed
        //seleccion(jButtonD5,"D5");
    }//GEN-LAST:event_jButtonD5ActionPerformed

    private void jButtonD7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonD7ActionPerformed
        //seleccion(jButtonD7,"D7");
    }//GEN-LAST:event_jButtonD7ActionPerformed

    private void jButtonD8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonD8ActionPerformed
        //seleccion(jButtonD8,"D8");
    }//GEN-LAST:event_jButtonD8ActionPerformed

    private void jButtonD9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonD9ActionPerformed
        //seleccion(jButtonD9,"D9");
    }//GEN-LAST:event_jButtonD9ActionPerformed

    private void jButtonD10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonD10ActionPerformed
        //seleccion(jButtonD10,"D10");
    }//GEN-LAST:event_jButtonD10ActionPerformed

    private void jButtonE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonE1ActionPerformed
        //seleccion(jButtonE1,"E1");
    }//GEN-LAST:event_jButtonE1ActionPerformed

    private void jButtonE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonE2ActionPerformed
        //seleccion(jButtonE2,"E2");
    }//GEN-LAST:event_jButtonE2ActionPerformed

    private void jButtonE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonE3ActionPerformed
        //seleccion(jButtonE3,"E3");
    }//GEN-LAST:event_jButtonE3ActionPerformed

    private void jButtonE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonE4ActionPerformed
        //seleccion(jButtonE4,"E4");
    }//GEN-LAST:event_jButtonE4ActionPerformed

    private void jButtonE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonE5ActionPerformed
        //seleccion(jButtonE5,"E5");
    }//GEN-LAST:event_jButtonE5ActionPerformed

    private void jButtonE7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonE7ActionPerformed
        //seleccion(jButtonE7,"E7");
    }//GEN-LAST:event_jButtonE7ActionPerformed

    private void jButtonE8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonE8ActionPerformed
        //seleccion(jButtonE8,"E8");
    }//GEN-LAST:event_jButtonE8ActionPerformed

    private void jButtonE9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonE9ActionPerformed
        //seleccion(jButtonE9,"E9");
    }//GEN-LAST:event_jButtonE9ActionPerformed

    private void jButtonE10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonE10ActionPerformed
        //seleccion(jButtonE10,"E10");
    }//GEN-LAST:event_jButtonE10ActionPerformed

    private void jButtonF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF1ActionPerformed
        //seleccion(jButtonF1,"F1");
    }//GEN-LAST:event_jButtonF1ActionPerformed

    private void jButtonF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF2ActionPerformed
        //seleccion(jButtonF2,"F2");
    }//GEN-LAST:event_jButtonF2ActionPerformed

    private void jButtonF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF3ActionPerformed
        //seleccion(jButtonF3,"F3");
    }//GEN-LAST:event_jButtonF3ActionPerformed

    private void jButtonF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF4ActionPerformed
        //seleccion(jButtonF4,"F4");
    }//GEN-LAST:event_jButtonF4ActionPerformed

    private void jButtonF5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF5ActionPerformed
        //seleccion(jButtonF5,"F5");
    }//GEN-LAST:event_jButtonF5ActionPerformed

    private void jButtonF7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF7ActionPerformed
        //seleccion(jButtonF7,"F7");
    }//GEN-LAST:event_jButtonF7ActionPerformed

    private void jButtonF8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF8ActionPerformed
        //seleccion(jButtonF8,"F8");
    }//GEN-LAST:event_jButtonF8ActionPerformed

    private void jButtonF9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF9ActionPerformed
        //seleccion(jButtonF9,"F9");
    }//GEN-LAST:event_jButtonF9ActionPerformed

    private void jButtonF10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonF10ActionPerformed
        //seleccion(jButtonF10,"F10");
    }//GEN-LAST:event_jButtonF10ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton jButtonA1;
    private javax.swing.JButton jButtonA10;
    private javax.swing.JButton jButtonA2;
    private javax.swing.JButton jButtonA3;
    private javax.swing.JButton jButtonA4;
    private javax.swing.JButton jButtonA5;
    private javax.swing.JButton jButtonA6;
    private javax.swing.JButton jButtonA7;
    private javax.swing.JButton jButtonA8;
    private javax.swing.JButton jButtonA9;
    private javax.swing.JButton jButtonB1;
    private javax.swing.JButton jButtonB10;
    private javax.swing.JButton jButtonB2;
    private javax.swing.JButton jButtonB3;
    private javax.swing.JButton jButtonB4;
    private javax.swing.JButton jButtonB5;
    private javax.swing.JButton jButtonB6;
    private javax.swing.JButton jButtonB7;
    private javax.swing.JButton jButtonB8;
    private javax.swing.JButton jButtonB9;
    private javax.swing.JButton jButtonC1;
    private javax.swing.JButton jButtonC10;
    private javax.swing.JButton jButtonC2;
    private javax.swing.JButton jButtonC3;
    private javax.swing.JButton jButtonC4;
    private javax.swing.JButton jButtonC5;
    private javax.swing.JButton jButtonC6;
    private javax.swing.JButton jButtonC7;
    private javax.swing.JButton jButtonC8;
    private javax.swing.JButton jButtonC9;
    private javax.swing.JButton jButtonD1;
    private javax.swing.JButton jButtonD10;
    private javax.swing.JButton jButtonD2;
    private javax.swing.JButton jButtonD3;
    private javax.swing.JButton jButtonD4;
    private javax.swing.JButton jButtonD5;
    private javax.swing.JButton jButtonD6;
    private javax.swing.JButton jButtonD7;
    private javax.swing.JButton jButtonD8;
    private javax.swing.JButton jButtonD9;
    private javax.swing.JButton jButtonE1;
    private javax.swing.JButton jButtonE10;
    private javax.swing.JButton jButtonE2;
    private javax.swing.JButton jButtonE3;
    private javax.swing.JButton jButtonE4;
    private javax.swing.JButton jButtonE5;
    private javax.swing.JButton jButtonE6;
    private javax.swing.JButton jButtonE7;
    private javax.swing.JButton jButtonE8;
    private javax.swing.JButton jButtonE9;
    private javax.swing.JButton jButtonF1;
    private javax.swing.JButton jButtonF10;
    private javax.swing.JButton jButtonF2;
    private javax.swing.JButton jButtonF3;
    private javax.swing.JButton jButtonF4;
    private javax.swing.JButton jButtonF5;
    private javax.swing.JButton jButtonF6;
    private javax.swing.JButton jButtonF7;
    private javax.swing.JButton jButtonF8;
    private javax.swing.JButton jButtonF9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
