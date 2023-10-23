
package Interfaces_Vistas;

import AccesoADatos.HabitacionData;
import Categorias.TipoHabitacion;
import Entidades.Habitacion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class habitacionesCategoria extends javax.swing.JInternalFrame {
   private final DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public habitacionesCategoria() {
        initComponents();
        armarCabecera();
        cargarComboHabitacion();
        
//        jCcategorias.setSelectedItem(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTtabla = new javax.swing.JTable();
        jCcategorias = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTtotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBsalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

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

        jCcategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCcategoriasActionPerformed(evt);
            }
        });

        jLabel1.setText("Total de Habitaciones de la Categoria seleccionada:");

        jTtotal.setEditable(false);

        jLabel2.setText("Seleccione Categoria:");

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Lista de Habitaciones por Categoria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(81, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(80, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jCcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)))))
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(525, Short.MAX_VALUE)
                .addComponent(jBsalir)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jBsalir)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
               dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jCcategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCcategoriasActionPerformed
        borrarFilas();
        HabitacionData habitacionData=new HabitacionData();
        List<Habitacion>listaHabitacion=new ArrayList<>();
        int cont=0;
        listaHabitacion=habitacionData.listarHabitacionesxCategoria((TipoHabitacion) jCcategorias.getSelectedItem());
        
        for (Habitacion habitacion : listaHabitacion) {
            modelo.addRow(new Object[]{habitacion.getIdHabitacion(),habitacion.getPiso(),habitacion.getNroHabitacion()});
        } 
        
         for (Habitacion habitacion : listaHabitacion){
             cont++; 
         }
         
        jTtotal.setText(cont+"");
    }//GEN-LAST:event_jCcategoriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<TipoHabitacion> jCcategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTtabla;
    private javax.swing.JTextField jTtotal;
    // End of variables declaration//GEN-END:variables
   private void cargarComboHabitacion() {

        jCcategorias.addItem(TipoHabitacion.EstandarSimple);
        jCcategorias.addItem(TipoHabitacion.Doble);
        jCcategorias.addItem(TipoHabitacion.Triple);
        jCcategorias.addItem(TipoHabitacion.SuiteLujo);

    }

   
   private void armarCabecera() {
        modelo.addColumn("ID Habitacion");
        modelo.addColumn("Piso");
        modelo.addColumn("Nro Habitacion");     
        jTtabla.setModel(modelo);
    }
   
     private void borrarFilas() {
        int filas = jTtabla.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}
