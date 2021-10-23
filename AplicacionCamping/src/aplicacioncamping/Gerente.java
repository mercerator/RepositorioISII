/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncamping;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author anita
 */
public class Gerente extends javax.swing.JFrame {

    private JFrame vistaAnterior;

    /**
     * Creates new form Gerente
     */
    public Gerente(JFrame vistaAnterior) {
        this.vistaAnterior = vistaAnterior;
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Administración Gerente");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parcelas = new javax.swing.JFrame();
        lbl_nomape = new javax.swing.JLabel();
        lbl_dni = new javax.swing.JLabel();
        lbl_numparcel = new javax.swing.JLabel();
        lbl_fechentrada = new javax.swing.JLabel();
        fEntrada = new datechooser.beans.DateChooserCombo();
        lbl_salida = new javax.swing.JLabel();
        fSalida = new datechooser.beans.DateChooserCombo();
        lbl_mcuadrados = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        luzSi = new javax.swing.JRadioButton();
        luzNO = new javax.swing.JRadioButton();
        lbl_datos = new javax.swing.JLabel();
        lbl_datos_reserva = new javax.swing.JLabel();
        lbl_detallestienda = new javax.swing.JLabel();
        lbl_luz = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        eventos = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        btn_atras2 = new javax.swing.JButton();
        btn_sancionar = new javax.swing.JButton();
        btn_emparejar = new javax.swing.JButton();
        btn_ganador = new javax.swing.JButton();
        lbl_iniciosesion = new javax.swing.JLabel();
        descuento = new javax.swing.JInternalFrame();
        eldescuentoes = new javax.swing.JLabel();
        descuentoAct = new javax.swing.JLabel();
        xcien = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_administrar = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        scroll_parcelas = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        scroll_eventos = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        btn_descuento = new javax.swing.JButton();

        parcelas.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        parcelas.setTitle("Modificar Parcela");
        parcelas.setLocation(new java.awt.Point(265, 112));
        parcelas.setMinimumSize(new java.awt.Dimension(1000, 600));
        parcelas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nomape.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_nomape.setText("Nombre y Apellidos: ");
        parcelas.getContentPane().add(lbl_nomape, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, 30));

