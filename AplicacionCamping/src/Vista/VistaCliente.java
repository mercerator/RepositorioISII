/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Cliente;
import Controlador.Gerente;
import Model.Camping;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author anita
 */
public class VistaCliente extends javax.swing.JFrame {

    private JFrame vistaAnterior;
    private Cliente cliente;
    private DefaultListModel lReservas;
    private DefaultListModel lEventos;
    /**
     * Creates new form VistaCliente
     */
    VistaCliente(VistaLogin vistaAnterior, Cliente cliente) {
        
        initComponents();
        this.cliente = cliente;
        this.vistaAnterior = vistaAnterior;
        this.setSize(1000, 600);
        this.setTitle("Area Cliente");
        bttReservas.setOpaque(false);
        bttEventos.setOpaque(false);                                        
        panelReservas.setVisible(true);
        panelEventos.setVisible(false);
        panelClub.setVisible(false);
        panelPiscina.setVisible(false);
        panelFronton.setVisible(false);
        panelModReserva.setVisible(false);
        
        // Inicializamos la lista de reservas
        lReservas = new DefaultListModel();
        lMisReservas.setModel(lReservas);
        
        for(Object reserva: this.cliente.getReservas()){
            lReservas.addElement(reserva);
        }
        
        lEventos = new DefaultListModel();
        lMisEventos.setModel(lEventos);
        
        for(Object evento: this.cliente.getEventos()){
            lEventos.addElement(evento);
        }
        
        
    }
    public void actionOff(){
        bttReservas.setEnabled(false);
        bttEventos.setEnabled(false);
        btnPrincipalAtras.setEnabled(false);
        btnFronton.setEnabled(false);
        btnPiscina.setEnabled(false);
        btnClubSocial.setEnabled(false);
        lMisEventos.setEnabled(false);
        btnCanEvento.setEnabled(false);
        btnNReserva.setEnabled(false);
        btnMod.setEnabled(false);
    }
    public void actionOn(){
        bttReservas.setEnabled(true);
        bttEventos.setEnabled(true);
        btnPrincipalAtras.setEnabled(true);
        btnFronton.setEnabled(true);
        btnPiscina.setEnabled(true);
        btnClubSocial.setEnabled(true);
        lMisEventos.setEnabled(true);
        btnCanEvento.setEnabled(true);
        btnNReserva.setEnabled(true);
        btnMod.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttReservas = new javax.swing.JButton();
        bttEventos = new javax.swing.JButton();
        panelReservas = new javax.swing.JPanel();
        panelModReserva = new javax.swing.JPanel();
        lbl_fechentrada = new javax.swing.JLabel();
        fEntrada = new datechooser.beans.DateChooserCombo();
        lbl_fechasalida = new javax.swing.JLabel();
        fSalida = new datechooser.beans.DateChooserCombo();
        datoscliente = new javax.swing.JLabel();
        modReservaCancelar = new javax.swing.JButton();
        fondobotones11 = new javax.swing.JLabel();
        modReservaGuardar = new javax.swing.JButton();
        fondobotones12 = new javax.swing.JLabel();
        modReservaAtras = new javax.swing.JButton();
        fondobotones10 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lMisReservas = new javax.swing.JList<>();
        btnMod = new javax.swing.JButton();
        fondobotones6 = new javax.swing.JLabel();
        btnNReserva = new javax.swing.JButton();
        fondobotones7 = new javax.swing.JLabel();
        fondoVistaCLiente2 = new javax.swing.JLabel();
        fblanco2 = new javax.swing.JLabel();
        panelEventos = new javax.swing.JPanel();
        panelFronton = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pFrontonAtras = new javax.swing.JButton();
        pFrontonUnirse = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        panelPiscina = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pPiscinaAtras = new javax.swing.JButton();
        pPiscinaUnirse = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        panelClub = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pClubAtras = new javax.swing.JButton();
        pCLubUnirse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lMisEventos = new javax.swing.JList<>();
        btnCanEvento = new javax.swing.JButton();
        fondobotones4 = new javax.swing.JLabel();
        btnPiscina = new javax.swing.JButton();
        fondobotones5 = new javax.swing.JLabel();
        btnFronton = new javax.swing.JButton();
        fondobotones3 = new javax.swing.JLabel();
        btnClubSocial = new javax.swing.JButton();
        fondobotones2 = new javax.swing.JLabel();
        seleccione = new javax.swing.JLabel();
        fondoVistaCLiente = new javax.swing.JLabel();
        fblanco = new javax.swing.JLabel();
        fondoVistaCLiente1 = new javax.swing.JLabel();
        btnPrincipalAtras = new javax.swing.JButton();
        fondobotones = new javax.swing.JLabel();
        fblanco1 = new javax.swing.JLabel();
        fondobotones1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bttReservas.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        bttReservas.setText("Mis Reservas");
        bttReservas.setBorder(null);
        bttReservas.setBorderPainted(false);
        bttReservas.setContentAreaFilled(false);
        bttReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttReservasActionPerformed(evt);
            }
        });
        getContentPane().add(bttReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 30));

        bttEventos.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        bttEventos.setText("Eventos");
        bttEventos.setBorder(null);
        bttEventos.setBorderPainted(false);
        bttEventos.setContentAreaFilled(false);
        bttEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEventosActionPerformed(evt);
            }
        });
        getContentPane().add(bttEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 30));

        panelReservas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelModReserva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_fechentrada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_fechentrada.setText("Fecha de entrada:");
        panelModReserva.add(lbl_fechentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 150, 40));

        fEntrada.setCalendarPreferredSize(new java.awt.Dimension(317, 321));
        panelModReserva.add(fEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 190, 40));

        lbl_fechasalida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_fechasalida.setText("Fecha de salida:");
        panelModReserva.add(lbl_fechasalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 140, 40));
        panelModReserva.add(fSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 190, 40));

        datoscliente.setFont(new java.awt.Font("Georgia Pro", 0, 24)); // NOI18N
        datoscliente.setText("Modificar Reserva");
        panelModReserva.add(datoscliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 210, 40));

        modReservaCancelar.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        modReservaCancelar.setText("Cancelar Reserva");
        modReservaCancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        modReservaCancelar.setContentAreaFilled(false);
        panelModReserva.add(modReservaCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 120, 30));

        fondobotones11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/blancoroto.jpg"))); // NOI18N
        fondobotones11.setText("jLabel2");
        panelModReserva.add(fondobotones11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 120, 30));

        modReservaGuardar.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        modReservaGuardar.setText("Guardar");
        modReservaGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        modReservaGuardar.setContentAreaFilled(false);
        panelModReserva.add(modReservaGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 120, 30));

        fondobotones12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/blancoroto.jpg"))); // NOI18N
        fondobotones12.setText("jLabel2");
        panelModReserva.add(fondobotones12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 120, 30));

        modReservaAtras.setFont(new java.awt.Font("Georgia Pro", 0, 14)); // NOI18N
        modReservaAtras.setText("Atras");
        modReservaAtras.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        modReservaAtras.setContentAreaFilled(false);
        modReservaAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modReservaAtrasActionPerformed(evt);
            }
        });
        panelModReserva.add(modReservaAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, 30));

        fondobotones10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/blancoroto.jpg"))); // NOI18N
        fondobotones10.setText("jLabel2");
        panelModReserva.add(fondobotones10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondoazul.png"))); // NOI18N
        fondo.setPreferredSize(new java.awt.Dimension(240, 260));
        panelModReserva.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 290));

        panelReservas.add(panelModReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 520, 310));

        lMisReservas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mis Reservas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 14))); // NOI18N
        lMisReservas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lMisReservas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lMisReservas);

        panelReservas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 340, 150));

        btnMod.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnMod.setText("Modificar");
        btnMod.setToolTipText("");
        btnMod.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMod.setContentAreaFilled(false);
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });
        panelReservas.add(btnMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 150, 30));

        fondobotones6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/blancoroto.jpg"))); // NOI18N
        fondobotones6.setText("jLabel2");
        panelReservas.add(fondobotones6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 150, 30));

        btnNReserva.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnNReserva.setText("Nueva Reserva");
        btnNReserva.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNReserva.setContentAreaFilled(false);
        btnNReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNReservaActionPerformed(evt);
            }
        });
        panelReservas.add(btnNReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 150, 30));

        fondobotones7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/blancoroto.jpg"))); // NOI18N
        fondobotones7.setText("jLabel2");
        panelReservas.add(fondobotones7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 150, 30));

        fondoVistaCLiente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/areaCliente.png"))); // NOI18N
        fondoVistaCLiente2.setText("jLabel2");
        panelReservas.add(fondoVistaCLiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -200, -1, -1));

        fblanco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondoBlanco.png"))); // NOI18N
        fblanco2.setText("jLabel2");
        panelReservas.add(fblanco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, -1, -1));

        getContentPane().add(panelReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 660, 490));

        panelEventos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFronton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelFronton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(242, 242, 242));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Está diseñado para jugadores y entrenadores que ");
        jLabel7.setToolTipText("");
        jLabel7.setName(""); // NOI18N
        jLabel7.setOpaque(true);
        panelFronton.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 280, 20));

        jLabel8.setBackground(new java.awt.Color(242, 242, 242));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("  quieran aprender jugadas o perfeccionar su técnica.");
        jLabel8.setToolTipText("");
        jLabel8.setOpaque(true);
        panelFronton.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 300, -1));

        pFrontonAtras.setText("ATRAS");
        pFrontonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pFrontonAtrasActionPerformed(evt);
            }
        });
        panelFronton.add(pFrontonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        pFrontonUnirse.setText("UNIRSE");
        pFrontonUnirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pFrontonUnirseActionPerformed(evt);
            }
        });
        panelFronton.add(pFrontonUnirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fronton.png"))); // NOI18N
        jLabel9.setText("jLabel1");
        panelFronton.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 190));

        panelEventos.add(panelFronton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 340, 210));

        panelPiscina.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelPiscina.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(242, 242, 242));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Practicar un ejercicio acuático, no solo te ayuda a");
        jLabel4.setToolTipText("");
        jLabel4.setName(""); // NOI18N
        jLabel4.setOpaque(true);
        panelPiscina.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 280, 20));

        jLabel5.setBackground(new java.awt.Color(242, 242, 242));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("estar en forma, sino que previene lesiones.");
        jLabel5.setToolTipText("");
        jLabel5.setOpaque(true);
        panelPiscina.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 240, -1));

        pPiscinaAtras.setText("ATRAS");
        pPiscinaAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pPiscinaAtrasActionPerformed(evt);
            }
        });
        panelPiscina.add(pPiscinaAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        pPiscinaUnirse.setText("UNIRSE");
        pPiscinaUnirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pPiscinaUnirseActionPerformed(evt);
            }
        });
        panelPiscina.add(pPiscinaUnirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/piscina.png"))); // NOI18N
        jLabel6.setText("jLabel1");
        panelPiscina.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 190));

        panelEventos.add(panelPiscina, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 340, 210));

        panelClub.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelClub.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(242, 242, 242));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("¡ Disfruta de una gran variedad de juegos de ");
        jLabel2.setName(""); // NOI18N
        jLabel2.setOpaque(true);
        panelClub.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 260, 20));

        jLabel3.setBackground(new java.awt.Color(242, 242, 242));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText(" mesa junto a otros apasionados como tú !");
        jLabel3.setOpaque(true);
        panelClub.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 240, -1));

        pClubAtras.setText("ATRAS");
        pClubAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pClubAtrasActionPerformed(evt);
            }
        });
        panelClub.add(pClubAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        pCLubUnirse.setText("UNIRSE");
        pCLubUnirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pCLubUnirseActionPerformed(evt);
            }
        });
        panelClub.add(pCLubUnirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/clubSocial.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        panelClub.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 190));

        panelEventos.add(panelClub, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 340, 210));

        lMisEventos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mis Eventos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 14))); // NOI18N
        lMisEventos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lMisEventos);

        panelEventos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 150, 120));

        btnCanEvento.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnCanEvento.setText("Cancelar Evento");
        btnCanEvento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCanEvento.setContentAreaFilled(false);
        panelEventos.add(btnCanEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 171, -1));

        fondobotones4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/blancoroto.jpg"))); // NOI18N
        fondobotones4.setText("jLabel2");
        panelEventos.add(fondobotones4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 170, 20));

        btnPiscina.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        btnPiscina.setText("PISCINA");
        btnPiscina.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPiscina.setContentAreaFilled(false);
        btnPiscina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiscinaActionPerformed(evt);
            }
        });
        panelEventos.add(btnPiscina, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 170, 63));

        fondobotones5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/blancoroto.jpg"))); // NOI18N
        fondobotones5.setText("jLabel2");
        panelEventos.add(fondobotones5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 170, 60));

        btnFronton.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        btnFronton.setText("FRONTON");
        btnFronton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnFronton.setContentAreaFilled(false);
        btnFronton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrontonActionPerformed(evt);
            }
        });
        panelEventos.add(btnFronton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 170, 63));

        fondobotones3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/blancoroto.jpg"))); // NOI18N
        fondobotones3.setText("jLabel2");
        panelEventos.add(fondobotones3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 170, 60));

        btnClubSocial.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        btnClubSocial.setText("CLUB SOCIAL");
        btnClubSocial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnClubSocial.setContentAreaFilled(false);
        btnClubSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClubSocialActionPerformed(evt);
            }
        });
        panelEventos.add(btnClubSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 170, 63));

        fondobotones2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/blancoroto.jpg"))); // NOI18N
        fondobotones2.setText("jLabel2");
        panelEventos.add(fondobotones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 170, 60));

        seleccione.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        seleccione.setText("¡Seleccione su proxima actividad!");
        panelEventos.add(seleccione, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, 53));

        fondoVistaCLiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/areaCliente.png"))); // NOI18N
        fondoVistaCLiente.setText("jLabel2");
        panelEventos.add(fondoVistaCLiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -200, -1, -1));

        fblanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondoBlanco.png"))); // NOI18N
        fblanco.setText("jLabel2");
        panelEventos.add(fblanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -40, -1, -1));

        getContentPane().add(panelEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 730, -1));

        fondoVistaCLiente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/areaCliente.png"))); // NOI18N
        getContentPane().add(fondoVistaCLiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, -1, -1));

        btnPrincipalAtras.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnPrincipalAtras.setText("Atras");
        btnPrincipalAtras.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPrincipalAtras.setContentAreaFilled(false);
        btnPrincipalAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrincipalAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 130, 40));

        fondobotones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/blancoroto.jpg"))); // NOI18N
        fondobotones.setText("jLabel2");
        getContentPane().add(fondobotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 130, 40));

        fblanco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondoBlanco.png"))); // NOI18N
        getContentPane().add(fblanco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        fondobotones1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/blancoroto.jpg"))); // NOI18N
        fondobotones1.setText("jLabel2");
        getContentPane().add(fondobotones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 130, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bttReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttReservasActionPerformed
        panelReservas.setVisible(true);
        panelEventos.setVisible(false);
    }//GEN-LAST:event_bttReservasActionPerformed

    private void bttEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEventosActionPerformed
        panelEventos.setVisible(true);
        panelReservas.setVisible(false);
    }//GEN-LAST:event_bttEventosActionPerformed

    private void btnPiscinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiscinaActionPerformed
        panelPiscina.setVisible(true);
        actionOff();
    }//GEN-LAST:event_btnPiscinaActionPerformed

    private void btnFrontonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrontonActionPerformed
        panelFronton.setVisible(true);
        actionOff();
    }//GEN-LAST:event_btnFrontonActionPerformed

    private void btnClubSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClubSocialActionPerformed
        panelClub.setVisible(true);
        actionOff();
    }//GEN-LAST:event_btnClubSocialActionPerformed

    private void btnPrincipalAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalAtrasActionPerformed
       vistaAnterior.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnPrincipalAtrasActionPerformed

    private void pPiscinaAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pPiscinaAtrasActionPerformed
        panelPiscina.setVisible(false);
        actionOn();
    }//GEN-LAST:event_pPiscinaAtrasActionPerformed

    private void pPiscinaUnirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pPiscinaUnirseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pPiscinaUnirseActionPerformed

    private void pFrontonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pFrontonAtrasActionPerformed
        panelFronton.setVisible(false);
        actionOn();
    }//GEN-LAST:event_pFrontonAtrasActionPerformed

    private void pFrontonUnirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pFrontonUnirseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pFrontonUnirseActionPerformed

    private void pCLubUnirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pCLubUnirseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pCLubUnirseActionPerformed

    private void pClubAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pClubAtrasActionPerformed
        panelClub.setVisible(false);
        actionOn();
    }//GEN-LAST:event_pClubAtrasActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        panelModReserva.setVisible(true);
        actionOff();
    }//GEN-LAST:event_btnModActionPerformed

    private void modReservaAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modReservaAtrasActionPerformed
        panelModReserva.setVisible(false);
        actionOn();
    }//GEN-LAST:event_modReservaAtrasActionPerformed

    private void btnNReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNReservaActionPerformed
        VistaClienteNuevaReserva v = new VistaClienteNuevaReserva(this.cliente, this);
        this.setVisible(false);
    }//GEN-LAST:event_btnNReservaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCanEvento;
    private javax.swing.JButton btnClubSocial;
    private javax.swing.JButton btnFronton;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnNReserva;
    private javax.swing.JButton btnPiscina;
    private javax.swing.JButton btnPrincipalAtras;
    private javax.swing.JButton bttEventos;
    private javax.swing.JButton bttReservas;
    private javax.swing.JLabel datoscliente;
    private datechooser.beans.DateChooserCombo fEntrada;
    private datechooser.beans.DateChooserCombo fSalida;
    private javax.swing.JLabel fblanco;
    private javax.swing.JLabel fblanco1;
    private javax.swing.JLabel fblanco2;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondoVistaCLiente;
    private javax.swing.JLabel fondoVistaCLiente1;
    private javax.swing.JLabel fondoVistaCLiente2;
    private javax.swing.JLabel fondobotones;
    private javax.swing.JLabel fondobotones1;
    private javax.swing.JLabel fondobotones10;
    private javax.swing.JLabel fondobotones11;
    private javax.swing.JLabel fondobotones12;
    private javax.swing.JLabel fondobotones2;
    private javax.swing.JLabel fondobotones3;
    private javax.swing.JLabel fondobotones4;
    private javax.swing.JLabel fondobotones5;
    private javax.swing.JLabel fondobotones6;
    private javax.swing.JLabel fondobotones7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lMisEventos;
    private javax.swing.JList<Object> lMisReservas;
    private javax.swing.JLabel lbl_fechasalida;
    private javax.swing.JLabel lbl_fechentrada;
    private javax.swing.JButton modReservaAtras;
    private javax.swing.JButton modReservaCancelar;
    private javax.swing.JButton modReservaGuardar;
    private javax.swing.JButton pCLubUnirse;
    private javax.swing.JButton pClubAtras;
    private javax.swing.JButton pFrontonAtras;
    private javax.swing.JButton pFrontonUnirse;
    private javax.swing.JButton pPiscinaAtras;
    private javax.swing.JButton pPiscinaUnirse;
    private javax.swing.JPanel panelClub;
    private javax.swing.JPanel panelEventos;
    private javax.swing.JPanel panelFronton;
    private javax.swing.JPanel panelModReserva;
    private javax.swing.JPanel panelPiscina;
    private javax.swing.JPanel panelReservas;
    private javax.swing.JLabel seleccione;
    // End of variables declaration//GEN-END:variables
}
