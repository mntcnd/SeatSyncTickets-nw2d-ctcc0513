// START
package ConcertSeatReservation_System;

// Import packages
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import java.awt.event.*;

public class QueuingEntry extends javax.swing.JFrame {

    public QueuingEntry() {
        initComponents();
        Login();
        setIconImage();

    }
// For images: background
    public void Login (){
        ImageIcon icon1 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\lg.png");
        Image img1 = icon1.getImage();
        Image imgScale1 = img1.getScaledInstance(bg.getWidth(), bg.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon (imgScale1);
        bg.setIcon(scaledIcon1);
        
    }
    
// Creating components and its layout
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        queueing_num = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("You are now in line");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(526, 662, 662, 662));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setEnabled(false);
        setMaximizedBounds(new java.awt.Rectangle(526, 662, 662, 662));
        setMaximumSize(new java.awt.Dimension(526, 662));
        setMinimumSize(new java.awt.Dimension(526, 662));
        setName("LoginFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(526, 662));
        setResizable(false);
        setSize(new java.awt.Dimension(525, 658));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("__________________________________");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 450, -1));

        jLabel3.setFont(new java.awt.Font("Impact", 1, 90)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 380, 200));

        name.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        name.setForeground(new java.awt.Color(238, 137, 104));
        name.setText("SeatSync Tickets");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Your Queueing number is:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 170, 550, 40));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("You are now in line for CaRose Tickets");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 100, 650, 40));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Your time wait is:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 330, 650, 40));

        queueing_num.setFont(new java.awt.Font("Impact", 0, 80)); // NOI18N
        queueing_num.setForeground(new java.awt.Color(255, 255, 255));
        queueing_num.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        queueing_num.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        queueing_num.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(queueing_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 380, 80));
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// Timer
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.i = 61*(Integer.parseInt(queueing_num.getText()));
        T.start();
    }//GEN-LAST:event_formWindowOpened

        int i;
        Timer T = new Timer(1000, new ActionListener() 
        {public void actionPerformed(ActionEvent e)
        {
            i--;
            if (i>=0)
                jLabel3.setText(""+i);
         
            if (i == 0){
            Main mn = new Main();
            mn.show();
            dispose();
            }
}
});

// Main Method
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QueuingEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel name;
    public javax.swing.JLabel queueing_num;
    // End of variables declaration//GEN-END:variables
    
// Logo package
private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
// END