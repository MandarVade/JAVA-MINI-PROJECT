
package application;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import application.about;
import application.about.AboutPanel; 
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;


public class Homepage extends JFrame {
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem aboutMenuItem;
    private JPanel mainPanel; 

    public Homepage() {
        initComponents();
        setTitle("Gym Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        mainPanel = new JPanel(new CardLayout());
        // Add the About panel wrapped in JScrollPane
        JScrollPane aboutScrollPane = new JScrollPane(new about());
        mainPanel.add(new MainContentPanel(), "mainContent"); // Main content panel
        mainPanel.add(aboutScrollPane, "about"); // Adding About panel inside JScrollPane

        // Add mainPanel to the frame in the center
        add(mainPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void showAboutPage() {
        CardLayout cl = (CardLayout) (mainPanel.getLayout());
        cl.show(mainPanel, "about");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Homepage().setVisible(true));
    }

    class MainContentPanel extends JPanel {
        public MainContentPanel() {
            add(new JLabel("Welcome to the Gym Management System!")); // Example content
        }
    }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jmenubar = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jprofile = new javax.swing.JMenu();
        jABOUT = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 690));
        setPreferredSize(new java.awt.Dimension(1000, 690));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 690));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homebg.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 98, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 690));

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        jmenubar.add(jMenu8);

        jMenu4.setText("Payment");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jmenubar.add(jMenu4);
        jmenubar.add(jMenu6);

        jprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
        jprofile.setText("PROFILE");
        jprofile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jprofile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jprofileMouseClicked(evt);
            }
        });
        jprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprofileActionPerformed(evt);
            }
        });
        jmenubar.add(jprofile);

        jABOUT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about.png"))); // NOI18N
        jABOUT.setText("ABOUT");
        jABOUT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jABOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jABOUTMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jABOUTMousePressed(evt);
            }
        });
        jABOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jABOUTActionPerformed(evt);
            }
        });
        jmenubar.add(jABOUT);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jMenu5.setText("LOGOUT");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jmenubar.add(jMenu5);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jMenu7.setText("EXIT");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jmenubar.add(jMenu7);

        setJMenuBar(jmenubar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do You Really Want To logout","select",JOptionPane.YES_NO_OPTION);
        if (a==0)
        {
            setVisible(false);
            new loginog().setVisible(true);
        }
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jprofileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jprofileMouseClicked
        setVisible(false);
         new NewMember().setVisible(true);
    }//GEN-LAST:event_jprofileMouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do You Really Want To exit","select",JOptionPane.YES_NO_OPTION);
        if (a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprofileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jprofileActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//this.setExtendedState(JFrame.MAXIMIZED_BOTH);    
    }//GEN-LAST:event_formWindowOpened

    private void jABOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jABOUTActionPerformed
//         showAboutPage(); 
//        setVisible(false);
//        new about().setVisible(true);
    }//GEN-LAST:event_jABOUTActionPerformed

    private void jABOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jABOUTMouseClicked
        setVisible(false);
         new MYABOUT().setVisible(true);
         

// about ab=new about();
//    ab.setVisible(true);
//    this.dispose();
////    new about().setVisible(true);
    }//GEN-LAST:event_jABOUTMouseClicked

    private void jABOUTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jABOUTMousePressed
     // TODO add your handling code here:
    }//GEN-LAST:event_jABOUTMousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jABOUT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar jmenubar;
    private javax.swing.JMenu jprofile;
    // End of variables declaration//GEN-END:variables
}
