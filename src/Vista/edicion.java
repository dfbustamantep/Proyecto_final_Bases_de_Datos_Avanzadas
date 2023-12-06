/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import GEtset.Automotor;
import GEtset.CiudadSucursal_Cliente;
import GEtset.Cliente;
import GEtset.Empleado;
import GEtset.Sucursal;
import GEtset.VariablesAuto;
import GEtset.VariablesCliente;
import GEtset.VariablesEmple;
import GEtset.VariablesVenta;
import GEtset.variables;
import SQL.CRUDSQL;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Josed
 */
public class edicion extends javax.swing.JFrame {
    
        ArrayList <CiudadSucursal_Cliente>  listaCiudad = new ArrayList<>();
        ArrayList <Sucursal>  listaSucursal = new ArrayList<>();
    
    public edicion() {
        
        
        initComponents();
        
        listaCiudad = crud.obtenerCiudad();
        listaSucursal = crud.obtenerSucursales();
        
        txtIDmostrarSu.setEditable(false);
        ChasisN.setEditable(false);
        DocumentoC.setEditable(false);
        CodigoEbus.setEditable(false);
        DocumentoE.setEditable(false);
        for(int i = 0 ; i < listaCiudad.size() ; i++){
        jComboBoxCiudadCliente.addItem(listaCiudad.get(i).getNombre());
        jComboBoxCiudadSucursal.addItem(listaCiudad.get(i).getNombre());
        }
        
        for(int i = 0 ; i < listaSucursal.size() ; i++){
        jComboBoxId_sucursal.addItem(listaSucursal.get(i).getNombre());
        }
        
    }
    
