package view;

import Vistas.textoSombra;
import static controlador.controlLogin.loginUsuarios;
import javax.swing.JOptionPane;
public class loginView extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(loginView.class.getName());

    public loginView() {
        initComponents();
        this.setLocationRelativeTo(this);
        textoSombra cedula = new textoSombra("Cedula",txt_cedula);
        textoSombra contraseña = new textoSombra("Contraseña",txt_contraseña);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_cedula = new javax.swing.JTextField();
        txt_contraseña = new javax.swing.JPasswordField();
        btn_registrar = new javax.swing.JButton();
        btn_ingresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_cedula.setBorder(null);
        jPanel1.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 232, 240, 30));

        txt_contraseña.setBorder(null);
        jPanel1.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 240, 30));

        btn_registrar.setBorder(null);
        btn_registrar.setContentAreaFilled(false);
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar.setFocusPainted(false);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 80, 20));

        btn_ingresar.setBorder(null);
        btn_ingresar.setContentAreaFilled(false);
        btn_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ingresar.setFocusPainted(false);
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/loginImagen.png"))); // NOI18N
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

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        registerView registerVista = new registerView();
        registerVista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        String cedula = txt_cedula.getText();
        String contraseña = txt_contraseña.getText();
        if (loginUsuarios(cedula, contraseña) == true) {
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas o Usuario inactivo");
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new loginView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JPasswordField txt_contraseña;
    // End of variables declaration//GEN-END:variables
}
