
package bookshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ForgotPassword extends javax.swing.JFrame {

    
    public ForgotPassword() {
        initComponents();
        setSize(800,500);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    
    Connection con;
    PreparedStatement select;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtbirth = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 130, 70, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Birth Place");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 200, 100, 17);
        getContentPane().add(txtusername);
        txtusername.setBounds(360, 120, 200, 30);
        getContentPane().add(txtbirth);
        txtbirth.setBounds(360, 190, 200, 30);

        submit.setBackground(new java.awt.Color(0, 0, 0));
        submit.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(400, 250, 110, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Your Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 330, 110, 17);

        txtpass.setEditable(false);
        getContentPane().add(txtpass);
        txtpass.setBounds(360, 320, 200, 30);

        jLabel4.setFont(new java.awt.Font("BankGothic Lt BT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Forgot Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 50, 270, 32);

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(650, 420, 100, 31);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/signin_backgrnd.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 820, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        String username = txtusername.getText();
        String birthplace = txtbirth.getText();
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bookshop","root","");
            select = con.prepareStatement("select * from signup where username = ? and birthplace = ?");
            select.setString(1,username);
            select.setString(2,birthplace);
            
            ResultSet rs=select.executeQuery();
            if(rs.next())
            {
                txtpass.setText(rs.getString(3));
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Sorry !! Username or Birth place not matched");
            }
            txtusername.setText("");
            txtbirth.setText("");
        }
        catch(SQLException ex)
        {
            System.out.println("something went wrong");
        }
    }//GEN-LAST:event_submitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new SignIn().setVisible(true);
       dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton submit;
    private javax.swing.JTextField txtbirth;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