    CRUDSQL crud = new CRUDSQL();
    variables var = new variables();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        BuscarC = new javax.swing.JButton();
        ActualizarC = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        FechaIniC = new javax.swing.JTextField();
        NombreC = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        DocumentoC = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        DocumentoBusC = new javax.swing.JTextField();
        BorrarC = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabelSalir5 = new javax.swing.JLabel();
        btnVolver3 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jComboBoxId_sucursal = new javax.swing.JComboBox<>();
        jComboBoxCiudadCliente = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        Chasisbuscar = new javax.swing.JTextField();
        BuscarN = new javax.swing.JButton();
        ChasisN = new javax.swing.JTextField();
        PrecioN = new javax.swing.JTextField();
        IDInternoN = new javax.swing.JTextField();
        FechaEntradaN = new javax.swing.JTextField();
        FechaSalidaN = new javax.swing.JTextField();
        ActualizarN = new javax.swing.JButton();
        BorrarN = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabelSalir3 = new javax.swing.JLabel();
        btnVolver2 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        Placa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIDbuscarSu = new javax.swing.JTextField();
        BtnBuscarSu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        NombreSucursal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnActuaSu = new javax.swing.JButton();
        btnBorrarSU = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabelSalir = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        txtIDmostrarSu = new javax.swing.JTextField();
        jComboBoxCiudadSucursal = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        lblDocumentoEm = new javax.swing.JLabel();
        lblCodigoEm = new javax.swing.JLabel();
        lblnombreEm = new javax.swing.JLabel();
        lblFechaNaEm = new javax.swing.JLabel();
        lblFechaInEM = new javax.swing.JLabel();
        lblFechaSaEm = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        SalarioE = new javax.swing.JTextField();
        FechaSalidaE = new javax.swing.JTextField();
        FechaIngresoE = new javax.swing.JTextField();
        fechaNacimientoE = new javax.swing.JTextField();
        NombreE = new javax.swing.JTextField();
        CodigoE = new javax.swing.JTextField();
        DocumentoE = new javax.swing.JTextField();
        lblDocumentoEm1 = new javax.swing.JLabel();
        lblCodigoEm1 = new javax.swing.JLabel();
        CodigoEbus = new javax.swing.JTextField();
        DocumentoEBus = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ActualizarE = new javax.swing.JButton();
        BorrarE = new javax.swing.JButton();
        btnVolver4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabelSalir1 = new javax.swing.JLabel();

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane2.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        BuscarC.setBackground(new java.awt.Color(0, 153, 153));
        BuscarC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BuscarC.setForeground(new java.awt.Color(0, 0, 0));
        BuscarC.setText("Buscar");
        BuscarC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCActionPerformed(evt);
            }
        });

        ActualizarC.setBackground(new java.awt.Color(0, 153, 153));
        ActualizarC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ActualizarC.setForeground(new java.awt.Color(0, 0, 0));
        ActualizarC.setText("Actualizar");
        ActualizarC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ActualizarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarCActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Fecha de inicio");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        FechaIniC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaIniCActionPerformed(evt);
            }
        });

        NombreC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreCActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Nombre");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Documento");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        DocumentoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocumentoCActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Documento a buscar");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        DocumentoBusC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocumentoBusCActionPerformed(evt);
            }
        });

        BorrarC.setBackground(new java.awt.Color(0, 153, 153));
        BorrarC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BorrarC.setForeground(new java.awt.Color(0, 0, 0));
        BorrarC.setText("Borrar");
        BorrarC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BorrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarCActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(0, 153, 153));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Editar Cliente");

        jLabelSalir5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSalir5.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSalir5.setText("    X");
        jLabelSalir5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalir5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addComponent(jLabelSalir5)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabelSalir5)
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnVolver3.setBackground(new java.awt.Color(0, 153, 153));
        btnVolver3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver3.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver3.setText("Regresar");
        btnVolver3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVolver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver3ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Sucursal");
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Ciudad");
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBoxId_sucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBoxCiudadCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DocumentoC, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DocumentoBusC, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FechaIniC, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(BuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBoxCiudadCliente, javax.swing.GroupLayout.Alignment.LEADING, 0, 162, Short.MAX_VALUE)
                                .addComponent(jComboBoxId_sucursal, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(ActualizarC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(BorrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(BuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(NombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DocumentoBusC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DocumentoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FechaIniC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCiudadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxId_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ActualizarC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BorrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Cliente", jPanel5);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        BuscarN.setBackground(new java.awt.Color(0, 153, 153));
        BuscarN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BuscarN.setForeground(new java.awt.Color(0, 0, 0));
        BuscarN.setText("Buscar N. Chasis");
        BuscarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarNActionPerformed(evt);
            }
        });

        PrecioN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioNActionPerformed(evt);
            }
        });

        IDInternoN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IDInternoNFocusLost(evt);
            }
        });
        IDInternoN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDInternoNKeyTyped(evt);
            }
        });

        ActualizarN.setBackground(new java.awt.Color(0, 153, 153));
        ActualizarN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ActualizarN.setForeground(new java.awt.Color(0, 0, 0));
        ActualizarN.setText("Actualizar");
        ActualizarN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ActualizarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarNActionPerformed(evt);
            }
        });

        BorrarN.setBackground(new java.awt.Color(0, 153, 153));
        BorrarN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BorrarN.setForeground(new java.awt.Color(0, 0, 0));
        BorrarN.setText("Borrar");
        BorrarN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BorrarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarNActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Numero de chasis");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Numero de chasis a buscar");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Precio");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("ID interno");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Fecha de entrada");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Fecha de salida");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Editar Automotor");

        jLabelSalir3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSalir3.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSalir3.setText("    X");
        jLabelSalir3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalir3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSalir3)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabelSalir3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnVolver2.setBackground(new java.awt.Color(0, 153, 153));
        btnVolver2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver2.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver2.setText("Regresar");
        btnVolver2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver2ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Placa");
        jLabel26.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Placa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                PlacaFocusLost(evt);
            }
        });
        Placa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PlacaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ActualizarN, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(BorrarN, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FechaSalidaN))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Chasisbuscar))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FechaEntradaN))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDInternoN))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ChasisN))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PrecioN))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Placa, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                .addGap(6, 6, 6)))))
                .addGap(31, 31, 31)
                .addComponent(BuscarN)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Chasisbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(ChasisN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(BuscarN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(PrecioN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(IDInternoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaEntradaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaSalidaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ActualizarN, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BorrarN, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );

        jTabbedPane2.addTab("Automotor", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID a buscar");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtIDbuscarSu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtIDbuscarSu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIDbuscarSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDbuscarSuActionPerformed(evt);
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
        jLabel2.setText("Ciudad");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NombreSucursal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Editar Sucursal");

        jLabelSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelSalir)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnVolver.setBackground(new java.awt.Color(0, 153, 153));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver.setText("Regresar");
        btnVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtIDmostrarSu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtIDmostrarSu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIDmostrarSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDmostrarSuActionPerformed(evt);
            }
        });

        jComboBoxCiudadSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnActuaSu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(btnBorrarSU, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIDmostrarSu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(txtIDbuscarSu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NombreSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxCiudadSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnBuscarSu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIDbuscarSu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtIDmostrarSu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(BtnBuscarSu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxCiudadSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NombreSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBorrarSU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnActuaSu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Sucursal", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDocumentoEm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDocumentoEm.setForeground(new java.awt.Color(0, 0, 0));
        lblDocumentoEm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocumentoEm.setText("Documento");
        lblDocumentoEm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lblDocumentoEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 140, 26));

        lblCodigoEm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigoEm.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigoEm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigoEm.setText("Codigo");
        lblCodigoEm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lblCodigoEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 142, 26));

        lblnombreEm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblnombreEm.setForeground(new java.awt.Color(0, 0, 0));
        lblnombreEm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnombreEm.setText("Nombre");
        lblnombreEm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lblnombreEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 142, 26));

        lblFechaNaEm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaNaEm.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaNaEm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaNaEm.setText("Fecha de nacimiento");
        lblFechaNaEm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lblFechaNaEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 142, 26));

        lblFechaInEM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaInEM.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaInEM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaInEM.setText("Fecha de ingreso");
        lblFechaInEM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lblFechaInEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 142, 26));

        lblFechaSaEm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaSaEm.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaSaEm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaSaEm.setText("Fecha de salida");
        lblFechaSaEm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lblFechaSaEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 140, 26));

        lblSalario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSalario.setForeground(new java.awt.Color(0, 0, 0));
        lblSalario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalario.setText("Salario");
        lblSalario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lblSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 140, 26));

        SalarioE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalarioEActionPerformed(evt);
            }
        });
        jPanel4.add(SalarioE, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 162, -1));

        FechaSalidaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaSalidaEActionPerformed(evt);
            }
        });
        jPanel4.add(FechaSalidaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 162, -1));

        FechaIngresoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaIngresoEActionPerformed(evt);
            }
        });
        jPanel4.add(FechaIngresoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 162, -1));

        fechaNacimientoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaNacimientoEActionPerformed(evt);
            }
        });
        jPanel4.add(fechaNacimientoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 162, -1));

        NombreE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreEActionPerformed(evt);
            }
        });
        jPanel4.add(NombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 162, -1));
        jPanel4.add(CodigoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 162, -1));

        DocumentoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocumentoEActionPerformed(evt);
            }
        });
        jPanel4.add(DocumentoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 162, -1));

        lblDocumentoEm1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDocumentoEm1.setForeground(new java.awt.Color(0, 0, 0));
        lblDocumentoEm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocumentoEm1.setText("Documento a buscar");
        lblDocumentoEm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lblDocumentoEm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 161, 26));

        lblCodigoEm1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigoEm1.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigoEm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigoEm1.setText("Codigo a buscar");
        lblCodigoEm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lblCodigoEm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 161, 26));

        CodigoEbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoEbusActionPerformed(evt);
            }
        });
        jPanel4.add(CodigoEbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 162, -1));

        DocumentoEBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocumentoEBusActionPerformed(evt);
            }
        });
        jPanel4.add(DocumentoEBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 162, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 90, 40));

        ActualizarE.setBackground(new java.awt.Color(0, 153, 153));
        ActualizarE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ActualizarE.setForeground(new java.awt.Color(0, 0, 0));
        ActualizarE.setText("Actualizar");
        ActualizarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarEActionPerformed(evt);
            }
        });
        jPanel4.add(ActualizarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 100, 40));

        BorrarE.setBackground(new java.awt.Color(0, 153, 153));
        BorrarE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BorrarE.setForeground(new java.awt.Color(0, 0, 0));
        BorrarE.setText("Borrar");
        BorrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarEActionPerformed(evt);
            }
        });
        jPanel4.add(BorrarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 90, 40));

        btnVolver4.setBackground(new java.awt.Color(0, 153, 153));
        btnVolver4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver4.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver4.setText("Regresar");
        btnVolver4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVolver4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver4ActionPerformed(evt);
            }
        });
        jPanel4.add(btnVolver4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 100, 40));

        jPanel10.setBackground(new java.awt.Color(0, 153, 153));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Editar Empleado");

        jLabelSalir1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSalir1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSalir1.setText("    X");
        jLabelSalir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalir1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(jLabelSalir1)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabelSalir1)
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        jTabbedPane2.addTab("Empleado", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void txtIDmostrarSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDmostrarSuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDmostrarSuActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        new Formularios().setVisible(true);

    }//GEN-LAST:event_btnVolverActionPerformed

    private void jLabelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseClicked
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema\nTenga un buen día");
        System.exit(0);
    }//GEN-LAST:event_jLabelSalirMouseClicked

    private void btnBorrarSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarSUActionPerformed
        CRUDSQL objcrud = new CRUDSQL();
        variables var = new variables();

        var.setId_sucursal(txtIDbuscarSu.getText());

        objcrud.eliminarSucursal(var.getId_sucursal());

        txtIDbuscarSu.setText("");
        txtIDmostrarSu.setText("");
        //IDcuidadSU.setText("");
        NombreSucursal.setText("");
    }//GEN-LAST:event_btnBorrarSUActionPerformed

    private void BtnActuaSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActuaSuActionPerformed
        CRUDSQL objcrud = new CRUDSQL();
        String id_sucursal="";
        for(int i = 0 ; i < listaCiudad.size() ; i++){
            if(jComboBoxCiudadSucursal.getSelectedItem().equals(listaCiudad.get(i).getNombre())){
                id_sucursal = listaCiudad.get(i).getIdCiudad() + "";
            }
        }
        objcrud.actualizarSucursal(txtIDmostrarSu.getText(), id_sucursal , NombreSucursal.getText() );

        txtIDbuscarSu.setText("");
        txtIDmostrarSu.setText("");
        jComboBoxCiudadSucursal.setSelectedItem("");
        NombreSucursal.setText("");
    }//GEN-LAST:event_BtnActuaSuActionPerformed

    private void NombreSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreSucursalActionPerformed

    private void BtnBuscarSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarSuActionPerformed
        Sucursal datos = new Sucursal ();
        datos = crud.mostrarSucursal(txtIDbuscarSu.getText());

        txtIDmostrarSu.setText(datos.getId_sucursal() + "");
        NombreSucursal.setText(datos.getNombre());

        for(int i = 0 ; i < listaCiudad.size() ; i++){
            if(datos.getId_ciudad()== listaCiudad.get(i).getIdCiudad()){
                jComboBoxCiudadSucursal.setSelectedItem(listaCiudad.get(i).getNombre());
            }
        }
    }//GEN-LAST:event_BtnBuscarSuActionPerformed

    private void txtIDbuscarSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDbuscarSuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDbuscarSuActionPerformed

    private void PlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlacaKeyTyped
        IDInternoN.setText("");
        IDInternoN.setEditable(false);
    }//GEN-LAST:event_PlacaKeyTyped

    private void PlacaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PlacaFocusLost
        IDInternoN.setEditable(true);
    }//GEN-LAST:event_PlacaFocusLost

    private void btnVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver2ActionPerformed
        this.setVisible(false);
        new Formularios().setVisible(true);
    }//GEN-LAST:event_btnVolver2ActionPerformed

    private void jLabelSalir3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalir3MouseClicked
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema\nTenga un buen día");
        System.exit(0);
    }//GEN-LAST:event_jLabelSalir3MouseClicked

    private void BorrarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarNActionPerformed
        CRUDSQL objcrud = new CRUDSQL();
        VariablesAuto var1 = new VariablesAuto();

        var1.setNumero_de_chasis(Chasisbuscar.getText());

        objcrud.eliminarAuto(var1.getNumero_de_chasis());

        Chasisbuscar.setText("");
        ChasisN.setText("");
        PrecioN.setText("");
        FechaEntradaN.setText("");
        FechaSalidaN.setText("");
    }//GEN-LAST:event_BorrarNActionPerformed

    private void ActualizarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarNActionPerformed
        CRUDSQL objcrud = new CRUDSQL();
        VariablesAuto var1 = new VariablesAuto();

        var1.setNumero_de_chasis(Chasisbuscar.getText());
        var1.setPrecio(PrecioN.getText());
        var1.setID_Interno(IDInternoN.getText());
        var1.setFecha_entrada(FechaEntradaN.getText());
        var1.setFecha_salida(FechaSalidaN.getText());

        objcrud.actualizarAuto(Placa.getText(), PrecioN.getText(), IDInternoN.getText(), FechaEntradaN.getText(),FechaSalidaN.getText() ,ChasisN.getText() );

        Chasisbuscar.setText("");
        ChasisN.setText("");
        PrecioN.setText("");
        FechaEntradaN.setText("");
        FechaSalidaN.setText("");
        IDInternoN.setText("");
        Placa.setText("");
    }//GEN-LAST:event_ActualizarNActionPerformed

    private void IDInternoNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDInternoNKeyTyped
        Placa.setText("");
        Placa.setEditable(false);
    }//GEN-LAST:event_IDInternoNKeyTyped

    private void IDInternoNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDInternoNFocusLost
        Placa.setEditable(true);
    }//GEN-LAST:event_IDInternoNFocusLost

    private void PrecioNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioNActionPerformed

    private void BuscarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarNActionPerformed
        Automotor datos = new Automotor();
        datos = crud.mostrarAutomotor(Chasisbuscar.getText());

        ChasisN.setText(datos.getNumero_chasis() + "");
        PrecioN.setText(datos.getPrecio() + "");
        IDInternoN.setText(datos.getId_interno() + "");
        FechaEntradaN.setText(datos.getFecha_entrada());
        FechaSalidaN.setText(datos.getFecha_salida());
        Placa.setText(datos.getPlaca());

    }//GEN-LAST:event_BuscarNActionPerformed

    private void btnVolver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver3ActionPerformed
        this.setVisible(false);
        new Formularios().setVisible(true);
    }//GEN-LAST:event_btnVolver3ActionPerformed

    private void jLabelSalir5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalir5MouseClicked
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema\nTenga un buen día");
        System.exit(0);
    }//GEN-LAST:event_jLabelSalir5MouseClicked

    private void BorrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarCActionPerformed
        CRUDSQL objcrud = new CRUDSQL();
        VariablesCliente var3 = new VariablesCliente();

        var3.setDocumento(DocumentoBusC.getText());

        objcrud.eliminarCliente(var3.getDocumento());

        DocumentoBusC.setText("");
        DocumentoC.setText("");
        NombreC.setText("");
        FechaIniC.setText("");
        jComboBoxCiudadCliente.setSelectedItem("");
        jComboBoxId_sucursal.setSelectedItem("");
    }//GEN-LAST:event_BorrarCActionPerformed

    private void DocumentoBusCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocumentoBusCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocumentoBusCActionPerformed

    private void DocumentoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocumentoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocumentoCActionPerformed

    private void NombreCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreCActionPerformed

    private void FechaIniCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaIniCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaIniCActionPerformed

    private void ActualizarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarCActionPerformed
        CRUDSQL objcrud = new CRUDSQL();
        String id_ciudad ="";
        String id_sucursal ="";
        for(int i = 0 ; i < listaCiudad.size() ; i++){
            if(jComboBoxCiudadCliente.getSelectedItem().equals(listaCiudad.get(i).getNombre())){
                id_ciudad = listaCiudad.get(i).getIdCiudad() +"";
            }
        }
        for(int i = 0 ; i < listaSucursal.size() ; i++){
            if(jComboBoxId_sucursal.getSelectedItem().equals(listaSucursal.get(i).getNombre())){
                id_sucursal = listaSucursal.get(i).getId_sucursal()+"";
            }
        }

        objcrud.actualizarCliente(DocumentoC.getText(), NombreC.getText(), FechaIniC.getText() , id_ciudad , id_sucursal);

        DocumentoBusC.setText("");
        DocumentoC.setText("");
        NombreC.setText("");
        FechaIniC.setText("");
        jComboBoxCiudadCliente.setSelectedItem("");
        jComboBoxId_sucursal.setSelectedItem("");
    }//GEN-LAST:event_ActualizarCActionPerformed

    private void BuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCActionPerformed
        Cliente datos = new Cliente();
        datos = crud.mostrarCliente(DocumentoBusC.getText());

        DocumentoC.setText(datos.getDocumento() + "");
        NombreC.setText(datos.getNombre());
        FechaIniC.setText(datos.getFecha_inicio());
        for(int i = 0 ; i < listaCiudad.size() ; i++){
            if(datos.getId_ciudad() == listaCiudad.get(i).getIdCiudad()){
                jComboBoxCiudadCliente.setSelectedItem(listaCiudad.get(i).getNombre());
            }
        }

        for(int i = 0 ; i < listaSucursal.size() ; i++){
            if(datos.getId_sucursal() == listaSucursal.get(i).getId_sucursal()){
                jComboBoxId_sucursal.setSelectedItem(listaSucursal.get(i).getNombre());
            }
        }

    }//GEN-LAST:event_BuscarCActionPerformed

    private void jLabelSalir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalir1MouseClicked
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema\nTenga un buen día");
        System.exit(0);
    }//GEN-LAST:event_jLabelSalir1MouseClicked

    private void btnVolver4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver4ActionPerformed
        this.setVisible(false);
        new Formularios().setVisible(true);
    }//GEN-LAST:event_btnVolver4ActionPerformed

    private void BorrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarEActionPerformed
        CRUDSQL objcrud = new CRUDSQL();
        VariablesEmple var1 = new VariablesEmple();

        var1.setDocumento(DocumentoEBus.getText());

        objcrud.eliminarEmpleado(var1.getDocumento());

        DocumentoEBus.setText("");
        CodigoEbus.setText("");
        DocumentoE.setText("");
        CodigoE.setText("");
        NombreE.setText("");
        fechaNacimientoE.setText("");
        FechaIngresoE.setText("");
        FechaSalidaE.setText("");
        SalarioE.setText("");
    }//GEN-LAST:event_BorrarEActionPerformed

    private void ActualizarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarEActionPerformed
        CRUDSQL objcrud = new CRUDSQL();
        VariablesEmple var1 = new VariablesEmple();

        var1.setDocumento(DocumentoE.getText());
        var1.setCodigo(CodigoE.getText());
        var1.setNombre(NombreE.getText());
        var1.setFecha_nacimiento(fechaNacimientoE.getText());
        var1.setFecha_ingreso(FechaIngresoE.getText());
        var1.setFecha_salida(FechaSalidaE.getText());
        var1.setSalario(SalarioE.getText());

        objcrud.actualizarEmpleado(var1.getDocumento(), var1.getNombre(), var1.getFecha_nacimiento(), var1.getFecha_ingreso(), var1.getFecha_salida(), var1.getSalario());

        DocumentoEBus.setText("");
        CodigoEbus.setText("");
        DocumentoE.setText("");
        CodigoE.setText("");
        NombreE.setText("");
        fechaNacimientoE.setText("");
        FechaIngresoE.setText("");
        FechaSalidaE.setText("");
        SalarioE.setText("");
    }//GEN-LAST:event_ActualizarEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Empleado datos1 = new Empleado();
        datos1 = crud.mostrarEmpleado(DocumentoEBus.getText());
        System.out.println("datos  " + datos1.getNombre());
        DocumentoE.setText(datos1.getDocumento() + "");
        CodigoE.setText(datos1.getCodigo() + "");
        CodigoEbus.setText(datos1.getCodigo() + "");
        NombreE.setText(datos1.getNombre());
        fechaNacimientoE.setText(datos1.getFecha_nacimineto());
        FechaIngresoE.setText(datos1.getFecha_ingreso());
        FechaSalidaE.setText(datos1.getFecha_salida());
        SalarioE.setText(datos1.getSalario()+"");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DocumentoEBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocumentoEBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocumentoEBusActionPerformed

    private void CodigoEbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoEbusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoEbusActionPerformed

    private void DocumentoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocumentoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocumentoEActionPerformed

    private void NombreEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreEActionPerformed

    private void fechaNacimientoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaNacimientoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaNacimientoEActionPerformed

    private void FechaIngresoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaIngresoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaIngresoEActionPerformed

    private void FechaSalidaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaSalidaEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaSalidaEActionPerformed

    private void SalarioEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalarioEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalarioEActionPerformed

    VariablesAuto var1 = new VariablesAuto();
    VariablesEmple var2 = new VariablesEmple();
    VariablesCliente var3 = new VariablesCliente();
    VariablesVenta var4 = new VariablesVenta();
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
            java.util.logging.Logger.getLogger(edicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edicion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarC;
    private javax.swing.JButton ActualizarE;
    private javax.swing.JButton ActualizarN;
    private javax.swing.JButton BorrarC;
    private javax.swing.JButton BorrarE;
    private javax.swing.JButton BorrarN;
    private javax.swing.JButton BtnActuaSu;
    private javax.swing.JButton BtnBuscarSu;
    private javax.swing.JButton BuscarC;
    private javax.swing.JButton BuscarN;
    private javax.swing.JTextField ChasisN;
    private javax.swing.JTextField Chasisbuscar;
    private javax.swing.JTextField CodigoE;
    private javax.swing.JTextField CodigoEbus;
    private javax.swing.JTextField DocumentoBusC;
    private javax.swing.JTextField DocumentoC;
    private javax.swing.JTextField DocumentoE;
    private javax.swing.JTextField DocumentoEBus;
    private javax.swing.JTextField FechaEntradaN;
    private javax.swing.JTextField FechaIngresoE;
    private javax.swing.JTextField FechaIniC;
    private javax.swing.JTextField FechaSalidaE;
    private javax.swing.JTextField FechaSalidaN;
    private javax.swing.JTextField IDInternoN;
    private javax.swing.JTextField NombreC;
    private javax.swing.JTextField NombreE;
    private javax.swing.JTextField NombreSucursal;
    private javax.swing.JTextField Placa;
    private javax.swing.JTextField PrecioN;
    private javax.swing.JTextField SalarioE;
    private javax.swing.JButton btnBorrarSU;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JButton btnVolver3;
    private javax.swing.JButton btnVolver4;
    private javax.swing.JTextField fechaNacimientoE;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxCiudadCliente;
    private javax.swing.JComboBox<String> jComboBoxCiudadSucursal;
    private javax.swing.JComboBox<String> jComboBoxId_sucursal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelSalir;
    private javax.swing.JLabel jLabelSalir1;
    private javax.swing.JLabel jLabelSalir3;
    private javax.swing.JLabel jLabelSalir5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblCodigoEm;
    private javax.swing.JLabel lblCodigoEm1;
    private javax.swing.JLabel lblDocumentoEm;
    private javax.swing.JLabel lblDocumentoEm1;
    private javax.swing.JLabel lblFechaInEM;
    private javax.swing.JLabel lblFechaNaEm;
    private javax.swing.JLabel lblFechaSaEm;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblnombreEm;
    private javax.swing.JTextField txtIDbuscarSu;
    private javax.swing.JTextField txtIDmostrarSu;
    // End of variables declaration//GEN-END:variables
}
