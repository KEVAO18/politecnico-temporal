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
public class fp extends javax.swing.JFrame {

    /**
     * Creates new form fp
     */
    public fp() {
        this.setLocation((1080 / 2), (640 / 2));
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

        jPanel1 = new javax.swing.JPanel();
        txtN1 = new javax.swing.JTextField();
        txtN2 = new javax.swing.JTextField();
        sumaBtn = new javax.swing.JButton();
        multiBtn = new javax.swing.JButton();
        borrarBtn = new javax.swing.JButton();
        restaBtn = new javax.swing.JButton();
        diviBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();
        resultadoLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        txtN1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtN1ActionPerformed(evt);
            }
        });

        txtN2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sumaBtn.setText("Suma");
        sumaBtn.setBorder(null);
        sumaBtn.setBorderPainted(false);
        sumaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaBtnActionPerformed(evt);
            }
        });

        multiBtn.setText("Multiplicacion");
        multiBtn.setBorder(null);
        multiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiBtnActionPerformed(evt);
            }
        });

        borrarBtn.setText("Borrar");
        borrarBtn.setBorder(null);
        borrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBtnActionPerformed(evt);
            }
        });

        restaBtn.setText("Resta");
        restaBtn.setBorder(null);
        restaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaBtnActionPerformed(evt);
            }
        });

        diviBtn.setText("Division");
        diviBtn.setBorder(null);
        diviBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diviBtnActionPerformed(evt);
            }
        });

        salirBtn.setText("Salir");
        salirBtn.setBorder(null);
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        resultadoLbl.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(borrarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(multiBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(sumaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtN1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(restaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(diviBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(salirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtN2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultadoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtN2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sumaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diviBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtN1ActionPerformed

    private void diviBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diviBtnActionPerformed
        double a, b;
        double c;
        a = Integer.parseInt(this.txtN1.getText());
        b = Integer.parseInt(this.txtN2.getText());
        if (b == 0) {
            this.resultadoLbl.setText("La operacion no es posible");
            this.txtN1.setText("");
            this.txtN2.setText("");
            this.txtN1.grabFocus();
        } else {
            c = (double) (a / b);
            this.txtN1.setText("");
            this.txtN2.setText("");
            this.txtN1.grabFocus();
            this.resultadoLbl.setText(String.valueOf(c));
        }
    }//GEN-LAST:event_diviBtnActionPerformed

    private void sumaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaBtnActionPerformed
        double a, b;
        double c;
        a = Integer.parseInt(this.txtN1.getText());
        b = Integer.parseInt(this.txtN2.getText());
        c = (double) (a + b);
        this.txtN1.setText("");
        this.txtN2.setText("");
        this.txtN1.grabFocus();
        this.resultadoLbl.setText(String.valueOf(c));
    }//GEN-LAST:event_sumaBtnActionPerformed

    private void restaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaBtnActionPerformed
        double a, b;
        double c;
        a = Integer.parseInt(this.txtN1.getText());
        b = Integer.parseInt(this.txtN2.getText());
        c = (double) (a - b);
        this.txtN1.setText("");
        this.txtN2.setText("");
        this.txtN1.grabFocus();
        this.resultadoLbl.setText(String.valueOf(c));
    }//GEN-LAST:event_restaBtnActionPerformed

    private void multiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiBtnActionPerformed
        double a, b;
        double c;
        a = Integer.parseInt(this.txtN1.getText());
        b = Integer.parseInt(this.txtN2.getText());
        c = (double) (a * b);
        this.txtN1.setText("");
        this.txtN2.setText("");
        this.txtN1.grabFocus();
        this.resultadoLbl.setText(String.valueOf(c));
    }//GEN-LAST:event_multiBtnActionPerformed

    private void borrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBtnActionPerformed
        this.txtN1.setText("");
        this.txtN1.grabFocus();
        this.txtN2.setText("");
        this.resultadoLbl.setText("");
    }//GEN-LAST:event_borrarBtnActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirBtnActionPerformed

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
            java.util.logging.Logger.getLogger(fp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarBtn;
    private javax.swing.JButton diviBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multiBtn;
    private javax.swing.JButton restaBtn;
    private javax.swing.JLabel resultadoLbl;
    private javax.swing.JButton salirBtn;
    private javax.swing.JButton sumaBtn;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextField txtN2;
    // End of variables declaration//GEN-END:variables
}