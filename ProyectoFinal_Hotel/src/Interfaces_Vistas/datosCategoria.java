package Interfaces_Vistas;

import AccesoADatos.CategoriaData;
import Audio.Audio;
import Categorias.TipoCama;
import Categorias.TipoHabitacion;
import Entidades.Categoria;
import FondoImagenes.InternalFrameImagen;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class datosCategoria extends InternalFrameImagen {

    Audio audio = new Audio();
    private final DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public datosCategoria() {
        initComponents();
        armarCabecera();
        armarTabla();
        setImagen("3.png");
        cargarComboHabitacion();
        cargarComboTipoCama();
        jCtipocamas.setSelectedItem(null);
        jCtipohabitacion.setSelectedItem(null);
        jTprecionoche.setText("");

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
        jLabel1.setForeground(new java.awt.Color(251, 195, 19));
        jLabel1.setText("Categorias");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(251, 195, 19));
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(251, 195, 19));
        jLabel3.setText("Cant/Personas:");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(251, 195, 19));
        jLabel4.setText("Cant/Camas:");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(251, 195, 19));
        jLabel5.setText("Tipo/Habitación:");

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(251, 195, 19));
        jLabel6.setText("Tipo/Cama:");

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(251, 195, 19));
        jLabel7.setText("Precio/Noche:");

        jBnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agregar-archivo.png"))); // NOI18N
        jBnuevo.setText("Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/disco-flexible.png"))); // NOI18N
        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png"))); // NOI18N
        jBactualizar.setText("Actualizar");
        jBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizarActionPerformed(evt);
            }
        });

        jBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eliminar.png"))); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
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

        jCtipohabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCtipohabitacionActionPerformed(evt);
            }
        });

        jCtipocamas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCtipocamasActionPerformed(evt);
            }
        });

        jTprecionoche.setEditable(false);
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
                .addContainerGap(295, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(253, 253, 253))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBnuevo)
                                .addGap(18, 18, 18)
                                .addComponent(jBguardar)
                                .addGap(18, 18, 18)
                                .addComponent(jBactualizar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTcodigo)
                                    .addComponent(jTcantpersonas, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTcantcamas)
                                    .addComponent(jCtipohabitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCtipocamas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTprecionoche, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jBbuscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBsalir)
                        .addGap(7, 7, 7)))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBsalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        // TODO add your handling code here:
        audio.soundButton();
        CategoriaData categoriaData = new CategoriaData();
        Categoria categoria = new Categoria();

        try {
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

        } catch (NullPointerException n) {
            
           
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa un código");
        }

    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        // TODO add your handling code here:
        audio.soundButton();
        jTcantcamas.setText("");
        jTcantpersonas.setText("");
        jTcodigo.setText("");
        jCtipocamas.setSelectedItem(null);
        jCtipohabitacion.setSelectedItem(null);
        jTprecionoche.setText("");

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
        audio.soundButton();
        CategoriaData categoriaData = new CategoriaData();
        Categoria categoria = null;
        TipoHabitacion tipoHabitacion = (TipoHabitacion) jCtipohabitacion.getSelectedItem();
        TipoCama tipoCama = (TipoCama) jCtipocamas.getSelectedItem();
        try {
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
        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(this, "Faltan ingresar datos");
        } catch (NumberFormatException e) {

        }

    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed
        // TODO add your handling code here:
        audio.soundButton();
        CategoriaData categoriaData = new CategoriaData();
        Categoria categoria = null;
        TipoHabitacion tipoHabitacion = (TipoHabitacion) jCtipohabitacion.getSelectedItem();
        TipoCama tipoCama = (TipoCama) jCtipocamas.getSelectedItem();
        try {
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
        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(this, "Faltan ingresar datos");
        } catch (NumberFormatException e) {

        }

    }//GEN-LAST:event_jBactualizarActionPerformed

    private void jCtipocamasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCtipocamasActionPerformed
        // TODO add your handling code here:

        CategoriaData categoriaData = new CategoriaData();
        TipoHabitacion tipoHabitacion = (TipoHabitacion) jCtipohabitacion.getSelectedItem();
        TipoCama tipoCama = (TipoCama) jCtipocamas.getSelectedItem();
        if (jCtipohabitacion != null && jCtipocamas != null) {
            jTprecionoche.setText(categoriaData.precioCatCama(tipoHabitacion, tipoCama) + "");
        } else {
            jTprecionoche.setText(null);
        }

    }//GEN-LAST:event_jCtipocamasActionPerformed

    private void jCtipohabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCtipohabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCtipohabitacionActionPerformed


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
