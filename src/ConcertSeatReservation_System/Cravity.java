// START
package ConcertSeatReservation_System;

// Import packages
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Cravity extends javax.swing.JFrame {

    public Cravity() {
        initComponents();
        Cravity();
        setIconImage();
       
// Setting the cancel button background to be transparent 
        cancel.setContentAreaFilled(false);  
    }

// For images: background, logo and poster
    public void Cravity (){
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
        
        ImageIcon icon2 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\ikon.jpg");
        Image img2 = icon2.getImage();
        Image imgScale2 = img2.getScaledInstance(poster.getWidth(), poster.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon (imgScale2);
        poster.setIcon(scaledIcon2);
    }

// Creating components and setting its layout
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        SearchField = new javax.swing.JTextField();
        menu = new javax.swing.JComboBox<>();
        poster = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cravity: 1st World Tour 'Masterpiece'");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1620, 900));
        setMinimumSize(new java.awt.Dimension(1620, 900));
        setName("TwiceFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1620, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(48, 47, 78));

        name.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 48)); // NOI18N
        name.setForeground(new java.awt.Color(238, 137, 104));
        name.setText("SeatSync Tickets");

        SearchField.setEditable(false);
        SearchField.setText("                                                                                          Search 🔎");
        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });

        menu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home", "Login or Sign Up", "About Us", "Contact Us", "Terms & Conditions" }));
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
                .addGap(145, 145, 145)
                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SearchField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, -1));

        poster.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(poster, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 520, 680));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("__________________________________________________________________");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 1450, -1));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Cravity: 1st World Tour 'Masterpiece'");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("North American and Asia legs of their upcoming world tour");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 840, 50));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("K-pop boyband CRAVITY have announced the dates for the");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 840, 50));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText(", \"Masterpiece\". The group are set to kick off the tour in ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 840, 50));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("South Korea with a show on May 13. CRAVITY’s ‘Masterpiece’");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 840, 50));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("South Korea with a show on May 13. CRAVITY’s ‘Masterpiece’ world ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 840, 50));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("world tour will also see the boyband perform one show");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 840, 50));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("here in the Philippines as a thanks to their filo fans that has");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 840, 50));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("August 5, 2023 at 7:00 pm");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, 490, 40));

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Date & Time:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, -1, -1));

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("__________________________________________________________________");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 1450, -1));

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("supported them since their debut.");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 840, 50));

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("New frontier Theater, Pasig City, Philippines");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 600, 790, 40));

        jLabel15.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Venue:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, -1, -1));

        cancel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("CANCEL");
        cancel.setBorder(null);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 760, 130, 50));

        jButton3.setBackground(new java.awt.Color(255, 94, 126));
        jButton3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("BUY TICKETS");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 765, 190, 40));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 840, 260));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 600, 670, 40));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 670, 40));

        bg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bg.setOpaque(true);
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1550, 850));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// Searchfield conditions
    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
 String[] eventKeywords = {
        "Cravity", "Masterpiece", "Cravity In Manila",
        "Dhruv", "Dhruv Live In Manila", "Dhruv In Manila",
        "Howlers", "Howlers 2.0", "Howlers In Manila",
        "Ikon", "Ikon in Manila", "Ikon World Tour", "Take Off",
        "NMixx", "NMixx Showcase Tour", "Nice to Mixx You", "NMixx in Manila",
        "SB19", "SB19 Pagtatag", "SB19 in Davao", "SB19 World Tour",
        "SSRFest", "Parokya ni Edgar", "Sponge Cola",
        "SarahGxBamboo", "SarahG", "Bamboo",
        "TXT", "TXT World Tour", "Act Sweet Mirage",
        "Super Stage", "Kpop in Manila", "Kepler", "Kep1er", "Lapillus", "Mamamoo",
        "Taeyeon", "Taeyeon in Manila", "The Odd of Love", "Odd", "Odd Love",
        "The Juans", "The Juans in Cebu", "TJ",
        "The Boyz", "The Boyz Manila", "The Boyz in Manila", "TBZ", "The Boyz Zenerarion", "Zeneration",
        "Twice", "Twice Ready To Be", "Twice World Tour", "RTB",
        "Seventeen", "Seventeen Be The Sun", "Be The Sun", "Seventeen World Tour", "SVT",
        "Enhypen", "Enhypen Manifesto", "Manifesto", "Enhypen World Tour",
        "Itzy", "Itzy Checkmate", "Checkmate", "Itzy World Tour",
        "Straykids", "Straykids Maniac Tour", "Maniac", "SKZ", "straykids World Tour"
    };
            
    String userInput = SearchField.getText().toLowerCase();

    for (String keyword : eventKeywords) {
    if (userInput.equalsIgnoreCase(keyword)) {
        // Match found, open the corresponding event
        switch (userInput) {
            case "cravity":
                Cravity cv = new Cravity();
                cv.show();
                dispose();
                break;
            case "dhruv":
                Dhruv dv = new Dhruv();
                dv.show();
                dispose();
                break;
            case "howlers":
                Howlers hl = new Howlers();
                hl.show();
                dispose();
                break;
            case "ikon":
                IKon ik = new IKon();
                ik.show();
                dispose();
                break;
            case "nmixx":
                NMixx nm = new NMixx();
                nm.show();
                dispose();
                break;
            case "sb19":
                SB19 sb19 = new SB19();
                sb19.show();
                dispose();
                break;
            case "ssrfest":
                SSRFest sr = new SSRFest();
                sr.show();
                dispose();
                break;
            case "sarahgxbamboo":
                SarahGxBamboo sb = new SarahGxBamboo();
                sb.show();
                dispose();
                break;
            case "txt":
                TXT tx = new TXT();
                tx.show();
                dispose();
                break;
            case "superstage":
                SuperStage ss = new SuperStage();
                ss.show();
                dispose();
                break;
            case "taeyeon":
                Taeyeon ty = new Taeyeon();
                ty.show();
                dispose();
                break;
            case "the juans":
                TheJuans tj = new TheJuans();
                tj.show();
                dispose();
                break;
            case "twice":
                Twice rtb = new Twice();
                rtb.show();
                dispose();
                break;
            case "The Boyz":
                The_Boyz tbz = new The_Boyz();
                tbz.show();
                dispose();
                break;
            case "seventeen":
                JOptionPane.showMessageDialog(null, "Sorry, Seventeen: Be The Sun event is already done.");
                break;
            case "enhypen":
                JOptionPane.showMessageDialog(null, "Sorry, Enhypen: Manifesto Tour event is already done.");
                break;
            case "itzy":
                JOptionPane.showMessageDialog(null, "Sorry, Itzy: Checkmate World Tour event is already done.");
                break;
            case "straykids":
                JOptionPane.showMessageDialog(null, "Sorry, Straykids: Maniac World Tour event is already done.");
                break;
            default:
                // Handle the case where the event is not found
                JOptionPane.showMessageDialog(null, "Event not found.");
        }
        return; // Exit the loop once a match is found
    }
}

        JOptionPane.showMessageDialog(null, "Event not found.");
        
    }//GEN-LAST:event_SearchFieldActionPerformed
