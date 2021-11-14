
package bookshop;

import javax.swing.JOptionPane;


public class BuySell extends javax.swing.JFrame {

    
    public BuySell() {
        initComponents();
        setSize(800,500);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buybook = new javax.swing.JButton();
        sell1 = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        help = new javax.swing.JButton();
        admin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("BankGothic Lt BT", 1, 36)); // NOI18N
        jLabel1.setText("Welcome To Boi Ghor");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 20, 490, 39);

        buybook.setBackground(new java.awt.Color(102, 102, 255));
        buybook.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        buybook.setText("Buy Book");
        buybook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buybookActionPerformed(evt);
            }
        });
        getContentPane().add(buybook);
        buybook.setBounds(440, 110, 110, 39);

        sell1.setBackground(new java.awt.Color(102, 102, 255));
        sell1.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        sell1.setText("Sell Book");
        sell1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sell1ActionPerformed(evt);
            }
        });
        getContentPane().add(sell1);
        sell1.setBounds(440, 170, 110, 39);

        exit.setBackground(new java.awt.Color(102, 102, 255));
        exit.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(440, 350, 113, 39);

        help.setBackground(new java.awt.Color(102, 102, 255));
        help.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        help.setText("Help");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        getContentPane().add(help);
        help.setBounds(440, 230, 110, 40);

        admin.setBackground(new java.awt.Color(102, 102, 255));
        admin.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        admin.setText("Admin");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        getContentPane().add(admin);
        admin.setBounds(440, 290, 110, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background1.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 820, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sell1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sell1ActionPerformed
        // TODO add your handling code here:
        SignInUp s= new SignInUp();
        s.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_sell1ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null,"Do you want to exit ?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
        {
            System.exit(0);
        } 
        else
        {
            
        }
    }//GEN-LAST:event_exitActionPerformed

    private void buybookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buybookActionPerformed
        // TODO add your handling code here:
        BookDetails.f = 0;
        BuyBook.search = null;
        new BuyBook().setVisible(true);
        dispose();
    }//GEN-LAST:event_buybookActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        // TODO add your handling code here:
        new Help().setVisible(true);
        dispose();
    }//GEN-LAST:event_helpActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
        new Admin().setVisible(true);
       dispose();
    }//GEN-LAST:event_adminActionPerformed

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
            java.util.logging.Logger.getLogger(BuySell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuySell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuySell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuySell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuySell().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JButton buybook;
    private javax.swing.JButton exit;
    private javax.swing.JButton help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton sell1;
    // End of variables declaration//GEN-END:variables
}
