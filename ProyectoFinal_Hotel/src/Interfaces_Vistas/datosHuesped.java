package Interfaces_Vistas;

import AccesoADatos.HuespedData;
import Entidades.Huesped;
import FondoImagenes.InternalFrameImagen;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class datosHuesped extends InternalFrameImagen {

    public datosHuesped() {
        initComponents();
        setImagen("1.png");
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
        jTcelular = new javax.swing.JTextField();
        jTcorreo = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jBnuevo = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBactualizar = new javax.swing.JButton();
        jRestado = new javax.swing.JRadioButton();
        jBsalir = new javax.swing.JButton();

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Huesped");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Documento:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Domicilio:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Celular:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estado");

        jTnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTnombreKeyTyped(evt);
            }
        });

        jTdocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTdocumentoKeyTyped(evt);
            }
        });

        jTapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTapellidoKeyTyped(evt);
            }
        });

        jTcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTcelularKeyTyped(evt);
            }
        });

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jTcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jTdomicilio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                                    .addComponent(jTcelular))
                                                .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jRestado)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBbuscar)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jBnuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jBguardar)
                        .addGap(18, 18, 18)
                        .addComponent(jBeliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jBactualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jBsalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addComponent(jTdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(jLabel2))
                                                                .addGap(18, 18, 18))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jBbuscar)
                                                                .addGap(10, 10, 10)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel5))
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(jTdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addComponent(jTcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addComponent(jTcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8))
                    .addComponent(jRestado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo)
                    .addComponent(jBguardar)
                    .addComponent(jBeliminar)
                    .addComponent(jBactualizar)
                    .addComponent(jBsalir))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        HuespedData huespedData = new HuespedData();
        Huesped huesped = new Huesped();
        List<Huesped> listaHuesped = new ArrayList();
        try {

            if (jTdocumento.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "La casilla documento no tiene ningun dato ingresado");
            } else if (jTnombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "La casilla nombre no tiene ningun dato ingresado");
            } else if (jTapellido.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "La casilla apellido no tiene ningun dato ingresado");
            } else if (jTdomicilio.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "La casilla domicilio no tiene ningun dato ingresado");
            } else if (jTcelular.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "La casilla celular no tiene ningun dato ingresado");
            } else if (jTcorreo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "La casilla correo no tiene ningun dato ingresado");
            } else {

                huesped = new Huesped(jTnombre.getText(), jTapellido.getText(), Integer.parseInt(jTdocumento.getText()), jTdomicilio.getText(), jTcorreo.getText(), Integer.parseInt(jTcelular.getText()), jRestado.isSelected());

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
        jTcelular.setText("");
        jTcorreo.setText("");
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
        } catch (NullPointerException e) {

        }

        jTdocumento.setText("");
        jTapellido.setText("");
        jTnombre.setText("");
        jTdomicilio.setText("");
        jTcelular.setText("");
        jTcorreo.setText("");
        jRestado.setSelected(false);
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed

        HuespedData huespedData = new HuespedData();
        Huesped huesped = new Huesped();

        huesped.setDni(Integer.parseInt(jTdocumento.getText()));
        huesped.setApellido(jTapellido.getText());
        huesped.setNombre(jTnombre.getText());
        huesped.setDomicilio(jTdomicilio.getText());
        huesped.setCorreo(jTcelular.getText());
        huesped.setCelular(Integer.parseInt(jTcorreo.getText()));
        huesped.setEstado(jRestado.isSelected());
        huespedData.actualizarHuesped(huesped);

    }//GEN-LAST:event_jBactualizarActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        HuespedData huespedData = new HuespedData();
        Huesped huesped = new Huesped();
        
//         if (jTdocumento.getText().equals("")) {
//
//            JOptionPane.showMessageDialog(this, "Ingrese un numero en la casilla Documento");
//
//        } else {
        try{
        huesped = huespedData.buscarHuespedPorDni(Integer.parseInt(jTdocumento.getText()));

        if (huesped != null) {
            jTdocumento.setText(huesped.getDni() + "");
            jTapellido.setText(huesped.getApellido());
            jTnombre.setText(huesped.getNombre());
            jTdomicilio.setText(huesped.getDomicilio());
            jTcelular.setText(huesped.getCorreo());
            jTcorreo.setText(huesped.getCelular() + "");
            jRestado.setSelected(huesped.isEstado());
        } else {
            jTdocumento.setText(null);
        }
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ingrese un numero en la casilla Documento");
        }
        
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jTdocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdocumentoKeyTyped
        // TODO add your handling code here:
        int maxCaracteres = 8;
        verificacionNumeros(evt);
        if (jTdocumento.getText().length() >= maxCaracteres) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Maximo 8 caracteres");
        }
    }//GEN-LAST:event_jTdocumentoKeyTyped

    private void jTapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTapellidoKeyTyped
        // TODO add your handling code here:
        verificacionCaracteres(evt);
    }//GEN-LAST:event_jTapellidoKeyTyped

    private void jTnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnombreKeyTyped
        // TODO add your handling code here:
        verificacionCaracteres(evt);
    }//GEN-LAST:event_jTnombreKeyTyped

    private void jTcelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcelularKeyTyped
        // TODO add your handling code here:

        int maxCaracteres = 10;
        verificacionNumeros(evt);
        if (jTcelular.getText().length() >= maxCaracteres) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Maximo 10 caracteres");
        }
    }//GEN-LAST:event_jTcelularKeyTyped


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
     private void verificacionNumeros(java.awt.event.KeyEvent evt) {

        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo numeros");
        }

    }

    private void verificacionCaracteres(java.awt.event.KeyEvent evt) {

        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
        }

    }

}
