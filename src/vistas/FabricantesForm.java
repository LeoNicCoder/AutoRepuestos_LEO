/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modelo.*;
/**
 *
 * @author del
 */
public class FabricantesForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form FabricantesForm
     */
    private TFabricante fc;
    private boolean editado;
    public FabricantesForm() throws SQLException {
        initComponents();
        ocultarElementos();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        editado = false;
        fc = new TFabricante();
        mostrar();
    }
    
    public void ocultarElementos()
    {
        //txtID.setVisible(false);
        btGuardar.setVisible(false);
        btnCancelar.setVisible(false);
    }
    
    public void mostrar()
    {
        this.txtID.setText("" + fc.getFabricanteID());
        this.txtNombre.setText(fc.getNombre());
        
        btAnterior.setEnabled(true);
        btSiguiente.setEnabled(true);
        btPrimero.setEnabled(true);
        btnEditar.setEnabled(true);
        btBuscar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btUltimo.setEnabled(true);
        btnCancelar.setVisible(false);
        btGuardar.setVisible(false);
        txtID.setEditable(true);
    }
    
    public void limpiarCampos()
    {
        this.txtID.setText("");
        this.txtNombre.setText("");
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
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btPrimero = new javax.swing.JButton();
        btAnterior = new javax.swing.JButton();
        btSiguiente = new javax.swing.JButton();
        btUltimo = new javax.swing.JButton();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(802, 597));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));

        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Inventario/icons8_Add_30px.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Inventario/icons8_Edit_30px.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        jLabel2.setText("Categoría: ");

        jLabel4.setText("ID: ");

        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Inventario/icons8_Trash_Can_25px.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Inventario/icons8_Search_25px.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBuscarMouseClicked(evt);
            }
        });

        btGuardar.setText("Guardar");
        btGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btGuardarMouseClicked(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(txtID)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btGuardar)
                        .addGap(68, 68, 68)
                        .addComponent(btnCancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(jLabel4)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscar)
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btGuardar)
                            .addComponent(btnCancelar))
                        .addGap(67, 67, 67))))
        );

        btPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Inventario/icons8_Skip_to_Start_25px.png"))); // NOI18N
        btPrimero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPrimero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPrimeroMouseClicked(evt);
            }
        });

        btAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Inventario/icons8_Chevron_Left_25px.png"))); // NOI18N
        btAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAnteriorMouseClicked(evt);
            }
        });

        btSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Inventario/icons8_Chevron_Right_25px.png"))); // NOI18N
        btSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSiguienteMouseClicked(evt);
            }
        });

        btUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Inventario/icons8_End_25px.png"))); // NOI18N
        btUltimo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btUltimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btUltimoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btSiguiente)
                        .addGap(45, 45, 45)
                        .addComponent(btUltimo)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        btAnterior.setEnabled(false);
        btSiguiente.setEnabled(false);
        btPrimero.setEnabled(false);
        btnEditar.setEnabled(false);
        btBuscar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btUltimo.setEnabled(false);
        btnCancelar.setVisible(true);
        btGuardar.setVisible(true);
        txtID.setEditable(false);
        limpiarCampos();
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        editado = true;
        btAnterior.setEnabled(false);
        btSiguiente.setEnabled(false);
        btPrimero.setEnabled(false);
        btnEditar.setEnabled(false);
        btBuscar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btUltimo.setEnabled(false);
        btnCancelar.setVisible(true);
        btGuardar.setVisible(true);
        txtID.setEditable(false);
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        int opc;
        opc = JOptionPane.showConfirmDialog(null,"¿Desea eliminar este registro?","Eliminar Registro",JOptionPane.YES_NO_OPTION);

        if(opc == 0)
        {
            fc.eliminar(Integer.parseInt(txtID.getText()));
            this.mostrar();
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarMouseClicked

        try {
            if(fc.buscarRegistro(Integer.parseInt(txtID.getText())))
            {
                mostrar();
            }else{
                JOptionPane.showMessageDialog(null, "No se encontró el registro...");
                mostrar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriasForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btBuscarMouseClicked

    private void btGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btGuardarMouseClicked

        int opc;
        opc = JOptionPane.showConfirmDialog(null,"¿Desea guardar este registro?","Guardar registro",JOptionPane.YES_NO_OPTION);

        if(opc == 0)
        {
            if(editado)
            {
                fc.modificar(Integer.parseInt(txtID.getText()), txtNombre.getText());
                editado = false;
            }else{
                fc.guardar(txtNombre.getText());
                editado = false;
                this.mostrar();
            }

        }
    }//GEN-LAST:event_btGuardarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked

    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btAnterior.setEnabled(true);
        btSiguiente.setEnabled(true);
        btPrimero.setEnabled(true);
        btnEditar.setEnabled(true);
        btBuscar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btUltimo.setEnabled(true);
        btnCancelar.setVisible(true);
        btGuardar.setVisible(true);
        txtID.setEditable(true);
        mostrar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btPrimeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPrimeroMouseClicked
        try {
            fc.primero();
            fc.actualizarEstado();
            mostrar();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriasForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btPrimeroMouseClicked

    private void btAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAnteriorMouseClicked
        try {
            fc.anterior();
            fc.actualizarEstado();
            mostrar();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriasForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAnteriorMouseClicked

    private void btSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSiguienteMouseClicked
        try {
            fc.siguiente();
            fc.actualizarEstado();
            mostrar();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriasForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btSiguienteMouseClicked

    private void btUltimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btUltimoMouseClicked
        try {
            fc.ultimo();
            fc.actualizarEstado();
            mostrar();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriasForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btUltimoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btPrimero;
    private javax.swing.JButton btSiguiente;
    private javax.swing.JButton btUltimo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
