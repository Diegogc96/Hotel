package proyectofinal_hotel;

import Audio.Audio;
import Interfaces_Vistas.datosCategoria;
import Interfaces_Vistas.datosHabitacion;
import Interfaces_Vistas.datosHuesped;
import Interfaces_Vistas.formularioReserva;
import Interfaces_Vistas.habitacionesCategoria;
import Interfaces_Vistas.huespedesHabitacion;
import Interfaces_Vistas.registroHuespedes;
import Interfaces_Vistas.registroReserva;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class InterfazPrincipal extends javax.swing.JFrame {

    Audio audio = new Audio();

    public InterfazPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        //audio.audio();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        ImageIcon icon = new ImageIcon(getClass().getResource("/FondoImagenes/Lapunta.png"));
        Image image = icon.getImage();
        jDescritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMdatosHuesped = new javax.swing.JMenuItem();
        jMregistroHuesped = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMdatosHabitacion = new javax.swing.JMenuItem();
        jMdatosCategoria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMformularioReserva = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMHabitacionCategoria = new javax.swing.JMenuItem();
        jMHuespedxHabitacion = new javax.swing.JMenuItem();
        jMRegistroReserva = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMsalir = new javax.swing.JMenuItem();

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel");
        setName("Menu_Principal"); // NOI18N

        javax.swing.GroupLayout jDescritorioLayout = new javax.swing.GroupLayout(jDescritorio);
        jDescritorio.setLayout(jDescritorioLayout);
        jDescritorioLayout.setHorizontalGroup(
            jDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jDescritorioLayout.setVerticalGroup(
            jDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Image20231018114938.png"))); // NOI18N
        jMenu1.setText("Huésped");

        jMdatosHuesped.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Image20231018115004.png"))); // NOI18N
        jMdatosHuesped.setText("Datos Huésped");
        jMdatosHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMdatosHuespedActionPerformed(evt);
            }
        });
        jMenu1.add(jMdatosHuesped);

        jMregistroHuesped.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/formulario.png"))); // NOI18N
        jMregistroHuesped.setText("Registro de Huesped");
        jMregistroHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMregistroHuespedActionPerformed(evt);
            }
        });
        jMenu1.add(jMregistroHuesped);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Image20231018114951.png"))); // NOI18N
        jMenu2.setText("Habitaciones/Categoria");

        jMdatosHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Image20231018114948.png"))); // NOI18N
        jMdatosHabitacion.setText("Datos Habitación");
        jMdatosHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMdatosHabitacionActionPerformed(evt);
            }
        });
        jMenu2.add(jMdatosHabitacion);

        jMdatosCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Image20231018115028.png"))); // NOI18N
        jMdatosCategoria.setText("Datos Categoría");
        jMdatosCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMdatosCategoriaActionPerformed(evt);
            }
        });
        jMenu2.add(jMdatosCategoria);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Image20231018114935.png"))); // NOI18N
        jMenu3.setText("Administración");

        jMformularioReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Image20231018114940.png"))); // NOI18N
        jMformularioReserva.setText("Formulario de Reserva");
        jMformularioReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMformularioReservaActionPerformed(evt);
            }
        });
        jMenu3.add(jMformularioReserva);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Image20231018115002.png"))); // NOI18N
        jMenu4.setText("Consultas");

        jMHabitacionCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/camas.png"))); // NOI18N
        jMHabitacionCategoria.setText("Habitaciones por Categoria");
        jMHabitacionCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMHabitacionCategoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMHabitacionCategoria);

        jMHuespedxHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Image20231018114945.png"))); // NOI18N
        jMHuespedxHabitacion.setText("Huespedes por Habitacion");
        jMHuespedxHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMHuespedxHabitacionActionPerformed(evt);
            }
        });
        jMenu4.add(jMHuespedxHabitacion);

        jMRegistroReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Image20231018115025.png"))); // NOI18N
        jMRegistroReserva.setText("Registro de Reservas");
        jMRegistroReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRegistroReservaActionPerformed(evt);
            }
        });
        jMenu4.add(jMRegistroReserva);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Image20231018115034.png"))); // NOI18N
        jMenu5.setText("Salir");

        jMsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Image20231018114922.png"))); // NOI18N
        jMsalir.setText("Cerrar Programa");
        jMsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMsalirActionPerformed(evt);
            }
        });
        jMenu5.add(jMsalir);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDescritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDescritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMsalirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jMsalirActionPerformed

    private void jMdatosHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMdatosHuespedActionPerformed
        // TODO add your handling code here:
        audio.soundButton();
        jDescritorio.removeAll();
        jDescritorio.repaint();
        datosHuesped dataHuesped = new datosHuesped();
        dataHuesped.setVisible(true);
        jDescritorio.add(dataHuesped);
        jDescritorio.moveToFront(dataHuesped);


    }//GEN-LAST:event_jMdatosHuespedActionPerformed

    private void jMdatosHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMdatosHabitacionActionPerformed
        // TODO add your handling code here:
        audio.soundButton();
        jDescritorio.removeAll();
        jDescritorio.repaint();
        datosHabitacion dataHabitacion = new datosHabitacion();
        dataHabitacion.setVisible(true);
        jDescritorio.add(dataHabitacion);
        jDescritorio.moveToFront(dataHabitacion);
    }//GEN-LAST:event_jMdatosHabitacionActionPerformed

    private void jMdatosCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMdatosCategoriaActionPerformed
        // TODO add your handling code here:
        audio.soundButton();
        jDescritorio.removeAll();
        jDescritorio.repaint();
        datosCategoria dataCategoria = new datosCategoria();
        dataCategoria.setVisible(true);
        jDescritorio.add(dataCategoria);
        jDescritorio.moveToFront(dataCategoria);
    }//GEN-LAST:event_jMdatosCategoriaActionPerformed

    private void jMformularioReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMformularioReservaActionPerformed
        // TODO add your handling code here:
        audio.soundButton();
        jDescritorio.removeAll();
        jDescritorio.repaint();
        formularioReserva formReserva = new formularioReserva();
        formReserva.setVisible(true);
        jDescritorio.add(formReserva);
        jDescritorio.moveToFront(formReserva);
    }//GEN-LAST:event_jMformularioReservaActionPerformed

    private void jMHuespedxHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMHuespedxHabitacionActionPerformed

        jDescritorio.removeAll();
        jDescritorio.repaint();
        huespedesHabitacion huespedHabitacion = new huespedesHabitacion();
        huespedHabitacion.setVisible(true);
        jDescritorio.add(huespedHabitacion);
        jDescritorio.moveToFront(huespedHabitacion);

    }//GEN-LAST:event_jMHuespedxHabitacionActionPerformed

    private void jMRegistroReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRegistroReservaActionPerformed

        audio.ringBell();
        jDescritorio.removeAll();
        jDescritorio.repaint();
        registroReserva registroIns = new registroReserva();
        registroIns.setVisible(true);
        jDescritorio.add(registroIns);
        jDescritorio.moveToFront(registroIns);


    }//GEN-LAST:event_jMRegistroReservaActionPerformed

    private void jMHabitacionCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMHabitacionCategoriaActionPerformed

        jDescritorio.removeAll();
        jDescritorio.repaint();
        habitacionesCategoria habitacionesCat = new habitacionesCategoria();
        habitacionesCat.setVisible(true);
        jDescritorio.add(habitacionesCat);
        jDescritorio.moveToFront(habitacionesCat);
    }//GEN-LAST:event_jMHabitacionCategoriaActionPerformed

    private void jMregistroHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMregistroHuespedActionPerformed
        // TODO add your handling code here:
        audio.soundButton();
        jDescritorio.removeAll();
        jDescritorio.repaint();
        registroHuespedes registroHues = new registroHuespedes();
        registroHues.setVisible(true);
        jDescritorio.add(registroHues);
        jDescritorio.moveToFront(registroHues);

    }//GEN-LAST:event_jMregistroHuespedActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JDesktopPane jDescritorio;
    private javax.swing.JMenuItem jMHabitacionCategoria;
    private javax.swing.JMenuItem jMHuespedxHabitacion;
    private javax.swing.JMenuItem jMRegistroReserva;
    private javax.swing.JMenuItem jMdatosCategoria;
    private javax.swing.JMenuItem jMdatosHabitacion;
    private javax.swing.JMenuItem jMdatosHuesped;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMformularioReserva;
    private javax.swing.JMenuItem jMregistroHuesped;
    private javax.swing.JMenuItem jMsalir;
    // End of variables declaration//GEN-END:variables

}
