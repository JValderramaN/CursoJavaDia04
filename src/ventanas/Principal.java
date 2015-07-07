/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Luis
 */
public class Principal extends javax.swing.JFrame {

    private int numeroImagen = 1;

    public Principal() {
        initComponents();
        ajustarImagen(new javax.swing.ImageIcon(getClass().
                getResource("/recursos/Jellyfish.jpg")));
    }

    private void ajustarImagen(javax.swing.ImageIcon imageIco) {

        Image img = imageIco.getImage();

        labelImagen.setIcon(
                new ImageIcon(
                        img.getScaledInstance(
                                labelImagen.getWidth(),
                                labelImagen.getHeight(),
                                Image.SCALE_DEFAULT)
                )
        );

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seleccionarArchivo = new javax.swing.JFileChooser();
        panelSlider = new javax.swing.JPanel();
        labelImagen = new javax.swing.JLabel();
        buttonAtras = new javax.swing.JButton();
        buttonSiguiente = new javax.swing.JButton();
        buttonCargarImagen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Jellyfish.jpg"))); // NOI18N

        buttonAtras.setText("<");
        buttonAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAtrasMouseClicked(evt);
            }
        });

        buttonSiguiente.setText(">");
        buttonSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSiguienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelSliderLayout = new javax.swing.GroupLayout(panelSlider);
        panelSlider.setLayout(panelSliderLayout);
        panelSliderLayout.setHorizontalGroup(
            panelSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSliderLayout.createSequentialGroup()
                .addGroup(panelSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSliderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSliderLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(buttonAtras)
                        .addGap(69, 69, 69)
                        .addComponent(buttonSiguiente)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelSliderLayout.setVerticalGroup(
            panelSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSliderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAtras)
                    .addComponent(buttonSiguiente))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        buttonCargarImagen.setText("Cargar Imagen");
        buttonCargarImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCargarImagenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(buttonCargarImagen)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonCargarImagen)
                        .addGap(143, 143, 143))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAtrasMouseClicked
        ajustarImagen(new javax.swing.ImageIcon(getClass().
                getResource("/recursos/" + getPreviousImage())));
    }//GEN-LAST:event_buttonAtrasMouseClicked

    private void buttonSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSiguienteMouseClicked
        ajustarImagen(new javax.swing.ImageIcon(getClass().
                getResource("/recursos/" + getNextImage())));
    }//GEN-LAST:event_buttonSiguienteMouseClicked

    private void buttonCargarImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCargarImagenMouseClicked
        try {
            seleccionarArchivo.showOpenDialog(null);
            File f = seleccionarArchivo.getSelectedFile();
            ajustarImagen(new ImageIcon(ImageIO.read(f)));
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonCargarImagenMouseClicked

    private String getNextImage() {
        switch (numeroImagen) {
            case 1:
                numeroImagen = 2;
                return "Koala.jpg";
            case 2:
                numeroImagen = 3;
                return "Lighthouse.jpg";
            case 3:
                numeroImagen = 1;
                return "Jellyfish.jpg";
            default:
                throw new AssertionError();
        }
    }

    private String getPreviousImage() {
        switch (numeroImagen) {
            case 1:
                numeroImagen = 3;
                return "Lighthouse.jpg";
            case 2:
                numeroImagen = 1;
                return "Jellyfish.jpg";
            case 3:
                numeroImagen = 2;
                return "Koala.jpg";

            default:
                throw new AssertionError();
        }
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAtras;
    private javax.swing.JButton buttonCargarImagen;
    private javax.swing.JButton buttonSiguiente;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JPanel panelSlider;
    private javax.swing.JFileChooser seleccionarArchivo;
    // End of variables declaration//GEN-END:variables
}
