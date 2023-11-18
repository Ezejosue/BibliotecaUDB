/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.BuscarMaterialControlador;
import controlador.LoginControlador;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;
import modelo.EjemplarTableModelo;
import modelo.UsuarioModelo;
import util.UsuarioActual;

/**
 *
 * @author Sofía
 */
public class vistaBuscarLibro extends javax.swing.JFrame {

    int idUsuario = UsuarioActual.getInstancia().getIdUsuario();
    String tipoUsuario = UsuarioActual.getInstancia().getTipoUsuario();

    /**
     * Creates new form BuscarLibro
     */
    public vistaBuscarLibro() {
        initComponents();
        configurarBotones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblBuscarMaterial = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        lblMaterial = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        cmbMaterial = new javax.swing.JComboBox<>();
        btnRegresarInicio = new javax.swing.JButton();
        btnRealizarPrestamo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnRegresarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/biblioteca.png"))); // NOI18N

        lblBuscarMaterial.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblBuscarMaterial.setText("Buscar Material");

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTitulo.setText("Titulo:");

        lblMaterial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblMaterial.setText("Material:");

        lblAutor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAutor.setText("Autor:");

        cmbMaterial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Revista", "Tesis", "Obra", "Cd´s" }));

        btnRegresarInicio.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnRegresarInicio.setText("Login");
        btnRegresarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarInicioActionPerformed(evt);
            }
        });

        btnRealizarPrestamo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnRealizarPrestamo.setText("Realizar Prestamo");
        btnRealizarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPrestamoActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnBuscar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnRegresarMenu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnRegresarMenu.setText("Menú");
        btnRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAutor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbMaterial, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(424, 424, 424)
                                .addComponent(lblBuscarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRealizarPrestamo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(181, 181, 181)
                                        .addComponent(btnBuscar)))
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar)
                                .addGap(11, 11, 11)
                                .addComponent(btnRegresarInicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRegresarMenu)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuscarMaterial)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAutor))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaterial)
                            .addComponent(cmbMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRealizarPrestamo)
                    .addComponent(btnBuscar)
                    .addComponent(btnRegresarInicio)
                    .addComponent(btnSalir)
                    .addComponent(btnLimpiar)
                    .addComponent(btnRegresarMenu))
                .addGap(185, 185, 185))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configurarTabla() {
        EjemplarTableModelo modelo = (EjemplarTableModelo) jTable1.getModel();
        jTable1.setModel(modelo);

        TableRowSorter<EjemplarTableModelo> sorter = new TableRowSorter<>(modelo);
        jTable1.setRowSorter(sorter);

    }

    public void ajustarAnchoColumnas() {
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        int minWidth = 100; // Establece un ancho mínimo para las columnas

        for (int column = 0; column < jTable1.getColumnCount(); column++) {
            TableColumn tableColumn = jTable1.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();

            for (int row = 0; row < jTable1.getRowCount(); row++) {
                TableCellRenderer cellRenderer = jTable1.getCellRenderer(row, column);
                Component c = jTable1.prepareRenderer(cellRenderer, row, column);
                int width = c.getPreferredSize().width + jTable1.getIntercellSpacing().width;
                preferredWidth = Math.max(preferredWidth, width);

                if (preferredWidth >= maxWidth) {
                    preferredWidth = maxWidth;
                    break;
                }
            }

            preferredWidth = Math.max(preferredWidth, minWidth);
            tableColumn.setPreferredWidth(preferredWidth);
        }
    }

    private void btnRegresarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarInicioActionPerformed
        vistaLogin vista = new vistaLogin();
        UsuarioModelo modelo = new UsuarioModelo();
        vistaMenu menuvista = new vistaMenu();
        LoginControlador controlador = new LoginControlador(vista, modelo, menuvista);
        vista.setControlador(controlador);
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarInicioActionPerformed

    private void btnRealizarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPrestamoActionPerformed

        vistaPrestamo vistaPrestamo = new vistaPrestamo(idUsuario, tipoUsuario);
        vistaPrestamo.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_btnRealizarPrestamoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String titulo = txtTitulo.getText();
        String autor = txtAutor.getText();
        String tipoMaterial = cmbMaterial.getSelectedItem().toString();

        BuscarMaterialControlador controlador = new BuscarMaterialControlador();
        EjemplarTableModelo modeloTabla = controlador.buscarEjemplares(titulo, autor, tipoMaterial);

        if (controlador.esListaVacia(modeloTabla.getEjemplares())) {
            JOptionPane.showMessageDialog(this, "No se encontraron ejemplares", "Búsqueda", JOptionPane.INFORMATION_MESSAGE);
            controlador.limpiarTabla(modeloTabla);
        } else {
            jTable1.setModel(modeloTabla);
            ajustarAnchoColumnas();
            configurarTabla();
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        EjemplarTableModelo modelo = (EjemplarTableModelo) jTable1.getModel();
        modelo.limpiarDatos();
        modelo.fireTableDataChanged();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarMenuActionPerformed

    private void configurarBotones() {
        if (idUsuario == 0) {
            btnRealizarPrestamo.setVisible(false);
            btnRegresarMenu.setVisible(false);
        } else {
            btnRegresarInicio.setVisible(false);
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
            java.util.logging.Logger.getLogger(vistaBuscarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaBuscarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaBuscarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaBuscarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaBuscarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRealizarPrestamo;
    private javax.swing.JButton btnRegresarInicio;
    private javax.swing.JButton btnRegresarMenu;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbMaterial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblBuscarMaterial;
    private javax.swing.JLabel lblMaterial;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    private void Showpanel(vistaLogin vistaLogin) {
        dispose();
        vistaLogin frame1 = new vistaLogin();

        frame1.setSize(1100, 800);
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.setVisible(true);
    }

    private void Showpanel(vistaPrestamo vistaPrestamo) {
        dispose();
        vistaPrestamo frame2 = new vistaPrestamo(idUsuario, tipoUsuario);
        frame2.setSize(1100, 800);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame2.setVisible(true);
    }
}
