/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author José
 */
public class Configuracion extends javax.swing.JFrame {

    /**
     * Creates new form Configuracion
     */
    private static final ImageIcon icono = new ImageIcon(Juego.class.getResource("/recursos/icono.png"));//Añadimos el icono que queramos

    public ImageIcon getImagenEscala(String ruta, int ancho, int alto) {
        ImageIcon imagenOriginal = new ImageIcon(getClass().getClassLoader().getResource(ruta));
        return new ImageIcon(imagenOriginal.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
    }

    public Configuracion() {
        initComponents();
        this.setSize(560, 490);
        setLocationRelativeTo(null);//Ajusta la ventana al centro del escritorio
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Opcion por defecto para cerrar la ventana
        setResizable(true);//Impedir el reajuste de la pantalla
        setIconImage(icono.getImage());//Cambiamos el icono de nuestra ventana
    }

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
            java.util.logging.Logger.getLogger(asistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(asistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(asistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(asistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Configuracion().setVisible(true);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cabezera = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dificultad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cabezera1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondoInterfaz.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondoInterfaz.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cabezera.setBackground(new java.awt.Color(0, 0, 0));
        cabezera.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        cabezera.setForeground(new java.awt.Color(255, 51, 51));
        cabezera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salva.png"))); // NOI18N
        cabezera.setText(" DAW INVADERS");
        cabezera.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));
        cabezera.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(cabezera, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 413, 86));

        jTextField1.setBackground(new java.awt.Color(252, 255, 51));
        jTextField1.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(238, 4, 4));
        jTextField1.setText("Introduzca Su Alias");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 165, 30));

        jLabel1.setBackground(new java.awt.Color(51, 102, 255));
        jLabel1.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/disparo.png"))); // NOI18N
        jLabel1.setText("Seleccione el grado de dificultad");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        dificultad.setBackground(new java.awt.Color(255, 51, 51));
        dificultad.setFont(new java.awt.Font("Chilanka", 1, 14)); // NOI18N
        dificultad.setForeground(new java.awt.Color(159, 8, 39));
        dificultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fácil", "Medio", "Dificil", "DAW" }));
        dificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dificultadActionPerformed(evt);
            }
        });
        getContentPane().add(dificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondoInterfaz.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondoInterfaz.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 280, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondoInvaders.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 280, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondoInvaders.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 280, -1));

        cabezera1.setBackground(new java.awt.Color(0, 0, 0));
        cabezera1.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        cabezera1.setForeground(new java.awt.Color(255, 51, 51));
        cabezera1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salva.png"))); // NOI18N
        cabezera1.setText(" DAW INVADERS");
        cabezera1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));
        cabezera1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(cabezera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 413, 86));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/jugadorChiri.png"))); // NOI18N
        jButton2.setText("COMENZAR!!!");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 200, 50));

        jLabel8.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("By...Devas");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 80, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondoInvaders2.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 300, 110));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondoInvaders2.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 260, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void dificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dificultadActionPerformed

        // DIFICULTAD

    }//GEN-LAST:event_dificultadActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // boton comenzar
        if (dificultad.getSelectedItem().equals("Fácil")) {
            new Pantalla(Dificultad.FACIL, jTextField1.getText());
        }
        if (dificultad.getSelectedItem().equals("Medio")) {
            new Pantalla(Dificultad.MEDIO, jTextField1.getText());
        }
        if (dificultad.getSelectedItem().equals("Dificil")) {
            new Pantalla(Dificultad.DIFICIL, jTextField1.getText());
        }
        if (dificultad.getSelectedItem().equals("DAW")) {
            new Pantalla(Dificultad.DAW, jTextField1.getText());
        }
        System.out.println(dificultad.getSelectedItem()+jTextField1.getText());
        setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cabezera;
    private javax.swing.JLabel cabezera1;
    private javax.swing.JComboBox<String> dificultad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
