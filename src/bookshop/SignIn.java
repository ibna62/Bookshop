
package bookshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class SignIn extends javax.swing.JFrame {

    
    public SignIn() {
        initComponents();
        setSize(800,500);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static String name,phone,Username,Password;
    Connection con1;
    PreparedStatement select;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        signin = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        forgotpass = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("BankGothic Lt BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sign In");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 100, 115, 32);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 250, 80, 17);
        getContentPane().add(txtusername);
        txtusername.setBounds(450, 170, 210, 30);
        getContentPane().add(txtpass);
        txtpass.setBounds(450, 240, 210, 30);

        signin.setBackground(new java.awt.Color(0, 0, 0));
        signin.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        signin.setText("Sign In");
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        getContentPane().add(signin);
        signin.setBounds(490, 310, 120, 31);

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(340, 180, 90, 17);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/signin_logo.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 100, 230, 250);

        forgotpass.setBackground(new java.awt.Color(0, 0, 0));
        forgotpass.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        forgotpass.setText("Forgot Password");
        forgotpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotpassActionPerformed(evt);
            }
        });
        getContentPane().add(forgotpass);
        forgotpass.setBounds(430, 350, 250, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/signin_backgrnd.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 820, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        SignInUp s= new SignInUp();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
        // TODO add your handling code here:
        String username = txtusername.getText();
        String password = txtpass.getText();
        try
        {
            if(!username.isEmpty() && !password.isEmpty())
            {
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/bookshop","root","");
                select = con1.prepareStatement("select * from signup where username = ? and pass = ?");
                select.setString(1,username);
                select.setString(2,password);
            
                ResultSet rs=select.executeQuery();
                if(rs.next())
                {
                    Username = rs.getString(2);
                    Password = rs.getString(3);
                    if(username.equals(Username) && password.equals(Password))
                    {
                        name = rs.getString(1);
                        phone = rs.getString(5);
                        JOptionPane.showMessageDialog(this,"SignIn Successful !!");
                        new Profile().setVisible(true);
                        dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"Username or Password not matched !!");
                    }
                }
                else 
                {
                    JOptionPane.showMessageDialog(this,"Username or Password not matched !!");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Please fillup all information box !!");
            }
            
        }
        catch(SQLException ex)
        {
            System.out.println("something went wrong");
        }
        txtusername.setText("");
        txtpass.setText("");
    }//GEN-LAST:event_signinActionPerformed

    private void forgotpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotpassActionPerformed
        // TODO add your handling code here:
        new ForgotPassword().setVisible(true);
        dispose();
    }//GEN-LAST:event_forgotpassActionPerformed

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton forgotpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton signin;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
