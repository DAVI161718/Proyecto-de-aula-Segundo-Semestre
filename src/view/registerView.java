package view;

import Vistas.textoSombra;
import static controlador.controladorRegistro.*;
import javax.swing.JOptionPane;
import static controlador.AuthRegistro.*;

public class registerView extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(registerView.class.getName());

    public registerView() {
        initComponents();
        this.setLocationRelativeTo(this);
        textoSombra telefono = new textoSombra("Nro de telefono", txt_telefono);
        textoSombra contraseña = new textoSombra("Contraseña", txt_contraseña);
        textoSombra cedula = new textoSombra("Cedula", txt_cedula);
        textoSombra nombre = new textoSombra("Nombre Completo", txt_nombre);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        btn_volver = new javax.swing.JButton();
        txt_contraseña = new javax.swing.JPasswordField();
        txt_telefono = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        box_rol = new javax.swing.JComboBox<>();
        box_semestre = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_volver.setBorder(null);
        btn_volver.setContentAreaFilled(false);
        btn_volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_volver.setFocusPainted(false);
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        jPanel1.add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, 40, 50));

        txt_contraseña.setBorder(null);
        jPanel1.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 240, 30));

        txt_telefono.setBorder(null);
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 240, 30));

        txt_nombre.setBorder(null);
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 240, 30));

        txt_cedula.setBorder(null);
        jPanel1.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 240, 30));

        btn_registrar.setBorder(null);
        btn_registrar.setContentAreaFilled(false);
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar.setFocusPainted(false);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 100, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("la casilla de semestre vacia");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Telefono*");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("Nombre*");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Contraseña*");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("Cedula*");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 60, -1));

        box_rol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box_rol.setForeground(new java.awt.Color(51, 153, 255));
        box_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Tutor" }));
        box_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_rolActionPerformed(evt);
            }
        });
        jPanel1.add(box_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, -1, -1));

        box_semestre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        box_semestre.setForeground(new java.awt.Color(51, 153, 255));
        box_semestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semestre 1", "Semestre 2", "Semestre 3", "Semestre 4", "" }));
        box_semestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_semestreActionPerformed(evt);
            }
        });
        jPanel1.add(box_semestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Elija una opcion de las casillas");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 153));
        jLabel8.setText("Si usted es tutor porfavor coloque");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registerImagen.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        loginView loginVista = new loginView();
        loginVista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        String nombre = txt_nombre.getText();
        String contraseña = txt_contraseña.getText();
        String cedula = txt_cedula.getText();
        String celular = txt_telefono.getText();
        if (valCedula(cedula) && valTelefono(celular)) {
            if (!nombre.isEmpty() || !contraseña.isEmpty() || !cedula.isEmpty() || !celular.isEmpty()) {
                String cargo = box_rol.getSelectedItem().toString();
                String semestre = box_semestre.getSelectedItem().toString();
                if (valUsuario(cedula) == true) {
                    JOptionPane.showMessageDialog(null, "Usuario ya existente");
                } else {
                    if (valInfo(cargo, semestre) == true) {
                        crearUsuario(cedula, nombre, contraseña, cargo, celular, "Inactivo", semestre);
                        JOptionPane.showMessageDialog(null, "Usuario creado con exito");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Informacion no valida porfavor intente nuevamente");
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void box_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_rolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_rolActionPerformed

    private void box_semestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_semestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_semestreActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new registerView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_rol;
    private javax.swing.JComboBox<String> box_semestre;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JPasswordField txt_contraseña;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
