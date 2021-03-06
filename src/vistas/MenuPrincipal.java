/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modelo.TEmpleado;
import sun.applet.Main;

/**
 *
 * @author del
 */
public class MenuPrincipal extends javax.swing.JInternalFrame {

    /**
     * Creates new form menuPrincipal
     */
    JDesktopPane dp;
    private TEmpleado te;
    public MenuPrincipal(JDesktopPane dp) throws SQLException {
        this.dp = dp;
        te = new TEmpleado();
        initComponents();
        mostrarImagen();
        mostrarNombreEmpleado();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }
    
    public void mostrarImagen()
    {
        
        BufferedImage img = null;
        File f = new File("src/images/LeonBlanco.png");
        try {
            img = ImageIO.read(f);
            
            Image dimg = img.getScaledInstance(/*leonLabel.getWidth()*/70,/* leonLabel.getHeight()*/ 70,
            Image.SCALE_SMOOTH);
            
            ImageIcon imageIcon = new ImageIcon(dimg);
            leonLabel.setIcon(imageIcon);
            //System.out.println(f.getPath());
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Error al cargar la imagen", "Upps",JOptionPane.WARNING_MESSAGE);
            //File fi = new File("/icons/default_image.jpg");
            //mostrarImagen(fi);
        }
        
        
    }
    
