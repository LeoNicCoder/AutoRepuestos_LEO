/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modelo.TCliente;

/**
 *
 * @author del
 */
public class ClientesForm extends javax.swing.JInternalFrame {

    private TCliente cl;
    int totalregistros;
    private String cadenaBusqueda;
    
    
    
    
    
    /**
     * Creates new form ClientesForm
     */
    JDesktopPane dp;
    public ClientesForm(JDesktopPane dp) throws SQLException {
        this.dp = dp;
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        cl = new TCliente();
        cargarTabla();
    }
    
    public void cargarTabla()
    {
        
        tablaClientes.setModel(cl.cargarTabla());
    }
    
    private void mostrarDatos(){
        this.txtCedulaCliente.setText(String.valueOf(cl.getCedula()));
        this.txtNombreCliente.setText(String.valueOf(cl.getNombres()));
        this.txtApellidoCliente.setText(cl.getApellidos());
        //this.txtCedula.setText(cl.getCedula());
    }
    
    private void limpiarControles()
    {
        this.txtIDCliente.setText("");
        //this.txtID.setEditable(false);
        this.txtCedulaCliente.setText("");
        this.txtNombreCliente.setText("");
        this.txtApellidoCliente.setText("");
    }
    
    
     
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        addBoton = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnEliminarRegistroCliente = new javax.swing.JButton();
        txtIDCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCedulaCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtApellidoCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbFemenino = new javax.swing.JRadioButton();
        rbMasculino = new javax.swing.JRadioButton();
        btnLimpiarRegistroCliente = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1100, 691));

        jPanel1.setBackground(new java.awt.Color(69, 126, 170));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Facturación/icons8_Long_Arrow_Left_40px_1.png"))); // NOI18N
        btnAtras.setToolTipText("Menú principal");
        btnAtras.setBorder(null);
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Facturación/icons8_Long_Arrow_Left_40px_2.png"))); // NOI18N
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clientes");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clientes/icons8_Customer_30px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtras)
                .addGap(476, 476, 476)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(btnAtras))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        txtBuscarCliente.setBackground(new java.awt.Color(238, 238, 238));
        txtBuscarCliente.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscarCliente.setText("Buscar");
        txtBuscarCliente.setToolTipText("");
        txtBuscarCliente.setBorder(null);
        txtBuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarClienteKeyTyped(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clientes/icons8_Search_25px_2.png"))); // NOI18N

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Clientes:"));

        addBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Plus_52px.png"))); // NOI18N
        addBoton.setToolTipText("Agregar");
        addBoton.setBorder(null);
        addBoton.setBorderPainted(false);
        addBoton.setContentAreaFilled(false);
        addBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBoton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Plus_40px.png"))); // NOI18N
        addBoton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Plus_52px_1.png"))); // NOI18N
        addBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBotonMouseClicked(evt);
            }
        });

        btnEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Edit_52px.png"))); // NOI18N
        btnEditarCliente.setBorder(null);
        btnEditarCliente.setBorderPainted(false);
        btnEditarCliente.setContentAreaFilled(false);
        btnEditarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Edit_40px.png"))); // NOI18N
        btnEditarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Edit_52px_1.png"))); // NOI18N
        btnEditarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarClienteMouseClicked(evt);
            }
        });
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnEliminarRegistroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_52px.png"))); // NOI18N
        btnEliminarRegistroCliente.setBorder(null);
        btnEliminarRegistroCliente.setBorderPainted(false);
        btnEliminarRegistroCliente.setContentAreaFilled(false);
        btnEliminarRegistroCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarRegistroCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_40px.png"))); // NOI18N
        btnEliminarRegistroCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_52px_1.png"))); // NOI18N
        btnEliminarRegistroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarRegistroClienteMouseClicked(evt);
            }
        });

        txtIDCliente.setEditable(false);

        jLabel8.setText("ID:");

        jLabel9.setText("Cedula");

        jLabel10.setText("Nombre:");

        jLabel11.setText("Apellido:");

        jLabel12.setText("Sexo:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Eliminar");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Editar");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Agregar");

        buttonGroup1.add(rbFemenino);
        rbFemenino.setText("Femenino");

        buttonGroup1.add(rbMasculino);
        rbMasculino.setText("Masculino");

        btnLimpiarRegistroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clean50px.png"))); // NOI18N
        btnLimpiarRegistroCliente.setContentAreaFilled(false);
        btnLimpiarRegistroCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarRegistroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarRegistroClienteMouseClicked(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Limpiar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel8)
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCedulaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(txtApellidoCliente)
                                    .addComponent(txtNombreCliente)
                                    .addComponent(txtIDCliente))
                                .addGap(22, 22, 22))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnEliminarRegistroCliente)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(rbFemenino)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbMasculino))
                                .addComponent(jLabel6)))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(addBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditarCliente)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel13)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLimpiarRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(rbFemenino)
                    .addComponent(rbMasculino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(36, 36, 36))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarRegistroCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarRegistroCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );

        jLabel7.setText("Filtrar Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(468, 468, 468)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(541, 541, 541)
                        .addComponent(jLabel7)))
                .addContainerGap(1386, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(580, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked
        try {
            MenuPrincipal mp = new MenuPrincipal(dp);
            dp.removeAll();
            dp.add(mp);
            mp.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ClientesForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAtrasMouseClicked

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        
        if(totalregistros != 0){
            
            int a = JOptionPane.showConfirmDialog(null, "¿Desea modificar este registro?");
            
            
            
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        // TODO add your handling code here:
        
        int seleccion = tablaClientes.rowAtPoint(evt.getPoint());
        
        txtIDCliente.setText(String.valueOf(tablaClientes.getValueAt(seleccion, 0)));
        txtCedulaCliente.setText(String.valueOf(tablaClientes.getValueAt(seleccion, 3)));
        txtNombreCliente.setText(String.valueOf(tablaClientes.getValueAt(seleccion, 1)));
        txtApellidoCliente.setText(String.valueOf(tablaClientes.getValueAt(seleccion, 2)));
        //txtSexoCliente.setText(String.valueOf(tablaClientes.getValueAt(seleccion, 4)));
        if(String.valueOf(tablaClientes.getValueAt(seleccion, 4)).equals("Masculino"))
        {
            rbMasculino.setSelected(true);
        }else{
            rbFemenino.setSelected(true);
        }
        
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void addBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBotonMouseClicked
        // TODO add your handling code here:
           
        String nmb = this.txtNombreCliente.getText();
        String apl = this.txtApellidoCliente.getText();
        String ced = this.txtCedulaCliente.getText();
        String sex ;
        
        if(rbFemenino.isSelected()){
            sex = "femenino";
        }else{
            sex = "Masculino";
        }
        
        cl.guardar(nmb, apl, ced, sex);
        this.mostrarDatos();
        this.cargarTabla();
    }//GEN-LAST:event_addBotonMouseClicked

    private void btnLimpiarRegistroClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarRegistroClienteMouseClicked
        // TODO add your handling code here:
        this.limpiarControles();
    }//GEN-LAST:event_btnLimpiarRegistroClienteMouseClicked

    private void btnEliminarRegistroClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarRegistroClienteMouseClicked
        // TODO add your handling code here:
        int row = tablaClientes.getSelectedRow();
        
        if(row != -1)
        {
            int id = Integer.parseInt(tablaClientes.getValueAt(row, 0).toString());
            
            int opc;
            opc = JOptionPane.showConfirmDialog(null,"¿Desea eliminar este registro?","Eliminar Registro",JOptionPane.YES_NO_OPTION);

            if(opc == 0)
            {
                cl.eliminar(id);
                
                this.mostrarDatos();   
                this.cargarTabla();
            }
        }
    }//GEN-LAST:event_btnEliminarRegistroClienteMouseClicked

    
    private void btnEditarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarClienteMouseClicked
        // TODO add your handling code here:
        int row = tablaClientes.getSelectedRow();
        int id = Integer.parseInt(this.txtIDCliente.getText());
        String ced = this.txtCedulaCliente.getText();
        String nom = this.txtNombreCliente.getText();
        String ap = this.txtApellidoCliente.getText();
        
        String sex ;
        
        if(rbFemenino.isSelected()){
            sex = "femenino";
        }else{
            sex = "Masculino";
        }
       
        
        if(row != -1)
        {
            
            txtCedulaCliente.setText(tablaClientes.getValueAt(row, 0).toString());
            txtNombreCliente.setText(tablaClientes.getValueAt(row, 1).toString());
            txtApellidoCliente.setText(tablaClientes.getValueAt(row, 2).toString());
            
            cl.modificar(id, nom, ap, ced, sex);
            this.mostrarDatos();
            this.cargarTabla();
            //limpiarControles();
    }//GEN-LAST:event_btnEditarClienteMouseClicked

    }
    private void txtBuscarClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarClienteKeyTyped
        // TODO add your handling code here:
         String q = "SELECT cliente_ID, nombres, apellidos, cedula, sexo FROM Cliente Where nombres like '" + txtBuscarCliente.getText() + "%'";
         
         tablaClientes.setModel(cl.cargarTabla(q));
    }//GEN-LAST:event_txtBuscarClienteKeyTyped

    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBoton;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEliminarRegistroCliente;
    private javax.swing.JButton btnLimpiarRegistroCliente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
