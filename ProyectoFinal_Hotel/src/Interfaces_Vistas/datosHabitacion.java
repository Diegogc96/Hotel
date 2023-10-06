
package Interfaces_Vistas;

import AccesoADatos.CategoriaData;
import AccesoADatos.HabitacionData;
import Entidades.Categoria;
import Entidades.Habitacion;
import FondoImagenes.InternalFrameImagen;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class datosHabitacion extends InternalFrameImagen {
private final DefaultTableModel modelo = new DefaultTableModel(){
     public boolean isCellEditable(int fila, int columna) {
            return false;
            }
           
    
};

    public datosHabitacion() {
        initComponents();
        cargarCombo();
        armarCabecera();
        armarTabla();
        jCcategoria.setSelectedItem(null);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBsalir)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBnuevo)
                .addGap(18, 18, 18)
                .addComponent(jBguardar)
                .addGap(18, 18, 18)
                .addComponent(jBactualizar)
                .addGap(18, 18, 18)
                .addComponent(jBeliminar)
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRestado)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTnroHabitacion)
                                    .addComponent(jTpiso)
                                    .addComponent(jCcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addComponent(jBbuscar)))))
                .addGap(67, 67, 67))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTpiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jRestado)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo)
                    .addComponent(jBguardar)
                    .addComponent(jBeliminar)
                    .addComponent(jBactualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jBsalir)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        // TODO add your handling code here:
        HabitacionData habitacionData= new HabitacionData();
        Habitacion habitacion=new Habitacion();
        CategoriaData categoriaData=new CategoriaData();
        List<Categoria>listaCategoria=new ArrayList<>();
        
        
        listaCategoria=categoriaData.listarCategoria();
        
        habitacion=habitacionData.buscarHabitacion(Integer.parseInt(jTnroHabitacion.getText()));
        jTpiso.setText(habitacion.getPiso()+"");
        jCcategoria.setSelectedIndex(habitacion.getCategoria().getIdCategoria()-1);
        jRestado.setSelected(habitacion.isEstado());
         
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        // TODO add your handling code here:
        jTnroHabitacion.setText("");
        jTpiso.setText("");
        jCcategoria.setSelectedItem(null);
        jRestado.setSelected(false);
        
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jTnroHabitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnroHabitacionKeyTyped
        // TODO add your handling code here:
        verificacionNumeros(evt);
    }//GEN-LAST:event_jTnroHabitacionKeyTyped

    private void jTpisoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTpisoKeyTyped
        // TODO add your handling code here:
        verificacionNumeros(evt);
    }//GEN-LAST:event_jTpisoKeyTyped

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        // TODO add your handling code here:
        HabitacionData habitacionData= new HabitacionData();
        Habitacion habitacion=new Habitacion();
        List<Habitacion>listaHabitacion=new ArrayList();
        try {
            
            if(jTpiso.getText().isEmpty()){
                 JOptionPane.showMessageDialog(this, "La casilla piso no tiene ningun dato ingresado");
            }else if(jTnroHabitacion.getText().isEmpty()){
                 JOptionPane.showMessageDialog(this, "La casilla número de habitación no tiene ningun dato ingresado");
            }else{
            
             habitacion=new Habitacion((Categoria)jCcategoria.getSelectedItem(), Integer.parseInt(jTpiso.getText()), Integer.parseInt(jTnroHabitacion.getText()), jRestado.isSelected());
             habitacionData.guardarHabitacion(habitacion);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al ingresar datos");
        }
   
        armarTabla();
      
          
        
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jCcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCcategoriaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCcategoriaActionPerformed

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed
        // TODO add your handling code here:
        HabitacionData habitacionData=new HabitacionData();
        Habitacion habitacion=new Habitacion();
        
        habitacion.setCategoria((Categoria)jCcategoria.getSelectedItem());
        habitacion.setPiso(Integer.parseInt(jTpiso.getText()));
        habitacion.setNroHabitacion(Integer.parseInt(jTnroHabitacion.getText()));
        habitacion.setEstado(jRestado.isSelected());
        habitacionData.actualizarHabitacion(habitacion);
        
        armarTabla();
        
    }//GEN-LAST:event_jBactualizarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here:
        HabitacionData habitacionData=new HabitacionData();            
        habitacionData.eliminarHabitacion(Integer.parseInt(jTnroHabitacion.getText()));
        jTnroHabitacion.setText("");
        jTpiso.setText("");
        jCcategoria.setSelectedItem(null);
        jRestado.setSelected(false);
        
        armarTabla();
    }//GEN-LAST:event_jBeliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBactualizar;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Categoria> jCcategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
        List<Categoria> listaCategoria = new ArrayList<>();
        CategoriaData categoriaData = new CategoriaData();

        listaCategoria = categoriaData.listarCategoria();
        for (Categoria categoria : listaCategoria) {
            jCcategoria.addItem(new Categoria(categoria.getIdCategoria(), categoria.getCantPersonas(), categoria.getCantCamas(), categoria.getTipoHabitacion(), categoria.getTipoCama(), categoria.getPrecioNoche()));
        }
    }
    
    private void armarCabecera() {
        modelo.addColumn("ID Habitacion");
        modelo.addColumn("Piso");
        modelo.addColumn("Numero De Habitacion");
        modelo.addColumn("Tipo Habitacion");
        modelo.addColumn("Estado");
        jTtabla.setModel(modelo);
    }

    private void armarTabla(){
        HabitacionData habitacionData= new HabitacionData();
        Habitacion habitacion=new Habitacion();
        List<Habitacion>listaHabitacion=new ArrayList();
        
        listaHabitacion=habitacionData.listarHabitaciones();
        borrarFilas();
        for (Habitacion habitacion1 : listaHabitacion) {
            modelo.addRow(new Object[]{habitacion1.getIdHabitacion(), habitacion1.getPiso(), habitacion1.getNroHabitacion(),habitacion1.getCategoria().getTipoHabitacion(),habitacion1.isEstado()});
        }
    }
    private void borrarFilas() {
        int filas = jTtabla.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    
     private void verificacionNumeros(java.awt.event.KeyEvent evt){
        
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo numeros");
        }
        
    }
}
