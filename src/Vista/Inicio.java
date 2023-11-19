/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import SQL.CRUDSQL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Josed
 */
public class Inicio extends javax.swing.JFrame {

    
    public Inicio() {
        initComponents();
        LocalDate now=LocalDate.now();
        Locale spanishLocale=new Locale("es","ES");
        jLabelFecha.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' YYYY",spanishLocale)));
        
        StringBuilder informacion = new StringBuilder();
                informacion.append("El concesionario BUENAUTO es un concesionario creado por colombianos con una gran trayectoria,").append("\n");
                informacion.append("fundados en el año de 1980 por Jose Quintero ,Heider Leyton y Daniel Bustamante.El concesionario ").append("\n");
                informacion.append("comenzo con una sede en Medellin y hoy cuenta con sedes en las diferentes ciudades de Colombia.").append("\n");
                //informacion.append("").append("\n");
                
                
        //String a = informacion.toString();
        jTextTexto.setText(informacion.toString());
        jTextTexto.setEditable(false);
    }
CRUDSQL objcrud = new CRUDSQL();
    

    @SuppressWarnings("unchecked")
   /*private void iniciarComponentes(){
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTextField3 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        
        btnRegistro = new javax.swing.JButton();
        JTextArea jTextArea1 = new javax.swing.JTextArea();
        
        jTextArea1.setText("El concesionario BUENAUTO es un concesionario creado por colombianos con una gran trayectoria, "
                + "fundados en el año de 1980 por Jose David Quintero Guerrero, Heider Sait Leyton Montiel y Daniel Felipe Bustamante Pérez. "
                + "El concesionario comenzó con una sede en Medellín y hoy cuenta con sedes en las diferentes ciudades de Colombia.");
        jTextArea1.setEditable(false);
        
        // Añadir el JTextArea al JPanel
        jPanel1.add(jTextArea1);
        //jPanel1.setVisible(true);
        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel16.setBackground(new java.awt.Color(91, 233, 168));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(61, 225, 143));

        jLabelFecha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFecha.setText("BUENAUTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelFecha)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 80));

        btnRegistro.setBackground(new java.awt.Color(61, 225, 143));
        btnRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistro.setText("Realizar registro");
        btnRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel16.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 120, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
   */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTextField3 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelSalir = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        jLabelFecha = new javax.swing.JLabel();
        jTextTexto = new javax.swing.JTextArea();
        jLabelImagen = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("BUENAUTO");

        jLabelSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSalir.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSalir.setText("    X");
        jLabelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(jLabelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelTitulo)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 80));

        btnRegistro.setBackground(new java.awt.Color(0, 153, 153));
        btnRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistro.setText("Realizar registros");
        btnRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel16.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 120, 50));

        jLabelFecha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(51, 51, 51));
        jLabelFecha.setText("Fecha");
        jPanel16.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 610, -1));

        jTextTexto.setBackground(new java.awt.Color(255, 255, 255));
        jTextTexto.setColumns(20);
        jTextTexto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextTexto.setForeground(new java.awt.Color(0, 0, 0));
        jTextTexto.setRows(5);
        jTextTexto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextTexto.setEnabled(false);
        jPanel16.add(jTextTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 630, 80));

        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenInicio.png"))); // NOI18N
        jLabelImagen.setToolTipText("");
        jPanel16.add(jLabelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
            
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        this.setVisible(false);
        new Formularios().setVisible(true);
        
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void jLabelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseClicked
        JOptionPane.showMessageDialog(null,"Gracias por usar nuestro sistema\nTenga un buen día");
        System.exit(0);
    }//GEN-LAST:event_jLabelSalirMouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistro;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelSalir;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextArea jTextTexto;
    // End of variables declaration//GEN-END:variables
}
