/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import GEtset.variables;
import SQL.CRUDSQL;

/**
 *
 * @author Josed
 */
public class mostrar extends javax.swing.JFrame {

    
    public mostrar() {
        initComponents();
        IDsucursal.setEditable(false);
    }
    
    CRUDSQL crud = new CRUDSQL();
    variables var = new variables();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIDbuscar = new javax.swing.JTextField();
        BtnBuscarSu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        IDcuidadSU = new javax.swing.JTextField();
        IDsucursal = new javax.swing.JTextField();
        NombreSucursal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnActuaSu = new javax.swing.JButton();
        btnBorrarSU = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jTabbedPane2.setBackground(new java.awt.Color(91, 233, 168));
        jTabbedPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane2.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID a buscar");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtIDbuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtIDbuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtIDbuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtIDbuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIDbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDbuscarActionPerformed(evt);
            }
        });

        BtnBuscarSu.setBackground(new java.awt.Color(0, 153, 153));
        BtnBuscarSu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnBuscarSu.setForeground(new java.awt.Color(0, 0, 0));
        BtnBuscarSu.setText("Buscar");
        BtnBuscarSu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnBuscarSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarSuActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID cuidad");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        IDcuidadSU.setBackground(new java.awt.Color(255, 255, 255));
        IDcuidadSU.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IDcuidadSU.setForeground(new java.awt.Color(0, 0, 0));
        IDcuidadSU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        IDcuidadSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDcuidadSUActionPerformed(evt);
            }
        });

        IDsucursal.setBackground(new java.awt.Color(255, 255, 255));
        IDsucursal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IDsucursal.setForeground(new java.awt.Color(0, 0, 0));
        IDsucursal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        IDsucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDsucursalActionPerformed(evt);
            }
        });

        NombreSucursal.setBackground(new java.awt.Color(255, 255, 255));
        NombreSucursal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NombreSucursal.setForeground(new java.awt.Color(0, 0, 0));
        NombreSucursal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NombreSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreSucursalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID Sucursal");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnActuaSu.setBackground(new java.awt.Color(0, 153, 153));
        BtnActuaSu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnActuaSu.setForeground(new java.awt.Color(0, 0, 0));
        BtnActuaSu.setText("Actualizar");
        BtnActuaSu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnActuaSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActuaSuActionPerformed(evt);
            }
        });

        btnBorrarSU.setBackground(new java.awt.Color(0, 153, 153));
        btnBorrarSU.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBorrarSU.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrarSU.setText("Borrar");
        btnBorrarSU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBorrarSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarSUActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(61, 225, 143));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Editar Sucursal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel14)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnVolver.setBackground(new java.awt.Color(0, 153, 153));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDcuidadSU, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtIDbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnBuscarSu, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnActuaSu, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrarSU, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnBuscarSu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIDbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(IDsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(IDcuidadSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(NombreSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnActuaSu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrarSU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jTabbedPane2.addTab("Sucursal", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Formularios objregresar = new Formularios();

        objregresar.setVisible(true);
        objregresar.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBorrarSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarSUActionPerformed
        CRUDSQL objcrud = new CRUDSQL();
        variables var = new variables();

        var.setId_sucursal(txtIDbuscar.getText());

        objcrud.eliminar(var.getId_sucursal());

        txtIDbuscar.setText("");
        IDsucursal.setText("");
        IDcuidadSU.setText("");
        NombreSucursal.setText("");

    }//GEN-LAST:event_btnBorrarSUActionPerformed

    private void BtnActuaSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActuaSuActionPerformed
        CRUDSQL objcrud = new CRUDSQL();
        variables var = new variables();

        var.setId_sucursal(IDsucursal.getText());
        var.setCuidad(IDcuidadSU.getText());
        var.setNombre(NombreSucursal.getText());

        objcrud.actualizarSucursal(var.getCuidad(), var.getNombre(), var.getId_sucursal() );

        txtIDbuscar.setText("");
        IDsucursal.setText("");
        IDcuidadSU.setText("");
        NombreSucursal.setText("");

    }//GEN-LAST:event_BtnActuaSuActionPerformed

    private void NombreSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreSucursalActionPerformed

    private void IDsucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDsucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDsucursalActionPerformed

    private void IDcuidadSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDcuidadSUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDcuidadSUActionPerformed

    private void BtnBuscarSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarSuActionPerformed
        crud.mostrarSucursal(txtIDbuscar.getText());

        IDsucursal.setText(var.getId_sucursal());
        IDcuidadSU.setText(var.getCuidad());
        NombreSucursal.setText(var.getNombre());

    }//GEN-LAST:event_BtnBuscarSuActionPerformed

    private void txtIDbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDbuscarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        new Formularios().setVisible(true);
        
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mostrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActuaSu;
    private javax.swing.JButton BtnBuscarSu;
    private javax.swing.JTextField IDcuidadSU;
    private javax.swing.JTextField IDsucursal;
    private javax.swing.JTextField NombreSucursal;
    private javax.swing.JButton btnBorrarSU;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtIDbuscar;
    // End of variables declaration//GEN-END:variables
}
