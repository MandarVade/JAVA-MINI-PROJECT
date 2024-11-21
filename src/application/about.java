package application;


import javax.swing.JFrame;
import java.awt.BorderLayout;
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
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Dell
 */
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class about extends javax.swing.JPanel {
    public about() {
         setLayout(new BorderLayout());
        initComponents();
    }
    
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> {
       // Create a JFrame
            JFrame frame = new JFrame("About");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            // Add the about panel to the frame
            frame.add(new about()); 
            
            // Adjust the frame size to fit the panel
            frame.pack(); 
            
            // Center the JFrame on the screen
            frame.setLocationRelativeTo(null); 
            
            // Make the frame visible
            frame.setVisible(true);
        });
}
    class AboutPanel extends JPanel {
    public AboutPanel() {
        setLayout(new BorderLayout());  // Set a layout manager for the panel

        // Add content to the About panel
        JLabel aboutLabel = new JLabel("<html><h1>About the Gym Management System</h1>"
                + "<p>This system helps manage gym memberships, profiles, and workouts. "
                + "It is designed to streamline operations and improve user experience.</p></html>");
        aboutLabel.setVerticalAlignment(JLabel.TOP);

        // Add the label to the panel
        add(aboutLabel, BorderLayout.NORTH); // You can adjust the layout position as needed
    }
}
   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 2400));

        jScrollPane6.setMaximumSize(new java.awt.Dimension(1000, 600));
        jScrollPane6.setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 2400));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 2300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ptrainer.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(198, 170, 161));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Functional training focuses on improving everyday movement\nand strength through exercises that mimic real-life activities.\nA gym with a dedicated area for functional training attracts members\nlooking for a versatile and dynamic workout.\nEquipment: The area includes battle ropes, kettlebells, \nresistance bands, suspension trainers (e.g., TRX), medicine balls\nand plyometric boxes.\nVersatility: This space can be used for bodyweight exercises,\nhigh-intensity training, offering a range of training options.");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 500, 250));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GYM.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, -1, -1));

        jTextArea2.setBackground(new java.awt.Color(198, 170, 161));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Your fitness journey is unique. That’s why at Sunshine  Gym, our certified\ntrainers craft a personal training program tailored just for you.\nAccelerate your fitness and weight loss goals with our expert blend of\ncardio, strength training, and the latest in fitness technology.\nKEY FEATURES OF PERSONAL TRAINNER:\n1.One-on-One Coaching\n2.Progress Tracking\n3.Motivation and Accountability\n4.Specialized Programs\n");
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 500, 226));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CLASSES.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 900, -1, -1));

        jTextArea3.setBackground(new java.awt.Color(198, 170, 161));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Modern, well-maintained equipment is essential for attracting and\nretaining gym members. The gym should offer a variety of machines,\nfree weights, and functional training tools to cater to all fitness\nlevels and workout preferences.\nCardio Equipment: Treadmills, ellipticals, rowing machines, and bikes\nwith built-in entertainment systems or interactive workout programs.\n\nStrength Training Machines: A wide range of resistance machines\nand free weights (dumbbells, barbells) for all muscle groups.\n\nFunctional Fitness Area: Space for bodyweight exercises, resistance\nbands, kettlebells, and medicine balls for dynamic workouts.\n");
        jScrollPane3.setViewportView(jTextArea3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 900, 500, 300));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EQP.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 1280, -1, -1));

        jTextArea4.setBackground(new java.awt.Color(198, 170, 161));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("Group classes are a fun and motivating way for members to\nexercise in a social environment. Offering a variety of classes\nappeals to a broader audience and encourages members to try\ndifferent workouts.\nClass Variety: Yoga, spinning, Zumba, pilates, strength training, and\nboot camps for all fitness levels.\nExpert Instructors: Certified instructors ensure members are\nperforming exercises correctly and safely while providing motivation.\nClass Scheduling Flexibility: Offering classes at different times\nduring the day to cater to different schedules, including early\nmorning, lunchtime, and evening.\n");
        jScrollPane4.setViewportView(jTextArea4);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 1280, 490, 260));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diet.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 1660, -1, -1));

        jTextArea5.setBackground(new java.awt.Color(198, 170, 161));
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea5.setRows(5);
        jTextArea5.setText("Organizing community events fosters camaraderie and keeps members\nengaged.\nFitness Challenges: Monthly or seasonal challenges (e.g., weight loss\ncompetitions, step challenges) to motivate members and create a\nsense of community.\nWorkshops and Seminars: Guest speakers or experts on health and\nwellness topics to educate members and provide additional value.\nSocial Events: Group outings, charity events, or fitness expos that\nallow members to connect outside of workouts.");
        jScrollPane5.setViewportView(jTextArea5);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 2000, 500, 230));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FUN.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 2000, -1, -1));

        jTextArea6.setBackground(new java.awt.Color(198, 170, 161));
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea6.setRows(5);
        jTextArea6.setText("Supporting members with nutritional guidance helps them\nachieve their fitness goals more effectively.\n\nNutrition Workshops: Regular workshops led by nutritionists on topics\nlike meal prep, healthy eating, and dietary strategies.\nPersonalized Meal Plans: Customized meal plans based on individual\nfitness goals, dietary restrictions, and preferences.\nHealthy Snack Bar: On-site healthy snack options and supplements\nfor post-workout nutrition.");
        jScrollPane7.setViewportView(jTextArea6);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 1660, 500, 220));

        jLabel8.setFont(new java.awt.Font("FrankRuehl", 1, 48)); // NOI18N
        jLabel8.setText("ABOUT OUR GYM");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        jButton1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("1.PERSONAL TRAINING");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("2.DEDICATED FUNCTIONAL TRAINING SPACE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("6.COMMUNITY  EVENTS AND CHALLENGES");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1930, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("5.NUTRITIONAL PROGRAMS AND MEAL PLAN");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1590, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("4.MODERN EQUIPNMENTS");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1210, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("3.GROUP FITNESS CLASSES");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 830, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about page.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane6.setViewportView(jPanel1);

        add(jScrollPane6);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   this.setVisible(false);
    Homepage hp = new Homepage();
    hp.setVisible(true);
    hp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
