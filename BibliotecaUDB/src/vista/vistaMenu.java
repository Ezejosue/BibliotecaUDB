/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.GeneroControlador;
import javax.swing.JOptionPane;
import modelo.GeneroModelo;

/**
 *
 * @author Sofía
 */
public class vistaMenu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public vistaMenu() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        btnRegistrarMaterial = new javax.swing.JButton();
        btnRegistarUsuario = new javax.swing.JButton();
        btnBuscarLibro = new javax.swing.JButton();
        btnRealizarPrestamo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnBuscarGenero = new javax.swing.JButton();
        btnBuscarEditorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                cerrar(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/biblioteca.png"))); // NOI18N

        lblMenu.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblMenu.setText("Menú");

        btnRegistrarMaterial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnRegistrarMaterial.setText("Registrar material");
        btnRegistrarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMaterialActionPerformed(evt);
            }
        });

        btnRegistarUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnRegistarUsuario.setText("Registrar Usuario");
        btnRegistarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarUsuarioActionPerformed(evt);
            }
        });

        btnBuscarLibro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBuscarLibro.setText("Buscar Material");
        btnBuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLibroActionPerformed(evt);
            }
        });

        btnRealizarPrestamo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnRealizarPrestamo.setText("Realizar Préstamo");
        btnRealizarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPrestamoActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSalir.setText("Salir ");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnBuscarGenero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBuscarGenero.setText("Buscar Genero");
        btnBuscarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarGeneroActionPerformed(evt);
            }
        });

        btnBuscarEditorial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBuscarEditorial.setText("Buscar Editorial ");
        btnBuscarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEditorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRealizarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                            .addComponent(btnBuscarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrarMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(lblMenu)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnRegistarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnRealizarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnBuscarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnBuscarEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblMenu.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMaterialActionPerformed
        // TODO add your handling code here:

        vistaRegistroMaterial vistRegistro = new vistaRegistroMaterial();
        vistRegistro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarMaterialActionPerformed

    private void btnRegistarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarUsuarioActionPerformed
        vistaRgistroUsuario vistaUsuario = new vistaRgistroUsuario();
        vistaUsuario.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnRegistarUsuarioActionPerformed

    private void btnBuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLibroActionPerformed
        vistaBuscarLibro vistaUsuario = new vistaBuscarLibro();
        vistaUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarLibroActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);

    }//GEN-LAST:event_btnSalirActionPerformed

    private void cerrar(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_cerrar

    }//GEN-LAST:event_cerrar

    private void btnRealizarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPrestamoActionPerformed
        vistaPrestamo vistaPrestamo = new vistaPrestamo();
        vistaPrestamo.setVisible(true);
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_btnRealizarPrestamoActionPerformed

    private void btnBuscarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarGeneroActionPerformed
        vistaGenero vistaGenero = new vistaGenero();
        GeneroModelo modelo = new GeneroModelo(); 
        GeneroControlador controlador = new GeneroControlador(vistaGenero, modelo, this);
        vistaGenero.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnBuscarGeneroActionPerformed

    private void btnBuscarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEditorialActionPerformed
        vistaEditoriales vistaEditorial = new vistaEditoriales();
        vistaEditorial.setVisible(true);
        vistaEditorial.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnBuscarEditorialActionPerformed

    public void configurarMenuParaUsuario(String tipoUsuario) {
        if ("Administrador".equals(tipoUsuario)) {
            btnRegistrarMaterial.setVisible(true);
            btnRegistarUsuario.setVisible(true);
            btnBuscarLibro.setVisible(true);
            btnRealizarPrestamo.setVisible(true);
        } else if ("Profesor".equals(tipoUsuario)) {
            btnRegistrarMaterial.setVisible(false);
            btnRegistarUsuario.setVisible(false);
            btnBuscarLibro.setVisible(true);
            btnRealizarPrestamo.setVisible(true);
        } else if ("Alumno".equals(tipoUsuario)) {
            btnRegistrarMaterial.setVisible(false);
            btnRegistarUsuario.setVisible(false);
            btnBuscarLibro.setVisible(true);
            btnRealizarPrestamo.setVisible(true);
        }

    }

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
            java.util.logging.Logger.getLogger(vistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarEditorial;
    private javax.swing.JButton btnBuscarGenero;
    private javax.swing.JButton btnBuscarLibro;
    private javax.swing.JButton btnRealizarPrestamo;
    private javax.swing.JButton btnRegistarUsuario;
    private javax.swing.JButton btnRegistrarMaterial;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables
}
