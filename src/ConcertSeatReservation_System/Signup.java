/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ConcertSeatReservation_System;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author KN Tech
 */
public class Signup extends javax.swing.JFrame {


    public Signup() {
        initComponents();
        Signup();
        setIconImage();
        
        cancel.setContentAreaFilled(false);  
    }
    
    public void Signup (){
        ImageIcon icon = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\logo.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon (imgScale);
        logo.setIcon(scaledIcon);
        
        ImageIcon icon1 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\bg.png");
        Image img1 = icon1.getImage();
        Image imgScale1 = img1.getScaledInstance(bg.getWidth(), bg.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon (imgScale1);
        bg.setIcon(scaledIcon1);
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        menu = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        cancel = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        jRePassword = new javax.swing.JPasswordField();
        jPassword = new javax.swing.JPasswordField();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1620, 900));
        setMinimumSize(new java.awt.Dimension(1620, 900));
        setName("SignupFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1620, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(48, 47, 78));

        name.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 48)); // NOI18N
        name.setForeground(new java.awt.Color(238, 137, 104));
        name.setText("SeatSync Tickets");

        menu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home", "About Us", "Customer Care", "Quick Links", "Terms & Conditions" }));
        menu.setSelectedIndex(-1);
        menu.setBorder(new javax.swing.border.MatteBorder(null));
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(518, 518, 518)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("PERSONAL INFORMATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("_________________________________________________________________________________________________________________");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 1450, -1));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("first name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 120, -1));

        fname.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        fname.setForeground(new java.awt.Color(102, 102, 102));
        fname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fname.setText("Enter your first name");
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 590, 40));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("REGISTER");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("last name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 120, -1));

        lname.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        lname.setForeground(new java.awt.Color(102, 102, 102));
        lname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lname.setText("Enter your last name");
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 590, 40));

        email.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        email.setText("@gmail.com    ");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 590, 40));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("email address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 170, 20));

        number.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        number.setForeground(new java.awt.Color(102, 102, 102));
        number.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        number.setText("+63 (XXX) YYY ZZZZ");
        getContentPane().add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 590, 40));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("phone number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 170, 20));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("CONTACT INFORMATION");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, 20));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("PERSONAL INFORMATION");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("username");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 120, -1));

        username.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(102, 102, 102));
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username.setText("Enter your username");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 210, 590, 40));

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("password");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, 120, -1));

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("re-type password");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, 210, -1));

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("_________________________________________________________________________________________________________________");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 1450, -1));

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("By using CaRose Tickets, you represent and warrant that:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, -1));

        jCheckBox1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("(2) you will maintain the accuracy of such information and promptly update it as necessary;");
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 840, 30));

        jLabel15.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("TERMS & CONDITIONS");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("(1) all registration information you submit will be true, accurate, current, and complete;");
        jCheckBox2.setBorder(null);
        jCheckBox2.setContentAreaFilled(false);
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 840, 30));

        jCheckBox3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("(3) you have the legal capacity and you agree to comply with these Legal Terms;");
        jCheckBox3.setContentAreaFilled(false);
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, 840, 30));

        jCheckBox4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Agree to all Terms and Conditions");
        jCheckBox4.setContentAreaFilled(false);
        getContentPane().add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 760, 360, 30));

        jCheckBox5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("(4) you will not use the Services for any illegal or unauthorized purpose; and");
        jCheckBox5.setContentAreaFilled(false);
        getContentPane().add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 700, 840, 30));

        jCheckBox6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("(5) your use of the Services will not violate any applicable law or regulation. ");
        jCheckBox6.setContentAreaFilled(false);
        getContentPane().add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 730, 840, 30));

        cancel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("CANCEL");
        cancel.setBorder(null);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 780, 130, 40));

        registerBtn.setBackground(new java.awt.Color(255, 94, 126));
        registerBtn.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerBtn.setText("REGISTER");
        registerBtn.setBorder(null);
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        getContentPane().add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1304, 780, 160, 35));

        jRePassword.setText("jPasswordField1");
        getContentPane().add(jRePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 350, 590, 40));

        jPassword.setText("jPasswordField1");
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 280, 590, 40));

        bg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1550, 830));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        if (menu.getSelectedItem() == "Home"){
            Main mn = new Main();
            mn.show();
            dispose();
        }

        else if (menu.getSelectedItem() == "About Us"){
            Main_2 mr = new Main_2();
            mr.show();
            dispose();
        }

        else if (menu.getSelectedItem() == "Customer Care"){
            Main_2 mr = new Main_2();
            mr.show();
            dispose();
        }

        else if (menu.getSelectedItem() == "Quick Links"){
            Main_2 mr = new Main_2();
            mr.show();
            dispose();
        }

        else if (menu.getSelectedItem() == "Terms & Conditions"){
            Main_2 mr = new Main_2();
            mr.show();
            dispose();
        }

    }//GEN-LAST:event_menuActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        char[] enteredPassword = jPassword.getPassword();
        String ep = new String(enteredPassword);
        char[] reenteredPassword = jRePassword.getPassword();
        String rep = new String(reenteredPassword);
        
        if (ep.equals(rep)){
            JOptionPane.showMessageDialog(null, "Registration successful!");
            Login lg = new Login();
            lg.show();  
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Registration failed.");
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        Login lg = new Login();
        lg.show();  
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPasswordField jRePassword;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> menu;
    private javax.swing.JLabel name;
    private javax.swing.JTextField number;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}

