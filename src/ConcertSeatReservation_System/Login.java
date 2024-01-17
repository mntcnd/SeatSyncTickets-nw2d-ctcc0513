// START
package ConcertSeatReservation_System;

// Import packages
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        Login();
        setIconImage();
        
// Setting button background to transparent 
        forgotpass.setContentAreaFilled(false);
        register.setContentAreaFilled(false);
        
    }

    public void Login (){
        ImageIcon icon1 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\lg.png");
        Image img1 = icon1.getImage();
        Image imgScale1 = img1.getScaledInstance(bg.getWidth(), bg.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon (imgScale1);
        bg.setIcon(scaledIcon1);
    }
// Creating components and their layout
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        lgbtn = new javax.swing.JButton();
        forgotpass = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(400, 468));
        setName("LoginFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(400, 468));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("_____________________________");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 380, -1));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("USERNAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, -1));

        username.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(102, 102, 102));
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username.setText("Enter your username");
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 360, 40));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, -1));

        register.setFont(new java.awt.Font("Palatino Linotype", 3, 12)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("Register here.");
        register.setBorder(null);
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        getContentPane().add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 80, -1));

        lgbtn.setBackground(new java.awt.Color(255, 94, 126));
        lgbtn.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        lgbtn.setForeground(new java.awt.Color(255, 255, 255));
        lgbtn.setText("LOGIN");
        lgbtn.setBorder(null);
        lgbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgbtnActionPerformed(evt);
            }
        });
        getContentPane().add(lgbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 214, 35));

        forgotpass.setFont(new java.awt.Font("Palatino Linotype", 3, 12)); // NOI18N
        forgotpass.setForeground(new java.awt.Color(255, 255, 255));
        forgotpass.setText("Forgot your password?");
        forgotpass.setBorder(null);
        getContentPane().add(forgotpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 130, -1));

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Don't have an account?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 140, -1));

        password.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        password.setText("Enter your password");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 360, 40));
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// "Login" Button
    private void lgbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgbtnActionPerformed
        char[] enteredPassword = password.getPassword();
        String ep = new String(enteredPassword);
        String pass = "68n81f61";
        String eusern = username.getText();
        String usern = "CAROSEFAN";
        if (eusern.equals(usern) && ep.equals(pass)){
            JOptionPane.showMessageDialog(null, "Login successfully!");
            QueuingEntry qe = new QueuingEntry();
            qe.show();
            dispose();
            
            Random random = new Random();
            int qnum = random.nextInt(100);
            qe.queueing_num.setText(""+qnum);
        } else {
            JOptionPane.showMessageDialog(null, "Login failed. Check username or password.");
        }
    }//GEN-LAST:event_lgbtnActionPerformed
// "Sign up" Button
    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:
        Signup su = new Signup();
        su.show();
        dispose();
    }//GEN-LAST:event_registerActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed

    }//GEN-LAST:event_usernameActionPerformed

// Main Method
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton forgotpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton lgbtn;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton register;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
     
// Logo package
private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
// END