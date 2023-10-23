package Interfaces_Vistas;

import AccesoADatos.CategoriaData;
import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import Entidades.Categoria;
import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.Reserva;
import FondoImagenes.InternalFrameImagen;
import com.toedter.calendar.JDateChooser;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formularioReserva extends InternalFrameImagen {

    private final DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public formularioReserva() {
        initComponents();
        armarCabecera();
        cargarCombo();
        jCombo.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtabla = new javax.swing.JTable();
        jRdisponibles = new javax.swing.JRadioButton();
        jRnodisponibles = new javax.swing.JRadioButton();
        jBconfirmar = new javax.swing.JButton();
        jBanular = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTprecio = new javax.swing.JTextField();
        jTdias = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jBactualizar = new javax.swing.JButton();
        jDinicio = new com.toedter.calendar.JDateChooser();
        jDfinal = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jTcantPersonas = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setText("Formulario De Reserva");

        jLabel2.setText("Listado de habitaciones");

        jCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboActionPerformed(evt);
            }
        });

        jLabel3.setText("Precio final:");

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

        jRdisponibles.setText("Disponibles");
        jRdisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdisponiblesActionPerformed(evt);
            }
        });

        jRnodisponibles.setText("No disponibles");
        jRnodisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRnodisponiblesActionPerformed(evt);
            }
        });

        jBconfirmar.setText("Confirmar");
        jBconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconfirmarActionPerformed(evt);
            }
        });

        jBanular.setText("Anular");
        jBanular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBanularActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jLabel4.setText("Seleccione un huesped inscripto:");

        jLabel5.setText("Fecha fin de reserva");

        jLabel6.setText("Fecha inicio de reserva");

        jTprecio.setEditable(false);

        jTdias.setEditable(false);

        jLabel8.setText("Cantidad de días:");

        jBactualizar.setText("Actualizar");
        jBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizarActionPerformed(evt);
            }
        });

        jDinicio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDinicioPropertyChange(evt);
            }
        });

        jDfinal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDfinalPropertyChange(evt);
            }
        });

        jLabel7.setText("Cantidad de personas:");

        jTcantPersonas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTcantPersonasKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTcantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jBactualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(256, 256, 256))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBconfirmar)
                        .addGap(44, 44, 44)
                        .addComponent(jBanular)
                        .addGap(97, 97, 97)
                        .addComponent(jBsalir)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jRdisponibles)
                                .addGap(18, 18, 18)
                                .addComponent(jRnodisponibles))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(52, 52, 52)))
                        .addGap(237, 237, 237))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTdias, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTcantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRnodisponibles)
                    .addComponent(jRdisponibles))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTdias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBactualizar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsalir)
                    .addComponent(jBanular)
                    .addComponent(jBconfirmar))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed

        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jRdisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdisponiblesActionPerformed
        // TODO add your handling code here:
        borrarFilas();
        HabitacionData habitacion = new HabitacionData();

        if (jTcantPersonas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número en la casilla de cantidad de personas");
            jRdisponibles.setSelected(false);
        }else{
            for (Habitacion hab : habitacion.listarHabitacionesActivas()) {
                if (hab.getCategoria().getCantPersonas() == Integer.parseInt(jTcantPersonas.getText())) {
                    modelo.addRow(new Object[]{hab.getIdHabitacion(), hab.getPiso(), hab.getNroHabitacion(), hab.getCategoria().getIdCategoria(), hab.getCategoria().getTipoHabitacion(), hab.getCategoria().getTipoCama(), hab.getCategoria().getCantCamas(), hab.getCategoria().getCantPersonas(), hab.getCategoria().getPrecioNoche()});
                }
                jCombo.setEnabled(true);
                jRnodisponibles.setSelected(false);
                jBconfirmar.setEnabled(true);
                jBanular.setEnabled(false);
                jTcantPersonas.setEnabled(true);
            }
        }

    }//GEN-LAST:event_jRdisponiblesActionPerformed

    private void jRnodisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRnodisponiblesActionPerformed
        jCombo.setSelectedItem(null);
        borrarFilas();
        HabitacionData habitacion = new HabitacionData();

        for (Habitacion hab : habitacion.listarHabitacionesNoActivas()) {
            modelo.addRow(new Object[]{hab.getIdHabitacion(), hab.getPiso(), hab.getNroHabitacion(), hab.getCategoria().getIdCategoria(), hab.getCategoria().getTipoHabitacion(), hab.getCategoria().getTipoCama(), hab.getCategoria().getCantCamas(), hab.getCategoria().getCantPersonas(), hab.getCategoria().getPrecioNoche()});
        }
        jCombo.setEnabled(false);
        jRdisponibles.setSelected(false);
        jBconfirmar.setEnabled(false);
        jBanular.setEnabled(true);
        
        jTcantPersonas.setEnabled(false);
    }//GEN-LAST:event_jRnodisponiblesActionPerformed

    private void jComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboActionPerformed
        // TODO add your handling code here:
        jRdisponibles.setSelected(false);
        if (jCombo.getSelectedItem() != null) {
            jRnodisponibles.setSelected(false);
        }
        borrarFilas();
    }//GEN-LAST:event_jComboActionPerformed

    private void jBconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconfirmarActionPerformed
        // TODO add your handling code here:
        ReservaData reservaData = new ReservaData();
        Huesped huesped = (Huesped) jCombo.getSelectedItem();
        Reserva reserva;
        Habitacion habitacion = new Habitacion();
        List<Habitacion> listaHabitacion;
        HabitacionData habitacionData = new HabitacionData();

        int nroHabitacion = 0;
        int idHabitacion = 0;
        int filaSeleccionada = jTtabla.getSelectedRow();

        if (filaSeleccionada != -1) {
            nroHabitacion = (int) jTtabla.getValueAt(filaSeleccionada, 2);
            idHabitacion = (int) jTtabla.getValueAt(filaSeleccionada, 0);
        }

        reserva = new Reserva(jDinicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), jDfinal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), Integer.parseInt(jTdias.getText()), Double.parseDouble(jTprecio.getText()), huesped.getIdHuesped(), idHabitacion, true);
        reservaData.guardarReserva(reserva);
        habitacionData.modificarHabitacionOcupada(nroHabitacion);
        borrarFilas();
        listaHabitacion = habitacionData.listarHabitacionesActivas();

        for (Habitacion hab : listaHabitacion) {
            modelo.addRow(new Object[]{hab.getIdHabitacion(), hab.getPiso(), hab.getNroHabitacion(), hab.getCategoria().getIdCategoria(), hab.getCategoria().getTipoHabitacion(), hab.getCategoria().getTipoCama(), hab.getCategoria().getCantCamas(), hab.getCategoria().getCantPersonas(), hab.getCategoria().getPrecioNoche()});
        }


    }//GEN-LAST:event_jBconfirmarActionPerformed

    private void jBanularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBanularActionPerformed
        // TODO add your handling code here:

        ReservaData reservaData = new ReservaData();
        HabitacionData habitaciondata = new HabitacionData();
        Huesped huesped = (Huesped) jCombo.getSelectedItem();

        int filaSeleccionada = jTtabla.getSelectedRow();

        if (filaSeleccionada != -1) {
            int nroHabitacion = (int) jTtabla.getValueAt(filaSeleccionada, 2);
            int idHabitacion = (int) jTtabla.getValueAt(filaSeleccionada, 0);

            reservaData.borrarReservaHuespedHabitacion(huesped.getIdHuesped(), idHabitacion);
            habitaciondata.modificarHabitacionLibre(nroHabitacion);
        }

        borrarFilas();

        for (Habitacion hab : habitaciondata.listarHabitacionesNoActivas()) {
            modelo.addRow(new Object[]{hab.getIdHabitacion(), hab.getPiso(), hab.getNroHabitacion(), hab.getCategoria().getIdCategoria(), hab.getCategoria().getTipoHabitacion(), hab.getCategoria().getTipoCama(), hab.getCategoria().getCantCamas(), hab.getCategoria().getCantPersonas(), hab.getCategoria().getPrecioNoche()});
        }


    }//GEN-LAST:event_jBanularActionPerformed

    private void jDfinalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDfinalPropertyChange
        // TODO add your handling code here:
        Categoria categoria;
        CategoriaData categoriaData = new CategoriaData();
        int filaSeleccionada = jTtabla.getSelectedRow();
        if (jDinicio.getDate() != null && jDfinal.getDate() != null) {
            calcularDias(jDinicio, jDfinal);

            if (filaSeleccionada != -1) {
                int idCategoria = (Integer) jTtabla.getValueAt(filaSeleccionada, 3);

                categoria = categoriaData.buscarCategoria(idCategoria);

                if (jDfinal.getDate().before(jDinicio.getDate())) {
                    JOptionPane.showMessageDialog(this, "Fecha inicio debe de ser menor a la Fecha final");
                    jTprecio.setText(null);
                    jDinicio.setDate(null);
                    jDfinal.setDate(null);
                } else {
                    mostrarPrecio(Integer.parseInt(jTdias.getText()), categoria);
                }
            }
        }
    }//GEN-LAST:event_jDfinalPropertyChange

    private void jDinicioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDinicioPropertyChange
        // TODO add your handling code here:
        if (jDinicio != null && jDfinal != null) {
            calcularDias(jDinicio, jDfinal);
        }
    }//GEN-LAST:event_jDinicioPropertyChange

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed
        // TODO add your handling code here:
        Categoria categoria;
        CategoriaData categoriaData = new CategoriaData();
        int filaSeleccionada = jTtabla.getSelectedRow();

        if (jDinicio != null && jDfinal != null) {
            calcularDias(jDinicio, jDfinal);
        }
        if (filaSeleccionada != -1) {
            int idCategoria = (Integer) jTtabla.getValueAt(filaSeleccionada, 3);

            categoria = categoriaData.buscarCategoria(idCategoria);

            if (Integer.parseInt(jTdias.getText()) >= 0) {
                mostrarPrecio(Integer.parseInt(jTdias.getText()), categoria);
            } else {
                jTprecio.setText(null);
                JOptionPane.showMessageDialog(this, "Fecha inicio debe de ser menor a la Fecha final");
            }
        }
    }//GEN-LAST:event_jBactualizarActionPerformed

    private void jTcantPersonasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcantPersonasKeyTyped
        // TODO add your handling code here:
        verificacionNumeros(evt);
        jRdisponibles.setSelected(false);
        borrarFilas();
    }//GEN-LAST:event_jTcantPersonasKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBactualizar;
    private javax.swing.JButton jBanular;
    private javax.swing.JButton jBconfirmar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Huesped> jCombo;
    private com.toedter.calendar.JDateChooser jDfinal;
    private com.toedter.calendar.JDateChooser jDinicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRdisponibles;
    private javax.swing.JRadioButton jRnodisponibles;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTcantPersonas;
    private javax.swing.JTextField jTdias;
    private javax.swing.JTextField jTprecio;
    private javax.swing.JTable jTtabla;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        modelo.addColumn("ID Hab");
        modelo.addColumn("Piso");
        modelo.addColumn("Nro Habitación");
        modelo.addColumn("ID Categoria");
        modelo.addColumn("Categoria");
        modelo.addColumn("Cama");
        modelo.addColumn("CantCamas");
        modelo.addColumn("CantPersonas");
        modelo.addColumn("Precio");

        jTtabla.setModel(modelo);
    }

    private void borrarFilas() {
        int filas = jTtabla.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void cargarCombo() {
        List<Huesped> listaHuesped = new ArrayList<>();
        HuespedData huesped = new HuespedData();
        listaHuesped = huesped.listarHuesped();
        for (Huesped huesped1 : listaHuesped) {
            jCombo.addItem(new Huesped(huesped1.getIdHuesped(), huesped1.getNombre(), huesped1.getApellido(), huesped1.getDni(), huesped1.getDomicilio(), huesped1.getCorreo(), huesped1.getCelular(), huesped1.isEstado()));
        }
    }

    public void calcularDias(JDateChooser jDinicio, JDateChooser jDfinal) {
        if (jDinicio.getDate() != null & jDfinal.getDate() != null) {
            Calendar fecha_inicio = jDinicio.getCalendar();
            Calendar fecha_final = jDfinal.getCalendar();
            int dias = -1;
            while (fecha_inicio.before(fecha_final) || fecha_inicio.equals(fecha_final)) {
                dias++;
                fecha_inicio.add(Calendar.DATE, 1);
            }
            jTdias.setText(dias + "");

        }
    }

    public void mostrarPrecio(int dias, Categoria categoria) {

        ReservaData reservaData = new ReservaData();

        jTprecio.setText(reservaData.calculoPrecio(dias, categoria) + "");

    }

    private static void clearComboBox(JComboBox<?> comboBox) {
        comboBox.setModel(new DefaultComboBoxModel<>());

    }

    private void verificacionNumeros(java.awt.event.KeyEvent evt) {

        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo numeros");
        }
    }
}
