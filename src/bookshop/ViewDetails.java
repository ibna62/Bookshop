
package bookshop;

import java.awt.Image;
import javax.swing.ImageIcon;


public class ViewDetails extends javax.swing.JFrame {

    
    public ViewDetails() {
        initComponents();
        setSize(842,700);
        setLocationRelativeTo(null);
        setResizable(false);
        check();
    }

    private void check()
    {
        Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(UploadBook.Photo);
        Image image = icon.getImage().getScaledInstance(txtphoto.getWidth(),txtphoto.getHeight(),Image.SCALE_SMOOTH);
        txtphoto.setIcon(icon);
        txtbookname.setText(UploadBook.Bookname);
        txtcategory.setText(UploadBook.Category);
        txtwritername.setText(UploadBook.Writername);
        txtedition.setText(UploadBook.Edition);
        txtdescription.setText(UploadBook.Description);
        txtprice.setText(UploadBook.Price);
        txtaddress.setText(UploadBook.Address);
        txtphone.setText(UploadBook.Phone);
        //txtphoto.setIcon(BuyBook.Photo);
        txtdate.setText(UploadBook.Date);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtbookname = new javax.swing.JTextField();
        txtcategory = new javax.swing.JTextField();
        txtwritername = new javax.swing.JTextField();
        txtedition = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescription = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        back = new javax.swing.JButton();
        txtphoto = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("BankGothic Lt BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Uploaded Book Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 20, 262, 32);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 100, 80, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Category");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 170, 90, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Writer Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 240, 100, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Edition");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 310, 70, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Description");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 380, 90, 17);

        txtbookname.setEditable(false);
        getContentPane().add(txtbookname);
        txtbookname.setBounds(190, 90, 220, 30);

        txtcategory.setEditable(false);
        getContentPane().add(txtcategory);
        txtcategory.setBounds(190, 160, 220, 30);

        txtwritername.setEditable(false);
        getContentPane().add(txtwritername);
        txtwritername.setBounds(190, 230, 220, 30);

        txtedition.setEditable(false);
        getContentPane().add(txtedition);
        txtedition.setBounds(190, 300, 220, 30);

        txtdescription.setEditable(false);
        txtdescription.setColumns(20);
        txtdescription.setRows(5);
        jScrollPane1.setViewportView(txtdescription);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(190, 370, 220, 96);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Price");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(480, 330, 29, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phone");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(480, 390, 70, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(480, 460, 80, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Upload Date");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 520, 120, 17);

        txtdate.setEditable(false);
        getContentPane().add(txtdate);
        txtdate.setBounds(190, 510, 220, 30);

        txtprice.setEditable(false);
        getContentPane().add(txtprice);
        txtprice.setBounds(550, 320, 220, 30);

        txtphone.setEditable(false);
        getContentPane().add(txtphone);
        txtphone.setBounds(550, 380, 220, 30);

        txtaddress.setEditable(false);
        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane2.setViewportView(txtaddress);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(550, 450, 220, 96);

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(700, 600, 90, 30);
        getContentPane().add(txtphoto);
        txtphoto.setBounds(490, 90, 280, 200);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/signin_backgrnd2.jpg"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 870, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new Profile().setVisible(true);
        setVisible(false);
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
            java.util.logging.Logger.getLogger(ViewDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField txtbookname;
    private javax.swing.JTextField txtcategory;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextArea txtdescription;
    private javax.swing.JTextField txtedition;
    private javax.swing.JTextField txtphone;
    private javax.swing.JLabel txtphoto;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtwritername;
    // End of variables declaration//GEN-END:variables
}
