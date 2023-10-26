
package Interfaces_Vistas;

import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import Audio.Audio;
import Entidades.Habitacion;
import Entidades.Huesped;
import FondoImagenes.InternalFrameImagen;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class huespedesHabitacion extends InternalFrameImagen {
 
    Audio audio = new Audio();
    private final DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public huespedesHabitacion() {
        initComponents();
        armarCabecera();
        armarCombo();
        setImagen("8.png");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jChuesped = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtablahabitacion = new javax.swing.JTable();
        jBsalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(251, 195, 19));
        jLabel1.setText("Listado Huesped por Habitación");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(251, 195, 19));
        jLabel2.setText("Seleccione un huesped:");

        jChuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChuespedActionPerformed(evt);
            }
        });

        jTtablahabitacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTtablahabitacion);

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
                .addGap(144, 144, 144)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jChuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBsalir)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(155, 155, 155))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jChuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jBsalir)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        
        audio.soundButton();
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jChuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChuespedActionPerformed
        
        audio.ringBell();
        borrarFilas();
        ReservaData reservaData=new ReservaData();
        Huesped huesped=(Huesped)jChuesped.getSelectedItem();
        int idHuesped=huesped.getIdHuesped();
        
        for(Habitacion habitacion : reservaData.obtenerHabitacionesReservadas(idHuesped)){
            modelo.addRow(new Object[]{habitacion.getCategoria().getTipoHabitacion(),habitacion.getPiso(),habitacion.getNroHabitacion()});
        }
    }//GEN-LAST:event_jChuespedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Huesped> jChuesped;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTtablahabitacion;
    // End of variables declaration//GEN-END:variables

    
    private void armarCabecera() {
        
        modelo.addColumn("Tipo Habitacion");
        modelo.addColumn("Piso");
        modelo.addColumn("Nro Habitacion");
        
        jTtablahabitacion.setModel(modelo);
    }
    
    private void armarCombo(){
        HuespedData huespedData=new HuespedData();
        List<Huesped>listaHuesped=new ArrayList<>();
        
        listaHuesped=huespedData.listarHuesped();
        
        for (Huesped huesped : listaHuesped) {
            jChuesped.addItem(huesped);
        }
        
    }
    
     private void borrarFilas() {
        int filas = jTtablahabitacion.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
     
     
     
}
