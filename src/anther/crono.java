/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anther;

import newp.menu;

/**
 *
 * @author casa
 */
public class crono extends javax.swing.JFrame {

    /**
     * Creates new form crono
     */
    public crono() {
        this.setLocation((720 / 2), 50);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        calcularBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();
        borrarBtn = new javax.swing.JButton();
        lunesTxt = new javax.swing.JTextField();
        miercolesTxt = new javax.swing.JTextField();
        viernesTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        promLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Conometro");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Lunes");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 200, 34));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Miercoles");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 200, 34));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Viernes");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 200, 34));

        calcularBtn.setText("Calcular promedio");
        calcularBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularBtnActionPerformed(evt);
            }
        });
        getContentPane().add(calcularBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 160, 30));

        salirBtn.setText("Salir");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });
        getContentPane().add(salirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 160, 30));

        borrarBtn.setText("Borrar");
        borrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(borrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 160, 30));

        lunesTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(lunesTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 200, 34));

        miercolesTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(miercolesTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 200, 34));

        viernesTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viernesTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viernesTxtActionPerformed(evt);
            }
        });
        getContentPane().add(viernesTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 200, 34));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Promedio");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 200, 34));

        promLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        promLbl.setForeground(new java.awt.Color(255, 255, 255));
        promLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(promLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 200, 34));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plain-black-01.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 626, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularBtnActionPerformed
        double a, b, c, d;
        a = Double.parseDouble(this.lunesTxt.getText());
        b = Double.parseDouble(this.miercolesTxt.getText());
        c = Double.parseDouble(this.viernesTxt.getText());
        d = (a + b + c) / 3;
        this.promLbl.setText(String.valueOf(d) + " Segundos");
    }//GEN-LAST:event_calcularBtnActionPerformed

    private void viernesTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viernesTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viernesTxtActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        menu menu = new menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_salirBtnActionPerformed

    private void borrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBtnActionPerformed
        this.lunesTxt.setText("");
        this.miercolesTxt.setText("");
        this.viernesTxt.setText("");
        this.promLbl.setText("");
    }//GEN-LAST:event_borrarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(crono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crono().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarBtn;
    private javax.swing.JButton calcularBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lunesTxt;
    private javax.swing.JTextField miercolesTxt;
    private javax.swing.JLabel promLbl;
    private javax.swing.JButton salirBtn;
    private javax.swing.JTextField viernesTxt;
    // End of variables declaration//GEN-END:variables
}
