package Interfaces_Vistas;

import Categorias.*;
import AccesoADatos.CategoriaData;
import Categorias.TipoCama;
import Categorias.TipoHabitacion;
import Entidades.Categoria;
import FondoImagenes.InternalFrameImagen;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class datosCategoria extends InternalFrameImagen {

    private final DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public datosCategoria() {
        initComponents();
        armarCabecera();
        armarTabla();
        cargarComboHabitacion();
        cargarComboTipoCama();
        jCtipocamas.setSelectedItem(null);
        jCtipohabitacion.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jBnuevo = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jBactualizar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jBbuscar = new javax.swing.JButton();
        jTcodigo = new javax.swing.JTextField();
        jTcantpersonas = new javax.swing.JTextField();
        jTcantcamas = new javax.swing.JTextField();
        jCtipohabitacion = new javax.swing.JComboBox<>();
        jCtipocamas = new javax.swing.JComboBox<>();
        jTprecionoche = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtabla = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setText("Categorias");

        jLabel2.setText("Código:");

        jLabel3.setText("Cant/Personas:");

        jLabel4.setText("Cant/Camas:");

        jLabel5.setText("Tipo/Habitación:");

        jLabel6.setText("Tipo/Cama:");

        jLabel7.setText("Precio/Noche:");

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

        jBactualizar.setText("Actualizar");
        jBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizarActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jTcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTcodigoKeyTyped(evt);
            }
        });

        jTcantpersonas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTcantpersonasKeyTyped(evt);
            }
        });

        jTcantcamas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTcantcamasKeyTyped(evt);
            }
        });

        jTprecionoche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTprecionocheKeyTyped(evt);
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
        jScrollPane1.setViewportView(jTtabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBsalir)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTcodigo)
                            .addComponent(jTcantpersonas, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTcantcamas)
                            .addComponent(jCtipohabitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCtipocamas, 0, 235, Short.MAX_VALUE)
                            .addComponent(jTprecionoche, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(jBbuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jBnuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jBguardar)
                        .addGap(18, 18, 18)
                        .addComponent(jBactualizar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jBbuscar)
                    .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTcantpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTcantcamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCtipohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCtipocamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTprecionoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo)
                    .addComponent(jBguardar)
                    .addComponent(jBactualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBsalir)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        // TODO add your handling code here:
        CategoriaData categoriaData = new CategoriaData();
        Categoria categoria = new Categoria();

        categoria = categoriaData.buscarCategoria(Integer.parseInt(jTcodigo.getText()));

        jTcantcamas.setText(categoria.getCantCamas() + "");
        jTcantpersonas.setText(categoria.getCantPersonas() + "");
        jTprecionoche.setText(categoria.getPrecioNoche() + "");

        if (categoria.getTipoHabitacion().equals("Estandar Simple")) {
            jCtipohabitacion.setSelectedItem(TipoHabitacion.EstandarSimple);
        } else if (categoria.getTipoHabitacion().equals("Doble")) {
            jCtipohabitacion.setSelectedItem(TipoHabitacion.Doble);
        } else if (categoria.getTipoHabitacion().equals("Triple")) {
            jCtipohabitacion.setSelectedItem(TipoHabitacion.Triple);
        } else {
            jCtipohabitacion.setSelectedItem(TipoHabitacion.SuiteLujo);
        }

        if (categoria.getTipoCama().equals("Simples")) {
            jCtipocamas.setSelectedItem(TipoCama.Simples);
        } else if (categoria.getTipoCama().equals("Queen")) {
            jCtipocamas.setSelectedItem(TipoCama.Queen);
        } else {
            jCtipocamas.setSelectedItem(TipoCama.KingSize);
        }

    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        // TODO add your handling code here:
        jTcantcamas.setText("");
        jTcantpersonas.setText("");
        jTcodigo.setText("");
        jTprecionoche.setText("");
        jCtipocamas.setSelectedItem(null);
        jCtipohabitacion.setSelectedItem(null);

    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jTcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcodigoKeyTyped
        // TODO add your handling code here:
        verificacionNumeros(evt);
    }//GEN-LAST:event_jTcodigoKeyTyped

    private void jTcantpersonasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcantpersonasKeyTyped
        // TODO add your handling code here:
        verificacionNumeros(evt);
    }//GEN-LAST:event_jTcantpersonasKeyTyped

    private void jTcantcamasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcantcamasKeyTyped
        // TODO add your handling code here:
        verificacionNumeros(evt);
    }//GEN-LAST:event_jTcantcamasKeyTyped

    private void jTprecionocheKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTprecionocheKeyTyped
        // TODO add your handling code here:
        verificacionNumeros(evt);
    }//GEN-LAST:event_jTprecionocheKeyTyped

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        // TODO add your handling code here:
        CategoriaData categoriaData = new CategoriaData();
        Categoria categoria = null;
        TipoHabitacion tipoHabitacion = (TipoHabitacion) jCtipohabitacion.getSelectedItem();
        TipoCama tipoCama = (TipoCama) jCtipocamas.getSelectedItem();

        if (tipoHabitacion == TipoHabitacion.EstandarSimple) {
            if (tipoCama == TipoCama.Simples) {
                categoria = new Categoria(Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "EstandarSimple", "Simples", Double.parseDouble(jTprecionoche.getText()));
            } else if (tipoCama == TipoCama.Queen) {
                categoria = new Categoria(Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "EstandarSimple", "Queen", Double.parseDouble(jTprecionoche.getText()));
            } else {
                categoria = new Categoria(Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "EstandarSimple", "KingSize", Double.parseDouble(jTprecionoche.getText()));
            }
        } else if (tipoHabitacion == TipoHabitacion.Doble) {
            if (tipoCama == TipoCama.Simples) {
                categoria = new Categoria(Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "Doble", "Simples", Double.parseDouble(jTprecionoche.getText()));
            } else if (tipoCama == TipoCama.Queen) {
                categoria = new Categoria(Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "Doble", "Queen", Double.parseDouble(jTprecionoche.getText()));
            } else {
                categoria = new Categoria(Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "Doble", "KingSize", Double.parseDouble(jTprecionoche.getText()));
            }
        } else if (tipoHabitacion == TipoHabitacion.Triple) {
            if (tipoCama == TipoCama.Simples) {
                categoria = new Categoria(Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "Triple", "Simples", Double.parseDouble(jTprecionoche.getText()));
            } else if (tipoCama == TipoCama.Queen) {
                categoria = new Categoria(Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "Triple", "Queen", Double.parseDouble(jTprecionoche.getText()));
            } else {
                categoria = new Categoria(Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "Triple", "KingSize", Double.parseDouble(jTprecionoche.getText()));
            }
        } else if (tipoHabitacion == TipoHabitacion.SuiteLujo) {
            if (tipoCama == TipoCama.Simples) {
                categoria = new Categoria(Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "SuiteLujo", "Simples", Double.parseDouble(jTprecionoche.getText()));
            } else if (tipoCama == TipoCama.Queen) {
                categoria = new Categoria(Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "SuiteLujo", "Queen", Double.parseDouble(jTprecionoche.getText()));
            } else {
                categoria = new Categoria(Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "SuiteLujo", "KingSize", Double.parseDouble(jTprecionoche.getText()));
            }
        }

        categoriaData.guardarCategoria(categoria);
        armarTabla();
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed
        // TODO add your handling code here:
        CategoriaData categoriaData = new CategoriaData();
        Categoria categoria = null;
        TipoHabitacion tipoHabitacion = (TipoHabitacion) jCtipohabitacion.getSelectedItem();
        TipoCama tipoCama = (TipoCama) jCtipocamas.getSelectedItem();

        if (tipoHabitacion == TipoHabitacion.EstandarSimple) {
            if (tipoCama == TipoCama.Simples) {
                categoria = new Categoria(Integer.parseInt(jTcodigo.getText()), Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "EstandarSimple", "Simples", Double.parseDouble(jTprecionoche.getText()));
            } else if (tipoCama == TipoCama.Queen) {
                categoria = new Categoria(Integer.parseInt(jTcodigo.getText()), Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "EstandarSimple", "Queen", Double.parseDouble(jTprecionoche.getText()));
            } else {
                categoria = new Categoria(Integer.parseInt(jTcodigo.getText()), Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "EstandarSimple", "KingSize", Double.parseDouble(jTprecionoche.getText()));
            }
        } else if (tipoHabitacion == TipoHabitacion.Doble) {
            if (tipoCama == TipoCama.Simples) {
                categoria = new Categoria(Integer.parseInt(jTcodigo.getText()), Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "Doble", "Simples", Double.parseDouble(jTprecionoche.getText()));
            } else if (tipoCama == TipoCama.Queen) {
                categoria = new Categoria(Integer.parseInt(jTcodigo.getText()), Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "Doble", "Queen", Double.parseDouble(jTprecionoche.getText()));
            } else {
                categoria = new Categoria(Integer.parseInt(jTcodigo.getText()), Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "Doble", "KingSize", Double.parseDouble(jTprecionoche.getText()));
            }
        } else if (tipoHabitacion == TipoHabitacion.Triple) {
            if (tipoCama == TipoCama.Simples) {
                categoria = new Categoria(Integer.parseInt(jTcodigo.getText()), Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "Triple", "Simples", Double.parseDouble(jTprecionoche.getText()));
            } else if (tipoCama == TipoCama.Queen) {
                categoria = new Categoria(Integer.parseInt(jTcodigo.getText()), Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "Triple", "Queen", Double.parseDouble(jTprecionoche.getText()));
            } else {
                categoria = new Categoria(Integer.parseInt(jTcodigo.getText()), Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "Triple", "KingSize", Double.parseDouble(jTprecionoche.getText()));
            }
        } else if (tipoHabitacion == TipoHabitacion.SuiteLujo) {
            if (tipoCama == TipoCama.Simples) {
                categoria = new Categoria(Integer.parseInt(jTcodigo.getText()), Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "SuiteLujo", "Simples", Double.parseDouble(jTprecionoche.getText()));
            } else if (tipoCama == TipoCama.Queen) {
                categoria = new Categoria(Integer.parseInt(jTcodigo.getText()), Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "SuiteLujo", "Queen", Double.parseDouble(jTprecionoche.getText()));
            } else {
                categoria = new Categoria(Integer.parseInt(jTcodigo.getText()), Integer.parseInt(jTcantpersonas.getText()), Integer.parseInt(jTcantcamas.getText()), "SuiteLujo", "KingSize", Double.parseDouble(jTprecionoche.getText()));
            }
        }

        categoriaData.actualizarCategoria(categoria);
        armarTabla();
    }//GEN-LAST:event_jBactualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBactualizar;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<TipoCama> jCtipocamas;
    private javax.swing.JComboBox<TipoHabitacion> jCtipohabitacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTcantcamas;
    private javax.swing.JTextField jTcantpersonas;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTprecionoche;
    private javax.swing.JTable jTtabla;
    // End of variables declaration//GEN-END:variables
    private void armarTabla() {
        CategoriaData categoriaData = new CategoriaData();
        Categoria categoria = new Categoria();
        List<Categoria> listaCategoria = new ArrayList();

        listaCategoria = categoriaData.listarCategoria();
        borrarFilas();
        for (Categoria categoria1 : listaCategoria) {
            modelo.addRow(new Object[]{categoria1.getIdCategoria(), categoria1.getTipoHabitacion(), categoria1.getTipoCama(), categoria1.getCantCamas(), categoria1.getCantPersonas(), categoria1.getPrecioNoche()});
        }
    }

    private void borrarFilas() {
        int filas = jTtabla.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void armarCabecera() {
        modelo.addColumn("ID Categoria");
        modelo.addColumn("Tipo Habitacion");
        modelo.addColumn("Tipo Cama");
        modelo.addColumn("Cant Camas");
        modelo.addColumn("Nro Personas");
        modelo.addColumn("Precio");
        jTtabla.setModel(modelo);
    }

    private void cargarComboHabitacion() {

        jCtipohabitacion.addItem(TipoHabitacion.EstandarSimple);
        jCtipohabitacion.addItem(TipoHabitacion.Doble);
        jCtipohabitacion.addItem(TipoHabitacion.Triple);
        jCtipohabitacion.addItem(TipoHabitacion.SuiteLujo);

    }

    private void cargarComboTipoCama() {

        jCtipocamas.addItem(TipoCama.Simples);
        jCtipocamas.addItem(TipoCama.Queen);
        jCtipocamas.addItem(TipoCama.KingSize);

    }

    private void verificacionNumeros(java.awt.event.KeyEvent evt) {

        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo numeros");
        }

    }

}
