/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.vista.Libro;

import ec.edu.ups.controlador.LibroControlador;
import ec.edu.ups.modelo.Libro;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class VentanaEditarLibro extends javax.swing.JInternalFrame {

    private LibroControlador libroControlador;
    private ResourceBundle mensajes;
    private String tituloOriginal;
    public VentanaEditarLibro(LibroControlador libroControlador) {
        initComponents();
        this.libroControlador = libroControlador;
        mensajes = ResourceBundle.getBundle("mensajes.mensajes", Locale.getDefault());
        tituloOriginal = "Editar Libro"; 
        setTitle(tituloOriginal); 
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
        Codigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        Autor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        Año = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        Disponible = new javax.swing.JLabel();
        txtDisponible = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Editar Libro");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Codigo.setFont(new java.awt.Font("Lucida Sans Typewriter", 3, 13)); // NOI18N
        Codigo.setText("Codigo");

        txtCodigo.setToolTipText("Ingresa el codigo de la Biblioteca a buscar");

        Titulo.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        Titulo.setText("Titulo");

        txtTitulo.setEditable(false);

        Autor.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        Autor.setText("Autor");

        txtAutor.setEditable(false);

        txtAño.setEditable(false);

        Año.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        Año.setText("Año");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        Disponible.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        Disponible.setText("Disponible");

        txtDisponible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "No Disponible" }));
        txtDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisponibleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Codigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Titulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Autor)
                                .addGap(59, 59, 59)
                                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Año)
                                    .addComponent(Disponible))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAño, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(txtDisponible, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Codigo)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Autor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Año))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Disponible)
                    .addComponent(txtDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
        Libro libro = libroControlador.read(codigo);
        if (libro == null) {
            JOptionPane.showMessageDialog(this, "No se ha encontrado El libro! ");
        } else {
            txtTitulo.setText(libro.getTitulo());
            txtTitulo.setEditable(true);
            txtAutor.setText(libro.getAutor());
            txtAutor.setEditable(true);
            txtAño.setText(String.valueOf(libro.getAño()));
            txtAño.setEditable(true);
            txtCodigo.setEditable(false);
            txtDisponible.setSelectedItem(libro.isDisponible());
            txtDisponible.setEditable(true);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
        String titulo = txtTitulo.getText();
        String autor = txtAutor.getText();
        int año = Integer.parseInt(txtAño.getText());
        String disponible = txtDisponible.getSelectedItem().toString();
        boolean disponible1;
        if (disponible.equals("Disponible")) {
            disponible1 = true;
        } else {
            disponible1 = false;
        }

        libroControlador.update(codigo, titulo, autor, año, disponible1);
        JOptionPane.showMessageDialog(this, "Libro actualizado exitosamente");

        limpiarDatos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void cambiarIdioma(Locale locale) {
        mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
        setTitle(mensajes.getString("EditarLibro"));
        Titulo.setText(mensajes.getString("Titulo"));
        Autor.setText(mensajes.getString("Autor"));
        Año.setText(mensajes.getString("Año"));
        Disponible.setText(mensajes.getString("Disponible"));
        btnCancelar.setText(mensajes.getString("btnCancelar"));
        btnBuscar.setText(mensajes.getString("btnBuscar"));
        btnGuardar.setText(mensajes.getString("btnGuardar"));
        Codigo.setText(mensajes.getString("Codigo"));
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisponibleActionPerformed

    private void limpiarDatos() {
        txtCodigo.setEditable(true);
        txtTitulo.setEditable(false);
        txtAutor.setEditable(false);
        txtAño.setEditable(false);
        txtDisponible.setSelectedIndex(0);
        txtCodigo.setText("");
        txtTitulo.setText("");
        txtAutor.setText("");
        txtAño.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Autor;
    private javax.swing.JLabel Año;
    private javax.swing.JLabel Codigo;
    private javax.swing.JLabel Disponible;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JComboBox<String> txtDisponible;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

}
