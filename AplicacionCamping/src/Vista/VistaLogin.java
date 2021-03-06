/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Cliente;
import Model.Camping;
import Controlador.GestoresCamping;
import Controlador.Gerente;
import Controlador.UsuarioNoRegistrado;
import Controlador.UsuarioRegistrado;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

import javax.swing.JOptionPane;

/**
 *
 * @author Epic
 */
public class VistaLogin extends javax.swing.JFrame {

    private JFrame vistaAnterior;
    protected Gerente gerente;
    protected GestoresCamping gestoresCamping;
    protected UsuarioNoRegistrado noRegistrado;
    protected UsuarioRegistrado ur;
    protected Camping camping;
    protected Cliente cliente;

    /**
     * Creates new form Login
     */
    public VistaLogin(GestoresCamping gestoresCamping, JFrame vistaAnterior) {
        super("Login");
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Inicio de Sesión");
        this.gestoresCamping = gestoresCamping;
        this.vistaAnterior = vistaAnterior;

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
        fondobotones = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        fondobotones1 = new javax.swing.JLabel();
        lbl_iniciosesion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Introduzca sus credenciales:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia Pro", 0, 18), new java.awt.Color(102, 0, 51))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_aceptar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_aceptar.setText("Aceptar");
        btn_aceptar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_aceptar.setContentAreaFilled(false);
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 140, 40));

        btn_atras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_atras.setText("Atrás");
        btn_atras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_atras.setContentAreaFilled(false);
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 140, 40));

        txt_passwd.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txt_passwd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_passwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwdActionPerformed(evt);
            }
        });
        jPanel1.add(txt_passwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 179, 200, 30));

        lbl_contraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_contraseña.setText("Contraseña:");
        jPanel1.add(lbl_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 179, -1, -1));

        txt_campo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txt_campo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_campoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 131, 200, 30));

        fondobotones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton.png"))); // NOI18N
        fondobotones.setText("jLabel2");
        jPanel1.add(fondobotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 140, 40));

        lbl_usuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_usuario.setText("Usuario:");
        jPanel1.add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 131, -1, -1));

        fondobotones1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton.png"))); // NOI18N
        fondobotones1.setText("jLabel2");
        jPanel1.add(fondobotones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 660, 310));

        lbl_iniciosesion.setFont(new java.awt.Font("Georgia Pro", 0, 36)); // NOI18N
        lbl_iniciosesion.setForeground(new java.awt.Color(102, 0, 0));
        lbl_iniciosesion.setText("Inicio de Sesión");
        getContentPane().add(lbl_iniciosesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/camping.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondocamping.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        this.setVisible(false);
        vistaAnterior.setVisible(true);
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

        UsuarioRegistrado usuario = gestoresCamping.login(nombre, contrasenya);

        if (usuario != null) {
            Class tipoUsuario = usuario.getClass();

            if (tipoUsuario == Gerente.class) {
                VistaGerente ger = new VistaGerente(this, (Gerente)usuario);
                ger.setVisible(true);
            }
            if (tipoUsuario == Cliente.class) {
                VistaCliente cli = new VistaCliente(this, (Cliente)usuario);
                cli.setVisible(true);
            }
            this.setVisible(false);
            txt_campo.setText("");
            txt_passwd.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Usuario Invalido. Vuelva a intentarlo");
        }
    }//GEN-LAST:event_btn_aceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_atras;
    private javax.swing.JLabel fondobotones;
    private javax.swing.JLabel fondobotones1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_contraseña;
    private javax.swing.JLabel lbl_iniciosesion;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JTextField txt_campo;
    private javax.swing.JPasswordField txt_passwd;
    // End of variables declaration//GEN-END:variables
}