    public void mostrarNombreEmpleado()
    {
        nombreEmpleado.setText("Bienvenido " + te.obtenerNombreEmpleadoIniciado());
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
        leonLabel = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnminimizar = new javax.swing.JButton();
        nombreEmpleado = new javax.swing.JLabel();
        panelClientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelFacturar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelInventario = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelEmpleados = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panelReportes = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelCuentas = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

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

        leonLabel.setPreferredSize(new java.awt.Dimension(100, 100));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/principal/icons8_Delete_18px.png"))); // NOI18N
        btnSalir.setToolTipText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/principal/icons8_Delete_18px_1.png"))); // NOI18N
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        btnminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/principal/icons8_Minimize_Window_18px.png"))); // NOI18N
        btnminimizar.setToolTipText("Minimizar");
        btnminimizar.setBorder(null);
        btnminimizar.setBorderPainted(false);
        btnminimizar.setContentAreaFilled(false);
        btnminimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnminimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/principal/icons8_Minimize_Window_18px_1.png"))); // NOI18N
        btnminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminimizarMouseClicked(evt);
            }
        });

        nombreEmpleado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nombreEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        nombreEmpleado.setText("jLabel13");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(leonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 836, Short.MAX_VALUE)
                        .addComponent(btnminimizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(nombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(leonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnminimizar)
                            .addComponent(btnSalir))
                        .addGap(31, 31, 31)
                        .addComponent(nombreEmpleado)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelClientes.setBackground(new java.awt.Color(215, 215, 215));
        panelClientes.setToolTipText("Administre datos de clientes");
        panelClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelClientesMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/principal/Admin_100px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Clientes");

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClientesLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1))
                    .addGroup(panelClientesLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        panelFacturar.setBackground(new java.awt.Color(215, 215, 215));
        panelFacturar.setToolTipText("Efectúe venta y facturación");
        panelFacturar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFacturar.setPreferredSize(new java.awt.Dimension(203, 220));
        panelFacturar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFacturarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelFacturarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelFacturarMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/principal/Request Money_100px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Facturación");

        javax.swing.GroupLayout panelFacturarLayout = new javax.swing.GroupLayout(panelFacturar);
        panelFacturar.setLayout(panelFacturarLayout);
        panelFacturarLayout.setHorizontalGroup(
            panelFacturarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturarLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panelFacturarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFacturarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addComponent(jLabel3))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        panelFacturarLayout.setVerticalGroup(
            panelFacturarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturarLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        panelInventario.setBackground(new java.awt.Color(215, 215, 215));
        panelInventario.setToolTipText("Gestionar datos principales del negocio");
        panelInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelInventario.setPreferredSize(new java.awt.Dimension(203, 220));
        panelInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelInventarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelInventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelInventarioMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/principal/icons8_Database_Administrator_80px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Inventario");

        javax.swing.GroupLayout panelInventarioLayout = new javax.swing.GroupLayout(panelInventario);
        panelInventario.setLayout(panelInventarioLayout);
        panelInventarioLayout.setHorizontalGroup(
            panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInventarioLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panelInventarioLayout.setVerticalGroup(
            panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInventarioLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        panelEmpleados.setBackground(new java.awt.Color(215, 215, 215));
        panelEmpleados.setToolTipText("Gestionar datos de empleados");
        panelEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelEmpleados.setPreferredSize(new java.awt.Dimension(203, 220));
        panelEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEmpleadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelEmpleadosMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/principal/Admin_100px_1.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Empleados");

        javax.swing.GroupLayout panelEmpleadosLayout = new javax.swing.GroupLayout(panelEmpleados);
        panelEmpleados.setLayout(panelEmpleadosLayout);
        panelEmpleadosLayout.setHorizontalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmpleadosLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(50, 50, 50))
        );
        panelEmpleadosLayout.setVerticalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panelReportes.setBackground(new java.awt.Color(215, 215, 215));
        panelReportes.setToolTipText("Reportes de ventas");
        panelReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelReportes.setPreferredSize(new java.awt.Dimension(203, 220));
        panelReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelReportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelReportesMouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/principal/Combo Chart_100px.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Reportes");

        javax.swing.GroupLayout panelReportesLayout = new javax.swing.GroupLayout(panelReportes);
        panelReportes.setLayout(panelReportesLayout);
        panelReportesLayout.setHorizontalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportesLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReportesLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReportesLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(59, 59, 59))))
        );
        panelReportesLayout.setVerticalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportesLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        panelCuentas.setBackground(new java.awt.Color(215, 215, 215));
        panelCuentas.setToolTipText("Gestionar cuentas de usuario");
        panelCuentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCuentas.setPreferredSize(new java.awt.Dimension(203, 220));
        panelCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCuentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelCuentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelCuentasMouseExited(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/principal/icons8_User_Account_80px.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Cuentas de usuario");

        javax.swing.GroupLayout panelCuentasLayout = new javax.swing.GroupLayout(panelCuentas);
        panelCuentas.setLayout(panelCuentasLayout);
        panelCuentasLayout.setHorizontalGroup(
            panelCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuentasLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuentasLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(33, 33, 33))
        );
        panelCuentasLayout.setVerticalGroup(
            panelCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuentasLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(169, 169, 169))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelClientesMouseEntered
        panelClientes.setBackground(new java.awt.Color(136, 136, 136));
    }//GEN-LAST:event_panelClientesMouseEntered

    private void panelClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelClientesMouseExited
        panelClientes.setBackground(new java.awt.Color(215, 215, 215));
    }//GEN-LAST:event_panelClientesMouseExited

    private void panelFacturarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFacturarMouseEntered
        panelFacturar.setBackground(new java.awt.Color(136, 136, 136));
    }//GEN-LAST:event_panelFacturarMouseEntered

    private void panelFacturarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFacturarMouseExited
        panelFacturar.setBackground(new java.awt.Color(215, 215, 215));
    }//GEN-LAST:event_panelFacturarMouseExited

    private void panelInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelInventarioMouseEntered
        panelInventario.setBackground(new java.awt.Color(136, 136, 136));
    }//GEN-LAST:event_panelInventarioMouseEntered

    private void panelInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelInventarioMouseExited
        panelInventario.setBackground(new java.awt.Color(215, 215, 215));
    }//GEN-LAST:event_panelInventarioMouseExited

    private void panelEmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEmpleadosMouseEntered
        panelEmpleados.setBackground(new java.awt.Color(136, 136, 136));
    }//GEN-LAST:event_panelEmpleadosMouseEntered

    private void panelEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEmpleadosMouseExited
        panelEmpleados.setBackground(new java.awt.Color(215, 215, 215));
    }//GEN-LAST:event_panelEmpleadosMouseExited

    private void panelReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelReportesMouseEntered
        panelReportes.setBackground(new java.awt.Color(136, 136, 136));
    }//GEN-LAST:event_panelReportesMouseEntered

    private void panelReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelReportesMouseExited
        panelReportes.setBackground(new java.awt.Color(215, 215, 215));
    }//GEN-LAST:event_panelReportesMouseExited

    private void panelCuentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCuentasMouseEntered
        panelCuentas.setBackground(new java.awt.Color(136, 136, 136));
    }//GEN-LAST:event_panelCuentasMouseEntered

    private void panelCuentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCuentasMouseExited
        panelCuentas.setBackground(new java.awt.Color(215, 215, 215));
    }//GEN-LAST:event_panelCuentasMouseExited

    private void panelInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelInventarioMouseClicked
        //JDesktopPane jdp = dp;
        InventarioForm iv = new InventarioForm(dp);
        //dp.removeAll();
        
        dp.add(iv);
        iv.setVisible(true);
    }//GEN-LAST:event_panelInventarioMouseClicked
     
    int xx, xy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        //this.setLocation(x - xx, y - xy);*
        //this.getParent().getParent().setLocation(x - xx, y - xy);
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void panelFacturarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFacturarMouseClicked
        FacturacionForm ff;
        try {
            ff = new FacturacionForm(dp);
            dp.removeAll();
            dp.add(ff);
            ff.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_panelFacturarMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminimizarMouseClicked
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.setState(topFrame.ICONIFIED);
    }//GEN-LAST:event_btnminimizarMouseClicked

    private void panelReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelReportesMouseClicked
        ReportesForm rf = new ReportesForm(dp);
        dp.removeAll();
        dp.add(rf);
        rf.setVisible(true);
    }//GEN-LAST:event_panelReportesMouseClicked

    private void panelClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelClientesMouseClicked
        
        try {
            ClientesForm cf;
            cf = new ClientesForm(dp);
            dp.removeAll();
            dp.add(cf);
        cf.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_panelClientesMouseClicked

    private void panelEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEmpleadosMouseClicked
        EmpleadosForm ef;
        try {
            ef = new EmpleadosForm(dp);
            dp.removeAll();
            dp.add(ef);
            ef.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_panelEmpleadosMouseClicked

    private void panelCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCuentasMouseClicked
        
        try {
            CuentasForm cf;
            cf = new CuentasForm(dp);
            dp.removeAll();
             dp.add(cf);
        cf.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_panelCuentasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnminimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel leonLabel;
    private javax.swing.JLabel nombreEmpleado;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelCuentas;
    private javax.swing.JPanel panelEmpleados;
    private javax.swing.JPanel panelFacturar;
    private javax.swing.JPanel panelInventario;
    private javax.swing.JPanel panelReportes;
    // End of variables declaration//GEN-END:variables
}
