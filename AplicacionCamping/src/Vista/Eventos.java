/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author alumno
 */
public class Eventos extends javax.swing.JFrame {

    /**
     * Creates new form Eventos
     */
    public Eventos() {
        
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Eventos Camping");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListadoEventos = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btn_reserva = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_atras2 = new javax.swing.JButton();
        lbl_iniciosesion = new javax.swing.JLabel();
        ReservaEventos = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        btn_reserva_evento = new javax.swing.JButton();
        btn_atras3 = new javax.swing.JButton();
        lbl_iniciosesion2 = new javax.swing.JLabel();
        CancelacionEventos = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        btn_cancelar_evento = new javax.swing.JButton();
        btn_atras4 = new javax.swing.JButton();
        lbl_iniciosesion1 = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_dni = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        btn_continuar = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();

        ListadoEventos.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ListadoEventos.setTitle("Listado De Eventos");
        ListadoEventos.setLocation(new java.awt.Point(265, 112));
        ListadoEventos.setMinimumSize(new java.awt.Dimension(1000, 600));
        ListadoEventos.setSize(new java.awt.Dimension(1000, 600));
        ListadoEventos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        ListadoEventos.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 260, 200));

        btn_reserva.setText("Reserva Eventos");
        btn_reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reservaActionPerformed(evt);
            }
        });
        ListadoEventos.getContentPane().add(btn_reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 160, 50));

        btn_cancelar.setText("Cancelar Eventos");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        ListadoEventos.getContentPane().add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 150, 50));

        btn_atras2.setText("Atrás");
        btn_atras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atras2ActionPerformed(evt);
            }
        });
        ListadoEventos.getContentPane().add(btn_atras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 150, 40));

        lbl_iniciosesion.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_iniciosesion.setText("Listado de eventos");
        ListadoEventos.getContentPane().add(lbl_iniciosesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 300, 40));

        ReservaEventos.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ReservaEventos.setTitle("Reserva De Eventos");
        ReservaEventos.setLocation(new java.awt.Point(265, 112));
        ReservaEventos.setMinimumSize(new java.awt.Dimension(1000, 600));
        ReservaEventos.setSize(new java.awt.Dimension(1000, 600));
        ReservaEventos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        ReservaEventos.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 340, 170));

        btn_reserva_evento.setText("Reservar Evento");
        ReservaEventos.getContentPane().add(btn_reserva_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 180, 50));

        btn_atras3.setText("Atrás");
        btn_atras3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atras3ActionPerformed(evt);
            }
        });
        ReservaEventos.getContentPane().add(btn_atras3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 180, 50));

        lbl_iniciosesion2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_iniciosesion2.setText("Eventos Disponibles");
        ReservaEventos.getContentPane().add(lbl_iniciosesion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 320, 50));

        CancelacionEventos.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        CancelacionEventos.setTitle("Cancelación De Eventos");
        CancelacionEventos.setLocation(new java.awt.Point(265, 112));
        CancelacionEventos.setMinimumSize(new java.awt.Dimension(1000, 600));
        CancelacionEventos.setSize(new java.awt.Dimension(1000, 600));
        CancelacionEventos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        CancelacionEventos.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 290, 190));

        btn_cancelar_evento.setText("Cancelar Evento");
        btn_cancelar_evento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_eventoActionPerformed(evt);
            }
        });
        CancelacionEventos.getContentPane().add(btn_cancelar_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 160, 40));

        btn_atras4.setText("Atrás");
        btn_atras4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atras4ActionPerformed(evt);
            }
        });
        CancelacionEventos.getContentPane().add(btn_atras4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 150, 40));

        lbl_iniciosesion1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_iniciosesion1.setText("Eventos reservados");
        CancelacionEventos.getContentPane().add(lbl_iniciosesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, 40));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eventos");
        setMinimumSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulo.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        lbl_titulo.setText("Eventos de Camping Party");
        getContentPane().add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 650, 70));

        lbl_dni.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_dni.setText("Introduce tu DNI:");
        getContentPane().add(lbl_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 160, 30));

        txt_dni.setFont(lbl_dni.getFont());
        txt_dni.setToolTipText("");
        txt_dni.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dniActionPerformed(evt);
            }
        });
        getContentPane().add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 150, 30));

        btn_continuar.setFont(lbl_dni.getFont());
        btn_continuar.setText("Continuar");
        btn_continuar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        btn_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_continuarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 260, 40));

        btn_atras.setFont(lbl_dni.getFont());
        btn_atras.setText("Atrás");
        btn_atras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 260, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dniActionPerformed

    }//GEN-LAST:event_txt_dniActionPerformed

    private void btn_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_continuarActionPerformed
        Eventos eventos = new Eventos();
        this.setVisible(false);
        eventos.ListadoEventos.setVisible(true);
    }//GEN-LAST:event_btn_continuarActionPerformed

    private void btn_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reservaActionPerformed
        Eventos eventos = new Eventos();
        this.ListadoEventos.setVisible(false);
        eventos.ReservaEventos.setVisible(true);
    }//GEN-LAST:event_btn_reservaActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        this.setVisible(false);
        Principal prin = new Principal();
        prin.setVisible(true);

    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_atras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras2ActionPerformed
        this.ListadoEventos.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btn_atras2ActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.ListadoEventos.setVisible(false);
        this.CancelacionEventos.setVisible(true);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_atras3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras3ActionPerformed
        this.ReservaEventos.setVisible(false);
        this.ListadoEventos.setVisible(true);
    }//GEN-LAST:event_btn_atras3ActionPerformed

    private void btn_atras4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras4ActionPerformed
        this.CancelacionEventos.setVisible(false);
        this.ListadoEventos.setVisible(true);
    }//GEN-LAST:event_btn_atras4ActionPerformed

    private void btn_cancelar_eventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_eventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelar_eventoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame CancelacionEventos;
    private javax.swing.JFrame ListadoEventos;
    private javax.swing.JFrame ReservaEventos;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_atras2;
    private javax.swing.JButton btn_atras3;
    private javax.swing.JButton btn_atras4;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cancelar_evento;
    private javax.swing.JButton btn_continuar;
    private javax.swing.JButton btn_reserva;
    private javax.swing.JButton btn_reserva_evento;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_dni;
    private javax.swing.JLabel lbl_iniciosesion;
    private javax.swing.JLabel lbl_iniciosesion1;
    private javax.swing.JLabel lbl_iniciosesion2;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTextField txt_dni;
    // End of variables declaration//GEN-END:variables
}
