package Vista;

import Controlador.Gerente;
import Datos.DatosParcela;
import Datos.DatosReserva;
import Model.Parcela;
import Model.Reserva;
import java.util.Calendar;
import javax.swing.JFrame;

/**
 *
 * @author Epic
 */
public class VistaActualizarReserva extends javax.swing.JFrame {
    
    private Gerente gerente;
    private JFrame vistaAnterior;
    
    public VistaActualizarReserva(Gerente ger, JFrame vAnterior, Object reserva) {
        super("Actualizar Datos Parcela");
        gerente = ger;
        vistaAnterior = vAnterior;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        DatosReserva dr = ger.consultarDetallesReserva(reserva);
        nombreyApellidos.setText(dr.nombreApellidos);
        txt_dni.setText(dr.dni);
        tipoTienda.setText(dr.nombreTiendas);
        mTienda.setText(Integer.toString(dr.metrosTienda));
        
        if (dr.luz) {
            luzSi.setSelected(true);
            luzNO.setSelected(false);
        } else {
            luzNO.setSelected(true);
            luzSi.setSelected(false);
        }
        
        Calendar calEn = Calendar.getInstance();
        Calendar calSal = Calendar.getInstance();
        fEntrada.setSelectedDate(calEn);
        fSalida.setSelectedDate(calSal);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reciboPago = new javax.swing.JFrame();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        costeDescuento = new javax.swing.JLabel();
        nomCliente = new javax.swing.JLabel();
        dni = new javax.swing.JLabel();
        diasEstancia = new javax.swing.JLabel();
        numParcelas = new javax.swing.JLabel();
        luz = new javax.swing.JLabel();
        costeTotal = new javax.swing.JLabel();
        imprimir = new javax.swing.JButton();
        lbl_numparcel = new javax.swing.JLabel();
        fEntrada = new datechooser.beans.DateChooserCombo();
        fSalida = new datechooser.beans.DateChooserCombo();
        btn_salir = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        btn_pago = new javax.swing.JButton();
        lbl_nomape = new javax.swing.JLabel();
        nombreyApellidos = new javax.swing.JTextField();
        lbl_dni = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        lbl_mcuadrados = new javax.swing.JLabel();
        mTienda = new javax.swing.JTextField();
        lbl_fSalida = new javax.swing.JLabel();
        tipoTienda = new javax.swing.JTextField();
        luzSi = new javax.swing.JRadioButton();
        luzNO = new javax.swing.JRadioButton();
        lbl_datosReserva = new javax.swing.JLabel();
        lbl_detallestienda = new javax.swing.JLabel();
        lbl_luzparcela = new javax.swing.JLabel();
        lbl_cliente = new javax.swing.JLabel();
        lbl_nomTienda = new javax.swing.JLabel();
        lbl_fEntrada = new javax.swing.JLabel();

        reciboPago.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        reciboPago.setLocation(new java.awt.Point(265, 112));
        reciboPago.setMinimumSize(new java.awt.Dimension(1000, 600));
        reciboPago.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setText("Nombre del Cliente:");
        reciboPago.getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 110, 30));

        label2.setText("Coste aplicando el descuento:");
        reciboPago.getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, 30));

        label3.setText("DNI:");
        reciboPago.getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 30, 30));

        label4.setText("Numero de parcelas reservadas:");
        reciboPago.getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 190, 30));

        label5.setText("Con luz");
        reciboPago.getContentPane().add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 50, 30));

        label6.setText("Dias totales de la estancia:");
        reciboPago.getContentPane().add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, 30));

        label7.setText("Coste total:");
        reciboPago.getContentPane().add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, 30));
        reciboPago.getContentPane().add(costeDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 230, 30));
        reciboPago.getContentPane().add(nomCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 140, 30));
        reciboPago.getContentPane().add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 140, 30));
        reciboPago.getContentPane().add(diasEstancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 140, 30));
        reciboPago.getContentPane().add(numParcelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 140, 30));
        reciboPago.getContentPane().add(luz, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 140, 30));
        reciboPago.getContentPane().add(costeTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 140, 30));

        imprimir.setText("Imprimir");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });
        reciboPago.getContentPane().add(imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 200, 50));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_numparcel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_numparcel.setText("Nº de parcelas:");

        btn_salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_guardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("4");

        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_eliminar.setText("Eliminar estancia");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_pago.setText("Realizar pago");
        btn_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagoActionPerformed(evt);
            }
        });

        lbl_nomape.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_nomape.setText("Nombre y Apellidos:");

        nombreyApellidos.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        nombreyApellidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreyApellidos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nombreyApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreyApellidosActionPerformed(evt);
            }
        });

        lbl_dni.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_dni.setText("DNI:");

        txt_dni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_dni.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_mcuadrados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_mcuadrados.setText("Metros cuadrados:");

        mTienda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mTienda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTiendaActionPerformed(evt);
            }
        });

        lbl_fSalida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_fSalida.setText("Fecha de Salida:");

        tipoTienda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tipoTienda.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        luzSi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        luzSi.setText("Si");
        luzSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luzSiActionPerformed(evt);
            }
        });

        luzNO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        luzNO.setText("No");
        luzNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luzNOActionPerformed(evt);
            }
        });

        lbl_datosReserva.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_datosReserva.setText("Datos de la reserva:");

        lbl_detallestienda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_detallestienda.setText("Detalles de la tienda de campaña:");

        lbl_luzparcela.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_luzparcela.setText("Servicio de luz en parcela:");

        lbl_cliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_cliente.setText("Datos del cliente:");

        lbl_nomTienda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_nomTienda.setText("Nombre:");

        lbl_fEntrada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_fEntrada.setText("Fecha de Entrada:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(lbl_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(190, 190, 190)
                            .addComponent(lbl_datosReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_nomape, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(nombreyApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(120, 120, 120)
                            .addComponent(lbl_numparcel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(lbl_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(120, 120, 120)
                            .addComponent(lbl_fEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(fEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(470, 470, 470)
                            .addComponent(lbl_fSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(fSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lbl_detallestienda, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(lbl_nomTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(tipoTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(lbl_mcuadrados, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(mTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_luzparcela, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(luzSi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60)
                                    .addComponent(luzNO, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(220, 220, 220)
                            .addComponent(btn_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(560, 560, 560)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_datosReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_nomape, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombreyApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_numparcel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_fEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_fSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addComponent(lbl_detallestienda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_nomTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tipoTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_mcuadrados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_luzparcela, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(luzSi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(luzNO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(btn_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
        VistaGerente vg = new VistaGerente(this, gerente);
        vg.setVisible(true);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        this.dispose();
        VistaGerente vg = new VistaGerente(this, gerente);
        vg.setVisible(true);
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagoActionPerformed
        this.setVisible(false);
        this.reciboPago.setVisible(true);
        
        this.nomCliente.setText("Luis Fernando");
        this.costeDescuento.setText("170.00 € (Con un descuento del 15%)");
        this.costeTotal.setText("200.00");
        this.dni.setText("23960564L");
        this.numParcelas.setText("5");
        this.diasEstancia.setText("3");
        this.luz.setText("Si");
    }//GEN-LAST:event_btn_pagoActionPerformed

    private void mTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mTiendaActionPerformed

    private void luzSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luzSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_luzSiActionPerformed

    private void luzNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luzNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_luzNOActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        this.reciboPago.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_imprimirActionPerformed

    private void nombreyApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreyApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreyApellidosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_pago;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel costeDescuento;
    private javax.swing.JLabel costeTotal;
    private javax.swing.JLabel diasEstancia;
    private javax.swing.JLabel dni;
    private datechooser.beans.DateChooserCombo fEntrada;
    private datechooser.beans.DateChooserCombo fSalida;
    private javax.swing.JButton imprimir;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel lbl_cliente;
    private javax.swing.JLabel lbl_datosReserva;
    private javax.swing.JLabel lbl_detallestienda;
    private javax.swing.JLabel lbl_dni;
    private javax.swing.JLabel lbl_fEntrada;
    private javax.swing.JLabel lbl_fSalida;
    private javax.swing.JLabel lbl_luzparcela;
    private javax.swing.JLabel lbl_mcuadrados;
    private javax.swing.JLabel lbl_nomTienda;
    private javax.swing.JLabel lbl_nomape;
    private javax.swing.JLabel lbl_numparcel;
    private javax.swing.JLabel luz;
    private javax.swing.JRadioButton luzNO;
    private javax.swing.JRadioButton luzSi;
    private javax.swing.JTextField mTienda;
    private javax.swing.JLabel nomCliente;
    private javax.swing.JTextField nombreyApellidos;
    private javax.swing.JLabel numParcelas;
    private javax.swing.JFrame reciboPago;
    private javax.swing.JTextField tipoTienda;
    private javax.swing.JTextField txt_dni;
    // End of variables declaration//GEN-END:variables
}
