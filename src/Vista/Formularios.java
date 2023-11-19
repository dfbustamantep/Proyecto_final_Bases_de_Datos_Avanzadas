/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import SQL.CRUDSQL;
import javax.swing.JOptionPane;

/**
 *
 * @author Josed
 */
public class Formularios extends javax.swing.JFrame {

    CRUDSQL objcrud = new CRUDSQL();

    public Formularios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTextField3 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabelCantidad = new javax.swing.JLabel();
        jLabelIdVenta = new javax.swing.JLabel();
        txtIDventa = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        btnGuardarVent = new javax.swing.JButton();
        btnEditarVenta = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelSalir4 = new javax.swing.JLabel();
        btnInicioVenta = new javax.swing.JButton();
        jLabelIFecha = new javax.swing.JLabel();
        txtIFechaVenta = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblDocumentoEm = new javax.swing.JLabel();
        txtCodigoEmpleado = new javax.swing.JTextField();
        lblCodigoEm = new javax.swing.JLabel();
        lblnombreEm = new javax.swing.JLabel();
        lblFechaInEM = new javax.swing.JLabel();
        lblFechaNaEm = new javax.swing.JLabel();
        txtDocumentoEmpleado = new javax.swing.JTextField();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtFechaNacimientoEmpleado = new javax.swing.JTextField();
        txtFechaIngresoEmpleado = new javax.swing.JTextField();
        btnGuardarEmpleado = new javax.swing.JButton();
        txtSalarioEmpleado = new javax.swing.JTextField();
        lblSalario = new javax.swing.JLabel();
        lblFechaSaEm = new javax.swing.JLabel();
        txtFechaSalidaEmpleado = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabelSalir3 = new javax.swing.JLabel();
        btnInicioEmpleado = new javax.swing.JButton();
        btnEditarEmpleado = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblDocumentoEm1 = new javax.swing.JLabel();
        txtNumCha = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        lblCodigoEm1 = new javax.swing.JLabel();
        lblnombreEm1 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtIDinterno = new javax.swing.JTextField();
        lblFechaNaEm1 = new javax.swing.JLabel();
        lblFechaInEM1 = new javax.swing.JLabel();
        txtFechaENAu = new javax.swing.JTextField();
        txtFechaSaAu = new javax.swing.JTextField();
        lblFechaSaEm1 = new javax.swing.JLabel();
        BtnGuardarAutomtor = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabelSalir2 = new javax.swing.JLabel();
        btnEditarAutomotor = new javax.swing.JButton();
        btnInicioAutomotor = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDocumentoCl = new javax.swing.JTextField();
        txtNombreCl = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFechaInCl = new javax.swing.JTextField();
        btnGuardarCliente = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabelSalir1 = new javax.swing.JLabel();
        btnInicioClientes = new javax.swing.JButton();
        btnEditarClientes = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDsucursal = new javax.swing.JTextField();
        txtNombresu = new javax.swing.JTextField();
        BtnGuardarSsucursal = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelSalir = new javax.swing.JLabel();
        BtnInicioSuscursal = new javax.swing.JButton();
        BtnEditarSucrusal = new javax.swing.JButton();

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

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCantidad.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCantidad.setText("Cantidad");
        jLabelCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelIdVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelIdVenta.setForeground(new java.awt.Color(0, 0, 0));
        jLabelIdVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIdVenta.setText("Id de la venta");
        jLabelIdVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtIDventa.setBackground(new java.awt.Color(255, 255, 255));
        txtIDventa.setForeground(new java.awt.Color(0, 0, 0));
        txtIDventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDventaActionPerformed(evt);
            }
        });

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnGuardarVent.setBackground(new java.awt.Color(0, 153, 153));
        btnGuardarVent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarVent.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarVent.setText("Guardar");
        btnGuardarVent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGuardarVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVentActionPerformed(evt);
            }
        });

        btnEditarVenta.setBackground(new java.awt.Color(0, 153, 153));
        btnEditarVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditarVenta.setForeground(new java.awt.Color(0, 0, 0));
        btnEditarVenta.setText("Editar");
        btnEditarVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEditarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarVentaActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        jPanel7.setForeground(new java.awt.Color(91, 233, 168));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Registro de venta");

        jLabelSalir4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSalir4.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSalir4.setText("    X");
        jLabelSalir4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalir4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelSalir4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabelSalir4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(29, 29, 29))
        );

        btnInicioVenta.setBackground(new java.awt.Color(0, 153, 153));
        btnInicioVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInicioVenta.setForeground(new java.awt.Color(0, 0, 0));
        btnInicioVenta.setText("Inicio");
        btnInicioVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnInicioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioVentaActionPerformed(evt);
            }
        });

        jLabelIFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelIFecha.setForeground(new java.awt.Color(0, 0, 0));
        jLabelIFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIFecha.setText("Fecha de la venta");
        jLabelIFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtIFechaVenta.setBackground(new java.awt.Color(255, 255, 255));
        txtIFechaVenta.setForeground(new java.awt.Color(0, 0, 0));
        txtIFechaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIFechaVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelIFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(txtIFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIDventa, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnGuardarVent, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInicioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabelIFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarVent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
        );

        jTabbedPane1.addTab("Venta", jPanel3);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Registro de Empleados");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblDocumentoEm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDocumentoEm.setForeground(new java.awt.Color(0, 0, 0));
        lblDocumentoEm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocumentoEm.setText("Documento");
        lblDocumentoEm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtCodigoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigoEmpleado.setForeground(new java.awt.Color(0, 0, 0));

        lblCodigoEm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigoEm.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigoEm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigoEm.setText("Codigo");
        lblCodigoEm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblnombreEm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblnombreEm.setForeground(new java.awt.Color(0, 0, 0));
        lblnombreEm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnombreEm.setText("Nombre");
        lblnombreEm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFechaInEM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaInEM.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaInEM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaInEM.setText("Fecha de ingreso");
        lblFechaInEM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFechaNaEm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaNaEm.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaNaEm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaNaEm.setText("Fecha de nacimiento");
        lblFechaNaEm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDocumentoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txtDocumentoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtDocumentoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoEmpleadoActionPerformed(evt);
            }
        });

        txtNombreEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmpleadoActionPerformed(evt);
            }
        });

        txtFechaNacimientoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaNacimientoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaNacimientoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNacimientoEmpleadoActionPerformed(evt);
            }
        });

        txtFechaIngresoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaIngresoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaIngresoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaIngresoEmpleadoActionPerformed(evt);
            }
        });

        btnGuardarEmpleado.setBackground(new java.awt.Color(0, 153, 153));
        btnGuardarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarEmpleado.setText("Guardar");
        btnGuardarEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpleadoActionPerformed(evt);
            }
        });

        txtSalarioEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txtSalarioEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtSalarioEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioEmpleadoActionPerformed(evt);
            }
        });

        lblSalario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSalario.setForeground(new java.awt.Color(0, 0, 0));
        lblSalario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalario.setText("Salario");
        lblSalario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFechaSaEm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaSaEm.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaSaEm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaSaEm.setText("Fecha de salida");
        lblFechaSaEm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtFechaSalidaEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaSalidaEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaSalidaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaSalidaEmpleadoActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(0, 153, 153));
        jPanel9.setForeground(new java.awt.Color(91, 233, 168));

        jLabelSalir3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSalir3.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSalir3.setText("    X");
        jLabelSalir3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalir3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelSalir3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabelSalir3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        btnInicioEmpleado.setBackground(new java.awt.Color(0, 153, 153));
        btnInicioEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInicioEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        btnInicioEmpleado.setText("Inicio");
        btnInicioEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnInicioEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioEmpleadoActionPerformed(evt);
            }
        });

        btnEditarEmpleado.setBackground(new java.awt.Color(0, 153, 153));
        btnEditarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditarEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        btnEditarEmpleado.setText("Editar");
        btnEditarEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFechaInEM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFechaNaEm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblnombreEm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCodigoEm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDocumentoEm, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFechaNacimientoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaIngresoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDocumentoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaSaEm, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFechaSalidaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnInicioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocumentoEm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocumentoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoEm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombreEm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaNaEm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaNacimientoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaInEM, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaIngresoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaSaEm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaSalidaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addContainerGap(431, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Empleado", jPanel5);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblDocumentoEm1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDocumentoEm1.setForeground(new java.awt.Color(0, 0, 0));
        lblDocumentoEm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocumentoEm1.setText("Numero del chasis");
        lblDocumentoEm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNumCha.setBackground(new java.awt.Color(255, 255, 255));
        txtNumCha.setForeground(new java.awt.Color(0, 0, 0));
        txtNumCha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumChaActionPerformed(evt);
            }
        });

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));

        lblCodigoEm1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigoEm1.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigoEm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigoEm1.setText("Precio");
        lblCodigoEm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblnombreEm1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblnombreEm1.setForeground(new java.awt.Color(0, 0, 0));
        lblnombreEm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnombreEm1.setText("Placa");
        lblnombreEm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPlaca.setBackground(new java.awt.Color(255, 255, 255));
        txtPlaca.setForeground(new java.awt.Color(0, 0, 0));
        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });

        txtIDinterno.setBackground(new java.awt.Color(255, 255, 255));
        txtIDinterno.setForeground(new java.awt.Color(0, 0, 0));
        txtIDinterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDinternoActionPerformed(evt);
            }
        });

        lblFechaNaEm1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaNaEm1.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaNaEm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaNaEm1.setText("ID interno");
        lblFechaNaEm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFechaInEM1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaInEM1.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaInEM1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaInEM1.setText("Fecha de Entrada");
        lblFechaInEM1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtFechaENAu.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaENAu.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaENAu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaENAuActionPerformed(evt);
            }
        });

        txtFechaSaAu.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaSaAu.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaSaAu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaSaAuActionPerformed(evt);
            }
        });

        lblFechaSaEm1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaSaEm1.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaSaEm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaSaEm1.setText("Fecha de salida");
        lblFechaSaEm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnGuardarAutomtor.setBackground(new java.awt.Color(0, 153, 153));
        BtnGuardarAutomtor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnGuardarAutomtor.setForeground(new java.awt.Color(0, 0, 0));
        BtnGuardarAutomtor.setText("Guardar");
        BtnGuardarAutomtor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnGuardarAutomtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarAutomtorActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(0, 153, 153));
        jPanel11.setForeground(new java.awt.Color(91, 233, 168));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Registro de Automotor");

        jLabelSalir2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSalir2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSalir2.setText("    X");
        jLabelSalir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalir2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabelSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        btnEditarAutomotor.setBackground(new java.awt.Color(0, 153, 153));
        btnEditarAutomotor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditarAutomotor.setForeground(new java.awt.Color(0, 0, 0));
        btnEditarAutomotor.setText("Editar");
        btnEditarAutomotor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEditarAutomotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAutomotorActionPerformed(evt);
            }
        });

        btnInicioAutomotor.setBackground(new java.awt.Color(0, 153, 153));
        btnInicioAutomotor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInicioAutomotor.setForeground(new java.awt.Color(0, 0, 0));
        btnInicioAutomotor.setText("Inicio");
        btnInicioAutomotor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnInicioAutomotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioAutomotorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblFechaInEM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFechaNaEm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblnombreEm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCodigoEm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDocumentoEm1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtIDinterno, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFechaENAu, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumCha, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFechaSaEm1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(txtFechaSaAu, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInicioAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnGuardarAutomtor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocumentoEm1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumCha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoEm1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombreEm1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaNaEm1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDinterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaInEM1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaENAu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaSaEm1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaSaAu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardarAutomtor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicioAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Automotor", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Documento");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDocumentoCl.setBackground(new java.awt.Color(255, 255, 255));
        txtDocumentoCl.setForeground(new java.awt.Color(0, 0, 0));
        txtDocumentoCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoClActionPerformed(evt);
            }
        });

        txtNombreCl.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCl.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Nombre");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Fecha de inicio");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtFechaInCl.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaInCl.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaInCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaInClActionPerformed(evt);
            }
        });

        btnGuardarCliente.setBackground(new java.awt.Color(0, 153, 153));
        btnGuardarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarCliente.setText("Guardar");
        btnGuardarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(0, 153, 153));
        jPanel8.setForeground(new java.awt.Color(91, 233, 168));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Registro de Clientes");

        jLabelSalir1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSalir1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSalir1.setText("    X");
        jLabelSalir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalir1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabelSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel8)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        btnInicioClientes.setBackground(new java.awt.Color(0, 153, 153));
        btnInicioClientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInicioClientes.setForeground(new java.awt.Color(0, 0, 0));
        btnInicioClientes.setText("Inicio");
        btnInicioClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnInicioClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioClientesActionPerformed(evt);
            }
        });

        btnEditarClientes.setBackground(new java.awt.Color(0, 153, 153));
        btnEditarClientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditarClientes.setForeground(new java.awt.Color(0, 0, 0));
        btnEditarClientes.setText("Editar");
        btnEditarClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEditarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(txtDocumentoCl, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreCl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFechaInCl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnInicioClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocumentoCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaInCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicioClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jPanel4);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID sucursal");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtIDsucursal.setBackground(new java.awt.Color(255, 255, 255));
        txtIDsucursal.setForeground(new java.awt.Color(0, 0, 0));
        txtIDsucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDsucursalActionPerformed(evt);
            }
        });

        txtNombresu.setBackground(new java.awt.Color(255, 255, 255));
        txtNombresu.setForeground(new java.awt.Color(0, 0, 0));
        txtNombresu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresuActionPerformed(evt);
            }
        });

        BtnGuardarSsucursal.setBackground(new java.awt.Color(0, 153, 153));
        BtnGuardarSsucursal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnGuardarSsucursal.setForeground(new java.awt.Color(0, 0, 0));
        BtnGuardarSsucursal.setText("Guardar");
        BtnGuardarSsucursal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnGuardarSsucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarSsucursalActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(0, 153, 153));
        jPanel10.setForeground(new java.awt.Color(91, 233, 168));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Regisro de Sucursal");

        jLabelSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSalir.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSalir.setText("    X");
        jLabelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        BtnInicioSuscursal.setBackground(new java.awt.Color(0, 153, 153));
        BtnInicioSuscursal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnInicioSuscursal.setForeground(new java.awt.Color(0, 0, 0));
        BtnInicioSuscursal.setText("Inicio");
        BtnInicioSuscursal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnInicioSuscursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicioSuscursalActionPerformed(evt);
            }
        });

        BtnEditarSucrusal.setBackground(new java.awt.Color(0, 153, 153));
        BtnEditarSucrusal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnEditarSucrusal.setForeground(new java.awt.Color(0, 0, 0));
        BtnEditarSucrusal.setText("Editar");
        BtnEditarSucrusal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnEditarSucrusal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarSucrusalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(txtIDsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(txtNombresu, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnInicioSuscursal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnGuardarSsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnEditarSucrusal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(102, 102, 102))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombresu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardarSsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnInicioSuscursal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEditarSucrusal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sucursal", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDsucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDsucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDsucursalActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void txtNombresuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresuActionPerformed

    private void BtnGuardarSsucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarSsucursalActionPerformed
        objcrud.insertarSucursal(txtIDsucursal.getText(), txtNombresu.getText());

        txtIDsucursal.setText("");
        txtNombresu.setText("");
    }//GEN-LAST:event_BtnGuardarSsucursalActionPerformed

    private void txtDocumentoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoEmpleadoActionPerformed

    private void txtNombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEmpleadoActionPerformed

    private void txtFechaNacimientoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNacimientoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacimientoEmpleadoActionPerformed

    private void txtFechaIngresoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaIngresoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaIngresoEmpleadoActionPerformed

    private void btnGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpleadoActionPerformed
        objcrud.insertarEmpleado(txtDocumentoEmpleado.getText(), txtCodigoEmpleado.getText(), txtNombreEmpleado.getText(), txtFechaNacimientoEmpleado.getText(), txtFechaIngresoEmpleado.getText(), txtFechaSalidaEmpleado.getText(), txtSalarioEmpleado.getText());

        txtCodigoEmpleado.setText("");
        txtDocumentoEmpleado.setText("");
        txtNombreEmpleado.setText("");
        txtFechaNacimientoEmpleado.setText("");
        txtFechaIngresoEmpleado.setText("");
        txtFechaSalidaEmpleado.setText("");
        txtSalarioEmpleado.setText("");


    }//GEN-LAST:event_btnGuardarEmpleadoActionPerformed

    private void txtSalarioEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioEmpleadoActionPerformed

    private void txtFechaSalidaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaSalidaEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaSalidaEmpleadoActionPerformed

    private void txtDocumentoClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoClActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoClActionPerformed

    private void txtNombreClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClActionPerformed

    private void txtFechaInClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaInClActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaInClActionPerformed

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed

        objcrud.insertarCleinte(txtDocumentoCl.getText(), txtNombreCl.getText(), txtFechaInCl.getText());

        txtDocumentoCl.setText("");
        txtNombreCl.setText("");
        txtFechaInCl.setText("");

    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void txtIDventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDventaActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnGuardarVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVentActionPerformed
        objcrud.insertarVenta(txtIDventa.getText(), txtIFechaVenta.getText(), txtCantidad.getText());

        txtCantidad.setText("");
        txtIFechaVenta.setText("");
        txtIDventa.setText("");

    }//GEN-LAST:event_btnGuardarVentActionPerformed

    private void txtNumChaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumChaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumChaActionPerformed

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void txtIDinternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDinternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDinternoActionPerformed

    private void txtFechaENAuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaENAuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaENAuActionPerformed

    private void txtFechaSaAuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaSaAuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaSaAuActionPerformed

    private void BtnGuardarAutomtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarAutomtorActionPerformed
        objcrud.insertarAutomotr(txtNumCha.getText(), txtPrecio.getText(), txtPlaca.getText(), txtIDinterno.getText(), txtFechaENAu.getText(), txtFechaSaAu.getText());

        txtNumCha.setText("");
        txtPrecio.setText("");
        txtPlaca.setText("");
        txtIDinterno.setText("");
        txtFechaENAu.setText("");
        txtFechaSaAu.setText("");

    }//GEN-LAST:event_BtnGuardarAutomtorActionPerformed

    private void btnEditarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarVentaActionPerformed


    }//GEN-LAST:event_btnEditarVentaActionPerformed

    private void btnInicioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioVentaActionPerformed
        this.setVisible(false);
        new Inicio().setVisible(true);
    }//GEN-LAST:event_btnInicioVentaActionPerformed

    private void btnInicioEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioEmpleadoActionPerformed
        this.setVisible(false);
        new Inicio().setVisible(true);
    }//GEN-LAST:event_btnInicioEmpleadoActionPerformed

    private void btnEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarEmpleadoActionPerformed

    private void btnEditarAutomotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAutomotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarAutomotorActionPerformed

    private void btnInicioAutomotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioAutomotorActionPerformed
        this.setVisible(false);
        new Inicio().setVisible(true);
    }//GEN-LAST:event_btnInicioAutomotorActionPerformed

    private void btnInicioClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioClientesActionPerformed
        this.setVisible(false);
        new Inicio().setVisible(true);
    }//GEN-LAST:event_btnInicioClientesActionPerformed

    private void btnEditarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarClientesActionPerformed

    private void BtnInicioSuscursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioSuscursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnInicioSuscursalActionPerformed

    private void BtnEditarSucrusalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarSucrusalActionPerformed
        editarSucursal objsiguiente = new editarSucursal();

        objsiguiente.setVisible(true);
        objsiguiente.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_BtnEditarSucrusalActionPerformed

    private void txtIFechaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIFechaVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIFechaVentaActionPerformed

    private void jLabelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseClicked
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema\nTenga un buen día");
        System.exit(0);
    }//GEN-LAST:event_jLabelSalirMouseClicked

    private void jLabelSalir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalir1MouseClicked
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema\nTenga un buen día");
        System.exit(0);
    }//GEN-LAST:event_jLabelSalir1MouseClicked

    private void jLabelSalir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalir2MouseClicked
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema\nTenga un buen día");
        System.exit(0);
    }//GEN-LAST:event_jLabelSalir2MouseClicked

    private void jLabelSalir3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalir3MouseClicked
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema\nTenga un buen día");
        System.exit(0);
    }//GEN-LAST:event_jLabelSalir3MouseClicked

    private void jLabelSalir4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalir4MouseClicked
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema\nTenga un buen día");
        System.exit(0);
    }//GEN-LAST:event_jLabelSalir4MouseClicked
    
    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formularios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditarSucrusal;
    private javax.swing.JButton BtnGuardarAutomtor;
    private javax.swing.JButton BtnGuardarSsucursal;
    private javax.swing.JButton BtnInicioSuscursal;
    private javax.swing.JButton btnEditarAutomotor;
    private javax.swing.JButton btnEditarClientes;
    private javax.swing.JButton btnEditarEmpleado;
    private javax.swing.JButton btnEditarVenta;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnGuardarEmpleado;
    private javax.swing.JButton btnGuardarVent;
    private javax.swing.JButton btnInicioAutomotor;
    private javax.swing.JButton btnInicioClientes;
    private javax.swing.JButton btnInicioEmpleado;
    private javax.swing.JButton btnInicioVenta;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelIFecha;
    private javax.swing.JLabel jLabelIdVenta;
    private javax.swing.JLabel jLabelSalir;
    private javax.swing.JLabel jLabelSalir1;
    private javax.swing.JLabel jLabelSalir2;
    private javax.swing.JLabel jLabelSalir3;
    private javax.swing.JLabel jLabelSalir4;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblCodigoEm;
    private javax.swing.JLabel lblCodigoEm1;
    private javax.swing.JLabel lblDocumentoEm;
    private javax.swing.JLabel lblDocumentoEm1;
    private javax.swing.JLabel lblFechaInEM;
    private javax.swing.JLabel lblFechaInEM1;
    private javax.swing.JLabel lblFechaNaEm;
    private javax.swing.JLabel lblFechaNaEm1;
    private javax.swing.JLabel lblFechaSaEm;
    private javax.swing.JLabel lblFechaSaEm1;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblnombreEm;
    private javax.swing.JLabel lblnombreEm1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigoEmpleado;
    private javax.swing.JTextField txtDocumentoCl;
    private javax.swing.JTextField txtDocumentoEmpleado;
    private javax.swing.JTextField txtFechaENAu;
    private javax.swing.JTextField txtFechaInCl;
    private javax.swing.JTextField txtFechaIngresoEmpleado;
    private javax.swing.JTextField txtFechaNacimientoEmpleado;
    private javax.swing.JTextField txtFechaSaAu;
    private javax.swing.JTextField txtFechaSalidaEmpleado;
    private javax.swing.JTextField txtIDinterno;
    private javax.swing.JTextField txtIDsucursal;
    private javax.swing.JTextField txtIDventa;
    private javax.swing.JTextField txtIFechaVenta;
    private javax.swing.JTextField txtNombreCl;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtNombresu;
    private javax.swing.JTextField txtNumCha;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSalarioEmpleado;
    // End of variables declaration//GEN-END:variables
}
