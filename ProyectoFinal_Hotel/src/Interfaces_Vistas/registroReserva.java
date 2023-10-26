package Interfaces_Vistas;

import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.Reserva;
import FondoImagenes.InternalFrameImagen;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class registroReserva extends InternalFrameImagen {

    private final DefaultTableModel modelo = new DefaultTableModel() {
        
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }

    };

    public registroReserva() {
        initComponents();
        armarCabecera();
        setImagen("8.png");

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCopcion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jChuesped = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtabla = new javax.swing.JTable();
        jBsalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(251, 195, 19));
        jLabel1.setText("Registro de Reservas");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(251, 195, 19));
        jLabel2.setText("Seleccione una Opción:");

        jCopcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas las Reservas", "Huesped en especifico" }));
        jCopcion.setSelectedItem(null);
        jCopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCopcionActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(251, 195, 19));
        jLabel3.setText("Huesped:");

        jChuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChuespedActionPerformed(evt);
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

        jBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eliminar.png"))); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCopcion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jChuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBsalir)
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCopcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jChuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBsalir)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCopcionActionPerformed
        // TODO add your handling code here:

        if (jCopcion.getSelectedItem().equals("Todas las Reservas")) {
            armarTablaReservasTotales();
            jChuesped.setEnabled(false);
            clearComboBox(jChuesped);
        } else if (jCopcion.getSelectedItem().equals("Huesped en especifico")) {
            jChuesped.setEnabled(true);
            clearComboBox(jChuesped);
            cargarComboHuesped();
        }


    }//GEN-LAST:event_jCopcionActionPerformed

    private void jChuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChuespedActionPerformed
        // TODO add your handling code here:
        borrarFilas();
        Huesped huesped = (Huesped) jChuesped.getSelectedItem();
        armarTablaReservasHuesped(huesped.getIdHuesped());

    }//GEN-LAST:event_jChuespedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbutton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jBbutton1ActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Huesped> jChuesped;
    private javax.swing.JComboBox<String> jCopcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTtabla;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Nro Habitacion");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("F.Inicio");
        modelo.addColumn("F.Final");
        jTtabla.setModel(modelo);
    }

    private void armarTablaReservasTotales() {
        List<Reserva> listaReserva;
        ReservaData reservaData = new ReservaData();
        HabitacionData habitacionData = new HabitacionData();
        HuespedData huespedData = new HuespedData();
        Huesped huesped;
        Habitacion habitacion;

        listaReserva = reservaData.listaReserva();

        borrarFilas();

        for (Reserva reserva : listaReserva) {
            huesped = huespedData.buscarHuesped(reserva.getIdHuesped());
            habitacion = habitacionData.buscarHabitacionId(reserva.getIdHabitacion());
            modelo.addRow(new Object[]{reserva.getIdReserva(), habitacion.getNroHabitacion(), huesped.getNombre(), huesped.getApellido(), reserva.getFechaInicio(), reserva.getFechaFin()});
        }
    }

    private void armarTablaReservasHuesped(int idHuesped) {
        List<Reserva> listaReserva;
        ReservaData reservaData = new ReservaData();
        Huesped huesped;
        Habitacion habitacion;
        HabitacionData habitacionData = new HabitacionData();
        HuespedData huespedData = new HuespedData();

        listaReserva = reservaData.obtenerReservasPorHuesped(idHuesped);

        borrarFilas();

        for (Reserva reserva : listaReserva) {
            huesped = huespedData.buscarHuesped(reserva.getIdHuesped());
            habitacion = habitacionData.buscarHabitacionId(reserva.getIdHabitacion());
            modelo.addRow(new Object[]{reserva.getIdReserva(), habitacion.getNroHabitacion(), huesped.getNombre(), huesped.getApellido(), reserva.getFechaInicio(), reserva.getFechaFin()});
        }

    }

    private void cargarComboHuesped() {

        HuespedData huespedData = new HuespedData();
        List<Huesped> listaHuesped;

        listaHuesped = huespedData.listarHuesped();

        for (Huesped huesped : listaHuesped) {
            jChuesped.addItem(new Huesped(huesped.getIdHuesped(), huesped.getNombre(), huesped.getApellido(), huesped.getDni(), huesped.getDomicilio(), huesped.getCorreo(), huesped.getCelular(), huesped.isEstado()));
        }

    }

    private void borrarFilas() {
        int filas = jTtabla.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private static void clearComboBox(JComboBox<?> comboBox) {
        comboBox.setModel(new DefaultComboBoxModel<>());

    }
}
