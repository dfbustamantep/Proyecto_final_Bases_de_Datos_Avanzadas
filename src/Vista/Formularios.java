/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import GEtset.*;
import SQL.CRUDSQL;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Graphics;
import java.io.FileNotFoundException;

/**
 *
 * @author Josed
 */
public class Formularios extends javax.swing.JFrame {
    int val = 0;
    CRUDSQL objcrud = new CRUDSQL();
    ArrayList <Sucursal> listaSucursalAux = new ArrayList<>();
    ArrayList <Cargo> listaCargoAux = new ArrayList<>();
    ArrayList <CiudadSucursal_Cliente> listaCiudadSucursal_ClienteAux = new ArrayList<>();    
    ArrayList <TipoAutomotor> listaTipoAutomotorAux = new ArrayList<>();
    ArrayList <LineaAutomotor> listaLineaAutomotorAux = new ArrayList<>();
    ArrayList <ModeloAutomotor> listaModeloAutomotorAux = new ArrayList<>();
    ArrayList <ColorAutomotor> listaColorAutomotorAux = new ArrayList<>();
    ArrayList <Cliente> listaClienteAux = new ArrayList<>();
    ArrayList <Empleado> listaEmpleadoAux = new ArrayList<>();
    //ArrayList <Automotor> listaAutomotoresDispoVentaAux = new ArrayList<>();
    ArrayList <Automotor> listaAutomotoresDispoPorIdSucursal = new ArrayList<>();
    ArrayList <Marca> listaMarcaAutomotor = new ArrayList<>();
    
    
    public Formularios() {
        
        initComponents();
        llenarCombox();
    }

    
    public void llenarCombox (){
        
        
        btnGuardarVent.setEnabled(false);
        listaSucursalAux = objcrud.obtenerSucursales();
        listaCargoAux = objcrud.obtenerCargos();
        listaCiudadSucursal_ClienteAux = objcrud.obtenerCiudad();  
        listaTipoAutomotorAux = objcrud.obtenerTipo();
        listaLineaAutomotorAux = objcrud.obtenerLinea();
        listaModeloAutomotorAux = objcrud.obtenerModelo();
        listaColorAutomotorAux = objcrud.obtenerColor();
        listaClienteAux = objcrud.obtenerCliente();
        listaEmpleadoAux = objcrud.obtenerEmpleado();
        //listaAutomotoresDispoVentaAux = objcrud.obtenerAutomotoresDisponiblesVenta();
        listaMarcaAutomotor  = objcrud.obtenerMarca();
        
              
        
        for(int i=0 ; i < listaSucursalAux.size() ; i++){
        this.jComboBoxidSucursalEmpleadoR.addItem(listaSucursalAux.get(i).getNombre());
        this.jComboBoxID_sucursalCliente.addItem(listaSucursalAux.get(i).getNombre());
        }        
        for(int i=0 ; i < listaCargoAux.size() ; i++){
        this.jComboBoxCargo.addItem(listaCargoAux.get(i).getNombreCargo());
        }        
        for(int i=0 ; i < listaCiudadSucursal_ClienteAux.size() ; i++){
        this.jComboBoxCiudadSucursal.addItem(listaCiudadSucursal_ClienteAux.get(i).getNombre());
        }
        for(int i=0 ; i < listaCiudadSucursal_ClienteAux.size() ; i++){
        this.jComboBoxID_CiudadCliente.addItem(listaCiudadSucursal_ClienteAux.get(i).getNombre());
        }
        for(int i=0 ; i < listaTipoAutomotorAux.size() ; i++){
        this.jComboBoxTipoAutomotor.addItem(listaTipoAutomotorAux.get(i).getNombre_tipo());
        }
        for(int i=0 ; i < listaSucursalAux.size() ; i++){
        this.jComboBoxSucursalAutomotor.addItem(listaSucursalAux.get(i).getNombre());
        }        
        for(int i=0 ; i < listaLineaAutomotorAux.size() ; i++){
        this.jComboBoxLineaAutomotor.addItem(listaLineaAutomotorAux.get(i).getNombre_linea());
        }    
        for(int i=0 ; i < listaModeloAutomotorAux.size() ; i++){
        this.jComboBoxModeloAutomotor.addItem(listaModeloAutomotorAux.get(i).getNombre_modelo());
        }
        for(int i=0 ; i < listaColorAutomotorAux.size() ; i++){
        this.jComboBoxColorAutomotor.addItem(listaColorAutomotorAux.get(i).getNombre_color());
        }
        for(int i=0 ; i < listaClienteAux.size() ; i++){
        this.jComboBoxDocumentoClienteVenta.addItem(listaClienteAux.get(i).getDocumento()+"");
        }
        for(int i=0 ; i < listaEmpleadoAux.size() ; i++){        
        this.jComboBoxDocumentoEmpleadoVenta.addItem(listaEmpleadoAux.get(i).getDocumento()+"");
        }                
        /*for(int i=0 ; i < listaAutomotoresDispoVentaAux.size() ; i++){         
        //this.jComboBoxNumeroChasisVenta.addItem(listaAutomotoresDispoVentaAux.get(i).getNumero_chasis()+"");
        }*/
        for(int i=0 ; i < listaMarcaAutomotor.size() ; i++){         
        this.jComboBoxMarcaAutomotor.addItem(listaMarcaAutomotor.get(i).getNombre_marca()+"");
        }   
//            val++;
    }
    
    public void vaciarCombobox (){
        
        this.jComboBoxidSucursalEmpleadoR.removeAllItems();
        this.jComboBoxID_sucursalCliente.removeAllItems();                        
        this.jComboBoxCargo.removeAllItems();                        
        this.jComboBoxCiudadSucursal.removeAllItems();                
        this.jComboBoxID_CiudadCliente.removeAllItems();                
        this.jComboBoxTipoAutomotor.removeAllItems();                
        this.jComboBoxSucursalAutomotor.removeAllItems();                        
        this.jComboBoxLineaAutomotor.removeAllItems();                    
        this.jComboBoxModeloAutomotor.removeAllItems();                
        this.jComboBoxColorAutomotor.removeAllItems();        
        this.jComboBoxDocumentoClienteVenta.removeAllItems();                
        this.jComboBoxDocumentoEmpleadoVenta.removeAllItems();                                
        this.jComboBoxNumeroChasisVenta.removeAllItems();                
        this.jComboBoxMarcaAutomotor.removeAllItems();
        
        llenarComboboxAux();
    }
    
