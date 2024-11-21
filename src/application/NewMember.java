package application;


import application.Homepage;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFrame;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */ 
public class NewMember extends javax.swing.JFrame {

    // Declare static JFrame instance
    private static NewMember frame;

    public NewMember() {
        initComponents();
        jwrong.setVisible(false);
        jwrong1.setVisible(false);
        jwrong5.setVisible(false);
        jwrong4.setVisible(false);
        jwrong2.setVisible(false);
         jwrong3.setVisible(false);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            frame = new NewMember();  // Instantiate frame in static context
            frame.setVisible(true);   // Show frame
        });
    }

    public static NewMember getFrame() {
        return frame;   // Static method to get the frame instance
    }
    // Add all the auto-generated code by NetBeans here like initComponents(), action listeners, etc.
    // Initialize components as done in your original code...

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        juser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jphno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCgender = new javax.swing.JComboBox<>();
        jissues = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jCgymtime = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jadhar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jage = new javax.swing.JTextField();
        jbsave = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jweight = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jheight = new javax.swing.JTextField();
        jwrong = new javax.swing.JLabel();
        jwrong2 = new javax.swing.JLabel();
        jwrong1 = new javax.swing.JLabel();
        jwrong3 = new javax.swing.JLabel();
        jwrong4 = new javax.swing.JLabel();
        jwrong5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(175, 100));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 118, 221));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Swis721 BlkOul BT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(227, 227, 173));
        jLabel1.setText("PROFILE PAGE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 430, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(241, 218, 167));
        jLabel4.setText("NAME:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 60, -1));

        juser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        juser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juserActionPerformed(evt);
            }
        });
        jPanel1.add(juser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 240, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(241, 218, 167));
        jLabel5.setText("MOBILE NUMBER:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 140, -1));

        jphno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jphno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jphnoFocusGained(evt);
            }
        });
        jphno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jphnoActionPerformed(evt);
            }
        });
        jPanel1.add(jphno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 240, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(241, 218, 167));
        jLabel6.setText("EMAIL ID:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 80, -1));

        jemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jemailFocusGained(evt);
            }
        });
        jPanel1.add(jemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 240, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(241, 218, 167));
        jLabel7.setText("GENDER:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 70, -1));

        jCgender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        jCgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCgenderActionPerformed(evt);
            }
        });
        jPanel1.add(jCgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 130, -1));

        jissues.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jissues, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 240, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(241, 218, 167));
        jLabel10.setText("GYM TIME:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 90, -1));

        jCgymtime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCgymtime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "05.00AM-11.00AM", "04.00PM-08.00PM" }));
        jPanel1.add(jCgymtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 210, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(241, 218, 167));
        jLabel11.setText("Aadhar Number ( Unique_ID)");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 230, -1));

        jadhar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jadhar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jadharFocusGained(evt);
            }
        });
        jadhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jadharActionPerformed(evt);
            }
        });
        jPanel1.add(jadhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 239, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(241, 218, 167));
        jLabel12.setText("AGE:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 90, -1));

        jage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jageFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jageFocusLost(evt);
            }
        });
        jage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jageActionPerformed(evt);
            }
        });
        jPanel1.add(jage, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 239, -1));

        jbsave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jbsave.setText("Save");
        jbsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsaveActionPerformed(evt);
            }
        });
        jPanel1.add(jbsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 160, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 180, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(241, 218, 167));
        jLabel3.setText("WEIGHT(IN KG):");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(241, 218, 167));
        jLabel14.setText("HEIGHT(IN FEET):");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 140, -1));

        jweight.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jweight.setSelectionColor(new java.awt.Color(0, 0, 0));
        jweight.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jweightFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jweightFocusLost(evt);
            }
        });
        jweight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jweightActionPerformed(evt);
            }
        });
        jPanel1.add(jweight, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 240, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(241, 218, 167));
        jLabel13.setText("ANY PHYSICAL/MENTAL ISSUES:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 250, 40));

        jheight.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jheight.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jheightFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jheightFocusLost(evt);
            }
        });
        jheight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jheightActionPerformed(evt);
            }
        });
        jPanel1.add(jheight, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 240, -1));

        jwrong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jPanel1.add(jwrong, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jwrong2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jPanel1.add(jwrong2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        jwrong1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jPanel1.add(jwrong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jwrong3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jPanel1.add(jwrong3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        jwrong4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jPanel1.add(jwrong4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        jwrong5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jPanel1.add(jwrong5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel8.setForeground(new java.awt.Color(241, 218, 167));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about page.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void juserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juserActionPerformed

    private void jCgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCgenderActionPerformed

    private void jphnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jphnoActionPerformed
    }//GEN-LAST:event_jphnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       new MYHOMEPAGE().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            juser.setText("");
            jphno.setText("");
            jage.setText("");
            jheight.setText("");
            jweight.setText("");
            jadhar.setText("");
            jissues.setText("");
            jemail.setText(""); 
            jCgender.setSelectedIndex(0);
            jCgymtime.setSelectedIndex(0);    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jbsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsaveActionPerformed
// Validate user input
    if (juser.getText().equals("")) {  
        JOptionPane.showMessageDialog(null, "Please enter username");
        return;
    }
     if (jphno.getText().equals("") || jphno.getText().length() != 10) {
        JOptionPane.showMessageDialog(null, "Please enter a valid 10-digit phone number");
        jwrong.setVisible(true);
    }
     else 
     {
     try {
    long phnoValue = Long.parseLong(jphno.getText().trim());
    if (phnoValue <= 0) {
        throw new NumberFormatException();
    }
} 
    catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Please enter a valid positive integers number for the phone number.");
     jwrong.setVisible(true);
    return;
}
     if (jadhar.getText().equals("") || jadhar.getText().length() != 12)
{
        JOptionPane.showMessageDialog(null, "Please enter a valid 12-digit Aadhar number");
           jwrong5.setVisible(true); 
           return;
    }
     else{
    try {
    long aadharValue = Long.parseLong(jadhar.getText().trim());
    if (aadharValue <= 0) {
        throw new NumberFormatException();
    }
} 
    catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Please enter a valid positive number for Aadhar number.");
       jwrong5.setVisible(true);
    return;
}
        if (jemail.getText().equals("")) {  
        JOptionPane.showMessageDialog(null, "Please enter email");
        jwrong1.setVisible(true);
        return;
    }
        try {
        int ageValue = Integer.parseInt(jage.getText());
        if (ageValue <= 0) {
            throw new NumberFormatException();
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Please enter a valid integer for age");
         jwrong3.setVisible(true);
        return;
    }   
try {
        float weightValue = Float.parseFloat(jweight.getText());
        if (weightValue <= 0) {
            throw new NumberFormatException();
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Please enter a valid number for weight in kg");
         jwrong2.setVisible(true);
        return;
    }
   try {
        float heightValue = Float.parseFloat(jheight.getText());
        if (heightValue <= 0) {
            throw new NumberFormatException();
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Please enter a valid number for height in feet.");
         jwrong4.setVisible(true);
        return;
    } 
    if (jissues.getText().equals("")) {  
        JOptionPane.showMessageDialog(null, "Please enter issues if any");
        return;
    }
     }
    String username = juser.getText();
    String phnumber = jphno.getText();
    String email = jemail.getText();
    String gender = (String) jCgender.getSelectedItem();
    String gymtime = (String) jCgymtime.getSelectedItem();
    String Aadharnumber = jadhar.getText();
    String age = jage.getText();
    String weight = jweight.getText();
    String uuchai = jheight.getText();
    String issues = jissues.getText();
    // Insert into database
    Connection con = null;
    PreparedStatement insert = null;
    try {
        // Load MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establish connection
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "mandar@1317");
        // SQL Insert query
        String query = "INSERT INTO profile(username, phnumber, email, gender, gymtime, Aadharnumber, age, weight, height, issues) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        insert = con.prepareStatement(query);
        // Set parameters
        insert.setString(1, username);
        insert.setString(2, phnumber);
        insert.setString(3, email);
        insert.setString(4, gender);
        insert.setString(5, gymtime);
        insert.setString(6, Aadharnumber);
        insert.setInt(7, Integer.parseInt(age));
        insert.setFloat(8, Float.parseFloat(weight));
        insert.setFloat(9, Float.parseFloat(uuchai));
        insert.setString(10, issues);
        // Execute insert
        insert.executeUpdate();
        // Success message
        JOptionPane.showMessageDialog(null, "Profile saved.");
    } catch (ClassNotFoundException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Error while saving profile: " + e.getMessage()); 
}
     }
    }//GEN-LAST:event_jbsaveActionPerformed

    private void jadharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jadharActionPerformed
 jwrong5.setVisible(false);
    }//GEN-LAST:event_jadharActionPerformed

    private void jageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jageActionPerformed

    private void jweightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jweightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jweightActionPerformed

    private void jheightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jheightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jheightActionPerformed

    private void jheightFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jheightFocusGained
 jwrong4.setVisible(false);  
    }//GEN-LAST:event_jheightFocusGained
  
    private void jheightFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jheightFocusLost
    
    }//GEN-LAST:event_jheightFocusLost

    private void jweightFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jweightFocusGained
 jwrong2.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jweightFocusGained

    private void jweightFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jweightFocusLost
     
    }//GEN-LAST:event_jweightFocusLost

    private void jageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jageFocusLost
    // TODO add your handling code here:
    }//GEN-LAST:event_jageFocusLost

    private void jphnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jphnoFocusGained
