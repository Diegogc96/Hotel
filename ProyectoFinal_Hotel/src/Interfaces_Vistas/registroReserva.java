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
        setImagen("RESERVAS.png");
//        jChuesped.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtabla = new javax.swing.JTable();
        jCopcion = new javax.swing.JComboBox<>();
        jChuesped = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel1.setText("Registro de Reservas");

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

        jCopcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas las Reservas", "Huesped en especifico" }));
        jCopcion.setSelectedItem(null);
        jCopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCopcionActionPerformed(evt);
            }
        });

        jChuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChuespedActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione una Opción:");

        jLabel3.setText("Huesped:");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jChuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCopcion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(104, 104, 104)))
                        .addGap(98, 98, 98))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCopcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Huesped> jChuesped;
    private javax.swing.JComboBox<String> jCopcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
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
