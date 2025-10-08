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
        check_estudiante = new javax.swing.JCheckBox();
        check_tutor = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_volver.setBorder(null);
        btn_volver.setContentAreaFilled(false);
        btn_volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        check_estudiante.setBackground(new java.awt.Color(255, 255, 255));
        check_estudiante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check_estudiante.setForeground(new java.awt.Color(0, 153, 255));
        check_estudiante.setText("Estudiante");
        check_estudiante.setBorder(null);
        jPanel1.add(check_estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, -1, -1));

        check_tutor.setBackground(new java.awt.Color(255, 255, 255));
        check_tutor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check_tutor.setForeground(new java.awt.Color(0, 153, 255));
        check_tutor.setText("Tutor");
        check_tutor.setBorder(null);
        jPanel1.add(check_tutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Elija una opcion de las casillas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

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
                loginView login = new loginView();
                if (check_tutor.isSelected() && check_estudiante.isSelected()) {
                    JOptionPane.showMessageDialog(null, "No es posible elegir dos opciones, Porfavor intente nuevamente");
                } else if (!check_tutor.isSelected() && !check_estudiante.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Debes elegir una de las opciones presentadas");
                } else if (check_tutor.isSelected()) {
                    crearUsuario(cedula, nombre, contraseña, "Tutor", celular);
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                    login.setVisible(true);
                    this.dispose();
                } else if (check_estudiante.isSelected()) {
                    crearUsuario(cedula, nombre, contraseña, "Estudiante", celular);
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                    login.setVisible(true);
                    this.dispose();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Informacion no valida porfavor intente nuevamente");
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new registerView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JCheckBox check_estudiante;
    private javax.swing.JCheckBox check_tutor;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JPasswordField txt_contraseña;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
