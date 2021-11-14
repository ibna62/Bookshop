
package bookshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Profile extends javax.swing.JFrame {

    String username;
    PreparedStatement select;
    public Profile() {
        initComponents();
        setSize(800,500);
        setLocationRelativeTo(null);
        setResizable(false);
        check();
    }

    private void check()
    {
        txtname.setText(SignIn.name);
        txtphone.setText(SignIn.phone);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        uploadlbook = new javax.swing.JButton();
        signout = new javax.swing.JButton();
        runningpost = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("BankGothic Lt BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Profile");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 50, 141, 32);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 120, 60, 17);

        txtname.setEditable(false);
        txtname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtname);
        txtname.setBounds(340, 110, 210, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 190, 70, 17);

        txtphone.setEditable(false);
        txtphone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtphone);
        txtphone.setBounds(340, 180, 210, 30);

        uploadlbook.setBackground(new java.awt.Color(0, 0, 0));
        uploadlbook.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        uploadlbook.setText("Upload Book");
        uploadlbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadlbookActionPerformed(evt);
            }
        });
        getContentPane().add(uploadlbook);
        uploadlbook.setBounds(250, 270, 170, 31);

        signout.setBackground(new java.awt.Color(0, 0, 0));
        signout.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        signout.setText("Sign Out");
        signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutActionPerformed(evt);
            }
        });
        getContentPane().add(signout);
        signout.setBounds(640, 420, 110, 31);

        runningpost.setBackground(new java.awt.Color(0, 0, 0));
        runningpost.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        runningpost.setText("Running Post");
        runningpost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runningpostActionPerformed(evt);
            }
        });
        getContentPane().add(runningpost);
        runningpost.setBounds(250, 340, 170, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/signin_backgrnd.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 820, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uploadlbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadlbookActionPerformed
        // TODO add your handling code here:
        new UploadBook().setVisible(true);
         dispose();
    }//GEN-LAST:event_uploadlbookActionPerformed

    private void signoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutActionPerformed
        // TODO add your handling code here:
        new SignInUp().setVisible(true);
        dispose();
    }//GEN-LAST:event_signoutActionPerformed

    private void runningpostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runningpostActionPerformed
        // TODO add your handling code here:
        new RunningPost().setVisible(true);
         dispose();
    }//GEN-LAST:event_runningpostActionPerformed

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton runningpost;
    private javax.swing.JButton signout;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    private javax.swing.JButton uploadlbook;
    // End of variables declaration//GEN-END:variables
}
