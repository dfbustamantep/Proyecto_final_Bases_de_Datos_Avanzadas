/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import GEtset.RepMarAutMasVendAnuSuc;
import GEtset.Sucursal;
import SQL.CRUDSQL;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HEIDER
 */
public class ReporteMarcaAutoMasVendidoMensualSucursal extends javax.swing.JFrame {

    CRUDSQL objcrud = new CRUDSQL();
    ArrayList<Sucursal> listaSucursalAux = new ArrayList<>();
    ArrayList<RepMarAutMasVendAnuSuc> listaAutosMasVendidosAnualSucursal = new ArrayList<>();
    DefaultTableModel modelo;

    public ReporteMarcaAutoMasVendidoMensualSucursal() {

        listaSucursalAux = objcrud.obtenerSucursales();
        initComponents();
        jTableTablaAutosMasVendidosMensualSucursal.setVisible(false);

        for (int i = 0; i < listaSucursalAux.size(); i++) {
            jComboBoxSucursales.addItem(listaSucursalAux.get(i).getNombre());
        }
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
        jButton1 = new javax.swing.JButton();
        jComboBoxMeses = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAño = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelSalir4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTablaAutosMasVendidosMensualSucursal = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxSucursales = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 80, 30));

        jComboBoxMeses.setBackground(null);
        jComboBoxMeses.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBoxMeses.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxMeses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jPanel1.add(jComboBoxMeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 120, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mes");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Año");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jTextFieldAño.setBackground(null);
        jTextFieldAño.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldAño.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAño.setText(" ");
        jTextFieldAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAñoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 120, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabelSalir4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSalir4.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSalir4.setText("    X");
        jLabelSalir4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalir4MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Reporte de la marca de automotores mas vendidos por mes - sucursal");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabelSalir4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelSalir4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Generar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        jTableTablaAutosMasVendidosMensualSucursal.setBackground(null);
        jTableTablaAutosMasVendidosMensualSucursal.setForeground(new java.awt.Color(0, 0, 0));
        jTableTablaAutosMasVendidosMensualSucursal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre marca", "Id marca", "Cantidad", "Estatus"
            }
        ));
        jTableTablaAutosMasVendidosMensualSucursal.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(jTableTablaAutosMasVendidosMensualSucursal);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 440, 100));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sucursal");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jComboBoxSucursales.setBackground(null);
        jComboBoxSucursales.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxSucursales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jPanel1.add(jComboBoxSucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAñoActionPerformed

    private void jLabelSalir4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalir4MouseClicked
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema\nTenga un buen día");
        System.exit(0);
    }//GEN-LAST:event_jLabelSalir4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new Reportes().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jComboBoxSucursales.getSelectedItem().equals("") || jTextFieldAño.getText().equals("") || jComboBoxMeses.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "rellene los campos requeridos");
            jComboBoxMeses.setSelectedItem("");
            jComboBoxSucursales.setSelectedItem("");
            jTextFieldAño.setText("");
            jTableTablaAutosMasVendidosMensualSucursal.setVisible(false);
        } else {
            Object datos[] = new Object[5];
            String nombreSucursalAux = jComboBoxSucursales.getSelectedItem() + "";
            String id_sucursal = "";
            String año = jTextFieldAño.getText();
            String mes = jComboBoxMeses.getSelectedItem() + "";
            String numMes = "";
            for (int i = 0; i < listaSucursalAux.size(); i++) {
                if (nombreSucursalAux.equals(listaSucursalAux.get(i).getNombre())) {
                    id_sucursal = listaSucursalAux.get(i).getId_sucursal() + "";
                }
            }

            numMes = objcrud.ConvertirMesANumero(mes);

            listaAutosMasVendidosAnualSucursal = objcrud.obtenerRepMarAutMasVendAnuSuc(año, id_sucursal);
            modelo = (new DefaultTableModel());
            modelo.addColumn("Nombre_marca");
            modelo.addColumn("Id_marca");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Estatus");

            for (int i = 0; i < listaAutosMasVendidosAnualSucursal.size(); i++) {
                datos[0] = listaAutosMasVendidosAnualSucursal.get(i).getNombre_marca();
                datos[1] = listaAutosMasVendidosAnualSucursal.get(i).getId_marca();
                datos[2] = listaAutosMasVendidosAnualSucursal.get(i).getCantidad();
                datos[3] = listaAutosMasVendidosAnualSucursal.get(i).getEstatus();
                modelo.addRow(datos);
            }

            this.jTableTablaAutosMasVendidosMensualSucursal.setModel(modelo);
            this.jTableTablaAutosMasVendidosMensualSucursal.setVisible(true);

            int opc = JOptionPane.showConfirmDialog(rootPane, "Desea guardar el reporte en un archivo csv?");

            if (opc == JOptionPane.YES_OPTION) {
                try {
                    BufferedWriter outStream = new BufferedWriter(new FileWriter("reporte_marca_masVendida_mensualSucursal.csv", true));

                    // Escribir datos
                    for (int i = 0; i < listaAutosMasVendidosAnualSucursal.size(); i++) {
                        datos[0] = listaAutosMasVendidosAnualSucursal.get(i).getNombre_marca();
                        datos[1] = listaAutosMasVendidosAnualSucursal.get(i).getId_marca();
                        datos[2] = listaAutosMasVendidosAnualSucursal.get(i).getCantidad();
                        datos[3] = listaAutosMasVendidosAnualSucursal.get(i).getEstatus();
                        outStream.write(datos[0] + " , " + datos[1] + " , " + datos[2] + " , " + datos[3] + "\n");

                    }
                    outStream.close();
                    JOptionPane.showMessageDialog(null, "Datos guardados en reporte_marca_masVendida_mensualSucursal.csv");
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al guardar en el archivo CSV");
                }
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ReporteMarcaAutoMasVendidoMensualSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteMarcaAutoMasVendidoMensualSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteMarcaAutoMasVendidoMensualSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteMarcaAutoMasVendidoMensualSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteMarcaAutoMasVendidoMensualSucursal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxMeses;
    private javax.swing.JComboBox<String> jComboBoxSucursales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelSalir4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTablaAutosMasVendidosMensualSucursal;
    private javax.swing.JTextField jTextFieldAño;
    // End of variables declaration//GEN-END:variables
}
