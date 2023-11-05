/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Dimension;

/**
 *
 * @author Sofía
 */
public class Libro extends javax.swing.JPanel {

    /**
     * Creates new form Libro
     */
    public Libro() {
        initComponents();
    }
   public static void main (String args []){
       Libro panelLibro = new Libro();
       panelLibro.setPreferredSize(new Dimension(878, 578)); 
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloLibro = new javax.swing.JLabel();
        lbldEjemplar = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        lblEdicion = new javax.swing.JLabel();
        txtEjemplar = new javax.swing.JTextField();
        lblIsbn = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        lblIdEditorial = new javax.swing.JLabel();
        txtEdicion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        lblUbicacion = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblAutor = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(878, 588));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloLibro.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTituloLibro.setText("Registro de Libro");
        add(lblTituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 219, 37));

        lbldEjemplar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbldEjemplar.setText("Id Ejemplar");
        add(lbldEjemplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 321, 100, 40));

        txtIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIsbnActionPerformed(evt);
            }
        });
        add(txtIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 170, -1));

        lblEdicion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEdicion.setText("Edicion");
        add(lblEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 100, 40));

        txtEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEjemplarActionPerformed(evt);
            }
        });
        add(txtEjemplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 170, -1));

        lblIsbn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblIsbn.setText("ISBN");
        add(lblIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 204, 100, 40));

        txtEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditorialActionPerformed(evt);
            }
        });
        add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 170, -1));

        lblIdEditorial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblIdEditorial.setText("ID Editorial");
        add(lblIdEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 379, 100, 40));

        txtEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdicionActionPerformed(evt);
            }
        });
        add(txtEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 170, -1));

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar ");
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 100, -1));

        btnSalir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/libro.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 207, 247));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTitulo.setText("Titulo:");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 112, 100, -1));

        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });
        add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 170, -1));

        lblUbicacion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblUbicacion.setText("Ubicacion: ");
        add(lblUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 244, 100, 40));

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });
        add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 170, -1));

        lblAutor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAutor.setText("Autor:");
        add(lblAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 141, 100, 40));

        txtUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacionActionPerformed(evt);
            }
        });
        add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 170, -1));

        lblCantidad.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCantidad.setText("Cantidad ");
        add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 100, 40));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIsbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIsbnActionPerformed

    private void txtEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEjemplarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEjemplarActionPerformed

    private void txtEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditorialActionPerformed

    private void txtEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdicionActionPerformed

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacionActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblEdicion;
    private javax.swing.JLabel lblIdEditorial;
    private javax.swing.JLabel lblIsbn;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloLibro;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JLabel lbldEjemplar;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtEdicion;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtEjemplar;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables

    void setSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
