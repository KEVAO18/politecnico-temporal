/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newp;

/**
 *
 * @author PCUNO
 */
public class fp2 extends javax.swing.JFrame {

    /**
     * Creates new form fp2
     */
    public fp2() {
        this.setLocation((1080/2),(720/4));
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

        v3TXT = new javax.swing.JTextField();
        v1TXT = new javax.swing.JTextField();
        v2TXT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rLBL = new javax.swing.JLabel();
        limpiarBTN = new javax.swing.JButton();
        calcBTN = new javax.swing.JButton();
        salirBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        v3TXT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(v3TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 200, 34));
        v3TXT.getAccessibleContext().setAccessibleName("");

        v1TXT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        v1TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v1TXTActionPerformed(evt);
            }
        });
        getContentPane().add(v1TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 200, 34));
        v1TXT.getAccessibleContext().setAccessibleName("");

        v2TXT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(v2TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 200, 34));
        v2TXT.getAccessibleContext().setAccessibleName("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VENTA 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 150, 34));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VENTA 2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 150, 34));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VENTA 3");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 150, 34));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("VENTA TOTAL");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 150, 34));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ALMACEN ABC");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 80));

        rLBL.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rLBL.setForeground(new java.awt.Color(255, 255, 255));
        rLBL.setText("0");
        getContentPane().add(rLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 200, 34));

        limpiarBTN.setBackground(new java.awt.Color(102, 204, 255));
        limpiarBTN.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBTN.setText("LIMPIAR");
        limpiarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(limpiarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 180, 34));

        calcBTN.setBackground(new java.awt.Color(102, 204, 255));
        calcBTN.setForeground(new java.awt.Color(255, 255, 255));
        calcBTN.setText("CALCULAR");
        calcBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcBTNActionPerformed(evt);
            }
        });
        getContentPane().add(calcBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 380, 34));

        salirBTN.setBackground(new java.awt.Color(102, 204, 255));
        salirBTN.setForeground(new java.awt.Color(255, 255, 255));
        salirBTN.setText("SALIR");
        salirBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBTNActionPerformed(evt);
            }
        });
        getContentPane().add(salirBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 180, 34));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void v1TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v1TXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v1TXTActionPerformed

    private void calcBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcBTNActionPerformed
        double a = Double.parseDouble(this.v1TXT.getText());
        double b = Double.parseDouble(this.v2TXT.getText());
        double c = Double.parseDouble(this.v3TXT.getText());
        double d = (a + b + c);
        this.rLBL.setText(String.valueOf(d));
    }//GEN-LAST:event_calcBTNActionPerformed

    private void limpiarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBTNActionPerformed
        this.v1TXT.setText("");
        this.v2TXT.setText("");
        this.v3TXT.setText("");
        this.rLBL.setText("");
    }//GEN-LAST:event_limpiarBTNActionPerformed

    private void salirBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBTNActionPerformed
        dispose();
    }//GEN-LAST:event_salirBTNActionPerformed

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
            java.util.logging.Logger.getLogger(fp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fp2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton limpiarBTN;
    private javax.swing.JLabel rLBL;
    private javax.swing.JButton salirBTN;
    private javax.swing.JTextField v1TXT;
    private javax.swing.JTextField v2TXT;
    private javax.swing.JTextField v3TXT;
    // End of variables declaration//GEN-END:variables
}