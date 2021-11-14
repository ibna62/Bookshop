
package bookshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AdminProfile extends javax.swing.JFrame {

    
    public AdminProfile() {
        initComponents();
        setSize(800,500);
        setLocationRelativeTo(null);
        setResizable(false);
        tableupdate();
    }

    public String id;
    Connection con;
    PreparedStatement pst;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("BankGothic Lt BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin Profile");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 60, 157, 32);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Name", "Book Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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
        jScrollPane1.setBounds(80, 110, 640, 220);

        delete.setBackground(new java.awt.Color(0, 0, 0));
        delete.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(80, 350, 100, 31);

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        back.setText("Log Out");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(610, 400, 120, 31);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/admin_background.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 830, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dfl = (DefaultTableModel) table.getModel();
        int selectedindex = table.getSelectedRow();
        id = dfl.getValueAt(selectedindex,1).toString();
    }//GEN-LAST:event_tableMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bookshop","root","");
            pst = con.prepareStatement("DELETE FROM uploadbook WHERE bookid= ?");
            pst.setString(1,id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"deleted successfully");
            tableupdate();
        }
        catch(SQLException ex)
        {
            System.out.println("something went wrong");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new Admin().setVisible(true);
       dispose();
    }//GEN-LAST:event_backActionPerformed

    private void tableupdate()
    {
        
        try
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost/bookshop", "root","");
                pst = con.prepareStatement("select * from uploadbook");
                ResultSet rs = pst.executeQuery();
                ResultSetMetaData rss = rs.getMetaData();
                DefaultTableModel df = (DefaultTableModel) table.getModel();
                df.setRowCount(0);
                while(rs.next())
                {
                    Vector v1 = new Vector();
                    v1.add(rs.getString("bookname"));
                    v1.add(rs.getString("bookid"));
                    df.addRow(v1);
                }
            }
            catch(SQLException ex)
            {
                System.out.println("something went wrong");
            }
    }
    
    
    
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
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