        lbl_dni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_dni.setText("DNI:");
        parcelas.getContentPane().add(lbl_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 40, 30));

        lbl_numparcel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_numparcel.setText("Nº de parcelas:");
        parcelas.getContentPane().add(lbl_numparcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 130, 30));

        lbl_fechentrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_fechentrada.setText("Fecha de entrada:");
        parcelas.getContentPane().add(lbl_fechentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 140, 30));
        parcelas.getContentPane().add(fEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, 30));

        lbl_salida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_salida.setText("Fecha de salida:");
        parcelas.getContentPane().add(lbl_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 130, 30));
        parcelas.getContentPane().add(fSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, 30));

        lbl_mcuadrados.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_mcuadrados.setText("Metros cuadrados:");
        parcelas.getContentPane().add(lbl_mcuadrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 140, 30));

        lbl_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_nombre.setText("Nombre:");
        parcelas.getContentPane().add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 70, 30));

        luzSi.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        luzSi.setText("Si");
        parcelas.getContentPane().add(luzSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 130, -1));

        luzNO.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        luzNO.setText("No");
        luzNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luzNOActionPerformed(evt);
            }
        });
        parcelas.getContentPane().add(luzNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 160, -1));

        lbl_datos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_datos.setText("Datos Cliente:");
        parcelas.getContentPane().add(lbl_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 200, 40));

        lbl_datos_reserva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_datos_reserva.setText("Datos de la reserva:");
        parcelas.getContentPane().add(lbl_datos_reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 240, 40));

        lbl_detallestienda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_detallestienda.setText("Introduzca los detalles de su tienda de campaña:");
        parcelas.getContentPane().add(lbl_detallestienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 460, 30));

        lbl_luz.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_luz.setText("¿Desea contar con servicio de luz en su parcela ?");
        parcelas.getContentPane().add(lbl_luz, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 450, 50));

        btn_salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        parcelas.getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 140, 40));

        btn_aceptar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_aceptar.setText("Aceptar");
        btn_aceptar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        parcelas.getContentPane().add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, 140, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText(" Alfredo Clemente");
        parcelas.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("24");
        parcelas.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 130, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("4");
        parcelas.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("485586954L");
        parcelas.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 130, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("qchua");
        parcelas.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 130, 30));

        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_eliminar.setText("Eliminar Reserva");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        parcelas.getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, 140, 40));

        eventos.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        eventos.setTitle("Administrar Eventos");
        eventos.setLocation(new java.awt.Point(265, 112));
        eventos.setMinimumSize(new java.awt.Dimension(1000, 600));
        eventos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre Evento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 14))); // NOI18N
        jList2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "DNI1", "DNI2", "DNI3", "DNI4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jList2);

        eventos.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 220, 270));

        btn_atras2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btn_atras2.setText("Atrás");
        btn_atras2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_atras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atras2ActionPerformed(evt);
            }
        });
        eventos.getContentPane().add(btn_atras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 140, 40));

        btn_sancionar.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btn_sancionar.setText("Sancionar");
        btn_sancionar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_sancionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sancionarActionPerformed(evt);
            }
        });
        eventos.getContentPane().add(btn_sancionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 140, 40));

        btn_emparejar.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btn_emparejar.setText("Emparejar");
        btn_emparejar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_emparejar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_emparejarActionPerformed(evt);
            }
        });
        eventos.getContentPane().add(btn_emparejar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 140, 40));

        btn_ganador.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btn_ganador.setText("Ganador");
        btn_ganador.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_ganador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ganadorActionPerformed(evt);
            }
        });
        eventos.getContentPane().add(btn_ganador, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 140, 40));

        lbl_iniciosesion.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_iniciosesion.setText("Seleccione un evento");
        eventos.getContentPane().add(lbl_iniciosesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 350, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración");
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 550));
        setSize(new java.awt.Dimension(1000, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descuento.setTitle("Descuento");
        descuento.setToolTipText("");
        descuento.setVisible(false);
        descuento.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eldescuentoes.setFont(jLabel15.getFont());
        eldescuentoes.setText("El descuento actual es de un");
        descuento.getContentPane().add(eldescuentoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 220, 20));

        descuentoAct.setFont(jLabel15.getFont());
        descuentoAct.setText(" 0");
        descuento.getContentPane().add(descuentoAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 20, -1));

        xcien.setFont(jLabel15.getFont());
        xcien.setText("%.");
        descuento.getContentPane().add(xcien, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        atras.setFont(btn_atras.getFont());
        atras.setText("Atrás");
        atras.setBorder(btn_atras.getBorder());
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        descuento.getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 100, 40));

        jButton1.setFont(atras.getFont());
        jButton1.setText("Actualizar");
        jButton1.setActionCommand("actualizarDescuento");
        jButton1.setBorder(atras.getBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        descuento.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 100, 40));

        jLabel1.setFont(jLabel15.getFont());
        jLabel1.setText("¿Desea actualizar el descuento?");
        descuento.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        getContentPane().add(descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 330, 250));

        btn_administrar.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btn_administrar.setText("Administrar");
        btn_administrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_administrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_administrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_administrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 110, 20));

        btn_atras.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btn_atras.setText("Atrás");
        btn_atras.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 140, 40));

        btn_modificar.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 90, 20));

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parcelas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 14))); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "DNI1", "DNI2", "DNI3", "DNI4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scroll_parcelas.setViewportView(jList1);

        getContentPane().add(scroll_parcelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 170, 210));

        jList3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eventos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 14))); // NOI18N
        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Piscina", "Fronton", "Club Social" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scroll_eventos.setViewportView(jList3);

        getContentPane().add(scroll_eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 170, 210));

        btn_descuento.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btn_descuento.setText("Descuento");
        btn_descuento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_descuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_descuentoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 110, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_administrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_administrarActionPerformed
        eventos.setSize(1000, 600);
        eventos.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btn_administrarActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        vistaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        parcelas.setSize(1000, 600);
        parcelas.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btn_modificarActionPerformed

    private void luzNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luzNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_luzNOActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        parcelas.setVisible(false);
        this.setVisible(true);

    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        parcelas.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_atras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras2ActionPerformed
        eventos.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btn_atras2ActionPerformed

    private void btn_sancionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sancionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_sancionarActionPerformed

    private void btn_emparejarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_emparejarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_emparejarActionPerformed

    private void btn_ganadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ganadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ganadorActionPerformed

    private void btn_descuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_descuentoActionPerformed
        descuento.setVisible(true);
    }//GEN-LAST:event_btn_descuentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        descuento.setVisible(false);
        descuentoAct.setText(JOptionPane.showInputDialog(null, "Introduce el descuento que quiere aplicar: ", "Descuento", JOptionPane.QUESTION_MESSAGE));
        if ("".equals(descuentoAct.getText()))
            descuentoAct.setText(" 0");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        descuento.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gerente(new JFrame()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_administrar;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_atras2;
    private javax.swing.JButton btn_descuento;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_emparejar;
    private javax.swing.JButton btn_ganador;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_sancionar;
    private javax.swing.JInternalFrame descuento;
    private javax.swing.JLabel descuentoAct;
    private javax.swing.JLabel eldescuentoes;
    private javax.swing.JFrame eventos;
    private datechooser.beans.DateChooserCombo fEntrada;
    private datechooser.beans.DateChooserCombo fSalida;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_datos;
    private javax.swing.JLabel lbl_datos_reserva;
    private javax.swing.JLabel lbl_detallestienda;
    private javax.swing.JLabel lbl_dni;
    private javax.swing.JLabel lbl_fechentrada;
    private javax.swing.JLabel lbl_iniciosesion;
    private javax.swing.JLabel lbl_luz;
    private javax.swing.JLabel lbl_mcuadrados;
    private javax.swing.JLabel lbl_nomape;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_numparcel;
    private javax.swing.JLabel lbl_salida;
    private javax.swing.JRadioButton luzNO;
    private javax.swing.JRadioButton luzSi;
    private javax.swing.JFrame parcelas;
    private javax.swing.JScrollPane scroll_eventos;
    private javax.swing.JScrollPane scroll_parcelas;
    private javax.swing.JLabel xcien;
    // End of variables declaration//GEN-END:variables
}
