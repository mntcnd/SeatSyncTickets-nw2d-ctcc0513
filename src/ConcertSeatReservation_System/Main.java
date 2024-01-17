// START
package ConcertSeatReservation_System;

// Import packages
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        Main();
        setIconImage();
       
    }
    
// For images: background, logo and posters
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
        
        ImageIcon icon2 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\bets.png");
        Image img2 = icon2.getImage();
        Image imgScale2 = img2.getScaledInstance(poster1.getWidth(), poster1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon (imgScale2);
        poster1.setIcon(scaledIcon2);
        
        ImageIcon icon3 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\rtb.jpg");
        Image img3 = icon3.getImage();
        Image imgScale3 = img3.getScaledInstance(poster2.getWidth(), poster2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon3 = new ImageIcon (imgScale3);
        poster2.setIcon(scaledIcon3);
        
        ImageIcon icon4 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\txt.jpg");
        Image img4 = icon4.getImage();
        Image imgScale4 = img4.getScaledInstance(poster3.getWidth(), poster3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon4 = new ImageIcon (imgScale4);
        poster3.setIcon(scaledIcon4);
        
        ImageIcon icon5 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\itzy.png");
        Image img5 = icon5.getImage();
        Image imgScale5 = img5.getScaledInstance(poster4.getWidth(), poster4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon5 = new ImageIcon (imgScale5);
        poster4.setIcon(scaledIcon5);
        
        ImageIcon icon6 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\enha.png");
        Image img6 = icon6.getImage();
        Image imgScale6 = img6.getScaledInstance(poster5.getWidth(), poster5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon6 = new ImageIcon (imgScale6);
        poster5.setIcon(scaledIcon6);
        
        ImageIcon icon7 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\skz.png");
        Image img7 = icon7.getImage();
        Image imgScale7 = img7.getScaledInstance(poster6.getWidth(), poster6.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon7 = new ImageIcon (imgScale7);
        poster6.setIcon(scaledIcon7);
       
        ImageIcon icon8 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\tix.png");
        Image img8 = icon8.getImage();
        Image imgScale8 = img8.getScaledInstance(poster.getWidth(), poster.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon8 = new ImageIcon (imgScale8);
        poster.setIcon(scaledIcon8);
    }
// Creating components and its layout
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        SearchField = new javax.swing.JTextField();
        menu = new javax.swing.JComboBox<>();
        background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        poster1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        poster2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        twice = new javax.swing.JButton();
        txt = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        poster3 = new javax.swing.JLabel();
        poster4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        poster5 = new javax.swing.JLabel();
        poster6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        poster = new javax.swing.JLabel();
        morebtn = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
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
        menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Login or Sign Up", "About Us", "Contact Us", "Terms & Conditions" }));
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

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Philippine Concerts ");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 547, 38));

        poster1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        background.add(poster1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 214, 268));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seventeen: Be The Sun");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 214, 23));

        jButton1.setBackground(new java.awt.Color(48, 47, 78));
        jButton1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buy Tickets");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 214, 35));

        poster2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        background.add(poster2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 214, 268));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Twice: Ready To Be");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 650, 214, 23));

        twice.setBackground(new java.awt.Color(255, 94, 126));
        twice.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        twice.setForeground(new java.awt.Color(255, 255, 255));
        twice.setText("Buy Tickets");
        twice.setBorder(null);
        twice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twiceActionPerformed(evt);
            }
        });
        background.add(twice, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 680, 214, 35));

        txt.setBackground(new java.awt.Color(255, 94, 126));
        txt.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        txt.setForeground(new java.awt.Color(255, 255, 255));
        txt.setText("Buy Tickets");
        txt.setBorder(null);
        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });
        background.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 680, 214, 35));

        jButton4.setBackground(new java.awt.Color(48, 47, 78));
        jButton4.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Buy Tickets");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        background.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 680, 214, 35));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Itzy: 1st World Tour");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 650, 214, 23));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TXT: ACT - Sweet Mirage");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 650, 214, 23));

        poster3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        background.add(poster3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 214, 268));

        poster4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        background.add(poster4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 214, 268));

        jButton5.setBackground(new java.awt.Color(48, 47, 78));
        jButton5.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Buy Tickets");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        background.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 680, 214, 35));

        poster5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        background.add(poster5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 370, 214, 268));

        poster6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        background.add(poster6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 370, 214, 268));

        jButton6.setBackground(new java.awt.Color(48, 47, 78));
        jButton6.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Buy Tickets");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        background.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 680, 214, 35));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Straykids: Maniac Tour");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 650, 214, 23));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Enhypen: Manifesto Tour");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 650, 214, 23));

        poster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ConcertSeatReservation_System/conbg.jpg"))); // NOI18N
        poster.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        background.add(poster, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 16, 1450, 300));

        morebtn.setBackground(new java.awt.Color(255, 94, 126));
        morebtn.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        morebtn.setForeground(new java.awt.Color(255, 255, 255));
        morebtn.setText("SHOW ALL EVENTS");
        morebtn.setBorder(null);
        morebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                morebtnActionPerformed(evt);
            }
        });
        background.add(morebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 330, 190, 30));

        bg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        background.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 830));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 74, 1550, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Sorry, Seventeen: Be The Sun event is already done.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void twiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twiceActionPerformed
        // TODO add your handling code here:
        Twice tw = new Twice();
        tw.show();
        dispose();
    }//GEN-LAST:event_twiceActionPerformed

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // TODO add your handling code here:
        TXT tx = new TXT();
        tx.show();
        dispose();
    }//GEN-LAST:event_txtActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Sorry, Itzy: Checkmate World Tour event is already done.");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Sorry, Straykids: Maniac World Tour event is already done.");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Sorry, Enhypen: Manifesto Tour event is already done.");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void morebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_morebtnActionPerformed
        // TODO add your handling code here:
        Main_2 mr = new Main_2();
        mr.show();
        dispose();

    }//GEN-LAST:event_morebtnActionPerformed
// Combobox menu navigator conditions
    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
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
        
// Main Method
    public static void main(String args[]) {
        Main df = new Main();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SearchField;
    private javax.swing.JPanel background;
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> menu;
    private javax.swing.JButton morebtn;
    private javax.swing.JLabel name;
    private javax.swing.JLabel poster;
    private javax.swing.JLabel poster1;
    private javax.swing.JLabel poster2;
    private javax.swing.JLabel poster3;
    private javax.swing.JLabel poster4;
    private javax.swing.JLabel poster5;
    private javax.swing.JLabel poster6;
    private javax.swing.JButton twice;
    private javax.swing.JButton txt;
    // End of variables declaration//GEN-END:variables

// Logo package
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
// END