// Combobox navigator conditions
    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        if (menu.getSelectedItem() == "Home"){
        Main mn = new Main();
        mn.show();
        dispose();  
        }
        
        if (menu.getSelectedItem() == "Login or Sign Up"){
        Login lg = new Login();
        lg.show();  
        }
        
        else if (menu.getSelectedItem() == "About Us"){
        AboutUs au = new AboutUs();
        au.show();
        dispose();   
        }
        
        else if (menu.getSelectedItem() == "Contact Us"){
        ContactUs cu = new ContactUs();
        cu.show();
        dispose();   
        }
        
        else if (menu.getSelectedItem() == "Terms & Conditions"){
        TandCs tc = new TandCs();
        tc.show();
        dispose();  
        }

    }//GEN-LAST:event_menuActionPerformed
//// "Buy tickets" button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Queuing q = new Queuing();
        q.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
// "Cancel button"
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        Main_2 mr = new Main_2();
        mr.show();
        dispose();   
    }//GEN-LAST:event_cancelActionPerformed

// Main Method
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cravity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SearchField;
    private javax.swing.JLabel bg;
    private javax.swing.JButton cancel;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> menu;
    private javax.swing.JLabel name;
    private javax.swing.JLabel poster;
    // End of variables declaration//GEN-END:variables

// Logo Package
private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
//END