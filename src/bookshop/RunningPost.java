
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


public class RunningPost extends javax.swing.JFrame {

    
    public RunningPost() {
        initComponents();
        setSize(800,600);
        setLocationRelativeTo(null);
        setResizable(false);
        check();
        tableupdate();
        
    }

    Connection con;
    PreparedStatement select,pst;
    public String username,id;
    
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
        jLabel1.setText("Running Post");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 70, 158, 32);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Name", "Writer Name", "Upload Date", "Book Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        jScrollPane1.setBounds(70, 160, 660, 250);

        delete.setBackground(new java.awt.Color(0, 0, 0));
        delete.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(70, 450, 120, 29);

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(640, 510, 110, 31);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 820, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dfl = (DefaultTableModel) table.getModel();
        int selectedindex = table.getSelectedRow();
        //txtname.setText(dfl.getValueAt(selectedindex,1).toString());
        id = dfl.getValueAt(selectedindex,3).toString();
        //txtcgpa.setText(dfl.getValueAt(selectedindex,2).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void check()
    {
        username = SignIn.Username;
        
        
    }
    
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
        new Profile().setVisible(true);
       dispose();
    }//GEN-LAST:event_backActionPerformed

    private void tableupdate(){
        
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bookshop", "root","");
            select = con.prepareStatement("select * from uploadbook where username = ?");
            select.setString(1,username);
            ResultSet rs=select.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            DefaultTableModel df = (DefaultTableModel) table.getModel();
            df.setRowCount(0);
            while(rs.next())
            {
                Vector v1 = new Vector();
                v1.add(rs.getString("bookname"));
                v1.add(rs.getString("writername"));
                v1.add(rs.getString("date"));
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
            java.util.logging.Logger.getLogger(RunningPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RunningPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RunningPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RunningPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RunningPost().setVisible(true);
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
