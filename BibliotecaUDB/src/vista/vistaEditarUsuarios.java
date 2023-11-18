/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.gestionarUsuarios;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modelo.UsuarioModelo;

public class vistaEditarUsuarios extends javax.swing.JFrame {

    private gestionarUsuarios controlador;

    public vistaEditarUsuarios() {
        initComponents();

        UsuarioModelo mUsuarios = new UsuarioModelo();
        gestionarUsuarios controlador = new gestionarUsuarios(mUsuarios, this);

        this.setControlador(controlador);

        todosUsuarios();
    }

    public void setControlador(gestionarUsuarios controlador) {
        this.controlador = controlador;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMora = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblClave = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();
        lblClave1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        lblName1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtMora, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 240, -1));

        lblName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblName.setText("Id:");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 20, 30));

        lblClave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblClave.setText("Mora:");
        getContentPane().add(lblClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 50, 20));

        lblCorreo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCorreo.setText("Correo :");
        getContentPane().add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 60, 30));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 240, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 240, -1));
        getContentPane().add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 240, -1));

        lblClave1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblClave1.setText("Contraseña :");
        getContentPane().add(lblClave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 90, 30));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 300, 110, 40));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 100, 40));

        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbUsuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 820, 340));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 240, -1));

        lblName1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblName1.setText("Nombre :");
        getContentPane().add(lblName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/biblioteca.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setText("EDITAR USUARIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 300, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void todosUsuarios() {
        tbUsuarios.setModel(controlador.MostrarTodosLosUsuarios());

    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        vistaGUsuarios vistaGUsuarios = new vistaGUsuarios();
        showpanel(vistaGUsuarios);
        vistaGUsuarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            Usuario usuario = new Usuario();
            usuario.setId(Integer.parseInt(txtId.getText()));
            usuario.setNombre(txtNombre.getText());
            usuario.setCorreo(txtCorreo.getText());
            usuario.setContrasena(txtContrasena.getText());
            usuario.setMora(Double.parseDouble(txtMora.getText()));
            if (controlador != null) {
                controlador.editarUsuarios(usuario);
                todosUsuarios();
            }else {
                System.out.println("Null");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tbUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuariosMouseClicked
        int fila = tbUsuarios.getSelectedRow();
        txtId.setText(tbUsuarios.getValueAt(fila, 0).toString());
        txtNombre.setText(tbUsuarios.getValueAt(fila, 1).toString());
        txtCorreo.setText(tbUsuarios.getValueAt(fila, 2).toString());
        txtContrasena.setText(tbUsuarios.getValueAt(fila, 3).toString());
        txtMora.setText(tbUsuarios.getValueAt(fila, 4).toString());

    }//GEN-LAST:event_tbUsuariosMouseClicked

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
            java.util.logging.Logger.getLogger(vistaEditarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaEditarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaEditarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaEditarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaEditarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblClave1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JTable tbUsuarios;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMora;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void showpanel(vistaGUsuarios vistaGusuario) {

        //vistaGusuario frame5 = new vistaGUsuarios();
        //frame5.setSize(1100, 800);
        //frame5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //frame5.setVisible(true);
    }

    
}
