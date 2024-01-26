/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.vista.Libro;

import ec.edu.ups.controlador.LibroControlador;
import ec.edu.ups.controlador.PrestamoControlador;
import ec.edu.ups.vista.usuario.*;
import ec.edu.ups.controlador.UsuarioControlador;
import ec.edu.ups.modelo.Libro;
import ec.edu.ups.modelo.Usuario;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fernan
 */
public class VentanaPrestar extends javax.swing.JInternalFrame {

    private PrestamoControlador prestamoControlador;
    private UsuarioControlador usuarioControlador;
    private LibroControlador libroControlador;
    private ResourceBundle mensajes;
    private String tituloOriginal;
    private Libro libro1 = null;
    private Usuario usuario1 = null;

    /**
     * Creates new form VentanaCrearBiblioteca
     */
    public VentanaPrestar(UsuarioControlador usuarioControlador, LibroControlador libroControlador,PrestamoControlador prestamoControlador) {
        initComponents();
        this.usuarioControlador = usuarioControlador;
        this.libroControlador = libroControlador;
        this.prestamoControlador = prestamoControlador;
        mensajes = ResourceBundle.getBundle("mensajes.mensajes", Locale.getDefault()); // Inicializa el ResourceBundle
        tituloOriginal = "Prestar libros";
        setTitle(tituloOriginal);
        tblLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLibrosMouseClicked(evt);
            }
        });

        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        cargarDatos();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnPrestar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Prestar");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Identificacion", "Nombre", "Apellido", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        btnPrestar.setText("Prestar");
        btnPrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestarActionPerformed(evt);
            }
        });

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Titulo", "Autor", "Año", "Disponible"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLibros.setCellSelectionEnabled(true);
        tblLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLibrosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblLibros);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(btnPrestar)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnPrestar)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestarActionPerformed
        String codigoPrestamoStr = JOptionPane.showInputDialog(this, "Ingrese el código de prestamo:");
        if (codigoPrestamoStr == null || codigoPrestamoStr.isEmpty()) {
            // El usuario canceló la operación o no ingresó un código válido
            return;
        }

        int codigoPrestamo = Integer.parseInt(codigoPrestamoStr);
        String fechaPrestamo = JOptionPane.showInputDialog(this, "Ingrese la fecha de prestamo:");

        if (libro1 != null && usuario1 != null) {
            // Verificar si el libro está disponible antes de prestar
            if (libro1.isDisponible()) {
                // Llamar al método prestar del controlador de prestamos
                prestamoControlador.create(codigoPrestamo, libro1, usuario1, fechaPrestamo);

                // Actualizar la disponibilidad del libro en el controlador de libros
                libroControlador.prestar(libro1.getId());

                // Limpiar campos y mostrar mensaje de éxito
                libro1 = null;
                usuario1 = null;
                cargarDatos();
                JOptionPane.showMessageDialog(this, "Prestamo creado exitosamente! :)");
            } else {
                JOptionPane.showMessageDialog(this, "El libro seleccionado no está disponible para préstamo.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un libro y un usuario.");
        }

    }//GEN-LAST:event_btnPrestarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        cargarDatos();
    }//GEN-LAST:event_formInternalFrameActivated

    private void tblLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLibrosMouseClicked
         int selectedRow = tblLibros.getSelectedRow();
        if (selectedRow != -1) {
            int libroId = (int) tblLibros.getValueAt(selectedRow, 0);
            libro1 = libroControlador.read(libroId); // Debes implementar un método getById en tu controlador
        }
    }//GEN-LAST:event_tblLibrosMouseClicked

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        int selectedRow = tblUsuarios.getSelectedRow();
        if (selectedRow != -1) {
            String usuarioId = (String) tblUsuarios.getValueAt(selectedRow, 0);
            usuario1 = usuarioControlador.read(usuarioId); // Debes implementar un método getById en tu controlador
        }
    }//GEN-LAST:event_tblUsuariosMouseClicked

    public void cargarDatos() {
        List<Usuario> usuarios = usuarioControlador.list();
        DefaultTableModel modelo = (DefaultTableModel) tblUsuarios.getModel();
        modelo.setNumRows(0);
        for (Usuario usuario : usuarios) {
            Object[] rowData = {usuario.getIdentificacion(), usuario.getNombre(), usuario.getApellido(), usuario.getCorreo()};
            modelo.addRow(rowData);
        }
        List<Libro> libros = libroControlador.list();
        DefaultTableModel modelo1 = (DefaultTableModel) tblLibros.getModel();
        modelo1.setNumRows(0);

        for (Libro libro : libros) {
            if (libro.isDisponible()) {  // Verifica si el libro está disponible antes de agregarlo
                Object[] rowData = {libro.getId(), libro.getTitulo(), libro.getAutor(), libro.getAño(), libro.isDisponible()};
                modelo1.addRow(rowData);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrestar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables

    public void cambiarIdioma(Locale locale) {
        mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
        setTitle(mensajes.getString("tituloPrestarLibros"));
        
        btnPrestar.setText(mensajes.getString("Prestar"));
        
        tblLibros.getColumnModel().getColumn(0).setHeaderValue(mensajes.getString("Codigo"));
        tblLibros.getColumnModel().getColumn(1).setHeaderValue(mensajes.getString("Titulo"));
        tblLibros.getColumnModel().getColumn(2).setHeaderValue(mensajes.getString("Autor"));
        tblLibros.getColumnModel().getColumn(3).setHeaderValue(mensajes.getString("Año"));
        tblLibros.getColumnModel().getColumn(3).setHeaderValue(mensajes.getString("Disponible"));

        tblUsuarios.getColumnModel().getColumn(0).setHeaderValue(mensajes.getString("Identificacion"));
        tblUsuarios.getColumnModel().getColumn(1).setHeaderValue(mensajes.getString("Nombre"));
        tblUsuarios.getColumnModel().getColumn(2).setHeaderValue(mensajes.getString("Apellido"));
        tblUsuarios.getColumnModel().getColumn(3).setHeaderValue(mensajes.getString("Correo"));

        cargarDatos();
    }
}
