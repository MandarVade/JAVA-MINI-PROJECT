package application;

import application.login;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

    
public class loginog extends javax.swing.JFrame {


    /**/
    public loginog() {
        initComponents();
        jwarning.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jusername = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        blogin = new javax.swing.JButton();
        jcshowpassword = new javax.swing.JCheckBox();
        jwarning = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jbsignup = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 255, 153));
        jLabel1.setFont(new java.awt.Font("Dutch801 XBd BT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN PAGE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 370, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        jusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jusernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jusernameFocusLost(evt);
            }
        });
        jusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusernameActionPerformed(evt);
            }
        });
        getContentPane().add(jusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 201, -1));

        jPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFocusLost(evt);
            }
        });
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 201, -1));

        blogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        blogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        blogin.setText("LOGIN");
        blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });
        getContentPane().add(blogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        jcshowpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jcshowpassword.setForeground(new java.awt.Color(255, 255, 255));
        jcshowpassword.setText("SHOW PASSWORD");
        jcshowpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcshowpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jcshowpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 150, -1));

        jwarning.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jwarning.setForeground(new java.awt.Color(255, 0, 51));
        jwarning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jwarning.setText("Wrong Username or Password");
        getContentPane().add(jwarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jbsignup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbsignup.setText("Sign Up");
        jbsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsignupActionPerformed(evt);
            }
        });
        getContentPane().add(jbsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Dont have an account?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 420, 200, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login bg.PNG.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jusernameActionPerformed

    private void jcshowpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcshowpasswordActionPerformed
if(jcshowpassword.isSelected())
{
jPassword.setEchoChar((char)0);// TODO add your handling code here:
    }                                              
else
{
    jPassword.setEchoChar('*');
}         // TODO add your handling code here:
    }//GEN-LAST:event_jcshowpasswordActionPerformed

    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloginActionPerformed
if (jusername.getText().equals("")) {  
    JOptionPane.showMessageDialog(null, "Please enter username");
} 
else if (new String(jPassword.getPassword()).equals("")) {
    JOptionPane.showMessageDialog(null, "Please enter password");
} 
else { 
    String query, username, password;
    username = jusername.getText();  
    password = new String(jPassword.getPassword());
    Connection con;
    PreparedStatement stmt;
    
    try {
        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Establish a connection to the database
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "mandar@1317");

        // Prepare the SQL query for checking username and password
        query = "SELECT * FROM signup WHERE userid=? AND password=?";
        
        // Use PreparedStatement to prevent SQL injection
        stmt = con.prepareStatement(query);
        stmt.setString(1, username);
        stmt.setString(2, password);
        
        // Execute the query
        ResultSet rs = stmt.executeQuery();

        // Check if the result set has any record
        if (rs.next()) {
            // Successful login
            JOptionPane.showMessageDialog(null, "Login successful!");
            new MYHOMEPAGE().setVisible(true); // Navigate to homepage
            this.setVisible(false); // Hide the login page
        } else {
            // Invalid login
            JOptionPane.showMessageDialog(null, "Invalid username or password.");
            jwarning.setVisible(true); // Show warning
        }

        // Close the result set, statement, and connection
        rs.close();
        stmt.close();
        con.close();
        
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error while establishing connection.");
    }
}
    }//GEN-LAST:event_bloginActionPerformed

    private void jusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jusernameFocusGained
       jwarning.setVisible(false);
    }//GEN-LAST:event_jusernameFocusGained

    private void jusernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jusernameFocusLost
       jwarning.setVisible(false);
    }//GEN-LAST:event_jusernameFocusLost

    private void jPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFocusGained
       jwarning.setVisible(false);     // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFocusGained

    private void jPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFocusLost
       jwarning.setVisible(false);
    }//GEN-LAST:event_jPasswordFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 int b= JOptionPane.showConfirmDialog(null, "Do yiu really want to Exit the Application","sellect",JOptionPane.YES_NO_OPTION);
        if(b==0)
        {
         System.exit(0);   
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsignupActionPerformed
       setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_jbsignupActionPerformed

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
            java.util.logging.Logger.getLogger(loginog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JButton jbsignup;
    private javax.swing.JCheckBox jcshowpassword;
    private javax.swing.JTextField jusername;
    private javax.swing.JLabel jwarning;
    // End of variables declaration//GEN-END:variables
}
