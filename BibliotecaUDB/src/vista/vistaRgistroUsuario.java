/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFrame;
import modelo.Usuario;
import controlador.usuarioControlador;
import javax.swing.JOptionPane;

/**
 *
 * @author Sofía
 */
public class vistaRgistroUsuario extends javax.swing.JFrame {

    private usuarioControlador controlador;

    public vistaRgistroUsuario() {

        initComponents();
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    private void agregarUsuario() {

        Usuario usuario = new Usuario();
        if (txtNombre.getText().isEmpty() &&  txtCorreo.getText().isEmpty() && txtClave.getText().isEmpty()) {
            mostrarMensaje("Todos los campos deben estar llenos");
        }else {
            usuario.setNombre(txtNombre.getText());
            usuario.setCorreo(txtCorreo.getText());
            usuario.setContrasena(txtClave.getText());
            if (rbtAdministrador.isSelected()) {
                usuario.setTipoUsuario("Administrador");
            } else if (rbtEstudiante.isSelected()) {
                usuario.setTipoUsuario("Alumno");
            } else if (rbtProfesor.isSelected()) {
                usuario.setTipoUsuario("Profesor");
            } else {
                usuario.setTipoUsuario("Rol no seleccionado");
            }
            controlador.RegistrarUsuario(usuario);
        }
        
    }

    public void setControlador(usuarioControlador controlador) {
        this.controlador = controlador;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupTipoUusuario = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lblRegistrodeUsuario = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblClave = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblTipoUsuario = new javax.swing.JLabel();
        rbtAdministrador = new javax.swing.JRadioButton();
        rbtProfesor = new javax.swing.JRadioButton();
        rbtEstudiante = new javax.swing.JRadioButton();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/biblioteca.png"))); // NOI18N

        lblRegistrodeUsuario.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblRegistrodeUsuario.setText("Registro de Usuario");

        lblName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblName.setText("Nombre :");

        lblClave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblClave.setText("Contraseña :");

        lblCorreo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCorreo.setText("Correo :");

        lblTipoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTipoUsuario.setText("Tipo de Usuario");

        groupTipoUusuario.add(rbtAdministrador);
        rbtAdministrador.setText("Administrador");
        rbtAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtAdministradorActionPerformed(evt);
            }
        });

        groupTipoUusuario.add(rbtProfesor);
        rbtProfesor.setText("Profesor ");
        rbtProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtProfesorActionPerformed(evt);
            }
        });

        groupTipoUusuario.add(rbtEstudiante);
        rbtEstudiante.setText("Estudiante");

        btnSalir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSalir.setText("Cancelar");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnMenu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(lblRegistrodeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTipoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(btnMenu)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(rbtAdministrador)
                                .addGap(18, 18, 18)
                                .addComponent(rbtProfesor)
                                .addGap(18, 18, 18)
                                .addComponent(rbtEstudiante)))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblRegistrodeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(lblTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtAdministrador)
                    .addComponent(rbtProfesor)
                    .addComponent(rbtEstudiante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnMenu)
                    .addComponent(btnGuardar))
                .addGap(150, 150, 150))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtProfesorActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         vistaGUsuarios vistaGUsuarios = new vistaGUsuarios();
        vistaGUsuarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        vistaMenu vistaMenu = new vistaMenu();
        showpanel(vistaMenu);
        vistaMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void rbtAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtAdministradorActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        agregarUsuario();

    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(vistaRgistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaRgistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaRgistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaRgistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaRgistroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup groupTipoUusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRegistrodeUsuario;
    private javax.swing.JLabel lblTipoUsuario;
    private javax.swing.JRadioButton rbtAdministrador;
    private javax.swing.JRadioButton rbtEstudiante;
    private javax.swing.JRadioButton rbtProfesor;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables


    private void showpanel(vistaMenu vistaMenu) {
        vistaMenu frame6 = new vistaMenu();
        frame6.setSize(1100, 800);
        frame6.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame6.setVisible(true);
        vistaMenu frame5 = new vistaMenu();
        frame5.setSize(1100, 800);
        frame5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame5.setVisible(true);
    }
}
