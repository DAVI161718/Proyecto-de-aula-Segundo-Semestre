/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import Vistas.textoSombra;

public class tutorview extends javax.swing.JFrame {

    public tutorview() {
        initComponents();
        this.setLocationRelativeTo(this);
        textoSombra Notas = new textoSombra("Digite documento", txt_notas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panel_lista = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panel_notas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        panel_horario = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        panel_horizontal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        tabla_lista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        gestion_horarios = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        tabla_horario = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton14 = new javax.swing.JButton();
        incio_notas = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        crear_notas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_notas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        eliminar_notas = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        tabla_buscarNotas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        finalizar_notas = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        buscar_notas = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        notas_creadas = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton22 = new javax.swing.JButton();
        crear_horarios = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        eliminar_horarios = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(51, 204, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("BIENVENIDO TUTOR");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tutor.png"))); // NOI18N
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 53, 190, 10));

        panel_lista.setBackground(new java.awt.Color(51, 204, 255));
        panel_lista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_lista.setMaximumSize(new java.awt.Dimension(100, 100));
        panel_lista.setMinimumSize(new java.awt.Dimension(100, 100));
        panel_lista.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panel_listaMouseMoved(evt);
            }
        });
        panel_lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_listaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_listaMouseExited(evt);
            }
        });
        panel_lista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("Lista");
        panel_lista.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista-de-verificacion.png"))); // NOI18N
        panel_lista.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jPanel6.add(panel_lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 250, 40));

        panel_notas.setBackground(new java.awt.Color(51, 204, 255));
        panel_notas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_notas.setMaximumSize(new java.awt.Dimension(100, 100));
        panel_notas.setMinimumSize(new java.awt.Dimension(100, 100));
        panel_notas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panel_notasMouseMoved(evt);
            }
        });
        panel_notas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_notasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_notasMouseExited(evt);
            }
        });
        panel_notas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setText("Gestión de notas");
        panel_notas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mentor.png"))); // NOI18N
        panel_notas.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel6.add(panel_notas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 250, 40));

        panel_horario.setBackground(new java.awt.Color(51, 204, 255));
        panel_horario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_horario.setMaximumSize(new java.awt.Dimension(100, 100));
        panel_horario.setMinimumSize(new java.awt.Dimension(100, 100));
        panel_horario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panel_horarioMouseMoved(evt);
            }
        });
        panel_horario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_horarioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_horarioMouseExited(evt);
            }
        });
        panel_horario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(242, 242, 242));
        jLabel19.setText("Gestión horarios");
        panel_horario.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendario.png"))); // NOI18N
        panel_horario.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel6.add(panel_horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 250, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        panel_horizontal.setBackground(new java.awt.Color(51, 153, 255));
        panel_horizontal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Panel del Tutor");
        panel_horizontal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesor.png"))); // NOI18N
        panel_horizontal.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jPanel1.add(panel_horizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 550, 100));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 255));
        jLabel2.setText("Sistema gestión de tutorias");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(51, 204, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 250, 20));

        jTabbedPane.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("¡Bienvenido al panel del tutor!");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel30.setText("A su lado izquierdo podrá encontrár todo los paneles para poder hacer uso del");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel31.setText("programa correctamente.");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jTabbedPane.addTab("0", jPanel2);

        tabla_lista.setBackground(new java.awt.Color(255, 255, 255));
        tabla_lista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Identificación", "Email", "# de celular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        tabla_lista.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 550, 350));

        jTabbedPane.addTab("1", tabla_lista);

        gestion_horarios.setBackground(new java.awt.Color(255, 255, 255));
        gestion_horarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        gestion_horarios.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Bienvenido a la gestión de horarios");
        gestion_horarios.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel25.setText("Seleccione la opcion que necesita a continuacion");
        gestion_horarios.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jButton9.setBackground(new java.awt.Color(51, 153, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Eliminar horarios");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        gestion_horarios.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 140, -1));

        jButton10.setBackground(new java.awt.Color(51, 153, 255));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Crear horario");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        gestion_horarios.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 140, -1));

        jButton11.setBackground(new java.awt.Color(51, 153, 255));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Ver horarios");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        gestion_horarios.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 140, -1));

        jTabbedPane.addTab("2", gestion_horarios);

        tabla_horario.setBackground(new java.awt.Color(255, 255, 255));
        tabla_horario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Estado", "Fecha de clases", "Salon"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        tabla_horario.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 550, 280));

        jButton14.setBackground(new java.awt.Color(51, 153, 255));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Regresar a la gestión");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        tabla_horario.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 170, -1));

        jTabbedPane.addTab("3", tabla_horario);

        incio_notas.setBackground(new java.awt.Color(255, 255, 255));
        incio_notas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Bienvenido a la gestión de notas");
        incio_notas.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setText("Seleccione la opcion que necesita a continuacion");
        incio_notas.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jButton6.setBackground(new java.awt.Color(51, 153, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Crear notas");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        incio_notas.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 150, -1));

        jButton7.setBackground(new java.awt.Color(51, 153, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Eliminar notas");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        incio_notas.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 150, -1));

        jButton8.setBackground(new java.awt.Color(51, 153, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Ver notas creadas");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        incio_notas.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 150, 20));

        jTabbedPane.addTab("4", incio_notas);

        crear_notas.setBackground(new java.awt.Color(255, 255, 255));
        crear_notas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ingresa el numero de identidad (sin puntos ni comas)");
        crear_notas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 500, 40));

        txt_notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_notasActionPerformed(evt);
            }
        });
        crear_notas.add(txt_notas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 170, -1));

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar estudiante");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        crear_notas.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jButton17.setBackground(new java.awt.Color(51, 153, 255));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Regresar a la gestión");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        crear_notas.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 170, -1));

        jTabbedPane.addTab("5", crear_notas);

        eliminar_notas.setBackground(new java.awt.Color(255, 255, 255));
        eliminar_notas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Eliminar notas");
        eliminar_notas.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Ingrese el número de identificación del estudiante:");
        eliminar_notas.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));
        eliminar_notas.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 200, 30));

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        eliminar_notas.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        jButton18.setBackground(new java.awt.Color(51, 153, 255));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Regresar a la gestión");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        eliminar_notas.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 170, -1));

        jTabbedPane.addTab("6", eliminar_notas);

        tabla_buscarNotas.setBackground(new java.awt.Color(255, 255, 255));
        tabla_buscarNotas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Apellidos", "Nombres"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        tabla_buscarNotas.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 550, 70));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("¡¡Estudiante encontrado!!");
        tabla_buscarNotas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Ingrese la nota que le desea crear a este estudiante:");
        tabla_buscarNotas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        tabla_buscarNotas.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 430, 30));

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Crear nota");
        tabla_buscarNotas.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        jButton19.setBackground(new java.awt.Color(51, 153, 255));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Regresar a la gestión");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        tabla_buscarNotas.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 170, -1));

        jTabbedPane.addTab("7", tabla_buscarNotas);

        finalizar_notas.setBackground(new java.awt.Color(255, 255, 255));
        finalizar_notas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setText("Estas son las notas que han sido creadas para este estudiante:");
        finalizar_notas.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        finalizar_notas.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 510, 80));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("En la tabla anterior, seleccione la nota que desea eliminar.");
        finalizar_notas.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jButton4.setBackground(new java.awt.Color(51, 153, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Eliminar nota");
        finalizar_notas.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jButton20.setBackground(new java.awt.Color(51, 153, 255));
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("Regresar a la gestión");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        finalizar_notas.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 170, -1));

        jTabbedPane.addTab("8", finalizar_notas);

        buscar_notas.setBackground(new java.awt.Color(255, 255, 255));
        buscar_notas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Ingrese el documento del estudiante al cual desea buscar sus notas:");
        buscar_notas.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        buscar_notas.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 200, -1));

        jButton5.setBackground(new java.awt.Color(51, 153, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Buscar estudiante");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        buscar_notas.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, 30));

        jButton21.setBackground(new java.awt.Color(51, 153, 255));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("Regresar a la gestión");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        buscar_notas.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 170, -1));

        jTabbedPane.addTab("9", buscar_notas);

        notas_creadas.setBackground(new java.awt.Color(255, 255, 255));
        notas_creadas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel22.setText("Estas son las notas que han sido creadas para este estudiante:");
        notas_creadas.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable5);

        notas_creadas.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 510, 80));

        jButton22.setBackground(new java.awt.Color(51, 153, 255));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("Regresar a la gestión");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        notas_creadas.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 170, -1));

        jTabbedPane.addTab("10", notas_creadas);

        crear_horarios.setBackground(new java.awt.Color(255, 255, 255));
        crear_horarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Fecha de clases", "Salón"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable6);

        crear_horarios.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 550, 130));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Crear horarios");
        crear_horarios.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("En la siguiente tabla podrá crear su horario:");
        crear_horarios.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jButton13.setBackground(new java.awt.Color(51, 153, 255));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Crear horario");
        crear_horarios.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jButton15.setBackground(new java.awt.Color(51, 153, 255));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Regresar a la gestión");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        crear_horarios.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 170, -1));

        jTabbedPane.addTab("11", crear_horarios);

        eliminar_horarios.setBackground(new java.awt.Color(255, 255, 255));
        eliminar_horarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Eliminar horarios");
        eliminar_horarios.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Fecha de clases", "Salón"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable7);

        eliminar_horarios.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 550, 190));

        jButton12.setBackground(new java.awt.Color(51, 153, 255));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Eliminar horario");
        eliminar_horarios.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 140, 30));

        jButton16.setBackground(new java.awt.Color(51, 153, 255));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Regresar a la gestión");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        eliminar_horarios.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 170, -1));

        jTabbedPane.addTab("12", eliminar_horarios);

        jPanel1.add(jTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 550, 380));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panel_listaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_listaMouseMoved
        panel_lista.setBackground(new Color (51,153,255));
    }//GEN-LAST:event_panel_listaMouseMoved

    private void panel_listaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_listaMouseExited
        panel_lista.setBackground(new Color (51,204,255));
    }//GEN-LAST:event_panel_listaMouseExited

    private void panel_horarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_horarioMouseMoved
        panel_horario.setBackground(new Color (51,153,255));

    }//GEN-LAST:event_panel_horarioMouseMoved

    private void panel_horarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_horarioMouseExited
        panel_horario.setBackground(new Color (51,204,255));

    }//GEN-LAST:event_panel_horarioMouseExited

    private void panel_notasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_notasMouseMoved
        panel_notas.setBackground(new Color (51,153,255));

    }//GEN-LAST:event_panel_notasMouseMoved

    private void panel_notasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_notasMouseExited
        panel_notas.setBackground(new Color (51,204,255));

    }//GEN-LAST:event_panel_notasMouseExited

    private void panel_listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_listaMouseClicked
        jTabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_panel_listaMouseClicked

    private void panel_horarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_horarioMouseClicked
        jTabbedPane.setSelectedIndex(2);

    }//GEN-LAST:event_panel_horarioMouseClicked

    private void panel_notasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_notasMouseClicked
        jTabbedPane.setSelectedIndex(4);

    }//GEN-LAST:event_panel_notasMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jTabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_jButton1MouseClicked

    private void txt_notasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_notasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_notasActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTabbedPane.setSelectedIndex(5);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTabbedPane.setSelectedIndex(6);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jTabbedPane.setSelectedIndex(9);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane.setSelectedIndex(7);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane.setSelectedIndex(8);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTabbedPane.setSelectedIndex(10);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jTabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jTabbedPane.setSelectedIndex(12);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jTabbedPane.setSelectedIndex(11);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jTabbedPane.setSelectedIndex(4);

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jTabbedPane.setSelectedIndex(4);

    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        jTabbedPane.setSelectedIndex(4);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jTabbedPane.setSelectedIndex(4);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        jTabbedPane.setSelectedIndex(4);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        jTabbedPane.setSelectedIndex(4);
    }//GEN-LAST:event_jButton22ActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tutorview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buscar_notas;
    private javax.swing.JPanel crear_horarios;
    private javax.swing.JPanel crear_notas;
    private javax.swing.JPanel eliminar_horarios;
    private javax.swing.JPanel eliminar_notas;
    private javax.swing.JPanel finalizar_notas;
    private javax.swing.JPanel gestion_horarios;
    private javax.swing.JPanel incio_notas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel notas_creadas;
    private javax.swing.JPanel panel_horario;
    private javax.swing.JPanel panel_horizontal;
    private javax.swing.JPanel panel_lista;
    private javax.swing.JPanel panel_notas;
    private javax.swing.JPanel tabla_buscarNotas;
    private javax.swing.JPanel tabla_horario;
    private javax.swing.JPanel tabla_lista;
    private javax.swing.JTextField txt_notas;
    // End of variables declaration//GEN-END:variables
}
