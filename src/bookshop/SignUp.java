
package bookshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class SignUp extends javax.swing.JFrame {

    
    public SignUp() {
        initComponents();
        setSize(800,600);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    public static String Username1; 
    Connection con1,con2;
    PreparedStatement insert,select;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtcpass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        signupb = new javax.swing.JButton();
        signupback = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtbirth = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("BankGothic Lt BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sign Up");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 20, 92, 32);
        getContentPane().add(txtname);
        txtname.setBounds(510, 80, 220, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 210, 70, 17);
        getContentPane().add(txtpass);
        txtpass.setBounds(510, 200, 220, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 270, 130, 17);
        getContentPane().add(txtusername);
        txtusername.setBounds(510, 140, 220, 30);
        getContentPane().add(txtcpass);
        txtcpass.setBounds(510, 260, 220, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 90, 60, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(370, 380, 80, 17);
        getContentPane().add(txtphone);
        txtphone.setBounds(510, 380, 220, 30);

        signupb.setBackground(new java.awt.Color(0, 0, 0));
        signupb.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        signupb.setText("Sign Up");
        signupb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbActionPerformed(evt);
            }
        });
        getContentPane().add(signupb);
        signupb.setBounds(480, 440, 130, 31);

        signupback.setBackground(new java.awt.Color(0, 0, 0));
        signupback.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        signupback.setText("Back");
        signupback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbackActionPerformed(evt);
            }
        });
        getContentPane().add(signupback);
        signupback.setBounds(640, 510, 110, 31);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(370, 150, 90, 17);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 70, 290, 400);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Brith Place");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(370, 330, 110, 17);
        getContentPane().add(txtbirth);
        txtbirth.setBounds(510, 320, 220, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/signin_backgrnd1.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 810, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbActionPerformed
        // TODO add your handling code here:
        String name = txtname.getText();
        String username = txtusername.getText();
        String pass = txtpass.getText();
        String cpass = txtcpass.getText();
        String phone = txtphone.getText();
        String birthplace = txtbirth.getText();
        try
        {
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/bookshop","root","");
            if(!name.isEmpty() && !username.isEmpty() && !pass.isEmpty() && !cpass.isEmpty() && !phone.isEmpty() && !birthplace.isEmpty())
            {
                
                if(pass.equals(cpass))
                {
                
                    select = con1.prepareStatement("select * from signup where username = ?");
                
                    select.setString(1,username);
                    ResultSet rs = select.executeQuery();
                    if(rs.next())
                    {
                        JOptionPane.showMessageDialog(null,"Username already exist !!");
                    
                    }
                    else
                    {
                        insert = con1.prepareStatement("insert into signup(name,username,pass,cpass,phone,birthplace) values(?,?,?,?,?,?)");
                    
                        insert.setString(1,name);
                        insert.setString(2,username);
                        insert.setString(3,pass);
                        insert.setString(4,cpass);
                        insert.setString(5,phone);
                        insert.setString(6,birthplace);
                        insert.executeUpdate();
                        JOptionPane.showMessageDialog(null,"Account Created Successfully!!");
                        dispose();
                      SignIn s = new SignIn();
                      s.setVisible(true);

                    }
                    txtname.setText("");
                    txtusername.setText("");
                    txtpass.setText("");
                    txtcpass.setText("");
                    txtphone.setText("");
                    txtbirth.setText("");
                
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Password and confirm password not matched !!");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Please fillup all information box !!");
                
            }
            
            //tableupdate();
        }
        catch(SQLException ex)
        {
            System.out.println("something went wrong");
        }
    }//GEN-LAST:event_signupbActionPerformed

    private void signupbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbackActionPerformed
        // TODO add your handling code here:
        SignInUp s= new SignInUp();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_signupbackActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton signupb;
    private javax.swing.JButton signupback;
    private javax.swing.JTextField txtbirth;
    private javax.swing.JTextField txtcpass;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