jwrong.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jphnoFocusGained

    private void jadharFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jadharFocusGained
 jwrong5.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jadharFocusGained

    private void jageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jageFocusGained
 jwrong3.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jageFocusGained

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//this.setExtendedState(JFrame.MAXIMIZED_BOTH);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jemailFocusGained
       jwrong1.setVisible(false);   // TODO add your handling code here:
    }//GEN-LAST:event_jemailFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCgender;
    private javax.swing.JComboBox<String> jCgymtime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jadhar;
    private javax.swing.JTextField jage;
    private javax.swing.JButton jbsave;
    private javax.swing.JTextField jemail;
    private javax.swing.JTextField jheight;
    private javax.swing.JTextField jissues;
    private javax.swing.JTextField jphno;
    private javax.swing.JTextField juser;
    private javax.swing.JTextField jweight;
    private javax.swing.JLabel jwrong;
    private javax.swing.JLabel jwrong1;
    private javax.swing.JLabel jwrong2;
    private javax.swing.JLabel jwrong3;
    private javax.swing.JLabel jwrong4;
    private javax.swing.JLabel jwrong5;
    // End of variables declaration//GEN-END:variables
private static void showProfile(String username) {
        // Create a new JFrame for profile display
        JFrame profileFrame = new JFrame("User Profile");
        profileFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Fetch profile information from the database
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "mandar@1317,userid,password");
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM profile WHERE userid = ?")) {
            stmt.setString(1, username);
            ResultSet profileResult = stmt.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        profileFrame.setLocationRelativeTo(null);
        profileFrame.setVisible(true);
    }
}


