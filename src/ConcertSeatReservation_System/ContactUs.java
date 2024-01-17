// START
package ConcertSeatReservation_System;

// Import packages
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ContactUs extends javax.swing.JFrame {

    public ContactUs() {
        initComponents();
        Main();
        setIconImage();  
    }

// For images: background and logo
    public void Main (){
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
// Creating the components and setting its layout
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        SearchField = new javax.swing.JTextField();
        menu = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contact Us");
        setBackground(new java.awt.Color(48, 47, 78));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1620, 900));
        setMinimumSize(new java.awt.Dimension(1620, 900));
        setName("MainFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1620, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(48, 47, 78));

        name.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 48)); // NOI18N
        name.setForeground(new java.awt.Color(238, 137, 104));
        name.setText("SeatSync Tickets");

        SearchField.setText("                                                                                          Search 🔎");
        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });

        menu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home", "Login or Sign Up", "About Us", "Terms & Conditions" }));
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SearchField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("_________________________________________________________________________________________________________________");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 1450, -1));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("CONTACT US");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Facebook:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 1440, 50));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("SeatSync Tickets Official");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 1440, 50));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Instagram:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 1440, 50));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("seatsynctix_ph");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 1470, 50));

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Email Address:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 1440, 50));

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("SeatSyncTickets@gmail.com");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 1470, 50));

        jButton3.setBackground(new java.awt.Color(255, 94, 126));
        jButton3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("I, understand.");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 690, 250, 40));

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Hotlines:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 1440, 50));

        jLabel18.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("+63 998 961 7204       or       +63 917 131 5165");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 1470, 50));

        jLabel19.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Meet Us:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 1440, 50));

        jLabel20.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Manila, 1229 Philippines");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 1470, 50));

        jLabel21.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("5th Floor Coherco Corporate Centre V.A Rufino Street, Legaspi Village Makati");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 1470, 50));

        bg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1550, 830));

        getAccessibleContext().setAccessibleName("About Us");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// Searchfield Conditions
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
        // TODO add your handling code here:
        if (menu.getSelectedItem() == "Home"){
        Main mn = new Main();
        mn.show();
        dispose();  
        }
        
        else if (menu.getSelectedItem() == "Login or Sign Up"){
        Login lg = new Login();
        lg.show();  
        }
        
        else if (menu.getSelectedItem() == "About Us"){
        AboutUs au = new AboutUs();
        au.show();
        dispose();  
        }
        
        else if (menu.getSelectedItem() == "Terms & Conditions"){
        TandCs tc = new TandCs();
        tc.show();
        dispose();   
        }

    }//GEN-LAST:event_menuActionPerformed
// "I understand" button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Main mn = new Main();
        mn.show();
        dispose();   
    }//GEN-LAST:event_jButton3ActionPerformed
        
// Main Method
    public static void main(String args[]) {
        ContactUs df = new ContactUs();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SearchField;
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> menu;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables

// Logo package
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
//END