
package bookshop;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class UploadBook extends javax.swing.JFrame {

    
    public UploadBook() {
        initComponents();
        setSize(842,700);
        setLocationRelativeTo(null);
        setResizable(false);
        check();
    }

    public static String Bookname,Category,Writername,Edition,Description,Price,Address,Phone,Photo,Date,filename;
    Connection con;
    PreparedStatement insert,select;
    ResultSet rs;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtbname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcategory = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtwname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtedition = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdescription = new javax.swing.JTextArea();
        uploadphoto = new javax.swing.JButton();
        txtuploadphoto = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        upload = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtdate = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("BankGothic Lt BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Upload Book");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 20, 149, 32);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 100, 100, 17);
        getContentPane().add(txtbname);
        txtbname.setBounds(190, 90, 220, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Category");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 170, 90, 17);
        getContentPane().add(txtcategory);
        txtcategory.setBounds(190, 160, 220, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Writer Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 240, 100, 17);
        getContentPane().add(txtwname);
        txtwname.setBounds(190, 230, 220, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Edition");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 310, 90, 17);
        getContentPane().add(txtedition);
        txtedition.setBounds(190, 300, 220, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(470, 100, 50, 17);
        getContentPane().add(txtprice);
        txtprice.setBounds(560, 90, 220, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(470, 180, 80, 17);

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(560, 160, 220, 100);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phone");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(470, 310, 60, 17);
        getContentPane().add(txtphone);
        txtphone.setBounds(560, 300, 220, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Description");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 380, 100, 17);

        txtdescription.setColumns(20);
        txtdescription.setRows(5);
        jScrollPane2.setViewportView(txtdescription);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(190, 370, 220, 96);

        uploadphoto.setBackground(new java.awt.Color(0, 0, 0));
        uploadphoto.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        uploadphoto.setText("Upload Photo");
        uploadphoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadphotoActionPerformed(evt);
            }
        });
        getContentPane().add(uploadphoto);
        uploadphoto.setBounds(460, 470, 140, 31);
        getContentPane().add(txtuploadphoto);
        txtuploadphoto.setBounds(460, 500, 320, 30);

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(690, 600, 100, 31);

        upload.setBackground(new java.awt.Color(0, 0, 0));
        upload.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        upload.setText("Upload");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        getContentPane().add(upload);
        upload.setBounds(360, 560, 160, 31);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(470, 380, 40, 14);
        getContentPane().add(txtdate);
        txtdate.setBounds(560, 370, 220, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Username");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(60, 510, 90, 17);

        txtusername.setEditable(false);
        getContentPane().add(txtusername);
        txtusername.setBounds(190, 500, 220, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/signin_backgrnd2.jpg"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 850, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void check()
    {
        txtusername.setText(SignIn.Username);
    }
    
    
    private void uploadphotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadphotoActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        txtuploadphoto.setText(filename);
        
    }//GEN-LAST:event_uploadphotoActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        // TODO add your handling code here:
        String username = txtusername.getText();
        String bookname = txtbname.getText();
        String category = txtcategory.getText();
        String writername = txtwname.getText();
        String edition = txtedition.getText();
        String description = txtdescription.getText();
        String price = txtprice.getText();
        String address = txtaddress.getText();
        String phone = txtphone.getText();
        String uploadphoto = txtuploadphoto.getText();
        //String division = (String) txtdivision.getSelectedItem();
        SimpleDateFormat date_format = new SimpleDateFormat("YYYY-MM-dd");
        String date = date_format.format(txtdate.getDate());
        
        /*Bookname = bookname;
        Category = category;
        Writername = writername;
        Edition = edition;
        Description = description;
        Price = price;
        Address = address;
        Phone = phone;
        Photo = uploadphoto;
        Date = date;*/
        
        
        
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bookshop","root","");
            insert = con.prepareStatement("insert into uploadbook(username,bookname,category,writername,edition,description,price,address,phone,photo,date) values(?,?,?,?,?,?,?,?,?,?,?)");
            
            insert.setString(1,username);
            insert.setString(2,bookname);
            insert.setString(3,category);
            insert.setString(4,writername);
            insert.setString(5,edition);
            insert.setString(6,description);
            insert.setString(7,price);
            insert.setString(8,address);
            insert.setString(9,phone);
            insert.setString(10,uploadphoto);
            insert.setString(11,date);
            //insert.setString(12,division);
            
            
            
            
            System.out.println("fd");
            
            
            insert.executeUpdate();
            
            //con = DriverManager.getConnection("jdbc:mysql://localhost/bookshop","root","");
            
            
            JOptionPane.showMessageDialog(null,"Uploaded Successfully!!");
            new ViewDetails().setVisible(true);
            setVisible(false);
            
        }
        catch(SQLException ex)
        {
            System.out.println("something went wrong");
        }
    }//GEN-LAST:event_uploadActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new Profile().setVisible(true);
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
            java.util.logging.Logger.getLogger(UploadBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UploadBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UploadBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UploadBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UploadBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtbname;
    private javax.swing.JTextField txtcategory;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JTextArea txtdescription;
    private javax.swing.JTextField txtedition;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtuploadphoto;
    private javax.swing.JTextField txtusername;
    private javax.swing.JTextField txtwname;
    private javax.swing.JButton upload;
    private javax.swing.JButton uploadphoto;
    // End of variables declaration//GEN-END:variables
}