    public void llenarComboboxAux(){
            jComboBoxidSucursalEmpleadoR.addItem("");
            jComboBoxID_sucursalCliente.addItem("");
            jComboBoxCargo.addItem("");
            jComboBoxCiudadSucursal.addItem("");
            jComboBoxID_CiudadCliente.addItem("");
            jComboBoxTipoAutomotor.addItem("");
            jComboBoxSucursalAutomotor.addItem("");
            jComboBoxLineaAutomotor.addItem("");
            jComboBoxModeloAutomotor.addItem("");
            jComboBoxColorAutomotor.addItem("");
            jComboBoxDocumentoClienteVenta.addItem("");
            jComboBoxDocumentoEmpleadoVenta.addItem("");
            jComboBoxNumeroChasisVenta.addItem("");
            jComboBoxMarcaAutomotor.addItem("");                                        
    }
    
    public void vaciarArrayList (){        
        listaSucursalAux.clear();
        listaCargoAux.clear();
        listaCiudadSucursal_ClienteAux.clear();
        listaTipoAutomotorAux.clear();
        listaLineaAutomotorAux.clear();
        listaModeloAutomotorAux.clear();
        listaColorAutomotorAux.clear();
        listaClienteAux.clear();
        listaEmpleadoAux.clear();
        //listaAutomotoresDispoVentaAux.clear();
        listaMarcaAutomotor.clear();
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
        txtIDventaVenta = new javax.swing.JTextField();
        btnGuardarVent = new javax.swing.JButton();
        btnEditarVenta = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelSalir4 = new javax.swing.JLabel();
        btnInicioVenta = new javax.swing.JButton();
        jLabelIFecha = new javax.swing.JLabel();
        txtIFechaVentaVenta = new javax.swing.JTextField();
        jLabelCantidad1 = new javax.swing.JLabel();
        jLabelCantidad2 = new javax.swing.JLabel();
        jLabelCantidad3 = new javax.swing.JLabel();
        jLabelNombreClienteVenta = new javax.swing.JLabel();
        jLabelNombreEmpleadoVenta = new javax.swing.JLabel();
        jLabelCodigoEmpleadoVenta = new javax.swing.JLabel();
        jLabelPrecioVenta = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelLinea = new javax.swing.JLabel();
        jLabelModelo = new javax.swing.JLabel();
        jLabel1Color = new javax.swing.JLabel();
        jLabelPrecioVentaVal = new javax.swing.JLabel();
        jLabelTipoval = new javax.swing.JLabel();
        jLabelLineaval = new javax.swing.JLabel();
        jLabelModeloval = new javax.swing.JLabel();
        jLabelColorVal = new javax.swing.JLabel();
        jCheckBoxVenta = new javax.swing.JCheckBox();
        jLabelMarca = new javax.swing.JLabel();
        jLabelMarcaVal = new javax.swing.JLabel();
        jComboBoxDocumentoEmpleadoVenta = new javax.swing.JComboBox<>();
        jComboBoxDocumentoClienteVenta = new javax.swing.JComboBox<>();
        jComboBoxNumeroChasisVenta = new javax.swing.JComboBox<>();
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
        txtSalario = new javax.swing.JTextField();
        btnGuardarEmpleado = new javax.swing.JButton();
        txtFechaSalidaEmpleado = new javax.swing.JTextField();
        lblSalario = new javax.swing.JLabel();
        lblFechaSaEm = new javax.swing.JLabel();
        txtFechaIngresoEmpleado = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabelSalir3 = new javax.swing.JLabel();
        btnInicioEmpleado = new javax.swing.JButton();
        btnEditarEmpleado = new javax.swing.JButton();
        lblID_sucursal = new javax.swing.JLabel();
        lblID_cargo = new javax.swing.JLabel();
        jComboBoxidSucursalEmpleadoR = new javax.swing.JComboBox<>();
        jComboBoxCargo = new javax.swing.JComboBox<>();
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
        lblSucursalAutomotor = new javax.swing.JLabel();
        lblTipoAutomotor = new javax.swing.JLabel();
        lblLineaAutomotor = new javax.swing.JLabel();
        lblModeloAutomotor = new javax.swing.JLabel();
        lblColorAutomotor = new javax.swing.JLabel();
        jComboBoxSucursalAutomotor = new javax.swing.JComboBox<>();
        jComboBoxTipoAutomotor = new javax.swing.JComboBox<>();
        jComboBoxLineaAutomotor = new javax.swing.JComboBox<>();
        jComboBoxModeloAutomotor = new javax.swing.JComboBox<>();
        jComboBoxColorAutomotor = new javax.swing.JComboBox<>();
        lblMarcaAutomotor = new javax.swing.JLabel();
        jComboBoxMarcaAutomotor = new javax.swing.JComboBox<>();
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
        jLabel11 = new javax.swing.JLabel();
        jComboBoxID_CiudadCliente = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxID_sucursalCliente = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDsucursalRegistro = new javax.swing.JTextField();
        txtNombresu = new javax.swing.JTextField();
        BtnGuardarSsucursal = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelSalir = new javax.swing.JLabel();
        BtnInicioSuscursal = new javax.swing.JButton();
        BtnEditarSucrusal = new javax.swing.JButton();
        jLabelCiudad = new javax.swing.JLabel();
        jComboBoxCiudadSucursal = new javax.swing.JComboBox<>();

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
        jLabelCantidad.setText("Documento Cliente");
        jLabelCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelIdVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelIdVenta.setForeground(new java.awt.Color(0, 0, 0));
        jLabelIdVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIdVenta.setText("Id de la venta");
        jLabelIdVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtIDventaVenta.setForeground(new java.awt.Color(0, 0, 0));
        txtIDventaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDventaVentaActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSalir4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabelSalir4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))
                .addContainerGap())
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

        txtIFechaVentaVenta.setForeground(new java.awt.Color(0, 0, 0));
        txtIFechaVentaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIFechaVentaVentaActionPerformed(evt);
            }
        });

        jLabelCantidad1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCantidad1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCantidad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCantidad1.setText("Documento Empleado");
        jLabelCantidad1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCantidad2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCantidad2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCantidad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCantidad2.setText("Codigo Empleado");
        jLabelCantidad2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCantidad3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCantidad3.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCantidad3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCantidad3.setText("Numero Chasis");
        jLabelCantidad3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelNombreClienteVenta.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombreClienteVenta.setText("Vacio");

        jLabelNombreEmpleadoVenta.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombreEmpleadoVenta.setText("Vacio");

        jLabelCodigoEmpleadoVenta.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCodigoEmpleadoVenta.setText("Vacio");

        jLabelPrecioVenta.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPrecioVenta.setText("Precio");

        jLabelTipo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTipo.setText("Tipo");

        jLabelLinea.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLinea.setText("Linea");

        jLabelModelo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelModelo.setText("Modelo");

        jLabel1Color.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1Color.setText("Color");

        jLabelPrecioVentaVal.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPrecioVentaVal.setText("###");

        jLabelTipoval.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTipoval.setText("###");

        jLabelLineaval.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLineaval.setText("###");

        jLabelModeloval.setForeground(new java.awt.Color(0, 0, 0));
        jLabelModeloval.setText("###");

        jLabelColorVal.setForeground(new java.awt.Color(0, 0, 0));
        jLabelColorVal.setText("###");

        jCheckBoxVenta.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBoxVenta.setText("He leido los terminos de referencia");
        jCheckBoxVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxVentaActionPerformed(evt);
            }
        });

        jLabelMarca.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMarca.setText("Marca");

        jLabelMarcaVal.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMarcaVal.setText("###");

        jComboBoxDocumentoEmpleadoVenta.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxDocumentoEmpleadoVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBoxDocumentoEmpleadoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDocumentoEmpleadoVentaActionPerformed(evt);
            }
        });

        jComboBoxDocumentoClienteVenta.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxDocumentoClienteVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBoxDocumentoClienteVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDocumentoClienteVentaActionPerformed(evt);
            }
        });

        jComboBoxNumeroChasisVenta.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxNumeroChasisVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBoxNumeroChasisVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNumeroChasisVentaActionPerformed(evt);
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
                        .addGap(95, 95, 95)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxVenta)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnGuardarVent, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnInicioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelCantidad1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(jLabelCantidad2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelCantidad3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelIFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelIdVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIDventaVenta, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtIFechaVentaVenta, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabelCodigoEmpleadoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelNombreEmpleadoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBoxDocumentoEmpleadoVenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jComboBoxDocumentoClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelNombreClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jComboBoxNumeroChasisVenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelPrecioVentaVal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelTipoval, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelLineaval, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelModeloval, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelColorVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1Color, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMarcaVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(58, 58, 58))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDventaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabelIFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIFechaVentaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombreClienteVenta)
                    .addComponent(jComboBoxDocumentoClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDocumentoEmpleadoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombreEmpleadoVenta)
                    .addComponent(jLabelCodigoEmpleadoVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCantidad3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxNumeroChasisVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecioVenta)
                    .addComponent(jLabelTipo)
                    .addComponent(jLabelLinea)
                    .addComponent(jLabelModelo)
                    .addComponent(jLabel1Color)
                    .addComponent(jLabelMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecioVentaVal)
                    .addComponent(jLabelTipoval)
                    .addComponent(jLabelLineaval)
                    .addComponent(jLabelModeloval)
                    .addComponent(jLabelColorVal)
                    .addComponent(jLabelMarcaVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jCheckBoxVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarVent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
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

        txtDocumentoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtDocumentoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoEmpleadoActionPerformed(evt);
            }
        });

        txtNombreEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmpleadoActionPerformed(evt);
            }
        });

        txtFechaNacimientoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaNacimientoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNacimientoEmpleadoActionPerformed(evt);
            }
        });

        txtSalario.setForeground(new java.awt.Color(0, 0, 0));
        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
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

        txtFechaSalidaEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaSalidaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaSalidaEmpleadoActionPerformed(evt);
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

        txtFechaIngresoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaIngresoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaIngresoEmpleadoActionPerformed(evt);
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

        lblID_sucursal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblID_sucursal.setForeground(new java.awt.Color(0, 0, 0));
        lblID_sucursal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblID_sucursal.setText("Sucursal");
        lblID_sucursal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblID_cargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblID_cargo.setForeground(new java.awt.Color(0, 0, 0));
        lblID_cargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblID_cargo.setText("Cargo");
        lblID_cargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBoxidSucursalEmpleadoR.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxidSucursalEmpleadoR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBoxidSucursalEmpleadoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxidSucursalEmpleadoRActionPerformed(evt);
            }
        });

        jComboBoxCargo.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnInicioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblFechaNaEm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblnombreEm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblCodigoEm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblDocumentoEm, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblSalario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblFechaInEM, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFechaNacimientoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDocumentoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFechaIngresoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFechaSaEm, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblID_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblID_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFechaSalidaEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(jComboBoxidSucursalEmpleadoR, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocumentoEm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocumentoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoEm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombreEm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaNaEm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaNacimientoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaInEM, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaIngresoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaSaEm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaSalidaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxidSucursalEmpleadoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
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
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(471, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Empleado", jPanel5);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        lblDocumentoEm1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDocumentoEm1.setForeground(new java.awt.Color(0, 0, 0));
        lblDocumentoEm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocumentoEm1.setText("Numero del chasis");
        lblDocumentoEm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNumCha.setForeground(new java.awt.Color(0, 0, 0));
        txtNumCha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumChaActionPerformed(evt);
            }
        });

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

        txtPlaca.setForeground(new java.awt.Color(0, 0, 0));
        txtPlaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPlacaMouseClicked(evt);
            }
        });
        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaKeyTyped(evt);
            }
        });

        txtIDinterno.setForeground(new java.awt.Color(0, 0, 0));
        txtIDinterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDinternoMouseClicked(evt);
            }
        });
        txtIDinterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDinternoActionPerformed(evt);
            }
        });
        txtIDinterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDinternoKeyTyped(evt);
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

        txtFechaENAu.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaENAu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaENAuActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(jLabelSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabelSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                .addContainerGap())
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

        lblSucursalAutomotor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSucursalAutomotor.setForeground(new java.awt.Color(0, 0, 0));
        lblSucursalAutomotor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSucursalAutomotor.setText("Sucursal");
        lblSucursalAutomotor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTipoAutomotor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTipoAutomotor.setForeground(new java.awt.Color(0, 0, 0));
        lblTipoAutomotor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoAutomotor.setText("Tipo");
        lblTipoAutomotor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblLineaAutomotor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLineaAutomotor.setForeground(new java.awt.Color(0, 0, 0));
        lblLineaAutomotor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLineaAutomotor.setText("Linea");
        lblLineaAutomotor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblModeloAutomotor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblModeloAutomotor.setForeground(new java.awt.Color(0, 0, 0));
        lblModeloAutomotor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModeloAutomotor.setText("Modelo");
        lblModeloAutomotor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblColorAutomotor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblColorAutomotor.setForeground(new java.awt.Color(0, 0, 0));
        lblColorAutomotor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblColorAutomotor.setText("Color");
        lblColorAutomotor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBoxSucursalAutomotor.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxSucursalAutomotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBoxSucursalAutomotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSucursalAutomotorActionPerformed(evt);
            }
        });

        jComboBoxTipoAutomotor.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxTipoAutomotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBoxLineaAutomotor.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxLineaAutomotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBoxLineaAutomotor.setToolTipText("");

        jComboBoxModeloAutomotor.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxModeloAutomotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jComboBoxColorAutomotor.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxColorAutomotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        lblMarcaAutomotor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMarcaAutomotor.setForeground(new java.awt.Color(0, 0, 0));
        lblMarcaAutomotor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMarcaAutomotor.setText("Marca");
        lblMarcaAutomotor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBoxMarcaAutomotor.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxMarcaAutomotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMarcaAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInicioAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnGuardarAutomtor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditarAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblFechaSaEm1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(lblSucursalAutomotor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(lblTipoAutomotor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(lblLineaAutomotor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(lblModeloAutomotor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(lblColorAutomotor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxMarcaAutomotor, 0, 162, Short.MAX_VALUE)
                                    .addComponent(txtFechaSaAu, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(jComboBoxSucursalAutomotor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxTipoAutomotor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxLineaAutomotor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxModeloAutomotor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxColorAutomotor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(83, 83, 83))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocumentoEm1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumCha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoEm1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombreEm1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaNaEm1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDinterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaInEM1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaENAu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaSaEm1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaSaAu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSucursalAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSucursalAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipoAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLineaAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxLineaAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModeloAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxModeloAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColorAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxColorAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarcaAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMarcaAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardarAutomtor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicioAutomotor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Automotor", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Documento");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDocumentoCl.setForeground(new java.awt.Color(0, 0, 0));
        txtDocumentoCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoClActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(jLabelSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabelSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                .addContainerGap())
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

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Sucursal");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBoxID_CiudadCliente.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxID_CiudadCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBoxID_CiudadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxID_CiudadClienteActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Ciudad");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBoxID_sucursalCliente.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxID_sucursalCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBoxID_sucursalCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxID_sucursalClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
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
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreCl, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(txtFechaInCl, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(jComboBoxID_CiudadCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxID_sucursalCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnInicioClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxID_sucursalCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxID_CiudadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicioClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
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

        txtIDsucursalRegistro.setForeground(new java.awt.Color(0, 0, 0));
        txtIDsucursalRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDsucursalRegistroActionPerformed(evt);
            }
        });

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
        jLabel1.setText("Registro de Sucursal");

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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(jLabelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                .addContainerGap())
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

        jLabelCiudad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCiudad.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCiudad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCiudad.setText("Ciudad");
        jLabelCiudad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBoxCiudadSucursal.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxCiudadSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIDsucursalRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(txtNombresu, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jComboBoxCiudadSucursal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(115, 115, 115))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(BtnInicioSuscursal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnGuardarSsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnEditarSucrusal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDsucursalRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombresu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCiudadSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardarSsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnInicioSuscursal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEditarSucrusal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
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

    private void txtIDsucursalRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDsucursalRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDsucursalRegistroActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void txtNombresuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresuActionPerformed

    private void BtnGuardarSsucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarSsucursalActionPerformed
        String auxSucursalCiudad = (String) jComboBoxCiudadSucursal.getSelectedItem();
        System.out.println("la ciudad seteada es   " + auxSucursalCiudad);
        String idCiudad = "";
                for(int i = 0 ; i < listaCiudadSucursal_ClienteAux.size() ; i++){  
                    System.out.println(listaCiudadSucursal_ClienteAux.get(i).getNombre());
            if(auxSucursalCiudad.equals(listaCiudadSucursal_ClienteAux.get(i).getNombre())){
                idCiudad = listaCiudadSucursal_ClienteAux.get(i).getIdCiudad() + "" ;
                System.out.println("comprobando el id ciudad   " + listaCiudadSucursal_ClienteAux.get(i).getIdCiudad());
            }
        } 
        System.out.println("ID DE LA SUCURSAL  "+idCiudad);
        objcrud.insertarSucursal(txtIDsucursalRegistro.getText(), txtNombresu.getText(), idCiudad);

        txtIDsucursalRegistro.setText("");
        txtNombresu.setText("");
        jComboBoxCiudadSucursal.setSelectedItem("");
        vaciarCombobox();
        vaciarArrayList();
        llenarCombox();
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

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void btnGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpleadoActionPerformed
        

        String auxCargo = (String) jComboBoxCargo.getSelectedItem();
        String idCargo = "";
        
        String auxSucursal = (String) jComboBoxidSucursalEmpleadoR.getSelectedItem();
        String idSucur = "";
        
        for(int i = 0 ; i < listaSucursalAux.size() ; i++){        
            if(auxSucursal.equals(listaSucursalAux.get(i).getNombre())){
                idSucur = listaSucursalAux.get(i).getId_sucursal() + "";
            }
        }        
        for(int i = 0 ; i < listaCargoAux.size() ; i++){        
            if(auxCargo.equals(listaCargoAux.get(i).getNombreCargo())){
                idCargo = listaCargoAux.get(i).getIdCargo()+ "";
            }
        }
       
        
        
        objcrud.insertarEmpleado(txtDocumentoEmpleado.getText(), txtCodigoEmpleado.getText(), txtNombreEmpleado.getText(), txtFechaNacimientoEmpleado.getText(), txtFechaIngresoEmpleado.getText(), txtFechaSalidaEmpleado.getText() , txtSalario.getText() , idSucur , idCargo);

     objcrud.obtenerSucursales();
        txtCodigoEmpleado.setText("");
        txtDocumentoEmpleado.setText("");
        txtNombreEmpleado.setText("");
        txtFechaNacimientoEmpleado.setText("");
        txtSalario.setText("");
        txtFechaIngresoEmpleado.setText("");
        txtFechaSalidaEmpleado.setText("");    
        jComboBoxCargo.setSelectedItem("");
        jComboBoxCargo.setSelectedItem("");
        vaciarCombobox();
        vaciarArrayList();
        llenarCombox();

    }//GEN-LAST:event_btnGuardarEmpleadoActionPerformed

    private void txtFechaSalidaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaSalidaEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaSalidaEmpleadoActionPerformed

    private void txtFechaIngresoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaIngresoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaIngresoEmpleadoActionPerformed

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
        String auxIdSucursal = (String) jComboBoxID_sucursalCliente.getSelectedItem();
        String idSucur = "";
        
        for(int i = 0 ; i < listaSucursalAux.size() ; i++){        
            if(auxIdSucursal.equals(listaSucursalAux.get(i).getNombre())){
                idSucur = listaSucursalAux.get(i).getId_sucursal() + "";
            }
        } 
        
        String auxCiudadCliente = (String) jComboBoxID_CiudadCliente.getSelectedItem();
        String idCiudad = "";
        
        for(int i = 0 ; i < listaCiudadSucursal_ClienteAux.size() ; i++){        
            if(auxCiudadCliente.equals(listaCiudadSucursal_ClienteAux.get(i).getNombre())){
                idCiudad = listaCiudadSucursal_ClienteAux.get(i).getIdCiudad()+ "";
            }
        } 
        
        
        objcrud.insertarCleinte(txtDocumentoCl.getText(), txtNombreCl.getText(), txtFechaInCl.getText() , idCiudad , idSucur);

        txtDocumentoCl.setText("");
        txtNombreCl.setText("");
        txtFechaInCl.setText("");
        vaciarCombobox();
        vaciarArrayList();
        llenarCombox();
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void txtIDventaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDventaVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDventaVentaActionPerformed

    private void btnGuardarVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVentActionPerformed
        String documento_cliente = jComboBoxDocumentoClienteVenta.getSelectedItem() + "";
        String documento_empleado = jComboBoxDocumentoEmpleadoVenta.getSelectedItem() + "";
        String codigo_empleado = jLabelCodigoEmpleadoVenta.getText();
        String chasisAutomotor = jComboBoxNumeroChasisVenta.getSelectedItem() + "";        

        objcrud.insertarVenta(txtIDventaVenta.getText(), txtIFechaVentaVenta.getText() , documento_cliente,documento_empleado,codigo_empleado,chasisAutomotor);
        crearFactura();
        
        txtIFechaVentaVenta.setText("");
        txtIDventaVenta.setText("");        
        jComboBoxDocumentoClienteVenta.setSelectedItem("");
        jComboBoxDocumentoEmpleadoVenta.setSelectedItem("");
        jLabelNombreClienteVenta.setText("vacio");
        jLabelCodigoEmpleadoVenta.setText("vacio");
        jLabelNombreEmpleadoVenta.setText("vacio");
        jComboBoxNumeroChasisVenta.setSelectedItem("");
        jLabelPrecioVentaVal.setText("###");       
        jLabelTipoval.setText("###");
        jLabelLineaval.setText("###");
        jLabelModeloval.setText("###");
        jLabelColorVal.setText("###");
        jLabelMarcaVal.setText("###");
        jCheckBoxVenta.setSelected(false);
        vaciarCombobox();
        vaciarArrayList();
        llenarCombox();
        
        
    }//GEN-LAST:event_btnGuardarVentActionPerformed

    private void btnInicioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioVentaActionPerformed
        this.setVisible(false);
        new Inicio().setVisible(true);
    }//GEN-LAST:event_btnInicioVentaActionPerformed

    private void btnInicioEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioEmpleadoActionPerformed
        this.setVisible(false);
        new Inicio().setVisible(true);
    }//GEN-LAST:event_btnInicioEmpleadoActionPerformed

    private void btnEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEmpleadoActionPerformed
        this.setVisible(false);
        new edicion().setVisible(true);
    }//GEN-LAST:event_btnEditarEmpleadoActionPerformed

    private void btnInicioClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioClientesActionPerformed
        
    }//GEN-LAST:event_btnInicioClientesActionPerformed

    private void btnEditarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClientesActionPerformed
        this.setVisible(false);
        new edicion().setVisible(true);
    }//GEN-LAST:event_btnEditarClientesActionPerformed

    private void BtnInicioSuscursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioSuscursalActionPerformed
        this.setVisible(false);
        new Inicio().setVisible(true);
    }//GEN-LAST:event_BtnInicioSuscursalActionPerformed

    private void BtnEditarSucrusalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarSucrusalActionPerformed
        edicion objsiguiente = new edicion();

        objsiguiente.setVisible(true);
        objsiguiente.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_BtnEditarSucrusalActionPerformed

    private void txtIFechaVentaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIFechaVentaVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIFechaVentaVentaActionPerformed

    private void jLabelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseClicked
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema\nTenga un buen día");
        System.exit(0);
    }//GEN-LAST:event_jLabelSalirMouseClicked

    private void jLabelSalir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalir1MouseClicked
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema\nTenga un buen día");
        System.exit(0);
    }//GEN-LAST:event_jLabelSalir1MouseClicked

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

    private void jComboBoxidSucursalEmpleadoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxidSucursalEmpleadoRActionPerformed

        
    }//GEN-LAST:event_jComboBoxidSucursalEmpleadoRActionPerformed

    private void jComboBoxID_sucursalClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxID_sucursalClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxID_sucursalClienteActionPerformed

    private void jComboBoxID_CiudadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxID_CiudadClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxID_CiudadClienteActionPerformed

    private void jCheckBoxVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxVentaActionPerformed
        if(jCheckBoxVenta.isSelected()){
            btnGuardarVent.setEnabled(true);
        }
        else{
            btnGuardarVent.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBoxVentaActionPerformed

    private void btnEditarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarVentaActionPerformed
        this.setVisible(false);
        new edicion().setVisible(true);
    }//GEN-LAST:event_btnEditarVentaActionPerformed

    private void jComboBoxSucursalAutomotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSucursalAutomotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSucursalAutomotorActionPerformed

    private void btnInicioAutomotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioAutomotorActionPerformed
        this.setVisible(false);
        new Inicio().setVisible(true);
    }//GEN-LAST:event_btnInicioAutomotorActionPerformed

    private void btnEditarAutomotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAutomotorActionPerformed
        this.setVisible(false);
        new edicion().setVisible(true);
    }//GEN-LAST:event_btnEditarAutomotorActionPerformed

    private void jLabelSalir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalir2MouseClicked
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema\nTenga un buen día");
        System.exit(0);
    }//GEN-LAST:event_jLabelSalir2MouseClicked

    private void BtnGuardarAutomtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarAutomtorActionPerformed

        String auxTipo = (String) jComboBoxTipoAutomotor.getSelectedItem();
        String idTipo = "";
        String auxIdSucursal = (String) jComboBoxSucursalAutomotor.getSelectedItem();
        String idSucur = "";
        String auxIdLinea = (String) jComboBoxLineaAutomotor.getSelectedItem();
        String idLinea = "";
        String auxIdModelo = (String) jComboBoxModeloAutomotor.getSelectedItem();
        String idModelo = "";
        String auxIdColor = (String) jComboBoxColorAutomotor.getSelectedItem();
        String idColor = "";
        String auxIdMarca = (String) jComboBoxMarcaAutomotor.getSelectedItem();
        String idMarca ="";
        

        for(int i = 0 ; i < listaTipoAutomotorAux.size() ; i++){
            if(auxTipo.equals(listaTipoAutomotorAux.get(i).getNombre_tipo())){
                idTipo = listaTipoAutomotorAux.get(i).getId_tipo()+ "";
            }
        }
        for(int i = 0 ; i < listaSucursalAux.size() ; i++){
            if(auxIdSucursal.equals(listaSucursalAux.get(i).getNombre())){
                idSucur = listaSucursalAux.get(i).getId_sucursal() + "";
            }
        }
        for(int i = 0 ; i < listaLineaAutomotorAux.size() ; i++){
            if(auxIdLinea.equals(listaLineaAutomotorAux.get(i).getNombre_linea())){
                idLinea = listaLineaAutomotorAux.get(i).getId_linea()+ "";
            }
        }
        for(int i = 0 ; i < listaModeloAutomotorAux.size() ; i++){
            if(auxIdModelo.equals(listaModeloAutomotorAux.get(i).getNombre_modelo())){
                idModelo = listaModeloAutomotorAux.get(i).getId_modelo()+ "";
            }
        }
        for(int i = 0 ; i < listaColorAutomotorAux.size() ; i++){
            if(auxIdColor.equals(listaColorAutomotorAux.get(i).getNombre_color())){
                idColor = listaColorAutomotorAux.get(i).getId_color()+ "";
            }
        }
        for(int i = 0 ; i < listaMarcaAutomotor.size() ; i++){
            if(auxIdMarca.equals(listaMarcaAutomotor.get(i).getNombre_marca())){
                idMarca = listaMarcaAutomotor.get(i).getId_marca()+ "";
            }
        }

        objcrud.insertarAutomotr(txtNumCha.getText(), txtPrecio.getText(), txtPlaca.getText(), txtIDinterno.getText(), txtFechaENAu.getText(), txtFechaSaAu.getText() , idSucur,idTipo,idLinea,idModelo,idColor, idMarca);
        txtNumCha.setText("");
        txtPrecio.setText("");
        txtPlaca.setText("");
        txtIDinterno.setText("");
        txtFechaENAu.setText("");
        txtFechaSaAu.setText("");

        jComboBoxTipoAutomotor.setSelectedItem("");
        jComboBoxColorAutomotor.setSelectedItem("");
        jComboBoxLineaAutomotor.setSelectedItem("");
        jComboBoxModeloAutomotor.setSelectedItem("");
        jComboBoxSucursalAutomotor.setSelectedItem("");
        vaciarCombobox();
        vaciarArrayList();
        llenarCombox();
        
    }//GEN-LAST:event_BtnGuardarAutomtorActionPerformed

    private void txtFechaSaAuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaSaAuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaSaAuActionPerformed

    private void txtFechaENAuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaENAuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaENAuActionPerformed

    private void txtIDinternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDinternoKeyTyped

    }//GEN-LAST:event_txtIDinternoKeyTyped

    private void txtIDinternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDinternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDinternoActionPerformed

    private void txtIDinternoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDinternoMouseClicked
        txtPlaca.setText("");
    }//GEN-LAST:event_txtIDinternoMouseClicked

    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped

    }//GEN-LAST:event_txtPlacaKeyTyped

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed

    }//GEN-LAST:event_txtPlacaActionPerformed

    private void txtPlacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlacaMouseClicked
        txtIDinterno.setText("");
    }//GEN-LAST:event_txtPlacaMouseClicked

    private void txtNumChaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumChaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumChaActionPerformed

    private void jComboBoxDocumentoEmpleadoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDocumentoEmpleadoVentaActionPerformed
        
        listaAutomotoresDispoPorIdSucursal.clear();
        jComboBoxNumeroChasisVenta.removeAllItems();
        jComboBoxNumeroChasisVenta.addItem("");
        
        String documentoAux = jComboBoxDocumentoEmpleadoVenta.getSelectedItem() + "";
        String id_sucursal = "";
        
        for(int i = 0 ; i < listaEmpleadoAux.size() ; i++){
            if(documentoAux.equals(listaEmpleadoAux.get(i).getDocumento()+"")){
                id_sucursal = listaEmpleadoAux.get(i).getId_sucursal() + "";                
                jLabelCodigoEmpleadoVenta.setText(listaEmpleadoAux.get(i).getCodigo() + "");
                jLabelNombreEmpleadoVenta.setText(listaEmpleadoAux.get(i).getNombre());
                
            }
        }
        System.out.println("este es el id sucural : " + id_sucursal);
        listaAutomotoresDispoPorIdSucursal = objcrud.obtenerAutomotorPorIdSucursal(id_sucursal);
        
        for(int i = 0 ; i < listaAutomotoresDispoPorIdSucursal.size() ; i++){
            jComboBoxNumeroChasisVenta.addItem(listaAutomotoresDispoPorIdSucursal.get(i).getNumero_chasis() + "");                        
        }
        
    }//GEN-LAST:event_jComboBoxDocumentoEmpleadoVentaActionPerformed

    private void jComboBoxDocumentoClienteVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDocumentoClienteVentaActionPerformed
        String nombreClienteAux = jComboBoxDocumentoClienteVenta.getSelectedItem() + "";
        String nombreCliente="";
        
        for(int i = 0 ; i < listaClienteAux.size() ; i++){
            if(nombreClienteAux.equals(listaClienteAux.get(i).getDocumento()+"")){
            nombreCliente = listaClienteAux.get(i).getNombre();
            }
        }
        jLabelNombreClienteVenta.setText(nombreCliente);
    }//GEN-LAST:event_jComboBoxDocumentoClienteVentaActionPerformed

    private void jComboBoxNumeroChasisVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNumeroChasisVentaActionPerformed
        String chasisAux = jComboBoxNumeroChasisVenta.getSelectedItem() + "";
        String precio="";
        String tipoAux ="";
        String tipo="";
        String lineaAux="";
        String linea="";
        String modeloAux="";
        String modelo="";
        String colorAux="";
        String color="";
        String marcaAux ="";
        String marca ="";
        
        for(int i = 0 ; i < listaAutomotoresDispoPorIdSucursal.size() ; i++){
            if(chasisAux.equals(listaAutomotoresDispoPorIdSucursal.get(i).getNumero_chasis()+"")){
            precio = listaAutomotoresDispoPorIdSucursal.get(i).getPrecio() + "";            
            tipoAux = listaAutomotoresDispoPorIdSucursal.get(i).getId_tipo() + "";
            lineaAux = listaAutomotoresDispoPorIdSucursal.get(i).getId_linea() + "";
            modeloAux = listaAutomotoresDispoPorIdSucursal.get(i).getId_modelo() + "";
            colorAux = listaAutomotoresDispoPorIdSucursal.get(i).getId_color() + "";
            marcaAux = listaAutomotoresDispoPorIdSucursal.get(i).getId_marca() + "";
            }
        }
        for(int i = 0 ; i < listaTipoAutomotorAux.size() ; i++){
            if(tipoAux.equals(listaTipoAutomotorAux.get(i).getId_tipo()+"")){
            tipo = listaTipoAutomotorAux.get(i).getNombre_tipo()+ "";            
            }
        }
        for(int i = 0 ; i < listaLineaAutomotorAux.size() ; i++){
            if(lineaAux.equals(listaLineaAutomotorAux.get(i).getId_linea()+"")){
            linea = listaLineaAutomotorAux.get(i).getNombre_linea()+ "";            
            }
        }        
        for(int i = 0 ; i < listaModeloAutomotorAux.size() ; i++){
            if(modeloAux.equals(listaModeloAutomotorAux.get(i).getId_modelo()+"")){
            modelo = listaModeloAutomotorAux.get(i).getNombre_modelo()+ "";            
            }
        }
        for(int i = 0 ; i < listaColorAutomotorAux.size() ; i++){
            if(colorAux.equals(listaColorAutomotorAux.get(i).getId_color()+"")){
            color = listaColorAutomotorAux.get(i).getNombre_color()+ "";            
            }
        }
        for(int i = 0 ; i < listaMarcaAutomotor.size() ; i++){
            if(marcaAux.equals(listaMarcaAutomotor.get(i).getId_marca()+"")){
            marca = listaMarcaAutomotor.get(i).getNombre_marca()+ "";            
            }
        }
        jLabelPrecioVentaVal.setText(precio);
        jLabelTipoval.setText(tipo);
        jLabelLineaval.setText(linea);
        jLabelModeloval.setText(modelo);
        jLabelColorVal.setText(color);
        jLabelMarcaVal.setText(marca);
    }//GEN-LAST:event_jComboBoxNumeroChasisVentaActionPerformed


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
    private javax.swing.JCheckBox jCheckBoxVenta;
    private javax.swing.JComboBox<String> jComboBoxCargo;
    private javax.swing.JComboBox<String> jComboBoxCiudadSucursal;
    private javax.swing.JComboBox<String> jComboBoxColorAutomotor;
    private javax.swing.JComboBox<String> jComboBoxDocumentoClienteVenta;
    private javax.swing.JComboBox<String> jComboBoxDocumentoEmpleadoVenta;
    private javax.swing.JComboBox<String> jComboBoxID_CiudadCliente;
    private javax.swing.JComboBox<String> jComboBoxID_sucursalCliente;
    private javax.swing.JComboBox<String> jComboBoxLineaAutomotor;
    private javax.swing.JComboBox<String> jComboBoxMarcaAutomotor;
    private javax.swing.JComboBox<String> jComboBoxModeloAutomotor;
    private javax.swing.JComboBox<String> jComboBoxNumeroChasisVenta;
    private javax.swing.JComboBox<String> jComboBoxSucursalAutomotor;
    private javax.swing.JComboBox<String> jComboBoxTipoAutomotor;
    private javax.swing.JComboBox<String> jComboBoxidSucursalEmpleadoR;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel1Color;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelCantidad1;
    private javax.swing.JLabel jLabelCantidad2;
    private javax.swing.JLabel jLabelCantidad3;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelCodigoEmpleadoVenta;
    private javax.swing.JLabel jLabelColorVal;
    private javax.swing.JLabel jLabelIFecha;
    private javax.swing.JLabel jLabelIdVenta;
    private javax.swing.JLabel jLabelLinea;
    private javax.swing.JLabel jLabelLineaval;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelMarcaVal;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelModeloval;
    private javax.swing.JLabel jLabelNombreClienteVenta;
    private javax.swing.JLabel jLabelNombreEmpleadoVenta;
    private javax.swing.JLabel jLabelPrecioVenta;
    private javax.swing.JLabel jLabelPrecioVentaVal;
    private javax.swing.JLabel jLabelSalir;
    private javax.swing.JLabel jLabelSalir1;
    private javax.swing.JLabel jLabelSalir2;
    private javax.swing.JLabel jLabelSalir3;
    private javax.swing.JLabel jLabelSalir4;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTipoval;
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
    private javax.swing.JLabel lblColorAutomotor;
    private javax.swing.JLabel lblDocumentoEm;
    private javax.swing.JLabel lblDocumentoEm1;
    private javax.swing.JLabel lblFechaInEM;
    private javax.swing.JLabel lblFechaInEM1;
    private javax.swing.JLabel lblFechaNaEm;
    private javax.swing.JLabel lblFechaNaEm1;
    private javax.swing.JLabel lblFechaSaEm;
    private javax.swing.JLabel lblFechaSaEm1;
    private javax.swing.JLabel lblID_cargo;
    private javax.swing.JLabel lblID_sucursal;
    private javax.swing.JLabel lblLineaAutomotor;
    private javax.swing.JLabel lblMarcaAutomotor;
    private javax.swing.JLabel lblModeloAutomotor;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblSucursalAutomotor;
    private javax.swing.JLabel lblTipoAutomotor;
    private javax.swing.JLabel lblnombreEm;
    private javax.swing.JLabel lblnombreEm1;
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
    private javax.swing.JTextField txtIDsucursalRegistro;
    private javax.swing.JTextField txtIDventaVenta;
    private javax.swing.JTextField txtIFechaVentaVenta;
    private javax.swing.JTextField txtNombreCl;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtNombresu;
    private javax.swing.JTextField txtNumCha;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables

    private void crearFactura(){
        //creacion documento
        Document document = new Document() {};
        
        try{
            //creacion del eritter
            PdfWriter writer=PdfWriter.getInstance((com.lowagie.text.Document) document, new FileOutputStream("Factura"+txtIDventaVenta.getText()+".pdf"));
            //abrir el documento
            document.open();
            
            PdfContentByte cb=writer.getDirectContent();
            Graphics g=cb.createGraphicsShapes(PageSize.LETTER.getWidth(), PageSize.LETTER.getHeight());
            
            g.setColor(Color.black);
            g.drawRect(1, 1, 593, 790);
;
                        
            Phrase titulo=new Phrase("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tBUENAUTO ");
            document.add(titulo);
            
            Phrase fechaVenta=new Phrase("\n\nFecha de la venta: "+txtIFechaVentaVenta.getText());
            document.add(fechaVenta);
            
            Phrase idventa=new Phrase("\n\nID venta: "+txtIDventaVenta.getText());
            document.add(idventa);
                                    
            Phrase documentoCliente=new Phrase("\n\nDocumento del cliente: "+jComboBoxDocumentoClienteVenta.getSelectedItem());
            document.add(documentoCliente);
            
            Phrase nombreCliente=new Phrase("\n\nNombre del cliente: "+jLabelNombreClienteVenta.getText());
            document.add(nombreCliente);
            
                    
            Phrase documentoEmpleado=new Phrase("\n\nDocumento del empleado: "+jComboBoxDocumentoEmpleadoVenta.getSelectedItem());
            document.add(documentoEmpleado);
            
            Phrase codigoEmpeleado=new Phrase("\n\nCodigo del empleado: "+jLabelCodigoEmpleadoVenta.getText());
            document.add(codigoEmpeleado);
            
            Phrase nombreEmpleado=new Phrase("\n\nNombre del empleado: "+jLabelNombreEmpleadoVenta.getText());
            document.add(nombreEmpleado);
            
            Phrase numeroC=new Phrase("\n\nNumero de chasis del automotr  "+jComboBoxNumeroChasisVenta.getSelectedItem());
            document.add(numeroC);         
                    
            JOptionPane.showMessageDialog(null, "Factura creada exitodamente");
            
            document.close();
            
            generarReporte();
        }
        catch (DocumentException de) {
            System.err.println(de.getMessage());
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }

    }

    private void generarReporte() {
        
    }
    

}
