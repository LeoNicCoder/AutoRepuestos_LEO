/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modelo.TEmpleado;
import modelo.TUsuario;
//import sun.net.www.protocol.http.HttpURLConnection;

/**
 *
 * @author del
 */
public class EmpleadosForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form ClientesForm
     */
    private JDesktopPane dp;
    private TEmpleado te;
    private boolean editar;
    private TUsuario tu;
    public EmpleadosForm(JDesktopPane dp) throws SQLException {
        this.dp = dp;
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        te = new TEmpleado();
        tu = new TUsuario();
        cargarTabla();
        tablaEmpleados.getTableHeader().setReorderingAllowed(false); // Para evitar que el usuario mueva las columnas
        btAceptar.setVisible(false);
        btCancelar.setVisible(false);
        editar = false;
    }
    
    public void cargarTabla()
    {
        if(te.verificarExistenciaRegistros())
        {
            tablaEmpleados.setModel(te.cargarTabla());
            
        }else{
            btEditar.setEnabled(false);
            btEliminar.setEnabled(false);
            txtBuscar.setEditable(false);
            JOptionPane.showMessageDialog(null,
                        "NO DATA",
                        "Cargar datos",
                        JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    public boolean validarCampos()
    {
        if(txtNombre.getText().equals("") || txtApellido.getText().equals("") || txtCedula.getText().equals("") || 
        txtUsuario.getText().equals("") || txtClave.getText().equals(""))
        {
            return false;
        }else{
            return true;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        datosPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btAceptar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        rbHombre = new javax.swing.JRadioButton();
        rbMujer = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        addBoton = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbBusqueda = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBorder(null);

        jPanel1.setBackground(new java.awt.Color(69, 126, 170));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

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
        jLabel1.setText("Empleados");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clientes/icons8_Member_30px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtras)
                .addGap(452, 452, 452)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(478, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtras)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        datosPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        jLabel7.setText("Nombre: ");

        jLabel8.setText("Apellido: ");

        jLabel9.setText("Cédula: ");

        jLabel10.setText("Sexo: ");

        btAceptar.setText("Aceptar");
        btAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAceptarMouseClicked(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCancelarMouseClicked(evt);
            }
        });

        buttonGroup1.add(rbHombre);
        rbHombre.setSelected(true);
        rbHombre.setText("Hombre");

        buttonGroup1.add(rbMujer);
        rbMujer.setText("Mujer");

        jLabel12.setText("ID: ");

        txtID.setEditable(false);

        jLabel13.setText("Usuario:");

        jLabel14.setText("Clave:");

        javax.swing.GroupLayout datosPanelLayout = new javax.swing.GroupLayout(datosPanel);
        datosPanel.setLayout(datosPanelLayout);
        datosPanelLayout.setHorizontalGroup(
            datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(datosPanelLayout.createSequentialGroup()
                            .addComponent(btAceptar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCancelar))
                        .addGroup(datosPanelLayout.createSequentialGroup()
                            .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14))
                            .addGap(31, 31, 31)
                            .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(datosPanelLayout.createSequentialGroup()
                                    .addComponent(rbHombre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rbMujer))
                                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtClave, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsuario))))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        datosPanelLayout.setVerticalGroup(
            datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(25, 25, 25)
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbHombre)
                        .addComponent(rbMujer)))
                .addGap(32, 32, 32)
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAceptar)
                    .addComponent(btCancelar))
                .addGap(19, 19, 19))
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Datos de empleados");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        tablaEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Cédula", "Nombre", "Apellido", "Sexo"
            }
        ));
        jScrollPane1.setViewportView(tablaEmpleados);

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

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Edit_52px.png"))); // NOI18N
        btEditar.setBorder(null);
        btEditar.setBorderPainted(false);
        btEditar.setContentAreaFilled(false);
        btEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEditar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Edit_40px.png"))); // NOI18N
        btEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Edit_52px_1.png"))); // NOI18N
        btEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEditarMouseClicked(evt);
            }
        });

        btEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_52px.png"))); // NOI18N
        btEliminar.setBorder(null);
        btEliminar.setBorderPainted(false);
        btEliminar.setContentAreaFilled(false);
        btEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_40px.png"))); // NOI18N
        btEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_52px_1.png"))); // NOI18N
        btEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEliminarMouseClicked(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        jLabel11.setText("Buscar: ");

        cbBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Cédula" }));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Eliminar");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Editar");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Agregar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(cbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btEditar)
                    .addComponent(jLabel5))
                .addGap(125, 125, 125)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6))
                    .addComponent(btEliminar))
                .addGap(62, 62, 62))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBoton)
                    .addComponent(btEditar)
                    .addComponent(btEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(datosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
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
            Logger.getLogger(EmpleadosForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAtrasMouseClicked
    
    int xx, xy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
       xx = evt.getX();
       xy = evt.getY(); 
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void addBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBotonMouseClicked
        btAceptar.setVisible(true);
        btCancelar.setVisible(true);
    }//GEN-LAST:event_addBotonMouseClicked

    private void btEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditarMouseClicked
        
        
        int index = tablaEmpleados.getSelectedRow();
        
        if(index != -1)
        {
            btAceptar.setVisible(true);
            btCancelar.setVisible(true);
            btEliminar.setEnabled(false);
            editar = true;
            txtID.setText(tablaEmpleados.getValueAt(index, 0).toString());
            txtNombre.setText(tablaEmpleados.getValueAt(index, 1).toString());
            txtApellido.setText(tablaEmpleados.getValueAt(index, 2).toString());
            txtCedula.setText(tablaEmpleados.getValueAt(index, 3).toString());
            
            if(tablaEmpleados.getValueAt(index, 4).toString().equals("Masculino"))
            {
                rbHombre.setSelected(true);
            }else{
                rbMujer.setSelected(true);
            }
        }
    }//GEN-LAST:event_btEditarMouseClicked

    private void btEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEliminarMouseClicked
        int index = tablaEmpleados.getSelectedRow();
        
        if(index != -1)
        {
            int opc;
            opc = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?");
            
            if(opc == 0)
            {
                int id = Integer.parseInt(tablaEmpleados.getValueAt(index, 0).toString());
                te.eliminar(id);
            }
        }
        
        cargarTabla();
    }//GEN-LAST:event_btEliminarMouseClicked

    private void btCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseClicked
        btAceptar.setVisible(false);
        btCancelar.setVisible(false);
        btEliminar.setEnabled(true);
        txtID.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.setText("");
        rbHombre.setSelected(true);
        editar = false;
    }//GEN-LAST:event_btCancelarMouseClicked

    private void btAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAceptarMouseClicked
        String sexo = "";
        if(editar)
        {
            int opc = JOptionPane.showConfirmDialog(null, "¿Desea guardar los cambios de este registro?");
            
            if(opc == 0)
            {
                if(validarCampos()){
                    if(rbHombre.isSelected())
                    {
                        sexo = "Masculino";
                    }else{
                        sexo = "Femenino";
                    }
                
                    te.modificar(txtCedula.getText(),txtNombre.getText(), txtApellido.getText(), sexo, Integer.parseInt(txtID.getText()));
                    cargarTabla();
                }else{
                    JOptionPane.showMessageDialog(null,
                        "Complete los campos requeridos",
                        "Campos sin completar",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            int opc = JOptionPane.showConfirmDialog(null, "¿Desea guardar este registro?");
            
            if(opc == 0)
            {
                if(validarCampos()){
                    if(rbHombre.isSelected())
                    {
                        sexo = "Masculino";
                    }else{
                        sexo = "Femenino";
                    }
                
                    te.guardar(txtCedula.getText(),txtNombre.getText(), txtApellido.getText(), sexo);
                    tu.guardar(txtUsuario.getText(), txtClave.getText());
                    cargarTabla();
                    
                }else{
                    JOptionPane.showMessageDialog(null,
                        "Complete los campos requeridos",
                        "Campos sin completar",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btAceptarMouseClicked

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        String cadBusqueda;
       
       if(cbBusqueda.getSelectedItem().toString().equals("Nombre"))
       {
           cadBusqueda = "SELECT empleado_ID, nombres, apellidos, cedula, sexo FROM Empleado WHERE"
           + " nombres LIKE '" + txtBuscar.getText() + "%'";
       }else{
           cadBusqueda = "SELECT empleado_ID, nombres, apellidos, cedula, sexo FROM Empleado WHERE"
           + " cedula LIKE '" + txtBuscar.getText() + "%'";
       }
       
       tablaEmpleados.setModel(te.cargarTabla(cadBusqueda));
    }//GEN-LAST:event_txtBuscarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBoton;
    private javax.swing.JButton btAceptar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btnAtras;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbBusqueda;
    private javax.swing.JPanel datosPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JRadioButton rbHombre;
    private javax.swing.JRadioButton rbMujer;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
