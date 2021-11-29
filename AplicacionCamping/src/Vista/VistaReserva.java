/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Cliente;
import Controlador.UsuarioNoRegistrado;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Jacques
 */
public class VistaReserva extends javax.swing.JFrame {

    /**
     * Creates new form Reserva
     */
    private Cliente cliente = null;
    private UsuarioNoRegistrado noRegistrado;
    private JFrame vistaAnterior;

    private ArrayList<Object> parcelasSeleccionadas = new ArrayList();
    private ArrayList<String> nombresTiendas = new ArrayList<String>();
    private ArrayList<Integer> metrosTiendas = new ArrayList<Integer>();
    private ArrayList luzParcelas = new ArrayList();

    /*
    private ArrayList parcelasSeleccionadas = new ArrayList();
    private ArrayList<String> nombresTiendas = new ArrayList<String>();
    private ArrayList<Integer> metrosTiendas = new ArrayList<Integer>();
     */
    private boolean reserva;
    protected double pre;
    DefaultListModel lParcelas;

    public VistaReserva(boolean reserva, UsuarioNoRegistrado noRegistrado, JFrame vAnterior) {
        super("Reservas");
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Reservas");
        this.reserva = reserva;
        this.noRegistrado = noRegistrado;
        this.vistaAnterior = vAnterior;

        lParcelas = new DefaultListModel();
        listaParcelas.setModel(lParcelas);

        //Seleccion del radioButton de la 
        grupo_botones_luz.add(luzSi);
        grupo_botones_luz.add(luzNO);
        fEntrada.enable(reserva);
        btn_finalizar.setVisible(false);
        fondobotones7.setVisible(false);

        // Comprobamos que parcelas hay asignadas y desactivamos los botones correspondientes
        // para que el usuario no pueda seleccionarlas.
        ArrayList parcelasAsignadas = this.noRegistrado.parcelasAsignadas();
        Enumeration botones = grupo_botonesParcela.getElements();
        JRadioButton boton = new JRadioButton();
        while (botones.hasMoreElements()){
            boton = (JRadioButton)botones.nextElement();
            for(int i = 0; i < parcelasAsignadas.size() ; i++){
                if((int)parcelasAsignadas.get(i) == Integer.parseInt(boton.getText()))
                    boton.setEnabled(false);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        dateChooserDialog2 = new datechooser.beans.DateChooserDialog();
        grupo_botones_luz = new javax.swing.ButtonGroup();
        mapaParcelas = new javax.swing.JFrame();
        btn_cancelarMapa = new javax.swing.JButton();
        fondobotones10 = new javax.swing.JLabel();
        btn_guardarParcela = new javax.swing.JButton();
        fondobotones9 = new javax.swing.JLabel();
        p37 = new javax.swing.JRadioButton();
        p36 = new javax.swing.JRadioButton();
        p35 = new javax.swing.JRadioButton();
        p34 = new javax.swing.JRadioButton();
        p33 = new javax.swing.JRadioButton();
        p32 = new javax.swing.JRadioButton();
        p31 = new javax.swing.JRadioButton();
        p30 = new javax.swing.JRadioButton();
        p29 = new javax.swing.JRadioButton();
        p28 = new javax.swing.JRadioButton();
        p27 = new javax.swing.JRadioButton();
        p26 = new javax.swing.JRadioButton();
        p25 = new javax.swing.JRadioButton();
        p24 = new javax.swing.JRadioButton();
        p23 = new javax.swing.JRadioButton();
        p22 = new javax.swing.JRadioButton();
        p21 = new javax.swing.JRadioButton();
        p20 = new javax.swing.JRadioButton();
        p19 = new javax.swing.JRadioButton();
        p18 = new javax.swing.JRadioButton();
        p17 = new javax.swing.JRadioButton();
        p16 = new javax.swing.JRadioButton();
        p15 = new javax.swing.JRadioButton();
        p14 = new javax.swing.JRadioButton();
        p13 = new javax.swing.JRadioButton();
        p12 = new javax.swing.JRadioButton();
        p11 = new javax.swing.JRadioButton();
        p10 = new javax.swing.JRadioButton();
        p9 = new javax.swing.JRadioButton();
        p8 = new javax.swing.JRadioButton();
        p7 = new javax.swing.JRadioButton();
        p6 = new javax.swing.JRadioButton();
        p5 = new javax.swing.JRadioButton();
        p4 = new javax.swing.JRadioButton();
        p3 = new javax.swing.JRadioButton();
        p2 = new javax.swing.JRadioButton();
        p1 = new javax.swing.JRadioButton();
        lbl_mcuadrados = new javax.swing.JLabel();
        mTienda = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        tipoTienda = new javax.swing.JTextField();
        luzSi = new javax.swing.JRadioButton();
        luzNO = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        lbl_luzparcela = new javax.swing.JLabel();
        mapa = new javax.swing.JLabel();
        fondoVerde = new javax.swing.JLabel();
        fondoVerde1 = new javax.swing.JLabel();
        fondoVerde2 = new javax.swing.JLabel();
        grupo_botonesParcela = new javax.swing.ButtonGroup();
        lbl_nomape = new javax.swing.JLabel();
        nombreyApellidos = new javax.swing.JTextField();
        lbl_dni = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        lbl_fechentrada = new javax.swing.JLabel();
        fEntrada = new datechooser.beans.DateChooserCombo();
        fSalida = new datechooser.beans.DateChooserCombo();
        datoscliente = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        fondobotones8 = new javax.swing.JLabel();
        btn_finalizar = new javax.swing.JButton();
        fondobotones7 = new javax.swing.JLabel();
        lbl_fechasalida = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaParcelas = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        btn_seleccParcelas = new javax.swing.JButton();
        fondobotones6 = new javax.swing.JLabel();
        lbl_tel = new javax.swing.JLabel();
        txt_tel = new javax.swing.JTextField();
        lbl_correo = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        txt_cp = new javax.swing.JTextField();
        lbl_cp = new javax.swing.JLabel();
        lbl_contra = new javax.swing.JLabel();
        txt_contra = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        dateChooserDialog1.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 6));

        mapaParcelas.setMinimumSize(new java.awt.Dimension(1000, 600));
        mapaParcelas.setSize(new java.awt.Dimension(1000, 600));
        mapaParcelas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cancelarMapa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_cancelarMapa.setText("Cancelar");
        btn_cancelarMapa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_cancelarMapa.setContentAreaFilled(false);
        btn_cancelarMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarMapaActionPerformed(evt);
            }
        });
        mapaParcelas.getContentPane().add(btn_cancelarMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 200, 40));

        fondobotones10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/blancoroto.jpg"))); // NOI18N
        fondobotones10.setText("jLabel2");
        mapaParcelas.getContentPane().add(fondobotones10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 200, 40));

        btn_guardarParcela.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_guardarParcela.setText("Guardar Parcela");
        btn_guardarParcela.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_guardarParcela.setContentAreaFilled(false);
        btn_guardarParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarParcelaActionPerformed(evt);
            }
        });
        mapaParcelas.getContentPane().add(btn_guardarParcela, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 200, 40));

        fondobotones9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/blancoroto.jpg"))); // NOI18N
        fondobotones9.setText("jLabel2");
        mapaParcelas.getContentPane().add(fondobotones9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 200, 40));

        grupo_botonesParcela.add(p37);
        p37.setText("37");
        mapaParcelas.getContentPane().add(p37, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 20, -1));

        grupo_botonesParcela.add(p36);
        p36.setText("36");
        mapaParcelas.getContentPane().add(p36, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 20, -1));

        grupo_botonesParcela.add(p35);
        p35.setText("35");
        mapaParcelas.getContentPane().add(p35, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 20, -1));

        grupo_botonesParcela.add(p34);
        p34.setText("34");
        mapaParcelas.getContentPane().add(p34, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 20, -1));

        grupo_botonesParcela.add(p33);
        p33.setText("33");
        mapaParcelas.getContentPane().add(p33, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 20, -1));

        grupo_botonesParcela.add(p32);
        p32.setText("32");
        mapaParcelas.getContentPane().add(p32, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 20, -1));

        grupo_botonesParcela.add(p31);
        p31.setText("31");
        p31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p31ActionPerformed(evt);
            }
        });
        mapaParcelas.getContentPane().add(p31, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 20, -1));

        grupo_botonesParcela.add(p30);
        p30.setText("30");
        mapaParcelas.getContentPane().add(p30, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 20, -1));

        grupo_botonesParcela.add(p29);
        p29.setText("29");
        mapaParcelas.getContentPane().add(p29, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 20, -1));

        grupo_botonesParcela.add(p28);
        p28.setText("28");
        mapaParcelas.getContentPane().add(p28, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 20, -1));

        grupo_botonesParcela.add(p27);
        p27.setText("27");
        mapaParcelas.getContentPane().add(p27, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 20, -1));

        grupo_botonesParcela.add(p26);
        p26.setText("26");
        p26.setName(""); // NOI18N
        mapaParcelas.getContentPane().add(p26, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 20, -1));

        grupo_botonesParcela.add(p25);
        p25.setText("25");
        mapaParcelas.getContentPane().add(p25, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 20, -1));

        grupo_botonesParcela.add(p24);
        p24.setText("24");
        mapaParcelas.getContentPane().add(p24, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 20, -1));

        grupo_botonesParcela.add(p23);
        p23.setText("23");
        p23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p23ActionPerformed(evt);
            }
        });
        mapaParcelas.getContentPane().add(p23, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 20, -1));

        grupo_botonesParcela.add(p22);
        p22.setText("22");
        mapaParcelas.getContentPane().add(p22, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 20, -1));

        grupo_botonesParcela.add(p21);
        p21.setText("21");
        mapaParcelas.getContentPane().add(p21, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 20, -1));

        grupo_botonesParcela.add(p20);
        p20.setText("20");
        mapaParcelas.getContentPane().add(p20, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 20, -1));

        grupo_botonesParcela.add(p19);
        p19.setText("19");
        mapaParcelas.getContentPane().add(p19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 20, -1));

        grupo_botonesParcela.add(p18);
        p18.setText("18");
        p18.setName("5"); // NOI18N
        mapaParcelas.getContentPane().add(p18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 20, -1));

        grupo_botonesParcela.add(p17);
        p17.setText("17");
        p17.setName("2"); // NOI18N
        mapaParcelas.getContentPane().add(p17, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, 20, -1));

        grupo_botonesParcela.add(p16);
        p16.setText("16");
        p16.setName("4"); // NOI18N
        mapaParcelas.getContentPane().add(p16, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, 20, -1));

        grupo_botonesParcela.add(p15);
        p15.setText("15");
        p15.setName("1"); // NOI18N
        mapaParcelas.getContentPane().add(p15, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 20, -1));

        grupo_botonesParcela.add(p14);
        p14.setText("14");
        p14.setName("3"); // NOI18N
        mapaParcelas.getContentPane().add(p14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 20, -1));

        grupo_botonesParcela.add(p13);
        p13.setText("13");
        p13.setName("0"); // NOI18N
        mapaParcelas.getContentPane().add(p13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 20, -1));

        grupo_botonesParcela.add(p12);
        p12.setText("12");
        mapaParcelas.getContentPane().add(p12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 20, -1));

        grupo_botonesParcela.add(p11);
        p11.setText("11");
        mapaParcelas.getContentPane().add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 20, -1));

        grupo_botonesParcela.add(p10);
        p10.setText("10");
        mapaParcelas.getContentPane().add(p10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 20, -1));

        grupo_botonesParcela.add(p9);
        p9.setText("9");
        mapaParcelas.getContentPane().add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 20, -1));

        grupo_botonesParcela.add(p8);
        p8.setText("8");
        mapaParcelas.getContentPane().add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 20, -1));

        grupo_botonesParcela.add(p7);
        p7.setText("7");
        mapaParcelas.getContentPane().add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 20, -1));

        grupo_botonesParcela.add(p6);
        p6.setText("6");
        p6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6ActionPerformed(evt);
            }
        });
        mapaParcelas.getContentPane().add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 20, -1));

        grupo_botonesParcela.add(p5);
        p5.setText("5");
        mapaParcelas.getContentPane().add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 20, -1));

        grupo_botonesParcela.add(p4);
        p4.setText("4");
        mapaParcelas.getContentPane().add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 20, -1));

        grupo_botonesParcela.add(p3);
        p3.setText("3");
        mapaParcelas.getContentPane().add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 20, -1));

        grupo_botonesParcela.add(p2);
        p2.setText("2");
        p2.setName(""); // NOI18N
        mapaParcelas.getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 20, -1));

        grupo_botonesParcela.add(p1);
        p1.setText("1");
        p1.setName(""); // NOI18N
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        mapaParcelas.getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 20, -1));

        lbl_mcuadrados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_mcuadrados.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mcuadrados.setText("Metros cuadrados:");
        mapaParcelas.getContentPane().add(lbl_mcuadrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 30));

        mTienda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTiendaActionPerformed(evt);
            }
        });
        mapaParcelas.getContentPane().add(mTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 90, 30));

        lbl_nombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombre.setText("Nombre:");
        mapaParcelas.getContentPane().add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 80, 30));

        tipoTienda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mapaParcelas.getContentPane().add(tipoTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 90, 30));

        grupo_botones_luz.add(luzSi);
        luzSi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        luzSi.setForeground(new java.awt.Color(255, 255, 255));
        luzSi.setText("Si");
        luzSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luzSiActionPerformed(evt);
            }
        });
        mapaParcelas.getContentPane().add(luzSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 80, 30));

        grupo_botones_luz.add(luzNO);
        luzNO.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        luzNO.setForeground(new java.awt.Color(255, 255, 255));
        luzNO.setText("No");
        luzNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luzNOActionPerformed(evt);
            }
        });
        mapaParcelas.getContentPane().add(luzNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 90, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Introduzca los detalles de su tienda de campaña:");
        mapaParcelas.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 420, 40));

        lbl_luzparcela.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_luzparcela.setForeground(new java.awt.Color(255, 255, 255));
        lbl_luzparcela.setText("¿Desea contar con servicio de luz en su parcela ?");
        mapaParcelas.getContentPane().add(lbl_luzparcela, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 410, 30));

        mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mapa.png"))); // NOI18N
        mapa.setOpaque(true);
        mapaParcelas.getContentPane().add(mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        fondoVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondoverde.png"))); // NOI18N
        mapaParcelas.getContentPane().add(fondoVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 70, -1, -1));

        fondoVerde1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondoverde.png"))); // NOI18N
        mapaParcelas.getContentPane().add(fondoVerde1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        fondoVerde2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondoverde.png"))); // NOI18N
        mapaParcelas.getContentPane().add(fondoVerde2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nomape.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_nomape.setText("Nombre y Apellidos:");
        getContentPane().add(lbl_nomape, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 170, 30));

        nombreyApellidos.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        nombreyApellidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreyApellidos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(nombreyApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 180, 30));

        lbl_dni.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_dni.setText("DNI:");
        getContentPane().add(lbl_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 50, 30));

        txt_dni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_dni.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 180, 30));

        lbl_fechentrada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_fechentrada.setText("Fecha de entrada:");
        getContentPane().add(lbl_fechentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 150, 40));

        fEntrada.setCalendarPreferredSize(new java.awt.Dimension(317, 321));
        getContentPane().add(fEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 190, 40));
        getContentPane().add(fSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 190, 40));

        datoscliente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        datoscliente.setText("Introduzca sus datos:");
        getContentPane().add(datoscliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 260, 40));

        btn_cancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        btn_cancelar.setContentAreaFilled(false);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 140, 40));

        fondobotones8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/blancoroto.jpg"))); // NOI18N
        fondobotones8.setText("jLabel2");
        getContentPane().add(fondobotones8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 140, 40));

        btn_finalizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_finalizar.setText("Finalizar");
        btn_finalizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_finalizar.setContentAreaFilled(false);
        btn_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 140, 40));

        fondobotones7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/blancoroto.jpg"))); // NOI18N
        fondobotones7.setText("jLabel2");
        getContentPane().add(fondobotones7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 140, 40));

        lbl_fechasalida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_fechasalida.setText("Fecha de salida:");
        getContentPane().add(lbl_fechasalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 140, 40));

        listaParcelas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mis parcelas reservadas:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        listaParcelas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listaParcelas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listaParcelas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 360, 150));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 410, 20));

        btn_seleccParcelas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_seleccParcelas.setText("Seleccionar Parcela");
        btn_seleccParcelas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_seleccParcelas.setContentAreaFilled(false);
        btn_seleccParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccParcelasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_seleccParcelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 200, 40));

        fondobotones6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/blancoroto.jpg"))); // NOI18N
        fondobotones6.setText("jLabel2");
        getContentPane().add(fondobotones6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 200, 40));

        lbl_tel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_tel.setText("Telefono: ");
        getContentPane().add(lbl_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 100, 30));

        txt_tel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_tel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telActionPerformed(evt);
            }
        });
        getContentPane().add(txt_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 180, 30));

        lbl_correo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_correo.setText("Correo: ");
        getContentPane().add(lbl_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 100, 30));

        txt_correo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_correo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 180, 30));

        txt_cp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_cp.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cpActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 180, 30));

        lbl_cp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_cp.setText("Codigo Postal: ");
        getContentPane().add(lbl_cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 140, 30));

        lbl_contra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_contra.setText("Contraseña: ");
        getContentPane().add(lbl_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 140, 30));

        txt_contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraActionPerformed(evt);
            }
        });
        getContentPane().add(txt_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 180, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondoazulconcamping.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void luzNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luzNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_luzNOActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.setVisible(false);
        vistaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalizarActionPerformed
        try {
            // Damos de alta el cliente en caso de que no este dado de alta
            if (this.cliente == null) {
                cliente = noRegistrado.altaCliente(txt_dni.getText(), String.valueOf(txt_contra.getPassword()), 
                        nombreyApellidos.getText(), txt_tel.getText(), txt_correo.getText(), txt_cp.getText());
            }
            
            // Nos guardamos las fechas de entrada y salida del cliente
            Date fechaIni = fEntrada.getSelectedDate().getTime();
            Date fechaFin = fSalida.getSelectedDate().getTime();
            
            // Hacemos la reserva
            cliente.realizarReserva(nombresTiendas, metrosTiendas, luzParcelas, parcelasSeleccionadas, fechaIni, fechaFin);
            
            this.setVisible(false);
            vistaAnterior.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en alguno de los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_finalizarActionPerformed

    private void mTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mTiendaActionPerformed

    private void luzSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luzSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_luzSiActionPerformed

    private void btn_seleccParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccParcelasActionPerformed
        this.setVisible(false);
        mapaParcelas.setVisible(true);
    }//GEN-LAST:event_btn_seleccParcelasActionPerformed

    private void btn_cancelarMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarMapaActionPerformed
        this.setVisible(true);
        mapaParcelas.setVisible(false);
        tipoTienda.setText("");
        mTienda.setText("");
        grupo_botonesParcela.clearSelection();
        grupo_botones_luz.clearSelection();
    }//GEN-LAST:event_btn_cancelarMapaActionPerformed

    public void parcelas() {
        String par = " ";
        //Parcelas pequeñas
        if (p1.isSelected()) {
            par += "Parcela 1";
            p1.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p1);
        }
        if (p2.isSelected()) {
            par += "Parcela 2";
            p2.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p2);
        }
        if (p3.isSelected()) {
            par += "Parcela 3";
            p3.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p3);
        }
        if (p4.isSelected()) {
            par += "Parcela 4";
            p4.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p4);
        }
        if (p5.isSelected()) {
            par += "Parcela 5";
            p5.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p5);
        }
        if (p6.isSelected()) {
            par += "Parcela 6";
            p6.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p6);
        }
        if (p7.isSelected()) {
            par += "Parcela 7";
            p7.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p7);
        }
        if (p8.isSelected()) {
            par += "Parcela 8";
            p8.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p8);
        }
        if (p9.isSelected()) {
            par += "Parcela 9";
            p9.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p9);
        }
        //Parcelas pequeñas/medianas
        if (p10.isSelected()) {
            par += "Parcela 10";
            p10.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p10);
        }
        if (p11.isSelected()) {
            par += "Parcela 11";
            p11.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p11);
        }
        if (p12.isSelected()) {
            par += "Parcela 12";
            p12.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p12);
        }
        if (p13.isSelected()) {
            par += "Parcela 13";
            p13.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p13);
        }

        if (p14.isSelected()) {
            par += "Parcela 14";
            p14.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p14);
        }
        if (p15.isSelected()) {
            par += "Parcela 15";
            p15.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p15);
        }
        if (p16.isSelected()) {
            par += "Parcela 16";
            p16.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p16);
        }
        if (p17.isSelected()) {
            par += "Parcela 17";
            p17.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p17);
        }
        //Parcelas medianas
        if (p18.isSelected()) {
            par += "Parcela 18";
            p18.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p18);
        }
        if (p19.isSelected()) {
            par += "Parcela 19";
            p19.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p19);
        }
        if (p20.isSelected()) {
            par += "Parcela 20";
            p20.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p20);
        }
        if (p21.isSelected()) {
            par += "Parcela 21";
            p21.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p21);
        }

        if (p22.isSelected()) {
            par += "Parcela 22";
            p22.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p22);
        }
        if (p23.isSelected()) {
            par += "Parcela 23";
            p23.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p23);
        }
        if (p24.isSelected()) {
            par += "Parcela 24";
            p24.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p24);
        }
        if (p25.isSelected()) {
            par += "Parcela 25";
            p25.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p25);
        }

        if (p26.isSelected()) {
            par += "Parcela 26";
            p26.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p26);
        }
        if (p27.isSelected()) {
            par += "Parcela 27";
            p27.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p27);
        }
        if (p28.isSelected()) {
            par += "Parcela 28";
            p28.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p28);
        }
        //Parcelas grandes
        if (p29.isSelected()) {
            par += "Parcela 29";
            p29.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p29);
        }

        if (p30.isSelected()) {
            par += "Parcela 30";
            p30.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p30);
        }

        if (p31.isSelected()) {
            par += "Parcela 31";
            p31.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p31);
        }
        if (p32.isSelected()) {
            par += "Parcela 32";
            p32.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p32);
        }
        if (p33.isSelected()) {
            par += "Parcela 33";
            p33.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p33);
        }
        if (p34.isSelected()) {
            par += "Parcela 34";
            p34.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p34);
        }

        if (p35.isSelected()) {
            par += "Parcela 35";
            p35.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p35);
        }
        if (p36.isSelected()) {
            par += "Parcela 36";
            p36.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p36);
        }

        if (p37.isSelected()) {
            par += "Parcela 37";
            p37.setText(par);
            lParcelas.addElement(par);
            parcelasSeleccionadas.add(p37);
        }

    }
    private void btn_guardarParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarParcelaActionPerformed
        try{

            boolean encontrado = false;
            Enumeration botones = grupo_botonesParcela.getElements();
            JRadioButton botonSeleccionado = new JRadioButton();
            while (botones.hasMoreElements() && !encontrado){
                botonSeleccionado = (JRadioButton)botones.nextElement();
                if(botonSeleccionado.isSelected()){
                    encontrado = true;
                }
            }
            Object parcela = noRegistrado.devolverParcela(Integer.parseInt(botonSeleccionado.getText()));
            if(noRegistrado.tamanyoCorrecto(parcela, Integer.parseInt(mTienda.getText()))){
                // Guardamos la parcela en un arraylist de parcelas seleccionadas
                parcelasSeleccionadas.add(parcela);
                lParcelas.addElement(parcela);
                listaParcelas.updateUI();
                
                // Guardamos los datos de la tienda de campaña seleccionada
                nombresTiendas.add(tipoTienda.getText());
                metrosTiendas.add(Integer.parseInt(mTienda.getText()));
                
                //Comprobamos si quiere luz en esa parcela o no
                if (luzSi.isSelected()) {
                    luzParcelas.add(true);
                }else{
                    luzParcelas.add(false);
                }
                
                // Dejamos la vista en un estado para que se pueda seleccionar otra parcela
                // Borramos el contenido de los text field
                tipoTienda.setText("");
                mTienda.setText("");
                
                // Hacemos que no se pueda volver a seleccionar la tienda actual y
                // quitamos la seleccion de todos los grupos de botones
                botonSeleccionado.setEnabled(false);
                grupo_botonesParcela.clearSelection();
                grupo_botones_luz.clearSelection();
                
                // Ocultamos la ventana para seleccionar parcelas
                this.setVisible(true);
                mapaParcelas.setVisible(false);
                btn_finalizar.setVisible(true);  
                fondobotones7.setVisible(true);
            } else{
                JOptionPane.showMessageDialog(this, "El tamanyo de la tienda es mayor al de la parcela seleccionada.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
                 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en alguno de los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btn_guardarParcelaActionPerformed

    private void p31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p31ActionPerformed

    }//GEN-LAST:event_p31ActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed

    }//GEN-LAST:event_p1ActionPerformed

    private void p6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6ActionPerformed

    }//GEN-LAST:event_p6ActionPerformed

    private void p23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p23ActionPerformed

    private void txt_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telActionPerformed

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoActionPerformed

    private void txt_cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cpActionPerformed

    private void txt_contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cancelarMapa;
    private javax.swing.JButton btn_finalizar;
    private javax.swing.JButton btn_guardarParcela;
    private javax.swing.JButton btn_seleccParcelas;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private datechooser.beans.DateChooserDialog dateChooserDialog2;
    private javax.swing.JLabel datoscliente;
    private datechooser.beans.DateChooserCombo fEntrada;
    private datechooser.beans.DateChooserCombo fSalida;
    private javax.swing.JLabel fondoVerde;
    private javax.swing.JLabel fondoVerde1;
    private javax.swing.JLabel fondoVerde2;
    private javax.swing.JLabel fondobotones10;
    private javax.swing.JLabel fondobotones6;
    private javax.swing.JLabel fondobotones7;
    private javax.swing.JLabel fondobotones8;
    private javax.swing.JLabel fondobotones9;
    private javax.swing.ButtonGroup grupo_botonesParcela;
    private javax.swing.ButtonGroup grupo_botones_luz;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_contra;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_cp;
    private javax.swing.JLabel lbl_dni;
    private javax.swing.JLabel lbl_fechasalida;
    private javax.swing.JLabel lbl_fechentrada;
    private javax.swing.JLabel lbl_luzparcela;
    private javax.swing.JLabel lbl_mcuadrados;
    private javax.swing.JLabel lbl_nomape;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_tel;
    private javax.swing.JList<Object> listaParcelas;
    private javax.swing.JRadioButton luzNO;
    private javax.swing.JRadioButton luzSi;
    private javax.swing.JTextField mTienda;
    private javax.swing.JLabel mapa;
    private javax.swing.JFrame mapaParcelas;
    private javax.swing.JTextField nombreyApellidos;
    private javax.swing.JRadioButton p1;
    private javax.swing.JRadioButton p10;
    private javax.swing.JRadioButton p11;
    private javax.swing.JRadioButton p12;
    private javax.swing.JRadioButton p13;
    private javax.swing.JRadioButton p14;
    private javax.swing.JRadioButton p15;
    private javax.swing.JRadioButton p16;
    private javax.swing.JRadioButton p17;
    private javax.swing.JRadioButton p18;
    private javax.swing.JRadioButton p19;
    private javax.swing.JRadioButton p2;
    private javax.swing.JRadioButton p20;
    private javax.swing.JRadioButton p21;
    private javax.swing.JRadioButton p22;
    private javax.swing.JRadioButton p23;
    private javax.swing.JRadioButton p24;
    private javax.swing.JRadioButton p25;
    private javax.swing.JRadioButton p26;
    private javax.swing.JRadioButton p27;
    private javax.swing.JRadioButton p28;
    private javax.swing.JRadioButton p29;
    private javax.swing.JRadioButton p3;
    private javax.swing.JRadioButton p30;
    private javax.swing.JRadioButton p31;
    private javax.swing.JRadioButton p32;
    private javax.swing.JRadioButton p33;
    private javax.swing.JRadioButton p34;
    private javax.swing.JRadioButton p35;
    private javax.swing.JRadioButton p36;
    private javax.swing.JRadioButton p37;
    private javax.swing.JRadioButton p4;
    private javax.swing.JRadioButton p5;
    private javax.swing.JRadioButton p6;
    private javax.swing.JRadioButton p7;
    private javax.swing.JRadioButton p8;
    private javax.swing.JRadioButton p9;
    private javax.swing.JTextField tipoTienda;
    private javax.swing.JPasswordField txt_contra;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_cp;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables
}
