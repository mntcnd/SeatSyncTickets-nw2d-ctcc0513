package ConcertSeatReservation_System;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Tickets_Tiers extends javax.swing.JFrame {

    public Tickets_Tiers() {
        initComponents();
        Tickets_Tiers();
        setIconImage();
    }

    public void Tickets_Tiers (){
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        menu = new javax.swing.JComboBox<>();
        ctier = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        atier = new javax.swing.JLabel();
        tierasec = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tiera = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btier = new javax.swing.JLabel();
        tierbsec = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tierb = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        dtier = new javax.swing.JLabel();
        tierdsec = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tierd = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        cctier = new javax.swing.JLabel();
        tiercsec = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tierc = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        atier1 = new javax.swing.JLabel();
        eventchosen = new javax.swing.JComboBox<>();
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
        setTitle("Tickets");
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
                .addGap(518, 518, 518)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, -1));

        ctier.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        ctier.setForeground(new java.awt.Color(255, 255, 255));
        ctier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ctier.setText("_________________________________________________________________________________________________________________");
        getContentPane().add(ctier, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 1450, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        atier.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        atier.setForeground(new java.awt.Color(255, 255, 255));
        atier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        atier.setText("TIER A");

        tierasec.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        tierasec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Section 100", "Section 101", "Section 102", "Section 103", "Section 104", "Section 105", "Section 106", "Section 107", "Section 108", "Section 109", "Section 110", " " }));
        tierasec.setSelectedIndex(-1);
        tierasec.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("price");

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("PHP 10, 350.00");

        tiera.setBackground(new java.awt.Color(255, 94, 126));
        tiera.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        tiera.setForeground(new java.awt.Color(255, 255, 255));
        tiera.setText("Select Seats");
        tiera.setBorder(null);
        tiera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tieraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(307, 307, 307)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(atier, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tierasec, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tiera, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(atier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tierasec, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tiera, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        tierasec.getAccessibleContext().setAccessibleDescription("SELECT SECTION");

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 690, 220));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("TICKETS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        btier.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        btier.setForeground(new java.awt.Color(255, 255, 255));
        btier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btier.setText("TIER B");

        tierbsec.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        tierbsec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Section 200", "Section 201", "Section 202", "Section 203", "Section 204", "Section 205", "Section 206", "Section 207", "Section 208", "Section 209", "Section 210", " " }));
        tierbsec.setSelectedIndex(-1);
        tierbsec.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("price");

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("PHP 7, 650.00");

        tierb.setBackground(new java.awt.Color(255, 94, 126));
        tierb.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        tierb.setForeground(new java.awt.Color(255, 255, 255));
        tierb.setText("Select Seats");
        tierb.setBorder(null);
        tierb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tierbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tierb, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tierbsec, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btier)
                                .addComponent(jLabel9))
                            .addGap(233, 233, 233)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tierbsec, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tierb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 690, 220));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        dtier.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        dtier.setForeground(new java.awt.Color(255, 255, 255));
        dtier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dtier.setText("TIER D");

        tierdsec.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        tierdsec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Section 400", "Section 401", "Section 402", "Section 403", "Section 404", "Section 405", "Section 406", "Section 407", "Section 408", "Section 409", "Section 410", " " }));
        tierdsec.setSelectedIndex(-1);
        tierdsec.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel15.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("price");

        jLabel16.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("PHP 1, 750.00");

        tierd.setBackground(new java.awt.Color(255, 94, 126));
        tierd.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        tierd.setForeground(new java.awt.Color(255, 255, 255));
        tierd.setText("Select Seats");
        tierd.setBorder(null);
        tierd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tierdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tierd, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtier)
                            .addComponent(jLabel15))
                        .addGap(233, 233, 233)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tierdsec, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(dtier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tierdsec, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tierd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 590, -1, 220));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        cctier.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        cctier.setForeground(new java.awt.Color(255, 255, 255));
        cctier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cctier.setText("TIER C");

        tiercsec.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        tiercsec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Section 300", "Section 301", "Section 302", "Section 303", "Section 304", "Section 305", "Section 306", "Section 307", "Section 308", "Section 309", "Section 310", " " }));
        tiercsec.setSelectedIndex(-1);
        tiercsec.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("price");

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("PHP 4, 550.00");

        tierc.setBackground(new java.awt.Color(255, 94, 126));
        tierc.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        tierc.setForeground(new java.awt.Color(255, 255, 255));
        tierc.setText("Select Seats");
        tierc.setBorder(null);
        tierc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiercActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(307, 307, 307)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
                    .addComponent(cctier, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tiercsec, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tierc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(cctier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tiercsec, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tierc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, 220));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        atier1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        atier1.setForeground(new java.awt.Color(255, 255, 255));
        atier1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        atier1.setText("Show");

        eventchosen.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        eventchosen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Twice Ready To Be World Tour", "TXT ACT Sweet Mirage Tour", "NMixx Nice To Mixx You Showcase Tour", "Howlers Manila 2.0", "SB19 Pagtatag! World Tour", "Sarah G x Bamboo", "The Juans LIVE in Cebu", "Cravity Masterpiece World Tour", "The Boyz 'Zeneration' 2nd World Tour", "iKon Take Off Tour", "Southside Rythm Fest", "Dhruv Live in Manila", "Taeyeon The Odd of Love Tour", "The Super Stage by KPop" }));
        eventchosen.setSelectedIndex(-1);
        eventchosen.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atier1)
                    .addComponent(eventchosen, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(atier1)
                .addGap(9, 9, 9)
                .addComponent(eventchosen, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 1440, 140));

        bg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1550, 850));

        getAccessibleContext().setAccessibleName("Concert Seat Reservation");
        getAccessibleContext().setAccessibleDescription("SELECT SECTION");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void tieraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tieraActionPerformed
        // TODO add your handling code here:
        Tickets_RandS trs = new Tickets_RandS();
        trs.show.setText(eventchosen.getSelectedItem().toString());
        trs.tier.setText(atier.getText());
        trs.section.setText(tierasec.getSelectedItem().toString());
        trs.show();
        dispose();
    }//GEN-LAST:event_tieraActionPerformed

    private void tierbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tierbActionPerformed
        // TODO add your handling code here:
        Tickets_RandS trs = new Tickets_RandS();
        trs.show.setText(eventchosen.getSelectedItem().toString());
        trs.tier.setText(btier.getText());
        trs.section.setText(tierbsec.getSelectedItem().toString());
        trs.show();
        dispose();
    }//GEN-LAST:event_tierbActionPerformed

    private void tierdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tierdActionPerformed
        // TODO add your handling code here:
        Tickets_RandS trs = new Tickets_RandS();
        trs.show.setText(eventchosen.getSelectedItem().toString());
        trs.tier.setText(dtier.getText());
        trs.section.setText(tierdsec.getSelectedItem().toString());
        trs.show();
        dispose();
    }//GEN-LAST:event_tierdActionPerformed

    private void tiercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiercActionPerformed
        // TODO add your handling code here:
        Tickets_RandS trs = new Tickets_RandS();
        trs.show.setText(eventchosen.getSelectedItem().toString());
        trs.tier.setText(cctier.getText());
        trs.section.setText(tiercsec.getSelectedItem().toString());
        trs.show();
        dispose();
    }//GEN-LAST:event_tiercActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Main df = new Main();
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tickets_Tiers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel atier;
    public javax.swing.JLabel atier1;
    private javax.swing.JLabel bg;
    public javax.swing.JLabel btier;
    public javax.swing.JLabel cctier;
    private javax.swing.JLabel ctier;
    public javax.swing.JLabel dtier;
    public javax.swing.JComboBox<String> eventchosen;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> menu;
    private javax.swing.JLabel name;
    private javax.swing.JButton tiera;
    public javax.swing.JComboBox<String> tierasec;
    private javax.swing.JButton tierb;
    public javax.swing.JComboBox<String> tierbsec;
    private javax.swing.JButton tierc;
    public javax.swing.JComboBox<String> tiercsec;
    private javax.swing.JButton tierd;
    public javax.swing.JComboBox<String> tierdsec;
    // End of variables declaration//GEN-END:variables
private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}

