package Interfaces_Vistas;

import AccesoADatos.CategoriaData;
import AccesoADatos.HabitacionData;
import Categorias.TipoHabitacion;
import Entidades.Categoria;
import Entidades.Habitacion;
import FondoImagenes.InternalFrameImagen;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class datosHabitacion extends InternalFrameImagen {

    private final DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }

    };

    public datosHabitacion() {
        initComponents();
        armarCabecera();
        armarTabla();
        cargarCombo();
        // jCcategoria.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTpiso = new javax.swing.JTextField();
        jTnroHabitacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBbuscar = new javax.swing.JButton();
        jBnuevo = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTtabla = new javax.swing.JTable();
        jRestado = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jCcategoria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jBactualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jCdatosCategoria = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField4.setText("jTextField4");

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setText("Habitacion");

        jTpiso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTpisoKeyTyped(evt);
            }
        });

        jTnroHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTnroHabitacionKeyTyped(evt);
            }
        });

        jLabel3.setText("Piso:");

        jLabel4.setText("Número Habitacion:");

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBnuevo.setText("Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jTtabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTtabla);

        jLabel5.setText("Estado:");

        jCcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCcategoriaActionPerformed(evt);
            }
        });

        jLabel2.setText("Categoria:");

        jBactualizar.setText("Actualizar");
        jBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizarActionPerformed(evt);
            }
        });

        jLabel6.setText("Datos Categoria:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBsalir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(jBnuevo)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBguardar)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBactualizar)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBeliminar))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRestado)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTnroHabitacion)
                                            .addComponent(jTpiso)
                                            .addComponent(jCcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addComponent(jBbuscar))
                                    .addComponent(jCdatosCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTnroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTpiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCdatosCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBnuevo)
                            .addComponent(jBguardar)
                            .addComponent(jBeliminar)
                            .addComponent(jBactualizar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBsalir))
                    .addComponent(jRestado))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        // TODO add your handling code here:
        HabitacionData habitacionData = new HabitacionData();
        Habitacion habitacion;
        CategoriaData categoriaData = new CategoriaData();
        List<Categoria> listaCategoria = new ArrayList<>();
        Categoria categoria = new Categoria();

        listaCategoria = categoriaData.listarCategoria();

        //idcategoria
        habitacion = habitacionData.buscarHabitacion(Integer.parseInt(jTnroHabitacion.getText()));
        categoria = categoriaData.buscarCategoria(habitacion.getCategoria().getIdCategoria());
        jTpiso.setText(habitacion.getPiso() + "");
        jRestado.setSelected(habitacion.isEstado());

        if (habitacion.getCategoria().getTipoHabitacion().equals("EstandarSimple")) {
            jCcategoria.setSelectedItem(TipoHabitacion.EstandarSimple);
        } else if (habitacion.getCategoria().getTipoHabitacion().equals("Doble")) {
            jCcategoria.setSelectedItem(TipoHabitacion.Doble);
        } else if (habitacion.getCategoria().getTipoHabitacion().equals("Triple")) {
            jCcategoria.setSelectedItem(TipoHabitacion.Triple);
        } else {
            jCcategoria.setSelectedItem(TipoHabitacion.SuiteLujo);
        }

        //  jCdatosCategoria.setSelectedIndex(); //VER ESTO <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<------ TAMBIEN METODO CARGARCOMBO

    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        
        jTnroHabitacion.setText("");
        jTpiso.setText("");
        jCdatosCategoria.setSelectedItem(null);
        jCcategoria.setSelectedItem(TipoHabitacion.Seleccione_Categoria);
        jRestado.setSelected(false);

    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jTnroHabitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnroHabitacionKeyTyped
        
        verificacionNumeros(evt);
    }//GEN-LAST:event_jTnroHabitacionKeyTyped

    private void jTpisoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTpisoKeyTyped
        
        verificacionNumeros(evt);
    }//GEN-LAST:event_jTpisoKeyTyped

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        
        HabitacionData habitacionData = new HabitacionData();
        Habitacion habitacion;
        List<Habitacion> listaHabitacion = new ArrayList();
        int cont = 0;
        try {

            if (jTpiso.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Llene el campo Piso");
            } else if (jTnroHabitacion.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Llene el campo Numero de Habitacion");
            } else if (jCcategoria.getSelectedItem().equals(TipoHabitacion.Seleccione_Categoria)) {
                JOptionPane.showMessageDialog(this, "Llene el campo Categoria");

            } else {
                for (Habitacion habitacion1 : habitacionData.listarHabitaciones()) {
                    if (Integer.parseInt(jTnroHabitacion.getText()) == habitacion1.getNroHabitacion()) {
                        cont++;
                    }
                }

                if (cont == 1) {
                    JOptionPane.showMessageDialog(this, "La habitacion que desea guardar ya existe");
                } else {
                    habitacion = new Habitacion((Categoria) jCdatosCategoria.getSelectedItem(), Integer.parseInt(jTpiso.getText()), Integer.parseInt(jTnroHabitacion.getText()), jRestado.isSelected());
                    habitacionData.guardarHabitacion(habitacion);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al ingresar datos");
        }

        armarTabla();


    }//GEN-LAST:event_jBguardarActionPerformed

    private void jCcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCcategoriaActionPerformed
        
        jCdatosCategoria.removeAllItems();

        if (jCcategoria != null) {
            cargarComboDescripcion((TipoHabitacion) jCcategoria.getSelectedItem());
        }
    }//GEN-LAST:event_jCcategoriaActionPerformed

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed
        
        HabitacionData habitacionData = new HabitacionData();
        Habitacion habitacion = new Habitacion();

        habitacion.setCategoria((Categoria) jCdatosCategoria.getSelectedItem());
        habitacion.setPiso(Integer.parseInt(jTpiso.getText()));
        habitacion.setNroHabitacion(Integer.parseInt(jTnroHabitacion.getText()));
        habitacion.setEstado(jRestado.isSelected());
        habitacionData.actualizarHabitacion(habitacion);

        armarTabla();

    }//GEN-LAST:event_jBactualizarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        if (jTnroHabitacion.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Llene el campo Numero de Habitacion");

        } else if (jTpiso.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Llene el campo Piso");

        } else if (jCcategoria.getSelectedItem().equals(TipoHabitacion.Seleccione_Categoria)) {
            JOptionPane.showMessageDialog(this, "Llene el campo Categoria");

        } else {

            HabitacionData habitacionData = new HabitacionData();
            habitacionData.modificarHabitacionOcupada(Integer.parseInt(jTnroHabitacion.getText()));
            jTnroHabitacion.setText("");
            jTpiso.setText("");
            jCcategoria.setSelectedItem(null);
            jRestado.setSelected(false);

            armarTabla();
        }
    }//GEN-LAST:event_jBeliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBactualizar;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<TipoHabitacion> jCcategoria;
    private javax.swing.JComboBox<Categoria> jCdatosCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRestado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTnroHabitacion;
    private javax.swing.JTextField jTpiso;
    private javax.swing.JTable jTtabla;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        jCcategoria.addItem(TipoHabitacion.Seleccione_Categoria);
        jCcategoria.addItem(TipoHabitacion.EstandarSimple);
        jCcategoria.addItem(TipoHabitacion.Doble);
        jCcategoria.addItem(TipoHabitacion.Triple);
        jCcategoria.addItem(TipoHabitacion.SuiteLujo);

    }

    private void cargarComboDescripcion(TipoHabitacion tipoHabitacion) {
        List<Categoria> listaCategoria = new ArrayList<>();
        CategoriaData categoriaData = new CategoriaData();
        ArrayList<Integer> indicesNumero = new ArrayList<>();

        listaCategoria = categoriaData.listarCategoriasxTipoHabitacion(tipoHabitacion);
        for (Categoria categoria : listaCategoria) {
            jCdatosCategoria.addItem(new Categoria(categoria.getIdCategoria(), categoria.getCantPersonas(), categoria.getCantCamas(), categoria.getTipoHabitacion(), categoria.getTipoCama(), categoria.getPrecioNoche()));
            //<<<<<<<<<<<<<<< VER ESTO   indicesNumero.add(jCdatosCategoria.getSelectedIndex());
        }
    }

    private void armarCabecera() {
        modelo.addColumn("ID Habitacion");
        modelo.addColumn("Piso");
        modelo.addColumn("Nro Habitacion");
        modelo.addColumn("Tipo Habitacion");
        modelo.addColumn("Estado");
        jTtabla.setModel(modelo);
    }

    private void armarTabla() {
        HabitacionData habitacionData = new HabitacionData();
        Habitacion habitacion = new Habitacion();
        List<Habitacion> listaHabitacion = new ArrayList();

        listaHabitacion = habitacionData.listarHabitaciones();
        borrarFilas();
        for (Habitacion habitacion1 : listaHabitacion) {
            modelo.addRow(new Object[]{habitacion1.getIdHabitacion(), habitacion1.getPiso(), habitacion1.getNroHabitacion(), habitacion1.getCategoria().getTipoHabitacion(), habitacion1.isEstado()});
        }
    }

    private void borrarFilas() {
        int filas = jTtabla.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void verificacionNumeros(java.awt.event.KeyEvent evt) {

        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo numeros");
        }

    }
}
