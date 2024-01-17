package ConcertSeatReservation_System;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class LoginorSignup extends javax.swing.JFrame {

    public LoginorSignup() {
        initComponents();
        Login();
        setIconImage();
        
    }

// For image: logo and backround
    public void Login (){
        ImageIcon icon1 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\lg.png");
        Image img1 = icon1.getImage();
        Image imgScale1 = img1.getScaledInstance(bg.getWidth(), bg.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon (imgScale1);
        bg.setIcon(scaledIcon1);
        
        ImageIcon icon2 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\icon.png");
        Image img2 = icon2.getImage();
        Image imgScale2 = img2.getScaledInstance(poster.getWidth(), poster.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon (imgScale2);
        poster.setIcon(scaledIcon2);
    }
    
// Creating components and its layout
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        subtn = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        poster = new javax.swing.JLabel();
        lgbtn = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome to SeatSync Tickets");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(400, 468));
        setName("LoginFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(400, 468));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome To");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("_____________________________");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 380, -1));

        subtn.setBackground(new java.awt.Color(255, 94, 126));
        subtn.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        subtn.setForeground(new java.awt.Color(255, 255, 255));
        subtn.setText("SIGNUP");
        subtn.setBorder(null);
        subtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtnActionPerformed(evt);
            }
        });
        getContentPane().add(subtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 330, 35));

        name.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        name.setForeground(new java.awt.Color(238, 137, 104));
        name.setText("SeatSync Tickets");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        poster.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 30)); // NOI18N
        poster.setForeground(new java.awt.Color(255, 255, 255));
        poster.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        poster.setText("Logo");
        getContentPane().add(poster, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 280, 220));

        lgbtn.setBackground(new java.awt.Color(255, 94, 126));
        lgbtn.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        lgbtn.setForeground(new java.awt.Color(255, 255, 255));
        lgbtn.setText("LOGIN");
        lgbtn.setBorder(null);
        lgbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgbtnActionPerformed(evt);
            }
        });
        getContentPane().add(lgbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 330, 35));
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// "Sign Up" Button
    private void subtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtnActionPerformed
        Signup su = new Signup();
        su.show();
        dispose();
    }//GEN-LAST:event_subtnActionPerformed
// "Log In" Button
    private void lgbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgbtnActionPerformed
        Login lg = new Login();
        lg.show();
        dispose();
    }//GEN-LAST:event_lgbtnActionPerformed

// Main Method
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginorSignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton lgbtn;
    private javax.swing.JLabel name;
    public javax.swing.JLabel poster;
    private javax.swing.JButton subtn;
    // End of variables declaration//GEN-END:variables
 
// Logo package
private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
// END