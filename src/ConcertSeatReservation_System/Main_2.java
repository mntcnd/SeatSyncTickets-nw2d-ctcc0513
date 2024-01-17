// START
package ConcertSeatReservation_System;

// Import packages
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main_2 extends javax.swing.JFrame {

    public Main_2() {
        initComponents();
        Main_2();
        setIconImage();
    }

// For images: background, logo and posters
    public void Main_2 (){
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
        
        ImageIcon icon2 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\nmixx.jpg");
        Image img2 = icon2.getImage();
        Image imgScale2 = img2.getScaledInstance(poster1.getWidth(), poster1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon (imgScale2);
        poster1.setIcon(scaledIcon2);
        
        ImageIcon icon3 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\Howlers.jpg");
        Image img3 = icon3.getImage();
        Image imgScale3 = img3.getScaledInstance(poster2.getWidth(), poster2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon3 = new ImageIcon (imgScale3);
        poster2.setIcon(scaledIcon3);
        
        ImageIcon icon4 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\sb19.jpg");
        Image img4 = icon4.getImage();
        Image imgScale4 = img4.getScaledInstance(poster3.getWidth(), poster3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon4 = new ImageIcon (imgScale4);
        poster3.setIcon(scaledIcon4);
        
        ImageIcon icon5 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\sb.jpg");
        Image img5 = icon5.getImage();
        Image imgScale5 = img5.getScaledInstance(poster4.getWidth(), poster4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon5 = new ImageIcon (imgScale5);
        poster4.setIcon(scaledIcon5);
        
        ImageIcon icon6 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\juans.jpg");
        Image img6 = icon6.getImage();
        Image imgScale6 = img6.getScaledInstance(poster5.getWidth(), poster5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon6 = new ImageIcon (imgScale6);
        poster5.setIcon(scaledIcon6);
        
        ImageIcon icon7 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\ikon.jpg");
        Image img7 = icon7.getImage();
        Image imgScale7 = img7.getScaledInstance(poster6.getWidth(), poster6.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon7 = new ImageIcon (imgScale7);
        poster6.setIcon(scaledIcon7);
        
        ImageIcon icon8 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\tbz.jpg");
        Image img8 = icon8.getImage();
        Image imgScale8 = img8.getScaledInstance(poster7.getWidth(), poster7.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon8 = new ImageIcon (imgScale8);
        poster7.setIcon(scaledIcon8);
        
        ImageIcon icon9 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\off.jpg");
        Image img9 = icon9.getImage();
        Image imgScale9 = img9.getScaledInstance(poster8.getWidth(), poster8.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon9 = new ImageIcon (imgScale9);
        poster8.setIcon(scaledIcon9);
       
        ImageIcon icon10 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\fest.jpg");
        Image img10 = icon10.getImage();
        Image imgScale10 = img10.getScaledInstance(poster9.getWidth(), poster9.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon10 = new ImageIcon (imgScale10);
        poster9.setIcon(scaledIcon10);
        
        ImageIcon icon11 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\dhruv.jpg");
        Image img11 = icon11.getImage();
        Image imgScale11 = img11.getScaledInstance(poster10.getWidth(), poster10.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon11 = new ImageIcon (imgScale11);
        poster10.setIcon(scaledIcon11);
        
        ImageIcon icon12 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\odd.jpg");
        Image img12 = icon12.getImage();
        Image imgScale12 = img12.getScaledInstance(poster11.getWidth(), poster11.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon12 = new ImageIcon (imgScale12);
        poster11.setIcon(scaledIcon12);
        
        ImageIcon icon13 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\super.jpg");
        Image img13 = icon13.getImage();
        Image imgScale13 = img13.getScaledInstance(poster12.getWidth(), poster12.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon13 = new ImageIcon (imgScale13);
        poster12.setIcon(scaledIcon13);
    }
    
// Creating components and its layout
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        SearchField = new javax.swing.JTextField();
        menu = new javax.swing.JComboBox<>();
        poster1 = new javax.swing.JLabel();
        poster2 = new javax.swing.JLabel();
        poster3 = new javax.swing.JLabel();
        poster4 = new javax.swing.JLabel();
        poster5 = new javax.swing.JLabel();
        thejuans = new javax.swing.JButton();
        sgxbam = new javax.swing.JButton();
        sb19 = new javax.swing.JButton();
        howlers = new javax.swing.JButton();
        nmixx = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        poster6 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cravity = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        poster7 = new javax.swing.JLabel();
        poster8 = new javax.swing.JLabel();
        poster9 = new javax.swing.JLabel();
        poster10 = new javax.swing.JLabel();
        poster11 = new javax.swing.JLabel();
        oddlove = new javax.swing.JButton();
        dhruv = new javax.swing.JButton();
        ssfest = new javax.swing.JButton();
        ikon = new javax.swing.JButton();
        theboyz = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        poster12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        thesstage = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Events");
        setMaximizedBounds(new java.awt.Rectangle(1, 0, 1620, 900));
        setMaximumSize(new java.awt.Dimension(1620, 900));
        setMinimumSize(new java.awt.Dimension(1620, 900));
        setName("Main_2Frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1620, 900));
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

        poster1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(poster1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 214, 268));

        poster2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(poster2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 214, 268));

        poster3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(poster3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 214, 268));

        poster4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(poster4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 214, 268));

        poster5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(poster5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 110, 214, 268));

        thejuans.setBackground(new java.awt.Color(255, 94, 126));
        thejuans.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        thejuans.setForeground(new java.awt.Color(255, 255, 255));
        thejuans.setText("Buy Tickets");
        thejuans.setBorder(null);
        thejuans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thejuansActionPerformed(evt);
            }
        });
        getContentPane().add(thejuans, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 420, 214, 35));

        sgxbam.setBackground(new java.awt.Color(255, 94, 126));
        sgxbam.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        sgxbam.setForeground(new java.awt.Color(255, 255, 255));
        sgxbam.setText("Buy Tickets");
        sgxbam.setBorder(null);
        sgxbam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sgxbamActionPerformed(evt);
            }
        });
        getContentPane().add(sgxbam, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 420, 214, 35));

        sb19.setBackground(new java.awt.Color(255, 94, 126));
        sb19.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        sb19.setForeground(new java.awt.Color(255, 255, 255));
        sb19.setText("Buy Tickets");
        sb19.setBorder(null);
        sb19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sb19ActionPerformed(evt);
            }
        });
        getContentPane().add(sb19, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 214, 35));

        howlers.setBackground(new java.awt.Color(255, 94, 126));
        howlers.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        howlers.setForeground(new java.awt.Color(255, 255, 255));
        howlers.setText("Buy Tickets");
        howlers.setBorder(null);
        howlers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                howlersActionPerformed(evt);
            }
        });
        getContentPane().add(howlers, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 214, 35));

        nmixx.setBackground(new java.awt.Color(255, 94, 126));
        nmixx.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        nmixx.setForeground(new java.awt.Color(255, 255, 255));
        nmixx.setText("Buy Tickets");
        nmixx.setBorder(null);
        nmixx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmixxActionPerformed(evt);
            }
        });
        getContentPane().add(nmixx, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 214, 35));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NMIXX: Showcase Tour");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 214, 23));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HOWLERS Manila");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 214, 23));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SB19 PAGTATAG! Tour");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 214, 23));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SarahG X Bamboo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, 214, 23));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("The Juans: LIVE in Cebu");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 390, 214, 23));

        poster6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(poster6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 110, 214, 268));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cravity: MASTERPIECE Tour");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 390, 214, 23));

        cravity.setBackground(new java.awt.Color(255, 94, 126));
        cravity.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        cravity.setForeground(new java.awt.Color(255, 255, 255));
        cravity.setText("Buy Tickets");
        cravity.setBorder(null);
        cravity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cravityActionPerformed(evt);
            }
        });
        getContentPane().add(cravity, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 420, 214, 35));

        backbtn.setBackground(new java.awt.Color(255, 94, 126));
        backbtn.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("BACK");
        backbtn.setBorder(null);
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 80, 110, 20));

        poster7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(poster7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 214, 268));

        poster8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(poster8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 214, 268));

        poster9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(poster9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 214, 268));

        poster10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(poster10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, 214, 268));

        poster11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(poster11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 470, 214, 268));

        oddlove.setBackground(new java.awt.Color(255, 94, 126));
        oddlove.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        oddlove.setForeground(new java.awt.Color(255, 255, 255));
        oddlove.setText("Buy Tickets");
        oddlove.setBorder(null);
        oddlove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oddloveActionPerformed(evt);
            }
        });
        getContentPane().add(oddlove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 780, 214, 35));

        dhruv.setBackground(new java.awt.Color(255, 94, 126));
        dhruv.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        dhruv.setForeground(new java.awt.Color(255, 255, 255));
        dhruv.setText("Buy Tickets");
        dhruv.setBorder(null);
        dhruv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dhruvActionPerformed(evt);
            }
        });
        getContentPane().add(dhruv, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 780, 214, 35));

        ssfest.setBackground(new java.awt.Color(255, 94, 126));
        ssfest.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        ssfest.setForeground(new java.awt.Color(255, 255, 255));
        ssfest.setText("Buy Tickets");
        ssfest.setBorder(null);
        ssfest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssfestActionPerformed(evt);
            }
        });
        getContentPane().add(ssfest, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 780, 214, 35));

        ikon.setBackground(new java.awt.Color(255, 94, 126));
        ikon.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        ikon.setForeground(new java.awt.Color(255, 255, 255));
        ikon.setText("Buy Tickets");
        ikon.setBorder(null);
        ikon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ikonActionPerformed(evt);
            }
        });
        getContentPane().add(ikon, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 780, 214, 35));

        theboyz.setBackground(new java.awt.Color(255, 94, 126));
        theboyz.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        theboyz.setForeground(new java.awt.Color(255, 255, 255));
        theboyz.setText("Buy Tickets");
        theboyz.setBorder(null);
        theboyz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theboyzActionPerformed(evt);
            }
        });
        getContentPane().add(theboyz, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 780, 214, 35));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("The Boyz: 2nd World Tour");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 750, 214, 23));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("iKON: Take Off Tour");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 750, 214, 23));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Southside Rythm Fest");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 750, 214, 23));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("DHRUV Live in MANILA");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 750, 214, 23));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Taeyon: The Odd of Love");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 750, 214, 23));

        poster12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(poster12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 470, 214, 268));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("The Super Stage");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 750, 214, 23));

        thesstage.setBackground(new java.awt.Color(255, 94, 126));
        thesstage.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        thesstage.setForeground(new java.awt.Color(255, 255, 255));
        thesstage.setText("Buy Tickets");
        thesstage.setBorder(null);
        thesstage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thesstageActionPerformed(evt);
            }
        });
        getContentPane().add(thesstage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 780, 214, 35));

        bg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1550, 850));

        getAccessibleContext().setAccessibleName("Concert Seat Reservation");

        pack();
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

    private void thejuansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thejuansActionPerformed
        // TODO add your handling code here:
        TheJuans tj = new TheJuans();
        tj.show();
        dispose();
    }//GEN-LAST:event_thejuansActionPerformed

    private void sgxbamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sgxbamActionPerformed
        // TODO add your handling code here:
        SarahGxBamboo sb = new SarahGxBamboo();
        sb.show();
        dispose();
    }//GEN-LAST:event_sgxbamActionPerformed

    private void sb19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sb19ActionPerformed
        // TODO add your handling code here:
        SB19 sb19 = new SB19();
        sb19.show();
        dispose();
    }//GEN-LAST:event_sb19ActionPerformed

    private void howlersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_howlersActionPerformed
        // TODO add your handling code here:
        Howlers hl = new Howlers();
        hl.show();
        dispose();
    }//GEN-LAST:event_howlersActionPerformed

    private void nmixxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmixxActionPerformed
        // TODO add your handling code here:
        NMixx nm = new NMixx();
        nm.show();
        dispose();
    }//GEN-LAST:event_nmixxActionPerformed

    private void cravityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cravityActionPerformed
        // TODO add your handling code here:
        Cravity cv = new Cravity();
        cv.show();
        dispose();
    }//GEN-LAST:event_cravityActionPerformed

    private void oddloveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oddloveActionPerformed
        // TODO add your handling code here:
        Taeyeon ty = new Taeyeon();
        ty.show();
        dispose();
    }//GEN-LAST:event_oddloveActionPerformed

    private void dhruvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dhruvActionPerformed
        // TODO add your handling code here:
        Dhruv dv = new Dhruv();
        dv.show();
        dispose();
    }//GEN-LAST:event_dhruvActionPerformed

    private void ssfestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssfestActionPerformed
        // TODO add your handling code here:
        SSRFest sr = new SSRFest();
        sr.show();
        dispose();
    }//GEN-LAST:event_ssfestActionPerformed

    private void ikonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ikonActionPerformed
        // TODO add your handling code here:
        IKon ik = new IKon();
        ik.show();
        dispose();
    }//GEN-LAST:event_ikonActionPerformed

    private void theboyzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theboyzActionPerformed
        // TODO add your handling code here:
        The_Boyz tb = new The_Boyz();
        tb.show();
        dispose();
    }//GEN-LAST:event_theboyzActionPerformed

    private void thesstageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thesstageActionPerformed
        // TODO add your handling code here:
        SuperStage ss = new SuperStage();
        ss.show();
        dispose();
    }//GEN-LAST:event_thesstageActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        Main mn = new Main();
        mn.show();
        dispose();
    }//GEN-LAST:event_backbtnActionPerformed

// Main Method
    public static void main(String args[]) {
        Main df = new Main();
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SearchField;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel bg;
    private javax.swing.JButton cravity;
    private javax.swing.JButton dhruv;
    private javax.swing.JButton howlers;
    private javax.swing.JButton ikon;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> menu;
    private javax.swing.JLabel name;
    private javax.swing.JButton nmixx;
    private javax.swing.JButton oddlove;
    private javax.swing.JLabel poster1;
    private javax.swing.JLabel poster10;
    private javax.swing.JLabel poster11;
    private javax.swing.JLabel poster12;
    private javax.swing.JLabel poster2;
    private javax.swing.JLabel poster3;
    private javax.swing.JLabel poster4;
    private javax.swing.JLabel poster5;
    private javax.swing.JLabel poster6;
    private javax.swing.JLabel poster7;
    private javax.swing.JLabel poster8;
    private javax.swing.JLabel poster9;
    private javax.swing.JButton sb19;
    private javax.swing.JButton sgxbam;
    private javax.swing.JButton ssfest;
    private javax.swing.JButton theboyz;
    private javax.swing.JButton thejuans;
    private javax.swing.JButton thesstage;
    // End of variables declaration//GEN-END:variables

// Logo package
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
// END