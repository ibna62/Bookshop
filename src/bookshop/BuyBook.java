
package bookshop;

import static bookshop.SignIn.name;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BuyBook extends javax.swing.JFrame {

    
    public BuyBook() {
        initComponents();
        setSize(800,600);
        setLocationRelativeTo(null);
        setResizable(false);
        if(BookDetails.f == 1)
        {
            System.out.println("fdfsdfsdfdsf");
            txtsearch.setText(Search);
            tableupdate();
        }
        else
        {
            tableupdate1();
        }
    }

    public static String Bookname,Category,Writername,Edition,Description,Price,Address,Phone,Photo,Date,Search,search;
    Connection con;
    PreparedStatement select;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        details = new javax.swing.JButton();
        back = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtbookid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("BankGothic Lt BT", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 153));
        jLabel1.setText("Buy Book");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 210, 30);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Name", "Writer Name", "Book Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 150, 730, 300);

        details.setBackground(new java.awt.Color(102, 102, 255));
        details.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        details.setText("Details");
        details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsActionPerformed(evt);
            }
        });
        getContentPane().add(details);
        details.setBounds(30, 490, 120, 31);

        back.setBackground(new java.awt.Color(102, 102, 255));
        back.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(650, 490, 110, 30);

        txtsearch.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsearchKeyPressed(evt);
            }
        });
        getContentPane().add(txtsearch);
        txtsearch.setBounds(520, 60, 200, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_photo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(730, 60, 30, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background2.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 820, 680);
        getContentPane().add(txtbookid);
        txtbookid.setBounds(360, 550, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            search = txtsearch.getText();
            //String division = (String) txtdivision.getSelectedItem();
            Search = search;
            if(search == "")
            {
                tableupdate1();
            }
            else
            {
                tableupdate();
            }
        }
    }//GEN-LAST:event_txtsearchKeyPressed
 
    
    private void tableupdate()
    {
        
        try
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost/bookshop", "root","");
                select = con.prepareStatement("select * from uploadbook where bookname = ?");
                select.setString(1,txtsearch.getText());
                //select.setString(2,(String) txtdivision.getSelectedItem());
                ResultSet rs = select.executeQuery();
                ResultSetMetaData rss = rs.getMetaData();
                DefaultTableModel df = (DefaultTableModel) table.getModel();
                df.setRowCount(0);
                while(rs.next())
                {
                    Vector v1 = new Vector();
                    v1.add(rs.getString("bookname"));
                    v1.add(rs.getString("writername"));
                    v1.add(rs.getString("bookid"));
                    df.addRow(v1);
                }
            }
            catch(SQLException ex)
            {
                System.out.println("something went wrong");
            }
    }
    
    
    private void tableupdate1()
    {
        
        try
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost/bookshop", "root","");
                select = con.prepareStatement("select * from uploadbook");
                ResultSet rs = select.executeQuery();
                ResultSetMetaData rss = rs.getMetaData();
                DefaultTableModel df = (DefaultTableModel) table.getModel();
                df.setRowCount(0);
                while(rs.next())
                {
                    Vector v1 = new Vector();
                    v1.add(rs.getString("bookname"));
                    v1.add(rs.getString("writername"));
                    v1.add(rs.getString("bookid"));
                    df.addRow(v1);
                }
            }
            catch(SQLException ex)
            {
                System.out.println("something went wrong");
            }
    }
    
    
    private void detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsActionPerformed
        // TODO add your handling code here:
        try
        {
            //con=DriverManager.getConnection("jdbc:mysql://localhost/bookshop","root","");
            //select = con.prepareStatement("select FROM uploadbook WHERE id= ?");
            //select.setString(1,txtbookid.getText());
            
            String bookid = txtbookid.getText();
            System.out.println("fdf");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/bookshop","root","");
            select = con.prepareStatement("select * from uploadbook where bookid = ?");
            select.setString(1,bookid);
            ResultSet rs=select.executeQuery();
            
            
            if(rs.next())
            {
                
                Bookname = rs.getString(3);
                Category = rs.getString(4);
                Writername = rs.getString(5);
                Edition = rs.getString(6);
                Description = rs.getString(7);
                Price = rs.getString(8);
                Address = rs.getString(9);
                Phone = rs.getString(10);
                Photo = rs.getString(11);
                Date = rs.getString(12);
                
                new BookDetails().setVisible(true);
                 dispose();
            }
            else
            {
                
            }
        }
        catch(SQLException ex)
        {
            System.out.println("something went wrong");
        }
    }//GEN-LAST:event_detailsActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dfl = (DefaultTableModel) table.getModel();
        int selectedindex = table.getSelectedRow();
        txtbookid.setText(dfl.getValueAt(selectedindex,2).toString());
        if(search == null)
        {
            Search = null;
        }
        else
        {
            Search = search;
        }
    }//GEN-LAST:event_tableMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
     
        new BuySell().setVisible(true);
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
            java.util.logging.Logger.getLogger(BuyBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton details;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtbookid;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
