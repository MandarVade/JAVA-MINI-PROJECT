package application;


import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

    
/**
 *
 * @author Dell
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        juser = new javax.swing.JTextField();
        bconfirm = new javax.swing.JButton();
        jpass = new javax.swing.JPasswordField();
        jcshowpassword = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jblogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("BankGothic Lt BT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SIGN UP PAGE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        juser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                juserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                juserFocusLost(evt);
            }
        });
        juser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juserActionPerformed(evt);
            }
        });
        getContentPane().add(juser, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 201, -1));

        bconfirm.setFont(new java.awt.Font("Shruti", 1, 18)); // NOI18N
        bconfirm.setText("CONFIRM");
        bconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bconfirmActionPerformed(evt);
            }
        });
        getContentPane().add(bconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        jpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpassFocusLost(evt);
            }
        });
        jpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpassActionPerformed(evt);
            }
        });
        getContentPane().add(jpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 201, -1));

        jcshowpassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jcshowpassword.setForeground(new java.awt.Color(255, 255, 255));
        jcshowpassword.setText("View Password");
        jcshowpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcshowpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jcshowpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 190, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jblogin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jblogin.setText("GO BACK TO LOGIN IN PAGE");
        jblogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbloginActionPerformed(evt);
            }
        });
        getContentPane().add(jblogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login bg.PNG.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void juserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juserActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_juserActionPerformed
            
    private void bconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bconfirmActionPerformed

    if (juser.getText().equals("")) {  
        JOptionPane.showMessageDialog(null, "Please enter username");
    } else if (jpass.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Please enter password");  
    } else { 
        String username = juser.getText();  
        String password = new String(jpass.getPassword()); 
        String query;
        Connection con = null;
        PreparedStatement insert = null;

        try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "mandar@1317");

            // Create the SQL insert query
            query = "INSERT INTO signup(userid, password) VALUES(?, ?)";

            // Prepare the statement (note: prepareStatement is the correct method)
            insert = con.prepareStatement(query);
            insert.setString(1, username);  // PreparedStatement index starts at 1
            insert.setString(2, password);

            // Execute the insert
            insert.executeUpdate();

            // Clear the fields after successful insertion
            juser.setText("");
            jpass.setText("");

            // Show success message
            JOptionPane.showMessageDialog(null, "Sign in successful.");

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error while establishing connection: " + e.getMessage());
        } finally {
            // Clean up database resources
            try {
                if (insert != null) insert.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error closing connection: " + e.getMessage());
            }
        }
    


    
    //    PreparedStatement insert = con.prepareStatement("INSERT INTO signup(userid, password) VALUES (?, ?)");
//    insert.setString(1, username);  // Index starts at 1
//    insert.setString(2, password);
//    insert.executeUpdate();
//    try    {
//         Class.forName("com.mysql.cj.jdbc.Driver") ;
//         con=(connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","mandar@1317");
//         insert =con.PreparedStatement("insert into login(userid,password)values(?,?)");
//         insert.setString(0,username);
//         insert.setString(1,password);
//         insert.executeUpdate();  
//    }

//      Statement st=con.createStatement();
//         String q="select * from login";
//         ResultSet rs=st.executeQuery(q);
//         while(rs.next())
//         {
//             String username=rs.getString("login");
//             String pass=rs.getString("password");
//             
//             if(a.equals(username)   &&   pass.equals(b))
//             {
////                 new f2().setVisible(true);
//             }
//         }
//   }   
//    catch(ClassNotFoundException | SQLException e)
//                {
//                 JOptionPane.showMessageDialog(null, "error while establishing connection");  
//                }
    }//GEN-LAST:event_bconfirmActionPerformed
    }
    private void jpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpassActionPerformed

    private void jcshowpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcshowpasswordActionPerformed
if(jcshowpassword.isSelected())
{
jpass.setEchoChar((char)0);// TODO add your handling code here:
    }//GEN-LAST:event_jcshowpasswordActionPerformed
else
{
    jpass.setEchoChar('*');
} 
    }
    private void juserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_juserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_juserFocusGained

    private void juserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_juserFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_juserFocusLost

    private void jpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpassFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jpassFocusGained

    private void jpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpassFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jpassFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a= JOptionPane.showConfirmDialog(null, "Do yiu really want to Exit the Application","sellect",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
         System.exit(0);   
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbloginActionPerformed
setVisible(false);
new loginog().setVisible(true);
    }//GEN-LAST:event_jbloginActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bconfirm;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jblogin;
    private javax.swing.JCheckBox jcshowpassword;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JTextField juser;
    // End of variables declaration//GEN-END:variables

}
   

    
