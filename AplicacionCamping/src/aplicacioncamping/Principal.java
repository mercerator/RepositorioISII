/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncamping;

/**
 *
 * @author antho
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Principal() {
        
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Menú Principal");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_reserva = new javax.swing.JButton();
        btn_ini_sesion = new javax.swing.JButton();
        btn_eventos = new javax.swing.JButton();
        btn_sinreserva = new javax.swing.JButton();
        lbl_titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_reserva.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_reserva.setText("Reserva");
        btn_reserva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reservaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 250, 80));

        btn_ini_sesion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_ini_sesion.setText("Iniciar Sesión");
        btn_ini_sesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ini_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ini_sesionActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ini_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 140, 30));

        btn_eventos.setFont(btn_ini_sesion.getFont());
        btn_eventos.setText("Eventos Camping");
        btn_eventos.setBorder(btn_ini_sesion.getBorder());
        btn_eventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eventosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 200, 40));

        btn_sinreserva.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_sinreserva.setText("Sin Reserva");
        btn_sinreserva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_sinreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sinreservaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sinreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 270, 80));

        lbl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl_titulo.setText("Camping Party");
        getContentPane().add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 340, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sinreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sinreservaActionPerformed
        this.setVisible(false);
        SinReserva al = new SinReserva();
        al.setVisible(true);
    }//GEN-LAST:event_btn_sinreservaActionPerformed

    private void btn_eventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eventosActionPerformed
        this.setVisible(false);
        Eventos eventos = new Eventos();
        eventos.setVisible(true);
    }//GEN-LAST:event_btn_eventosActionPerformed

    private void btn_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reservaActionPerformed
        this.setVisible(false);
        Reserva res = new Reserva();
        res.setVisible(true);
    }//GEN-LAST:event_btn_reservaActionPerformed

    private void btn_ini_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ini_sesionActionPerformed
        this.setVisible(false);
        Login log = new Login();
        log.setVisible(true);
    }//GEN-LAST:event_btn_ini_sesionActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eventos;
    private javax.swing.JButton btn_ini_sesion;
    private javax.swing.JButton btn_reserva;
    private javax.swing.JButton btn_sinreserva;
    private javax.swing.JLabel lbl_titulo;
    // End of variables declaration//GEN-END:variables
}
