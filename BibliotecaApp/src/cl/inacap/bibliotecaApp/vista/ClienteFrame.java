/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bibliotecaApp.vista;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Corvalan
 */
public class ClienteFrame extends javax.swing.JFrame {

    /**
     * Creates new form ClienteFrame
     */
    public ClienteFrame() {
        initComponents();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono_img.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        agregar_trabajador_btn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        limpiar_trabajador_btn = new javax.swing.JButton();
        flecha1 = new javax.swing.JLabel();
        id_trabajador_txt = new javax.swing.JTextField();
        rut_trabajador_txt = new javax.swing.JTextField();
        nom_trabajador_txt = new javax.swing.JTextField();
        apePa_trabajador_txt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        apeMa_trabajador_txt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        direccion_trabajador_txt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        correo_txt = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        telefono_trabajador_txt = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        fecha_cont_trabajador_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Fast Development - Cliente");

        jPanel1.setBackground(java.awt.SystemColor.controlLtHighlight);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(39, 151, 212));
        jPanel3.setForeground(new java.awt.Color(51, 0, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(102, 102, 102));
        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Rut Cliente");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jLabel15.setBackground(new java.awt.Color(102, 102, 102));
        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre Cliente");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        agregar_trabajador_btn.setBackground(new java.awt.Color(255, 255, 255));
        agregar_trabajador_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        agregar_trabajador_btn.setForeground(new java.awt.Color(0, 0, 0));
        agregar_trabajador_btn.setActionCommand("Agregar Cliente");
        agregar_trabajador_btn.setLabel("Agregar Trabajador");
        agregar_trabajador_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_trabajador_btnActionPerformed(evt);
            }
        });
        jPanel3.add(agregar_trabajador_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 180, 52));

        jLabel11.setBackground(new java.awt.Color(11, 0, 32));
        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Registro Cliente");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 250, -1));

        jLabel16.setBackground(new java.awt.Color(102, 102, 102));
        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ID");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        limpiar_trabajador_btn.setBackground(new java.awt.Color(255, 255, 255));
        limpiar_trabajador_btn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 13)); // NOI18N
        limpiar_trabajador_btn.setForeground(new java.awt.Color(0, 0, 0));
        limpiar_trabajador_btn.setText("Limpiar texto");
        limpiar_trabajador_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_trabajador_btnActionPerformed(evt);
            }
        });
        jPanel3.add(limpiar_trabajador_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 143, 52));

        flecha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha_img.png"))); // NOI18N
        flecha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flecha1MouseClicked(evt);
            }
        });
        jPanel3.add(flecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 11, 73, -1));

        id_trabajador_txt.setBackground(java.awt.SystemColor.controlLtHighlight);
        id_trabajador_txt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(id_trabajador_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 60, 35));

        rut_trabajador_txt.setBackground(java.awt.SystemColor.controlLtHighlight);
        jPanel3.add(rut_trabajador_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 280, 35));

        nom_trabajador_txt.setBackground(java.awt.SystemColor.controlLtHighlight);
        nom_trabajador_txt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(nom_trabajador_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 174, 35));

        apePa_trabajador_txt.setBackground(java.awt.SystemColor.controlLtHighlight);
        apePa_trabajador_txt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(apePa_trabajador_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 170, 35));

        jLabel18.setBackground(new java.awt.Color(102, 102, 102));
        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Apellido Paterno");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 171, -1));

        apeMa_trabajador_txt.setBackground(java.awt.SystemColor.controlLtHighlight);
        apeMa_trabajador_txt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(apeMa_trabajador_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 170, 35));

        jLabel19.setBackground(new java.awt.Color(102, 102, 102));
        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Apellido Materno");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 187, -1));

        direccion_trabajador_txt.setBackground(java.awt.SystemColor.controlLtHighlight);
        direccion_trabajador_txt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(direccion_trabajador_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 260, 35));

        jLabel20.setBackground(new java.awt.Color(102, 102, 102));
        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Fecha Contrato");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 140, 40));

        correo_txt.setBackground(java.awt.SystemColor.controlLtHighlight);
        correo_txt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(correo_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 260, 35));

        jLabel21.setBackground(new java.awt.Color(102, 102, 102));
        jLabel21.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Correo");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 90, 40));

        telefono_trabajador_txt.setBackground(java.awt.SystemColor.controlLtHighlight);
        telefono_trabajador_txt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(telefono_trabajador_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 170, 35));

        jLabel22.setBackground(new java.awt.Color(102, 102, 102));
        jLabel22.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Telefono");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 187, -1));

        jLabel23.setBackground(new java.awt.Color(102, 102, 102));
        jLabel23.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Direccion");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 90, 40));

        fecha_cont_trabajador_txt.setBackground(java.awt.SystemColor.controlLtHighlight);
        fecha_cont_trabajador_txt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(fecha_cont_trabajador_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 220, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas_img.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 40, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas_img.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 40, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas_img.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 40, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1186, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregar_trabajador_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_trabajador_btnActionPerformed

    }//GEN-LAST:event_agregar_trabajador_btnActionPerformed

    private void limpiar_trabajador_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_trabajador_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiar_trabajador_btnActionPerformed

    private void flecha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flecha1MouseClicked
        GestionDatosFrame gtFrame = new GestionDatosFrame();
        gtFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_flecha1MouseClicked

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
            java.util.logging.Logger.getLogger(ClienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton agregar_trabajador_btn;
    public javax.swing.JTextField apeMa_trabajador_txt;
    public javax.swing.JTextField apePa_trabajador_txt;
    public javax.swing.JTextField correo_txt;
    public javax.swing.JTextField direccion_trabajador_txt;
    public javax.swing.JTextField fecha_cont_trabajador_txt;
    public javax.swing.JLabel flecha1;
    public javax.swing.JTextField id_trabajador_txt;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JButton limpiar_trabajador_btn;
    public javax.swing.JTextField nom_trabajador_txt;
    public javax.swing.JTextField rut_trabajador_txt;
    public javax.swing.JTextField telefono_trabajador_txt;
    // End of variables declaration//GEN-END:variables
}