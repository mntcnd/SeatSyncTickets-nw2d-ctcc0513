package ConcertSeatReservation_System;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Receipt extends javax.swing.JFrame {

    public Receipt() {
        initComponents();
        Receipt();
        setIconImage();

        balance.setEditable(false);
}
    public void Receipt (){
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
        
        ImageIcon icon2 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\code.gif");
        Image img2 = icon2.getImage();
        Image imgScale2 = img2.getScaledInstance(code.getWidth(), code.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon (imgScale2);
        code.setIcon(scaledIcon2);       
    }
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        menu = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tierlabel = new javax.swing.JLabel();
        sectionlabel = new javax.swing.JLabel();
        rowlabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        subtot = new javax.swing.JLabel();
        seatlabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ppertix = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tiercsec = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        nrlabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        accnum = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cash = new javax.swing.JTextField();
        paybtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        balance = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        twice3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        shown = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        datime = new javax.swing.JLabel();
        tiertix = new javax.swing.JLabel();
        sectiontix = new javax.swing.JLabel();
        rowtix = new javax.swing.JLabel();
        seattix = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        venue = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tixprice = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        admit = new javax.swing.JLabel();
        code = new javax.swing.JLabel();
        poster = new javax.swing.JLabel();
        dandt = new javax.swing.JLabel();
        showlabel1 = new javax.swing.JLabel();
        ven = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        showlabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, -1));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("ORDER SUMMARY");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tierlabel.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        tierlabel.setForeground(new java.awt.Color(255, 255, 255));
        tierlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tierlabel.setText("TIER");
        jPanel3.add(tierlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 110, -1));

        sectionlabel.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        sectionlabel.setForeground(new java.awt.Color(255, 255, 255));
        sectionlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sectionlabel.setText("section");
        jPanel3.add(sectionlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        rowlabel.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        rowlabel.setForeground(new java.awt.Color(255, 255, 255));
        rowlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rowlabel.setText("row ");
        jPanel3.add(rowlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, 30));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("____________________________________________________");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 670, -1));

        subtot.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        subtot.setForeground(new java.awt.Color(255, 255, 255));
        subtot.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtot.setText("PHP 0.00");
        jPanel3.add(subtot, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 255, -1));

        seatlabel.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        seatlabel.setForeground(new java.awt.Color(255, 255, 255));
        seatlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        seatlabel.setText("seat");
        jPanel3.add(seatlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Price Per Ticket");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Sub Total");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        ppertix.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        ppertix.setForeground(new java.awt.Color(255, 255, 255));
        ppertix.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ppertix.setText("PHP 0.00");
        jPanel3.add(ppertix, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 255, -1));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Online Fee");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("PHP 100.00");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 204, -1));

        total.setBackground(new java.awt.Color(255, 204, 204));
        total.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total.setText("PHP 0.00");
        jPanel3.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 232, -1));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("______________________");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 609, -1));

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Choose Payment Method:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));

        tiercsec.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        tiercsec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Master Card", "Visa", "GCash", "Maya" }));
        tiercsec.setSelectedIndex(-1);
        tiercsec.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.add(tiercsec, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 585, 43));

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Total");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 131, -1));

        nrlabel.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        nrlabel.setForeground(new java.awt.Color(255, 255, 255));
        nrlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nrlabel.setText("x");
        nrlabel.setToolTipText("");
        jPanel3.add(nrlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Account Number:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 46, 312, -1));

        accnum.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jPanel3.add(accnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 80, 458, 37));

        jLabel15.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Cash:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 312, -1));

        cash.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jPanel3.add(cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 458, 37));

        paybtn.setBackground(new java.awt.Color(255, 94, 126));
        paybtn.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        paybtn.setForeground(new java.awt.Color(255, 255, 255));
        paybtn.setText("PAY");
        paybtn.setBorder(null);
        paybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paybtnActionPerformed(evt);
            }
        });
        jPanel3.add(paybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 160, 190, 37));

        jLabel16.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Balance:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 312, 40));

        balance.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jPanel3.add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, 458, 40));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        twice3.setBackground(new java.awt.Color(255, 94, 126));
        twice3.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        twice3.setForeground(new java.awt.Color(255, 255, 255));
        twice3.setText("PRINT TICKET");
        twice3.setBorder(null);
        twice3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twice3ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shown.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        shown.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(shown, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 400, 20));

        jLabel17.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("SEATSYNC TICKETS");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 18, 351, -1));

        jLabel18.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("SHOW");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel27.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("DATE & TIME");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        datime.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        datime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(datime, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, 20));

        tiertix.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        tiertix.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(tiertix, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, 20));

        sectiontix.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        sectiontix.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(sectiontix, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 190, 20));

        rowtix.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        rowtix.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(rowtix, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 210, 20));

        seattix.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        seattix.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(seattix, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 210, 20));

        jLabel37.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("VENUE");
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        venue.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        venue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(venue, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 220, 20));

        jLabel39.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("------------------------------------");
        jPanel4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel40.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel40.setText("------------------------------------");
        jPanel4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel19.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("TICKET PRICE");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        tixprice.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        tixprice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(tixprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 120, 20));

        jLabel21.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("ADMIT");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        admit.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        admit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(admit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 80, 20));
        jPanel4.add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 170, 40));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(twice3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(twice3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 666, -1));

        poster.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 30)); // NOI18N
        poster.setForeground(new java.awt.Color(255, 255, 255));
        poster.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        poster.setText("Show");
        poster.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel3.add(poster, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 210, 270));

        dandt.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        dandt.setForeground(new java.awt.Color(255, 255, 255));
        dandt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dandt.setText("datime");
        jPanel3.add(dandt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 350, 40));

        showlabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        showlabel1.setForeground(new java.awt.Color(255, 255, 255));
        showlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showlabel1.setText("show");
        jPanel3.add(showlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 350, 50));

        ven.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        ven.setForeground(new java.awt.Color(255, 255, 255));
        ven.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ven.setText("venue");
        jPanel3.add(ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 350, 40));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("______________________________________________");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 590, -1));

        showlabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        showlabel.setForeground(new java.awt.Color(255, 255, 255));
        showlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showlabel.setText("show");
        jPanel3.add(showlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 350, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 1440, 610));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("_________________________________________________________________________________________________________________");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 1450, -1));

        bg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1550, 850));

        getAccessibleContext().setAccessibleName("Concert Seat Reservation");
        getAccessibleContext().setAccessibleDescription("SELECT SECTION");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        if (menu.getSelectedItem() == "Home"){
        Main mn = new Main();
        mn.show();  
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

    private void paybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paybtnActionPerformed

        double pay = Double.parseDouble(cash.getText());
        double a = 10450.00;
        double b = 28000.00;
        double c = 31150.00;
        double d = 7750.00;
        double e = 15400.00;
        double f = 23050.00;
        double g = 4650.00;
        double h = 9200.00;
        double i = 13750.00;
        double j = 1850.00;
        double k = 3600.00;
        double l = 5250.00;
        
        if (total.getText().equals("Php 10450.00")){
            balance.setText("" + (pay - a));}
        
        if (total.getText().equals("Php 28000.00")){
            balance.setText("" + (pay - b));}
        
        if (total.getText().equals("Php 31150.00")){
            balance.setText("" + (pay - c));}
        
        if (total.getText().equals("Php 7750.00")){
            balance.setText("" + (pay - d));}
        
        if (total.getText().equals("Php 15400.00")){
            balance.setText("" + (pay - e));}
        
        if (total.getText().equals("Php 23050.00")){
            balance.setText("" + (pay - f));}
        
        if (total.getText().equals("Php 4650.00")){
            balance.setText("" + (pay - g));}
        
        if (total.getText().equals("Php 9200.00")){
            balance.setText("" + (pay - h));}
        
        if (total.getText().equals("Php 13750.00")){
            balance.setText("" + (pay - i));}
        
        if (total.getText().equals("Php 1850.00")){
            balance.setText("" + (pay - j));}
        
        if (total.getText().equals("Php 3600.00")){
            balance.setText("" + (pay - k));}
        
        if (total.getText().equals("Php 5250.00")){
            balance.setText("" + (pay - l));}
        
        Tickets_RandS trs = new Tickets_RandS();
        
        String s1 = "Twice: Ready To Be";
        String s2 = "TomorrowXTogether";
        String s3 = "Howlers Live in Manila";
        String s4 = "SB19 Pagtatag! World";
        String s5 = "Sarah G x Bamboo";
        String s6 = "The Juans";
        String s7 = "Cravity: World Tour";
        String s8 = "The Boyz: 'Zeneration'";
        String s9 = "iKon: 'Take Off'";
        String s10 = "Southside Rythm Fest";
        String s11 = "Dhruv Live in";
        String s12 = "Taeyeon: 'The Odd of";
        String s13 = "The Super Stage";
        String s14 = "NMixx: Nice To Mixx";
        
        if (showlabel.getText().equals(s1)){
            shown.setText("Twice: Ready To Be World Tour"); 
            datime.setText("09/30/2023, 7:00PM");
            venue.setText("Philippine Arena, Bulacan");}
            
        if (showlabel.getText().equals(s2)){
            shown.setText("TXT: ACT - Sweet Mirage World Tour"); 
            datime.setText("07/13/2023, 7:00PM");
            venue.setText("Philippine Arena, Bulacan");}
            
        if (showlabel.getText().equals(s3)){
            shown.setText("Howlers Manila 2.0"); 
            datime.setText("07/01/2023, 7:00PM"); 
            venue.setText("Circuit Makati, Manila");}
            
        if (showlabel.getText().equals(s4)){
            shown.setText("SB19 Pagtatag! World Tour"); 
            datime.setText("07/05/2023, 7:00PM"); 
            venue.setText("SMX Convention Center");}
            
        if (showlabel.getText().equals(s5)){
            shown.setText("Sarah G x Bamboo"); 
            datime.setText("07/07/2023, 7:00PM"); 
            venue.setText("Araneta Coliseum");}
            
        if (showlabel.getText().equals(s6)){
            shown.setText("The Juans LIVE in Cebu"); 
            dandt.setText("07/08/2023, 7:00PM"); 
            venue.setText("Waterfront Hotel, Cebu");}
            
        if (showlabel.getText().equals(s7)){
            shown.setText("Cravity: 'Masterpiece' World Tour"); 
            datime.setText("08/05/2023, 7:00PM"); 
            venue.setText("New Front Theater");}
            
        if (showlabel.getText().equals(s8)){
            shown.setText("The Boyz: 'Zeneration' 2nd World Tour"); 
            datime.setText("07/15/2023, 6:00PM"); 
            venue.setText("Araneta Coliseum");}
            
        if (showlabel.getText().equals(s9)){
            shown.setText("iKon: 'Take Off' World Tour"); 
            datime.setText("08/05/2023, 6:00PM"); 
            venue.setText("Araneta Coliseum");}
            
        if (showlabel.getText().equals(s10)){
            shown.setText("Southside Rythm Fest"); 
            datime.setText("07/22/2023, 6:00PM");
            venue.setText("Di Mare Openfield, Cebu");}
            
        if (showlabel.getText().equals(s11)){
            shown.setText("Dhruv Live in Manila"); 
            datime.setText("07/25/2023, 8:00PM");
            venue.setText("The Podium Hall");}
            
        if (showlabel.getText().equals(s12)){
            shown.setText("Taeyeon: The Odd of Love Tour"); 
            datime.setText("07/30/2023, 5:00PM");
             venue.setText("Araneta Coliseum");}
            
        if (showlabel.getText().equals(s13)){
            shown.setText("The Super Stage by KPop"); 
            datime.setText("08/11/2023, 7:00PM");
            venue.setText("Mall of Asia Arena");}
            
        if (showlabel.getText().equals(s14)){
            shown.setText("NMixx: Nice To Mixx You Showcase Tour"); 
            datime.setText("07/01/2023, 7:00PM"); 
            venue.setText("New Frontier Theater");}
        
        tiertix.setText("" + tierlabel.getText());
        sectiontix.setText("" + sectionlabel.getText());
        rowtix.setText("" + rowlabel.getText());
        seattix.setText("" + seatlabel.getText());
        tixprice.setText("" + total.getText());
        admit.setText("" + nrlabel.getText());
    }//GEN-LAST:event_paybtnActionPerformed

    private void twice3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twice3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twice3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Main df = new Main();
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accnum;
    private javax.swing.JLabel admit;
    private javax.swing.JTextField balance;
    private javax.swing.JLabel bg;
    private javax.swing.JTextField cash;
    private javax.swing.JLabel code;
    public javax.swing.JLabel dandt;
    public javax.swing.JLabel datime;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> menu;
    private javax.swing.JLabel name;
    public javax.swing.JLabel nrlabel;
    private javax.swing.JButton paybtn;
    public javax.swing.JLabel poster;
    public javax.swing.JLabel ppertix;
    public javax.swing.JLabel rowlabel;
    private javax.swing.JLabel rowtix;
    public javax.swing.JLabel seatlabel;
    private javax.swing.JLabel seattix;
    public javax.swing.JLabel sectionlabel;
    private javax.swing.JLabel sectiontix;
    public javax.swing.JLabel showlabel;
    public javax.swing.JLabel showlabel1;
    public javax.swing.JLabel shown;
    public javax.swing.JLabel subtot;
    public javax.swing.JComboBox<String> tiercsec;
    public javax.swing.JLabel tierlabel;
    private javax.swing.JLabel tiertix;
    private javax.swing.JLabel tixprice;
    public javax.swing.JLabel total;
    private javax.swing.JButton twice3;
    public javax.swing.JLabel ven;
    public javax.swing.JLabel venue;
    // End of variables declaration//GEN-END:variables
private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}

