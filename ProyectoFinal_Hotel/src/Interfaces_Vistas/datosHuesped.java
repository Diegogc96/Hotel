package Interfaces_Vistas;

import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import Entidades.Categoria;
import Entidades.Habitacion;
import Entidades.Huesped;
import FondoImagenes.InternalFrameImagen;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class datosHuesped extends InternalFrameImagen {

    public datosHuesped() {
        initComponents();
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
        jLabel8 = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jTdocumento = new javax.swing.JTextField();
        jTapellido = new javax.swing.JTextField();
        jTdomicilio = new javax.swing.JTextField();
        jTcorreo = new javax.swing.JTextField();
        jTcelular = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jBnuevo = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBactualizar = new javax.swing.JButton();
        jRestado = new javax.swing.JRadioButton();
        jBsalir = new javax.swing.JButton();

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Huesped");

        jLabel2.setText("Documento");

        jLabel3.setText("Apellido");

        jLabel4.setText("Domicilio");

        jLabel5.setText("Nombre");

        jLabel6.setText("Correo");

        jLabel7.setText("Celular");

        jLabel8.setText("Estado");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBnuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jBguardar)
                        .addGap(18, 18, 18)
                        .addComponent(jBeliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jBactualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jBsalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBbuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addGap(13, 13, 13)))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRestado))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jRestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo)
                    .addComponent(jBguardar)
                    .addComponent(jBeliminar)
                    .addComponent(jBactualizar)
                    .addComponent(jBsalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
         HuespedData huespedData= new HuespedData();
        Huesped huesped =new Huesped();
        List<Huesped>listaHuesped=new ArrayList();
        try {
            
            if(jTdocumento.getText().isEmpty()){
                 JOptionPane.showMessageDialog(this, "La casilla documento no tiene ningun dato ingresado");
            }else if(jTnombre.getText().isEmpty()){
                 JOptionPane.showMessageDialog(this, "La casilla nombre de habitación no tiene ningun dato ingresado");
            }else if(jTapellido.getText().isEmpty()){
                 JOptionPane.showMessageDialog(this, "La casilla apellido de habitación no tiene ningun dato ingresado");
            }else if(jTdomicilio.getText().isEmpty()){
                 JOptionPane.showMessageDialog(this, "La casilla domicilio de habitación no tiene ningun dato ingresado");
            }else if(jTcorreo.getText().isEmpty()){
                 JOptionPane.showMessageDialog(this, "La casilla correo de habitación no tiene ningun dato ingresado");
            }else if(jTcelular.getText().isEmpty()){
                 JOptionPane.showMessageDialog(this, "La casilla celular de habitación no tiene ningun dato ingresado");
            }else{
            
             huesped=new Huesped(jTnombre.getText(),jTapellido.getText(),Integer.parseInt(jTdocumento.getText()),jTdomicilio.getText(),jTcorreo.getText(),Integer.parseInt(jTcelular.getText()),jRestado.isSelected());
             
             huespedData.guardarHuesped(huesped);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al ingresar datos");
        }
   
      
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        
        jTdocumento.setText("");
        jTnombre.setText("");
        jTapellido.setText("");
        jTdomicilio.setText("");
        jTcorreo.setText("");
        jTcelular.setText("");
        jRestado.setSelected(false);
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        
        try {
              HuespedData huespedData = new HuespedData();
            Huesped huesped = new Huesped();

            huesped = huespedData.buscarHuespedPorDni(Integer.parseInt(jTdocumento.getText()));
            huespedData.eliminarHuesped(huesped.getIdHuesped());
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe de ingresar un dato numerico en el campo Documento");
        }

        jTdocumento.setText("");
        jTapellido.setText("");
        jTnombre.setText("");
        jTdomicilio.setText("");
        jTcorreo.setText("");
        jTcelular.setText("");
        jRestado.setSelected(false);
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed
     
        HuespedData huespedData=new HuespedData();
        Huesped huesped=new Huesped();
        
       
        
        huesped.setDni(Integer.parseInt(jTdocumento.getText()));
        huesped.setApellido(jTapellido.getText());
        huesped.setNombre(jTnombre.getText());
        huesped.setDomicilio(jTdomicilio.getText());
        huesped.setCorreo(jTcorreo.getText());
        huesped.setCelular(Integer.parseInt(jTcelular.getText()));
        huesped.setEstado(jRestado.isSelected());
        huespedData.actualizarHuesped(huesped);
  
    }//GEN-LAST:event_jBactualizarActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
       HuespedData huespedData= new HuespedData();
        Huesped huesped=new Huesped();
      
        huesped=huespedData.buscarHuespedPorDni(Integer.parseInt(jTdocumento.getText()));
        jTdocumento.setText(huesped.getDni()+"");
        jTapellido.setText(huesped.getApellido());
        jTnombre.setText(huesped.getNombre());
        jTdomicilio.setText(huesped.getDomicilio());
        jTcorreo.setText(huesped.getCorreo());
        jTcelular.setText(huesped.getCelular()+"");
        jRestado.setSelected(huesped.isEstado());
        
    }//GEN-LAST:event_jBbuscarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBactualizar;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRestado;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTcelular;
    private javax.swing.JTextField jTcorreo;
    private javax.swing.JTextField jTdocumento;
    private javax.swing.JTextField jTdomicilio;
    private javax.swing.JTextField jTnombre;
    // End of variables declaration//GEN-END:variables
}
