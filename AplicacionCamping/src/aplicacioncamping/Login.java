/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncamping;

import aplicacioncamping.controlador.GestoresCamping;

import aplicacioncamping.model.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Epic
 */
public class Login extends javax.swing.JFrame {

    protected Camping camping;
    protected GestoresCamping perCamping;

    /**
     * Creates new form Login
     */
    public Login() {

        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Inicio de Sesión");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_aceptar = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        txt_passwd = new javax.swing.JPasswordField();
        lbl_contraseña = new javax.swing.JLabel();
        txt_campo = new javax.swing.JTextField();
        lbl_usuario = new javax.swing.JLabel();
        lbl_iniciosesion = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Introduzca sus credenciales:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        btn_aceptar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_aceptar.setText("Aceptar");
        btn_aceptar.setBorder(btn_atras.getBorder());
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn_atras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_atras.setText("Atrás");
        btn_atras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        txt_passwd.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txt_passwd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_passwd.setOpaque(false);
        txt_passwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwdActionPerformed(evt);
            }
        });

        lbl_contraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_contraseña.setText("Contraseña:");

        txt_campo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txt_campo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_campo.setOpaque(false);
        txt_campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_campoActionPerformed(evt);
            }
        });

        lbl_usuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_usuario.setText("Usuario:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_contraseña)
                        .addGap(17, 17, 17)
                        .addComponent(txt_passwd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_usuario)
                        .addGap(16, 16, 16)
                        .addComponent(txt_campo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_usuario)
                    .addComponent(txt_campo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_contraseña)
                    .addComponent(txt_passwd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 660, 310));

        lbl_iniciosesion.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_iniciosesion.setText("Inicio de Sesión");
        getContentPane().add(lbl_iniciosesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 250, 30));

        lbl_titulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_titulo.setText("Camping Party");
        getContentPane().add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 530, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        this.setVisible(false);
        Principal pri = new Principal();
        pri.setVisible(true);
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void txt_campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_campoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_campoActionPerformed

    private void txt_passwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwdActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        String nombre = txt_campo.getText();
        String contrasenya = String.valueOf(txt_passwd.getPassword());

        if ((camping.usuario1.equals(nombre) || camping.usuario2.equals(nombre)
                || camping.usuario3.equals(nombre) || camping.usuario4.equals(nombre)
                )&& camping.contra.equals(contrasenya)) {
            Gerente ger = new Gerente(this);
            ger.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario Invalido. Vuelva a intentarlo");
        }

    }//GEN-LAST:event_btn_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_atras;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_contraseña;
    private javax.swing.JLabel lbl_iniciosesion;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JTextField txt_campo;
    private javax.swing.JPasswordField txt_passwd;
    // End of variables declaration//GEN-END:variables
}
