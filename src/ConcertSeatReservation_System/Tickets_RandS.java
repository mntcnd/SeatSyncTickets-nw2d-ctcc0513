package ConcertSeatReservation_System;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tickets_RandS extends javax.swing.JFrame {

    public Tickets_RandS() {
        initComponents();
        Tickets_RandS();
        setIconImage();
    }
    
    public void addtable(String row, String seat){
       DefaultTableModel dt = (DefaultTableModel) rowandseat.getModel();

// Adding values to table
       Vector v = new Vector();
       v.add(row);
       v.add(seat);
       
       dt.addRow(v);
    }

    public void Tickets_RandS (){
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
        jLabel5 = new javax.swing.JLabel();
        tier = new javax.swing.JLabel();
        section = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rowandseat = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        twice = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn35 = new javax.swing.JButton();
        btn36 = new javax.swing.JButton();
        btn37 = new javax.swing.JButton();
        btn38 = new javax.swing.JButton();
        btn39 = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btn41 = new javax.swing.JButton();
        btn42 = new javax.swing.JButton();
        btn43 = new javax.swing.JButton();
        btn44 = new javax.swing.JButton();
        btn45 = new javax.swing.JButton();
        btn46 = new javax.swing.JButton();
        btn47 = new javax.swing.JButton();
        btn48 = new javax.swing.JButton();
        btn49 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();
        btn51 = new javax.swing.JButton();
        btn52 = new javax.swing.JButton();
        btn53 = new javax.swing.JButton();
        btn54 = new javax.swing.JButton();
        btn55 = new javax.swing.JButton();
        btn56 = new javax.swing.JButton();
        btn57 = new javax.swing.JButton();
        btn58 = new javax.swing.JButton();
        btn59 = new javax.swing.JButton();
        btn60 = new javax.swing.JButton();
        btn61 = new javax.swing.JButton();
        btn62 = new javax.swing.JButton();
        btn63 = new javax.swing.JButton();
        btn64 = new javax.swing.JButton();
        btn65 = new javax.swing.JButton();
        btn66 = new javax.swing.JButton();
        btn67 = new javax.swing.JButton();
        btn68 = new javax.swing.JButton();
        btn69 = new javax.swing.JButton();
        btn70 = new javax.swing.JButton();
        btn71 = new javax.swing.JButton();
        btn72 = new javax.swing.JButton();
        btn73 = new javax.swing.JButton();
        btn74 = new javax.swing.JButton();
        btn75 = new javax.swing.JButton();
        btn76 = new javax.swing.JButton();
        btn77 = new javax.swing.JButton();
        btn78 = new javax.swing.JButton();
        btn79 = new javax.swing.JButton();
        btn80 = new javax.swing.JButton();
        btn81 = new javax.swing.JButton();
        btn82 = new javax.swing.JButton();
        btn83 = new javax.swing.JButton();
        btn84 = new javax.swing.JButton();
        btn85 = new javax.swing.JButton();
        btn86 = new javax.swing.JButton();
        btn87 = new javax.swing.JButton();
        btn88 = new javax.swing.JButton();
        btn89 = new javax.swing.JButton();
        btn90 = new javax.swing.JButton();
        btn91 = new javax.swing.JButton();
        btn92 = new javax.swing.JButton();
        btn93 = new javax.swing.JButton();
        btn94 = new javax.swing.JButton();
        btn95 = new javax.swing.JButton();
        btn96 = new javax.swing.JButton();
        btn97 = new javax.swing.JButton();
        btn98 = new javax.swing.JButton();
        btn99 = new javax.swing.JButton();
        btn100 = new javax.swing.JButton();
        btn101 = new javax.swing.JButton();
        btn102 = new javax.swing.JButton();
        btn103 = new javax.swing.JButton();
        btn104 = new javax.swing.JButton();
        btn105 = new javax.swing.JButton();
        btn106 = new javax.swing.JButton();
        btn107 = new javax.swing.JButton();
        btn108 = new javax.swing.JButton();
        btn109 = new javax.swing.JButton();
        btn110 = new javax.swing.JButton();
        btn111 = new javax.swing.JButton();
        btn112 = new javax.swing.JButton();
        btn113 = new javax.swing.JButton();
        btn114 = new javax.swing.JButton();
        btn115 = new javax.swing.JButton();
        btn116 = new javax.swing.JButton();
        btn117 = new javax.swing.JButton();
        btn118 = new javax.swing.JButton();
        btn119 = new javax.swing.JButton();
        btn120 = new javax.swing.JButton();
        btn121 = new javax.swing.JButton();
        btn122 = new javax.swing.JButton();
        btn123 = new javax.swing.JButton();
        btn124 = new javax.swing.JButton();
        btn125 = new javax.swing.JButton();
        btn126 = new javax.swing.JButton();
        btn127 = new javax.swing.JButton();
        btn128 = new javax.swing.JButton();
        btn129 = new javax.swing.JButton();
        btn130 = new javax.swing.JButton();
        btn131 = new javax.swing.JButton();
        btn132 = new javax.swing.JButton();
        btn133 = new javax.swing.JButton();
        btn134 = new javax.swing.JButton();
        btn135 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        show = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
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
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, -1));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("*up to three (3) seats only");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 400, -1, -1));

        tier.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        tier.setForeground(new java.awt.Color(255, 255, 255));
        tier.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(tier, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 90, 320, 30));

        section.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        section.setForeground(new java.awt.Color(255, 255, 255));
        section.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        section.setText("Section");
        getContentPane().add(section, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 120, 320, -1));

        btn1.setBackground(new java.awt.Color(255, 94, 126));
        btn1.setBorder(null);
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 40, 40));

        jLabel19.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("STATUS");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("__________________________________");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 500, 440, -1));

        jLabel20.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("SELECT YOUR SEAT/S");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("__________________________________________________________");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 750, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        rowandseat.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        rowandseat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ROW", "SEAT"
            }
        ));
        rowandseat.setAutoscrolls(false);
        rowandseat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(rowandseat);

        jLabel21.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Selected seats");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(92, 92, 92))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel21)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 440, 510, 220));

        twice.setBackground(new java.awt.Color(255, 94, 126));
        twice.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        twice.setForeground(new java.awt.Color(255, 255, 255));
        twice.setText("CONFIRM SELECTION");
        twice.setBorder(null);
        twice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twiceActionPerformed(evt);
            }
        });
        getContentPane().add(twice, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 710, 510, 50));

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Available");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 310, -1, 40));

        btn2.setBackground(new java.awt.Color(102, 102, 102));
        btn2.setBorder(null);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 40, 40));

        btn3.setBackground(new java.awt.Color(255, 94, 126));
        btn3.setBorder(null);
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 40, 40));

        btn4.setBackground(new java.awt.Color(255, 94, 126));
        btn4.setBorder(null);
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 40, 40));

        btn5.setBackground(new java.awt.Color(255, 94, 126));
        btn5.setBorder(null);
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
        });
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 40, 40));

        btn6.setBackground(new java.awt.Color(255, 94, 126));
        btn6.setBorder(null);
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
            }
        });
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 40, 40));

        btn7.setBackground(new java.awt.Color(255, 94, 126));
        btn7.setBorder(null);
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn7MouseClicked(evt);
            }
        });
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 40, 40));

        btn8.setBackground(new java.awt.Color(255, 94, 126));
        btn8.setBorder(null);
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn8MouseClicked(evt);
            }
        });
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 40, 40));

        btn9.setBackground(new java.awt.Color(255, 94, 126));
        btn9.setBorder(null);
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn9MouseClicked(evt);
            }
        });
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 40, 40));

        btn10.setBackground(new java.awt.Color(102, 102, 102));
        btn10.setBorder(null);
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 40, 40));

        btn11.setBackground(new java.awt.Color(255, 94, 126));
        btn11.setBorder(null);
        btn11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn11MouseClicked(evt);
            }
        });
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        getContentPane().add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 40, 40));

        btn12.setBackground(new java.awt.Color(255, 94, 126));
        btn12.setBorder(null);
        btn12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn12MouseClicked(evt);
            }
        });
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        getContentPane().add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 40, 40));

        btn13.setBackground(new java.awt.Color(255, 94, 126));
        btn13.setBorder(null);
        btn13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn13MouseClicked(evt);
            }
        });
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });
        getContentPane().add(btn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 40, 40));

        btn14.setBackground(new java.awt.Color(255, 94, 126));
        btn14.setBorder(null);
        btn14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn14MouseClicked(evt);
            }
        });
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });
        getContentPane().add(btn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 40, 40));

        btn15.setBackground(new java.awt.Color(255, 94, 126));
        btn15.setBorder(null);
        btn15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn15MouseClicked(evt);
            }
        });
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });
        getContentPane().add(btn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, 40, 40));

        btn16.setBackground(new java.awt.Color(255, 94, 126));
        btn16.setBorder(null);
        btn16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn16MouseClicked(evt);
            }
        });
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });
        getContentPane().add(btn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 40, 40));

        btn17.setBackground(new java.awt.Color(255, 94, 126));
        btn17.setBorder(null);
        btn17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn17MouseClicked(evt);
            }
        });
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });
        getContentPane().add(btn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 40, 40));

        btn18.setBackground(new java.awt.Color(255, 94, 126));
        btn18.setBorder(null);
        btn18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn18MouseClicked(evt);
            }
        });
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });
        getContentPane().add(btn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 40, 40));

        btn19.setBackground(new java.awt.Color(255, 94, 126));
        btn19.setBorder(null);
        btn19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn19MouseClicked(evt);
            }
        });
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });
        getContentPane().add(btn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 40, 40));

        btn20.setBackground(new java.awt.Color(102, 102, 102));
        btn20.setBorder(null);
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });
        getContentPane().add(btn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 40, 40));

        btn21.setBackground(new java.awt.Color(255, 94, 126));
        btn21.setBorder(null);
        btn21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn21MouseClicked(evt);
            }
        });
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });
        getContentPane().add(btn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 40, 40));

        btn22.setBackground(new java.awt.Color(255, 94, 126));
        btn22.setBorder(null);
        btn22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn22MouseClicked(evt);
            }
        });
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });
        getContentPane().add(btn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 40, 40));

        btn23.setBackground(new java.awt.Color(255, 94, 126));
        btn23.setBorder(null);
        btn23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn23MouseClicked(evt);
            }
        });
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });
        getContentPane().add(btn23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 40, 40));

        btn24.setBackground(new java.awt.Color(255, 94, 126));
        btn24.setBorder(null);
        btn24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn24MouseClicked(evt);
            }
        });
        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24ActionPerformed(evt);
            }
        });
        getContentPane().add(btn24, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 40, 40));

        btn25.setBackground(new java.awt.Color(255, 94, 126));
        btn25.setBorder(null);
        btn25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn25MouseClicked(evt);
            }
        });
        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25ActionPerformed(evt);
            }
        });
        getContentPane().add(btn25, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 40, 40));

        btn26.setBackground(new java.awt.Color(102, 102, 102));
        btn26.setBorder(null);
        btn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn26ActionPerformed(evt);
            }
        });
        getContentPane().add(btn26, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 40, 40));

        btn27.setBackground(new java.awt.Color(255, 94, 126));
        btn27.setBorder(null);
        btn27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn27MouseClicked(evt);
            }
        });
        btn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn27ActionPerformed(evt);
            }
        });
        getContentPane().add(btn27, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 40, 40));

        btn28.setBackground(new java.awt.Color(255, 94, 126));
        btn28.setBorder(null);
        btn28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn28MouseClicked(evt);
            }
        });
        btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn28ActionPerformed(evt);
            }
        });
        getContentPane().add(btn28, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 40, 40));

        btn29.setBackground(new java.awt.Color(255, 94, 126));
        btn29.setBorder(null);
        btn29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn29MouseClicked(evt);
            }
        });
        btn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn29ActionPerformed(evt);
            }
        });
        getContentPane().add(btn29, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, 40, 40));

        btn30.setBackground(new java.awt.Color(102, 102, 102));
        btn30.setBorder(null);
        btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30ActionPerformed(evt);
            }
        });
        getContentPane().add(btn30, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, 40, 40));

        btn31.setBackground(new java.awt.Color(255, 94, 126));
        btn31.setBorder(null);
        btn31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn31MouseClicked(evt);
            }
        });
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });
        getContentPane().add(btn31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 40, 40));

        btn32.setBackground(new java.awt.Color(102, 102, 102));
        btn32.setBorder(null);
        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });
        getContentPane().add(btn32, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 40, 40));

        btn33.setBackground(new java.awt.Color(255, 94, 126));
        btn33.setBorder(null);
        btn33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn33MouseClicked(evt);
            }
        });
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });
        getContentPane().add(btn33, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 40, 40));

        btn34.setBackground(new java.awt.Color(255, 94, 126));
        btn34.setBorder(null);
        btn34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn34MouseClicked(evt);
            }
        });
        btn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn34ActionPerformed(evt);
            }
        });
        getContentPane().add(btn34, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 40, 40));

        btn35.setBackground(new java.awt.Color(255, 94, 126));
        btn35.setBorder(null);
        btn35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn35MouseClicked(evt);
            }
        });
        btn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn35ActionPerformed(evt);
            }
        });
        getContentPane().add(btn35, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 40, 40));

        btn36.setBackground(new java.awt.Color(255, 94, 126));
        btn36.setBorder(null);
        btn36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn36MouseClicked(evt);
            }
        });
        btn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn36ActionPerformed(evt);
            }
        });
        getContentPane().add(btn36, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 40, 40));

        btn37.setBackground(new java.awt.Color(102, 102, 102));
        btn37.setBorder(null);
        btn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn37ActionPerformed(evt);
            }
        });
        getContentPane().add(btn37, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 40, 40));

        btn38.setBackground(new java.awt.Color(102, 102, 102));
        btn38.setBorder(null);
        btn38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn38ActionPerformed(evt);
            }
        });
        getContentPane().add(btn38, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 40, 40));

        btn39.setBackground(new java.awt.Color(102, 102, 102));
        btn39.setBorder(null);
        btn39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn39ActionPerformed(evt);
            }
        });
        getContentPane().add(btn39, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 40, 40));

        btn40.setBackground(new java.awt.Color(255, 94, 126));
        btn40.setBorder(null);
        btn40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn40MouseClicked(evt);
            }
        });
        btn40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn40ActionPerformed(evt);
            }
        });
        getContentPane().add(btn40, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 40, 40));

        btn41.setBackground(new java.awt.Color(255, 94, 126));
        btn41.setBorder(null);
        btn41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn41MouseClicked(evt);
            }
        });
        btn41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn41ActionPerformed(evt);
            }
        });
        getContentPane().add(btn41, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 40, 40));

        btn42.setBackground(new java.awt.Color(255, 94, 126));
        btn42.setBorder(null);
        btn42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn42MouseClicked(evt);
            }
        });
        btn42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn42ActionPerformed(evt);
            }
        });
        getContentPane().add(btn42, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 40, 40));

        btn43.setBackground(new java.awt.Color(102, 102, 102));
        btn43.setBorder(null);
        btn43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn43ActionPerformed(evt);
            }
        });
        getContentPane().add(btn43, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 40, 40));

        btn44.setBackground(new java.awt.Color(255, 94, 126));
        btn44.setBorder(null);
        btn44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn44MouseClicked(evt);
            }
        });
        btn44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn44ActionPerformed(evt);
            }
        });
        getContentPane().add(btn44, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 40, 40));

        btn45.setBackground(new java.awt.Color(255, 94, 126));
        btn45.setBorder(null);
        btn45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn45MouseClicked(evt);
            }
        });
        btn45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn45ActionPerformed(evt);
            }
        });
        getContentPane().add(btn45, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 420, 40, 40));

        btn46.setBackground(new java.awt.Color(255, 94, 126));
        btn46.setBorder(null);
        btn46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn46MouseClicked(evt);
            }
        });
        btn46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn46ActionPerformed(evt);
            }
        });
        getContentPane().add(btn46, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 40, 40));

        btn47.setBackground(new java.awt.Color(255, 94, 126));
        btn47.setBorder(null);
        btn47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn47MouseClicked(evt);
            }
        });
        btn47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn47ActionPerformed(evt);
            }
        });
        getContentPane().add(btn47, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 40, 40));

        btn48.setBackground(new java.awt.Color(255, 94, 126));
        btn48.setBorder(null);
        btn48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn48MouseClicked(evt);
            }
        });
        btn48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn48ActionPerformed(evt);
            }
        });
        getContentPane().add(btn48, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 40, 40));

        btn49.setBackground(new java.awt.Color(255, 94, 126));
        btn49.setBorder(null);
        btn49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn49MouseClicked(evt);
            }
        });
        btn49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn49ActionPerformed(evt);
            }
        });
        getContentPane().add(btn49, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 40, 40));

        btn50.setBackground(new java.awt.Color(255, 94, 126));
        btn50.setBorder(null);
        btn50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn50MouseClicked(evt);
            }
        });
        btn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn50ActionPerformed(evt);
            }
        });
        getContentPane().add(btn50, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 40, 40));

        btn51.setBackground(new java.awt.Color(255, 94, 126));
        btn51.setBorder(null);
        btn51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn51MouseClicked(evt);
            }
        });
        btn51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn51ActionPerformed(evt);
            }
        });
        getContentPane().add(btn51, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 40, 40));

        btn52.setBackground(new java.awt.Color(102, 102, 102));
        btn52.setBorder(null);
        btn52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn52ActionPerformed(evt);
            }
        });
        getContentPane().add(btn52, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 40, 40));

        btn53.setBackground(new java.awt.Color(102, 102, 102));
        btn53.setBorder(null);
        btn53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn53ActionPerformed(evt);
            }
        });
        getContentPane().add(btn53, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 40, 40));

        btn54.setBackground(new java.awt.Color(102, 102, 102));
        btn54.setBorder(null);
        btn54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn54ActionPerformed(evt);
            }
        });
        getContentPane().add(btn54, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 40, 40));

        btn55.setBackground(new java.awt.Color(102, 102, 102));
        btn55.setBorder(null);
        btn55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn55ActionPerformed(evt);
            }
        });
        getContentPane().add(btn55, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 40, 40));

        btn56.setBackground(new java.awt.Color(102, 102, 102));
        btn56.setBorder(null);
        btn56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn56ActionPerformed(evt);
            }
        });
        getContentPane().add(btn56, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 40, 40));

        btn57.setBackground(new java.awt.Color(255, 94, 126));
        btn57.setBorder(null);
        btn57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn57MouseClicked(evt);
            }
        });
        btn57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn57ActionPerformed(evt);
            }
        });
        getContentPane().add(btn57, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 40, 40));

        btn58.setBackground(new java.awt.Color(255, 94, 126));
        btn58.setBorder(null);
        btn58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn58MouseClicked(evt);
            }
        });
        btn58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn58ActionPerformed(evt);
            }
        });
        getContentPane().add(btn58, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 40, 40));

        btn59.setBackground(new java.awt.Color(102, 102, 102));
        btn59.setBorder(null);
        btn59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn59ActionPerformed(evt);
            }
        });
        getContentPane().add(btn59, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 40, 40));

        btn60.setBackground(new java.awt.Color(255, 94, 126));
        btn60.setBorder(null);
        btn60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn60MouseClicked(evt);
            }
        });
        btn60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn60ActionPerformed(evt);
            }
        });
        getContentPane().add(btn60, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, 40, 40));

        btn61.setBackground(new java.awt.Color(102, 102, 102));
        btn61.setBorder(null);
        btn61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn61ActionPerformed(evt);
            }
        });
        getContentPane().add(btn61, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 40, 40));

        btn62.setBackground(new java.awt.Color(102, 102, 102));
        btn62.setBorder(null);
        btn62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn62ActionPerformed(evt);
            }
        });
        getContentPane().add(btn62, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 40, 40));

        btn63.setBackground(new java.awt.Color(102, 102, 102));
        btn63.setBorder(null);
        btn63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn63ActionPerformed(evt);
            }
        });
        getContentPane().add(btn63, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 40, 40));

        btn64.setBackground(new java.awt.Color(255, 94, 126));
        btn64.setBorder(null);
        btn64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn64MouseClicked(evt);
            }
        });
        btn64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn64ActionPerformed(evt);
            }
        });
        getContentPane().add(btn64, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 40, 40));

        btn65.setBackground(new java.awt.Color(255, 94, 126));
        btn65.setBorder(null);
        btn65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn65MouseClicked(evt);
            }
        });
        btn65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn65ActionPerformed(evt);
            }
        });
        getContentPane().add(btn65, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 40, 40));

        btn66.setBackground(new java.awt.Color(102, 102, 102));
        btn66.setBorder(null);
        btn66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn66ActionPerformed(evt);
            }
        });
        getContentPane().add(btn66, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 40, 40));

        btn67.setBackground(new java.awt.Color(255, 94, 126));
        btn67.setBorder(null);
        btn67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn67MouseClicked(evt);
            }
        });
        btn67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn67ActionPerformed(evt);
            }
        });
        getContentPane().add(btn67, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 40, 40));

        btn68.setBackground(new java.awt.Color(255, 94, 126));
        btn68.setBorder(null);
        btn68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn68MouseClicked(evt);
            }
        });
        btn68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn68ActionPerformed(evt);
            }
        });
        getContentPane().add(btn68, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 40, 40));

        btn69.setBackground(new java.awt.Color(255, 94, 126));
        btn69.setBorder(null);
        btn69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn69MouseClicked(evt);
            }
        });
        btn69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn69ActionPerformed(evt);
            }
        });
        getContentPane().add(btn69, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 40, 40));

        btn70.setBackground(new java.awt.Color(255, 94, 126));
        btn70.setBorder(null);
        btn70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn70MouseClicked(evt);
            }
        });
        btn70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn70ActionPerformed(evt);
            }
        });
        getContentPane().add(btn70, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 40, 40));

        btn71.setBackground(new java.awt.Color(255, 94, 126));
        btn71.setBorder(null);
        btn71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn71MouseClicked(evt);
            }
        });
        btn71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn71ActionPerformed(evt);
            }
        });
        getContentPane().add(btn71, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 40, 40));

        btn72.setBackground(new java.awt.Color(255, 94, 126));
        btn72.setBorder(null);
        btn72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn72MouseClicked(evt);
            }
        });
        btn72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn72ActionPerformed(evt);
            }
        });
        getContentPane().add(btn72, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, 40, 40));

        btn73.setBackground(new java.awt.Color(102, 102, 102));
        btn73.setBorder(null);
        btn73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn73ActionPerformed(evt);
            }
        });
        getContentPane().add(btn73, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, 40, 40));

        btn74.setBackground(new java.awt.Color(102, 102, 102));
        btn74.setBorder(null);
        btn74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn74ActionPerformed(evt);
            }
        });
        getContentPane().add(btn74, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 40, 40));

        btn75.setBackground(new java.awt.Color(255, 94, 126));
        btn75.setBorder(null);
        btn75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn75MouseClicked(evt);
            }
        });
        btn75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn75ActionPerformed(evt);
            }
        });
        getContentPane().add(btn75, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 40, 40));

        btn76.setBackground(new java.awt.Color(255, 94, 126));
        btn76.setBorder(null);
        btn76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn76MouseClicked(evt);
            }
        });
        btn76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn76ActionPerformed(evt);
            }
        });
        getContentPane().add(btn76, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 40, 40));

        btn77.setBackground(new java.awt.Color(255, 94, 126));
        btn77.setBorder(null);
        btn77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn77MouseClicked(evt);
            }
        });
        btn77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn77ActionPerformed(evt);
            }
        });
        getContentPane().add(btn77, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, 40, 40));

        btn78.setBackground(new java.awt.Color(255, 94, 126));
        btn78.setBorder(null);
        btn78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn78MouseClicked(evt);
            }
        });
        btn78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn78ActionPerformed(evt);
            }
        });
        getContentPane().add(btn78, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, 40, 40));

        btn79.setBackground(new java.awt.Color(255, 94, 126));
        btn79.setBorder(null);
        btn79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn79MouseClicked(evt);
            }
        });
        btn79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn79ActionPerformed(evt);
            }
        });
        getContentPane().add(btn79, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 40, 40));

        btn80.setBackground(new java.awt.Color(255, 94, 126));
        btn80.setBorder(null);
        btn80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn80MouseClicked(evt);
            }
        });
        btn80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn80ActionPerformed(evt);
            }
        });
        getContentPane().add(btn80, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, 40, 40));

        btn81.setBackground(new java.awt.Color(102, 102, 102));
        btn81.setBorder(null);
        btn81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn81ActionPerformed(evt);
            }
        });
        getContentPane().add(btn81, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, 40, 40));

        btn82.setBackground(new java.awt.Color(255, 94, 126));
        btn82.setBorder(null);
        btn82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn82MouseClicked(evt);
            }
        });
        btn82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn82ActionPerformed(evt);
            }
        });
        getContentPane().add(btn82, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 40, 40));

        btn83.setBackground(new java.awt.Color(255, 94, 126));
        btn83.setBorder(null);
        btn83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn83MouseClicked(evt);
            }
        });
        btn83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn83ActionPerformed(evt);
            }
        });
        getContentPane().add(btn83, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 570, 40, 40));

        btn84.setBackground(new java.awt.Color(255, 94, 126));
        btn84.setBorder(null);
        btn84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn84MouseClicked(evt);
            }
        });
        btn84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn84ActionPerformed(evt);
            }
        });
        getContentPane().add(btn84, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, 40, 40));

        btn85.setBackground(new java.awt.Color(255, 94, 126));
        btn85.setBorder(null);
        btn85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn85MouseClicked(evt);
            }
        });
        btn85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn85ActionPerformed(evt);
            }
        });
        getContentPane().add(btn85, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, 40, 40));

        btn86.setBackground(new java.awt.Color(255, 94, 126));
        btn86.setBorder(null);
        btn86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn86MouseClicked(evt);
            }
        });
        btn86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn86ActionPerformed(evt);
            }
        });
        getContentPane().add(btn86, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 570, 40, 40));

        btn87.setBackground(new java.awt.Color(255, 94, 126));
        btn87.setBorder(null);
        btn87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn87MouseClicked(evt);
            }
        });
        btn87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn87ActionPerformed(evt);
            }
        });
        getContentPane().add(btn87, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, 40, 40));

        btn88.setBackground(new java.awt.Color(102, 102, 102));
        btn88.setBorder(null);
        btn88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn88ActionPerformed(evt);
            }
        });
        getContentPane().add(btn88, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 570, 40, 40));

        btn89.setBackground(new java.awt.Color(102, 102, 102));
        btn89.setBorder(null);
        btn89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn89ActionPerformed(evt);
            }
        });
        getContentPane().add(btn89, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 570, 40, 40));

        btn90.setBackground(new java.awt.Color(255, 94, 126));
        btn90.setBorder(null);
        btn90.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn90MouseClicked(evt);
            }
        });
        btn90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn90ActionPerformed(evt);
            }
        });
        getContentPane().add(btn90, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 570, 40, 40));

        btn91.setBackground(new java.awt.Color(102, 102, 102));
        btn91.setBorder(null);
        btn91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn91ActionPerformed(evt);
            }
        });
        getContentPane().add(btn91, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, 40, 40));

        btn92.setBackground(new java.awt.Color(102, 102, 102));
        btn92.setBorder(null);
        btn92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn92ActionPerformed(evt);
            }
        });
        getContentPane().add(btn92, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 620, 40, 40));

        btn93.setBackground(new java.awt.Color(255, 94, 126));
        btn93.setBorder(null);
        btn93.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn93MouseClicked(evt);
            }
        });
        btn93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn93ActionPerformed(evt);
            }
        });
        getContentPane().add(btn93, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, 40, 40));

        btn94.setBackground(new java.awt.Color(102, 102, 102));
        btn94.setBorder(null);
        btn94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn94ActionPerformed(evt);
            }
        });
        getContentPane().add(btn94, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 40, 40));

        btn95.setBackground(new java.awt.Color(102, 102, 102));
        btn95.setBorder(null);
        btn95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn95ActionPerformed(evt);
            }
        });
        getContentPane().add(btn95, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 40, 40));

        btn96.setBackground(new java.awt.Color(102, 102, 102));
        btn96.setBorder(null);
        btn96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn96ActionPerformed(evt);
            }
        });
        getContentPane().add(btn96, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, 40, 40));

        btn97.setBackground(new java.awt.Color(102, 102, 102));
        btn97.setBorder(null);
        btn97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn97ActionPerformed(evt);
            }
        });
        getContentPane().add(btn97, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 620, 40, 40));

        btn98.setBackground(new java.awt.Color(102, 102, 102));
        btn98.setBorder(null);
        btn98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn98ActionPerformed(evt);
            }
        });
        getContentPane().add(btn98, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 620, 40, 40));

        btn99.setBackground(new java.awt.Color(102, 102, 102));
        btn99.setBorder(null);
        btn99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn99ActionPerformed(evt);
            }
        });
        getContentPane().add(btn99, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 620, 40, 40));

        btn100.setBackground(new java.awt.Color(255, 94, 126));
        btn100.setBorder(null);
        btn100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn100MouseClicked(evt);
            }
        });
        btn100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100ActionPerformed(evt);
            }
        });
        getContentPane().add(btn100, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 620, 40, 40));

        btn101.setBackground(new java.awt.Color(255, 94, 126));
        btn101.setBorder(null);
        btn101.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn101MouseClicked(evt);
            }
        });
        btn101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn101ActionPerformed(evt);
            }
        });
        getContentPane().add(btn101, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 620, 40, 40));

        btn102.setBackground(new java.awt.Color(102, 102, 102));
        btn102.setBorder(null);
        btn102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn102ActionPerformed(evt);
            }
        });
        getContentPane().add(btn102, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 620, 40, 40));

        btn103.setBackground(new java.awt.Color(102, 102, 102));
        btn103.setBorder(null);
        btn103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn103ActionPerformed(evt);
            }
        });
        getContentPane().add(btn103, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 620, 40, 40));

        btn104.setBackground(new java.awt.Color(255, 94, 126));
        btn104.setBorder(null);
        btn104.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn104MouseClicked(evt);
            }
        });
        btn104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn104ActionPerformed(evt);
            }
        });
        getContentPane().add(btn104, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 620, 40, 40));

        btn105.setBackground(new java.awt.Color(102, 102, 102));
        btn105.setBorder(null);
        btn105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn105ActionPerformed(evt);
            }
        });
        getContentPane().add(btn105, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 620, 40, 40));

        btn106.setBackground(new java.awt.Color(255, 94, 126));
        btn106.setBorder(null);
        btn106.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn106MouseClicked(evt);
            }
        });
        btn106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn106ActionPerformed(evt);
            }
        });
        getContentPane().add(btn106, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, 40, 40));

        btn107.setBackground(new java.awt.Color(255, 94, 126));
        btn107.setBorder(null);
        btn107.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn107MouseClicked(evt);
            }
        });
        btn107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn107ActionPerformed(evt);
            }
        });
        getContentPane().add(btn107, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 670, 40, 40));

        btn108.setBackground(new java.awt.Color(255, 94, 126));
        btn108.setBorder(null);
        btn108.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn108MouseClicked(evt);
            }
        });
        btn108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn108ActionPerformed(evt);
            }
        });
        getContentPane().add(btn108, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 670, 40, 40));

        btn109.setBackground(new java.awt.Color(102, 102, 102));
        btn109.setBorder(null);
        btn109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn109ActionPerformed(evt);
            }
        });
        getContentPane().add(btn109, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 670, 40, 40));

        btn110.setBackground(new java.awt.Color(102, 102, 102));
        btn110.setBorder(null);
        btn110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn110ActionPerformed(evt);
            }
        });
        getContentPane().add(btn110, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 670, 40, 40));

        btn111.setBackground(new java.awt.Color(102, 102, 102));
        btn111.setBorder(null);
        btn111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn111ActionPerformed(evt);
            }
        });
        getContentPane().add(btn111, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 670, 40, 40));

        btn112.setBackground(new java.awt.Color(102, 102, 102));
        btn112.setBorder(null);
        btn112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn112ActionPerformed(evt);
            }
        });
        getContentPane().add(btn112, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 670, 40, 40));

        btn113.setBackground(new java.awt.Color(102, 102, 102));
        btn113.setBorder(null);
        btn113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn113ActionPerformed(evt);
            }
        });
        getContentPane().add(btn113, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 670, 40, 40));

        btn114.setBackground(new java.awt.Color(102, 102, 102));
        btn114.setBorder(null);
        btn114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn114ActionPerformed(evt);
            }
        });
        getContentPane().add(btn114, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 670, 40, 40));

        btn115.setBackground(new java.awt.Color(255, 94, 126));
        btn115.setBorder(null);
        btn115.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn115MouseClicked(evt);
            }
        });
        btn115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn115ActionPerformed(evt);
            }
        });
        getContentPane().add(btn115, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 670, 40, 40));

        btn116.setBackground(new java.awt.Color(255, 94, 126));
        btn116.setBorder(null);
        btn116.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn116MouseClicked(evt);
            }
        });
        btn116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn116ActionPerformed(evt);
            }
        });
        getContentPane().add(btn116, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 670, 40, 40));

        btn117.setBackground(new java.awt.Color(255, 94, 126));
        btn117.setBorder(null);
        btn117.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn117MouseClicked(evt);
            }
        });
        btn117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn117ActionPerformed(evt);
            }
        });
        getContentPane().add(btn117, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 670, 40, 40));

        btn118.setBackground(new java.awt.Color(255, 94, 126));
        btn118.setBorder(null);
        btn118.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn118MouseClicked(evt);
            }
        });
        btn118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn118ActionPerformed(evt);
            }
        });
        getContentPane().add(btn118, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 670, 40, 40));

        btn119.setBackground(new java.awt.Color(255, 94, 126));
        btn119.setBorder(null);
        btn119.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn119MouseClicked(evt);
            }
        });
        btn119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn119ActionPerformed(evt);
            }
        });
        getContentPane().add(btn119, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 670, 40, 40));

        btn120.setBackground(new java.awt.Color(255, 94, 126));
        btn120.setBorder(null);
        btn120.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn120MouseClicked(evt);
            }
        });
        btn120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn120ActionPerformed(evt);
            }
        });
        getContentPane().add(btn120, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 670, 40, 40));

        btn121.setBackground(new java.awt.Color(255, 94, 126));
        btn121.setBorder(null);
        btn121.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn121MouseClicked(evt);
            }
        });
        btn121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn121ActionPerformed(evt);
            }
        });
        getContentPane().add(btn121, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 720, 40, 40));

        btn122.setBackground(new java.awt.Color(255, 94, 126));
        btn122.setBorder(null);
        btn122.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn122MouseClicked(evt);
            }
        });
        btn122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn122ActionPerformed(evt);
            }
        });
        getContentPane().add(btn122, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 720, 40, 40));

        btn123.setBackground(new java.awt.Color(102, 102, 102));
        btn123.setBorder(null);
        btn123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn123ActionPerformed(evt);
            }
        });
        getContentPane().add(btn123, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 720, 40, 40));

        btn124.setBackground(new java.awt.Color(255, 94, 126));
        btn124.setBorder(null);
        btn124.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn124MouseClicked(evt);
            }
        });
        btn124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn124ActionPerformed(evt);
            }
        });
        getContentPane().add(btn124, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 720, 40, 40));

        btn125.setBackground(new java.awt.Color(255, 94, 126));
        btn125.setBorder(null);
        btn125.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn125MouseClicked(evt);
            }
        });
        btn125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn125ActionPerformed(evt);
            }
        });
        getContentPane().add(btn125, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 720, 40, 40));

        btn126.setBackground(new java.awt.Color(255, 94, 126));
        btn126.setBorder(null);
        btn126.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn126MouseClicked(evt);
            }
        });
        btn126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn126ActionPerformed(evt);
            }
        });
        getContentPane().add(btn126, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 720, 40, 40));

        btn127.setBackground(new java.awt.Color(255, 94, 126));
        btn127.setBorder(null);
        btn127.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn127MouseClicked(evt);
            }
        });
        btn127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn127ActionPerformed(evt);
            }
        });
        getContentPane().add(btn127, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 720, 40, 40));

        btn128.setBackground(new java.awt.Color(255, 94, 126));
        btn128.setBorder(null);
        btn128.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn128MouseClicked(evt);
            }
        });
        btn128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn128ActionPerformed(evt);
            }
        });
        getContentPane().add(btn128, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 720, 40, 40));

        btn129.setBackground(new java.awt.Color(255, 94, 126));
        btn129.setBorder(null);
        btn129.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn129MouseClicked(evt);
            }
        });
        btn129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn129ActionPerformed(evt);
            }
        });
        getContentPane().add(btn129, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 720, 40, 40));

        btn130.setBackground(new java.awt.Color(255, 94, 126));
        btn130.setBorder(null);
        btn130.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn130MouseClicked(evt);
            }
        });
        btn130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn130ActionPerformed(evt);
            }
        });
        getContentPane().add(btn130, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 720, 40, 40));

        btn131.setBackground(new java.awt.Color(102, 102, 102));
        btn131.setBorder(null);
        btn131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn131ActionPerformed(evt);
            }
        });
        getContentPane().add(btn131, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 720, 40, 40));

        btn132.setBackground(new java.awt.Color(255, 94, 126));
        btn132.setBorder(null);
        btn132.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn132MouseClicked(evt);
            }
        });
        btn132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn132ActionPerformed(evt);
            }
        });
        getContentPane().add(btn132, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 720, 40, 40));

        btn133.setBackground(new java.awt.Color(255, 94, 126));
        btn133.setBorder(null);
        btn133.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn133MouseClicked(evt);
            }
        });
        btn133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn133ActionPerformed(evt);
            }
        });
        getContentPane().add(btn133, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 720, 40, 40));

        btn134.setBackground(new java.awt.Color(255, 94, 126));
        btn134.setBorder(null);
        btn134.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn134MouseClicked(evt);
            }
        });
        btn134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn134ActionPerformed(evt);
            }
        });
        getContentPane().add(btn134, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 720, 40, 40));

        btn135.setBackground(new java.awt.Color(255, 94, 126));
        btn135.setBorder(null);
        btn135.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn135MouseClicked(evt);
            }
        });
        btn135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn135ActionPerformed(evt);
            }
        });
        getContentPane().add(btn135, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 720, 40, 40));

        jPanel5.setBackground(new java.awt.Color(255, 94, 126));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 320, 20, 20));

        jLabel15.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Reserved");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 310, -1, 40));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 320, -1, -1));

        show.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 36)); // NOI18N
        show.setForeground(new java.awt.Color(255, 255, 255));
        show.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        show.setText("show_name");
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("_________________________________________________________________________________________________________________");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 1450, -1));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("__________________________________");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 270, 440, -1));

        jLabel23.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("STAGE");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        jLabel24.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Show:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Selected");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 350, -1, 40));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 360, 20, 20));

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

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        addtable("01", "01");
    }//GEN-LAST:event_btn1ActionPerformed
        
    private void twiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twiceActionPerformed
        
        Receipt rc = new Receipt();
        int numOfRow = rowandseat.getRowCount();
        rc.tierlabel.setText(tier.getText());
        rc.nrlabel.setText(numOfRow + "x");
        rc.sectionlabel.setText(section.getText());
          if (numOfRow == 1){
            rc.rowlabel.setText("Row " + rowandseat.getValueAt(0, 0).toString());
            rc.seatlabel.setText("Seat " + rowandseat.getValueAt(0, 1).toString());
        } else if (numOfRow == 2){
            rc.rowlabel.setText("Row " + rowandseat.getValueAt(0, 0).toString() + ", " + rowandseat.getValueAt(1, 0).toString());
            rc.seatlabel.setText("Seat " + rowandseat.getValueAt(0, 1).toString() + ", " + rowandseat.getValueAt(1, 1).toString());
        } else if (numOfRow == 3) {
            rc.rowlabel.setText("Row " + rowandseat.getValueAt(0, 0).toString() + ", " + rowandseat.getValueAt(1, 0).toString() + 
                                ", " + rowandseat.getValueAt(2, 0).toString());
            rc.seatlabel.setText("Seat " + rowandseat.getValueAt(0, 1).toString() + ", " + rowandseat.getValueAt(1, 1).toString()+
                                 ", " + rowandseat.getValueAt(2, 1).toString());
        }     
        
        String at = "TIER A";
        String bt = "TIER B";
        String ct = "TIER C";
        String dt = "TIER D";
        int atp = 10350; 
        int btp = 7650;
        int ctp = 4550;
        int dtp = 1750;
        
        if (tier.getText().equals(at)){
            rc.ppertix.setText("Php " + atp + ".00");
            switch (rowandseat.getRowCount()) {
                case 1 -> {
                    rc.subtot.setText("Php " + atp + ".00");
                    rc.total.setText("Php " + (atp + 100) + ".00");
                }
                case 2 -> {
                    rc.subtot.setText("Php " + atp * 2 + ".00");
                    rc.total.setText("Php " + (atp * 2 + 100) + ".00");
                }
                case 3 -> {
                    rc.subtot.setText("Php " + atp * 3 + ".00");
                    rc.total.setText("Php " + (atp * 3 + 100) + ".00");
                }
                default -> {
                }
            }
        }
          
        if (tier.getText().equals(bt)){
            rc.ppertix.setText("Php " + btp + ".00");
            switch (rowandseat.getRowCount()) {
                case 1 -> {
                    rc.subtot.setText("Php " + btp + ".00");
                    rc.total.setText("Php " + (btp + 100) + ".00");
                }
                case 2 -> {
                    rc.subtot.setText("Php " + btp * 2 + ".00");
                    rc.total.setText("Php " + (btp * 2 + 100) + ".00");
                }
                case 3 -> {
                    rc.subtot.setText("Php " + btp * 3 + ".00");
                    rc.total.setText("Php " + (btp * 3 + 100) + ".00");
                }
                default -> {
                }
            }
        }
        
        if (tier.getText().equals(ct)){
            rc.ppertix.setText("Php " + ctp + ".00");
            switch (rowandseat.getRowCount()) {
                case 1 -> {
                    rc.subtot.setText("Php " + ctp + ".00");
                    rc.total.setText("Php " + (ctp + 100) + ".00");
                }
                case 2 -> {
                    rc.subtot.setText("Php " + ctp * 2 + ".00");
                    rc.total.setText("Php " + (ctp * 2 + 100) + ".00");
                }
                case 3 -> {
                    rc.subtot.setText("Php " + ctp * 3 + ".00");
                    rc.total.setText("Php " + (ctp * 3 + 100) + ".00");
                }
                default -> {
                }
            }
        }
          
        if (tier.getText().equals(dt)){
            rc.ppertix.setText("Php " + dtp + ".00");
            switch (rowandseat.getRowCount()) {
                case 1 -> {
                    rc.subtot.setText("Php " + dtp + ".00");
                    rc.total.setText("Php " + (dtp + 100) + ".00");
                }
                case 2 -> {
                    rc.subtot.setText("Php " + dtp * 2 + ".00");
                    rc.total.setText("Php " + (dtp * 2 + 100) + ".00");
                }
                case 3 -> {
                    rc.subtot.setText("Php " + dtp * 3 + ".00");
                    rc.total.setText("Php " + (dtp * 3 + 100) + ".00");
                }
                default -> {
                }
            }
        }
        
        switch (show.getText()) {
            case "Twice Ready To Be World Tour" -> {
                ImageIcon icon = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\rtb.jpg");
                Image img = icon.getImage();
                Image imgScale = img.getScaledInstance(rc.poster.getWidth(), rc.poster.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon (imgScale);
                rc.poster.setIcon(scaledIcon);
                rc.showlabel.setText("Twice: Ready To Be");
                rc.showlabel1.setText("5th World Tour");
                rc.dandt.setText("09/30/2023, 7:00PM");
                rc.ven.setText("Philippine Arena, Bulacan");
            }
                
            case "TXT ACT Sweet Mirage Tour" -> {
                ImageIcon icon1 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\txt.jpg");
                Image img1 = icon1.getImage();
                Image imgScale1 = img1.getScaledInstance(rc.poster.getWidth(), rc.poster.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon1 = new ImageIcon (imgScale1);
                rc.poster.setIcon(scaledIcon1);
                rc.showlabel.setText("TomorrowXTogether");
                rc.showlabel1.setText("ACT: Sweet Mirage Tour");
                rc.dandt.setText("07/13/2023, 7:00PM");
                rc.ven.setText("Philippine Arena, Bulacan");
            }
                
            case "NMixx Nice To Mixx You Showcase Tour" -> {
                ImageIcon icon2 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\nmixx.jpg");
                Image img2 = icon2.getImage();
                Image imgScale2 = img2.getScaledInstance(rc.poster.getWidth(), rc.poster.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon2 = new ImageIcon (imgScale2);
                rc.poster.setIcon(scaledIcon2);
                rc.showlabel.setText("NMixx: Nice To Mixx");
                rc.showlabel1.setText("You Showcase Tour");
                rc.dandt.setText("07/01/2023, 7:00PM"); 
                rc.ven.setText("New Frontier Theater");
            }
                
            case "Howlers Manila 2.0" -> {
                ImageIcon icon3 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\Howlers.jpg");
                Image img3 = icon3.getImage();
                Image imgScale3 = img3.getScaledInstance(rc.poster.getWidth(), rc.poster.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon3 = new ImageIcon (imgScale3);
                rc.poster.setIcon(scaledIcon3);
                rc.showlabel.setText("Howlers Live in Manila");
                rc.showlabel1.setText("2.0");
                rc.dandt.setText("07/01/2023, 7:00PM"); 
                rc.ven.setText("Circuit Makati, Manila");
            }   
                
            case "SB19 Pagtatag! World Tour" -> {
                ImageIcon icon4 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\sb19.jpg");
                Image img4 = icon4.getImage();
                Image imgScale4 = img4.getScaledInstance(rc.poster.getWidth(), rc.poster.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon4 = new ImageIcon (imgScale4);
                rc.poster.setIcon(scaledIcon4);
                rc.showlabel.setText("SB19 Pagtatag! World");
                rc.showlabel1.setText("Tour");
                rc.dandt.setText("07/05/2023, 7:00PM"); 
                rc.ven.setText("SMX Convention Center");
            }   
                
            case "Sarah G x Bamboo" -> {
                ImageIcon icon5 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\sb.jpg");
                Image img5 = icon5.getImage();
                Image imgScale5 = img5.getScaledInstance(rc.poster.getWidth(), rc.poster.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon5 = new ImageIcon (imgScale5);
                rc.poster.setIcon(scaledIcon5);
                rc.showlabel.setText("Sarah G x Bamboo");
                rc.showlabel1.setText("Joint Concert");
                rc.dandt.setText("07/07/2023, 7:00PM"); 
                rc.ven.setText("Araneta Coliseum");
            } 
                
            case "The Juans LIVE in Cebu" -> {
                ImageIcon icon6 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\juans.jpg");
                Image img6 = icon6.getImage();
                Image imgScale6 = img6.getScaledInstance(rc.poster.getWidth(), rc.poster.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon6 = new ImageIcon (imgScale6);
                rc.poster.setIcon(scaledIcon6);
                rc.showlabel.setText("The Juans");
                rc.showlabel1.setText("Live in Cebu");
                rc.dandt.setText("07/08/2023, 7:00PM"); 
                rc.ven.setText("Waterfront Hotel, Cebu");
            } 
              
            case "Cravity Masterpiece World Tour" -> {
                ImageIcon icon7 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\ikon.jpg");
                Image img7 = icon7.getImage();
                Image imgScale7 = img7.getScaledInstance(rc.poster.getWidth(), rc.poster.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon7 = new ImageIcon (imgScale7);
                rc.poster.setIcon(scaledIcon7);
                rc.showlabel.setText("Cravity: World Tour");
                rc.showlabel1.setText("'Masterpiece'");
                rc.dandt.setText("08/05/2023, 7:00PM"); 
                rc.ven.setText("New Front Theater");
            }    
             
            case "The Boyz 'Zeneration' 2nd World Tour" -> {
                ImageIcon icon8 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\tbz.jpg");
                Image img8 = icon8.getImage();
                Image imgScale8 = img8.getScaledInstance(rc.poster.getWidth(), rc.poster.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon8 = new ImageIcon (imgScale8);
                rc.poster.setIcon(scaledIcon8);
                rc.showlabel.setText("The Boyz: 'Zeneration'");
                rc.showlabel1.setText("2nd World Tour");
                rc.dandt.setText("07/15/2023, 6:00PM"); 
                rc.ven.setText("Araneta Coliseum");
            }
                
            case "iKon Take Off Tour" -> {
                ImageIcon icon9 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\off.jpg");
                Image img9 = icon9.getImage();
                Image imgScale9 = img9.getScaledInstance(rc.poster.getWidth(), rc.poster.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon9 = new ImageIcon (imgScale9);
                rc.poster.setIcon(scaledIcon9);
                rc.showlabel.setText("iKon: 'Take Off'");
                rc.showlabel1.setText("World Tour");
                rc.dandt.setText("08/05/2023, 6:00PM"); 
                rc.ven.setText("Araneta Coliseum");
            }
                
            case "Southside Rythm Fest" -> {
                ImageIcon icon10 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\fest.jpg");
                Image img10 = icon10.getImage();
                Image imgScale10 = img10.getScaledInstance(rc.poster.getWidth(), rc.poster.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon10 = new ImageIcon (imgScale10);
                rc.poster.setIcon(scaledIcon10);
                rc.showlabel.setText("Southside Rythm Fest");
                rc.showlabel1.setText("Live in Cebu");
                rc.dandt.setText("07/22/2023, 6:00PM");
                rc.ven.setText("Di Mare Openfield, Cebu");
            }
                
            case "Dhruv Live in Manila" -> {
                ImageIcon icon11 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\dhruv.jpg");
                Image img11 = icon11.getImage();
                Image imgScale11 = img11.getScaledInstance(rc.poster.getWidth(), rc.poster.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon11 = new ImageIcon (imgScale11);
                rc.poster.setIcon(scaledIcon11);
                rc.showlabel.setText("Dhruv Live in");
                rc.showlabel1.setText("MANILA");
                rc.dandt.setText("07/25/2023, 8:00PM");
                rc.ven.setText("The Podium Hall");
            }
             
            case "Taeyeon The Odd of Love Tour" -> {
                ImageIcon icon12 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\odd.jpg");
                Image img12 = icon12.getImage();
                Image imgScale12 = img12.getScaledInstance(rc.poster.getWidth(), rc.poster.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon12 = new ImageIcon (imgScale12);
                rc.poster.setIcon(scaledIcon12);
                rc.showlabel.setText("Taeyeon: 'The Odd of");
                rc.showlabel1.setText("Love' Tour");
                rc.dandt.setText("07/30/2023, 5:00PM");
                rc.ven.setText("Araneta Coliseum");
            }
                
            case "The Super Stage by KPop" -> {
                ImageIcon icon13 = new ImageIcon ("C:\\Users\\Mika\\OneDrive\\Documents\\NetBeansProjects\\CaseStudy_Finals\\odd.jpg");
                Image img13 = icon13.getImage();
                Image imgScale13 = img13.getScaledInstance(rc.poster.getWidth(), rc.poster.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledIcon13 = new ImageIcon (imgScale13);
                rc.poster.setIcon(scaledIcon13);
                rc.showlabel.setText("The Super Stage");
                rc.showlabel1.setText("by KPop");
                rc.dandt.setText("08/11/2023, 7:00PM");
                rc.ven.setText("Mall of Asia Arena");
            }
                
            default -> {
            }
        }
        
        rc.show();
        dispose();

    }//GEN-LAST:event_twiceActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        addtable("01", "03");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        addtable("01", "04");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        addtable("01", "05");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        addtable("01", "06");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        addtable("01", "07");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        addtable("01", "08");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        addtable("01", "09");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        addtable("01", "11");
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        addtable("01", "12");
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        addtable("01", "13");
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        addtable("01", "14");
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        addtable("01", "15");
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        addtable("02", "16");
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        addtable("02", "17");
    }//GEN-LAST:event_btn17ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
        addtable("02", "18");
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed
        addtable("02", "19");
    }//GEN-LAST:event_btn19ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        addtable("02", "21");
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        addtable("02", "22");
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        addtable("02", "23");
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
        addtable("02", "24");
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
        addtable("02", "25");
    }//GEN-LAST:event_btn25ActionPerformed

    private void btn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn26ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn26ActionPerformed

    private void btn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn27ActionPerformed
        addtable("02", "27");
    }//GEN-LAST:event_btn27ActionPerformed

    private void btn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn28ActionPerformed
        addtable("02", "28");
    }//GEN-LAST:event_btn28ActionPerformed

    private void btn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn29ActionPerformed
        addtable("02", "29");
    }//GEN-LAST:event_btn29ActionPerformed

    private void btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn30ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        addtable("03", "31");
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        addtable("03", "33");
    }//GEN-LAST:event_btn33ActionPerformed

    private void btn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn34ActionPerformed
        addtable("03", "34");
    }//GEN-LAST:event_btn34ActionPerformed

    private void btn35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn35ActionPerformed
        addtable("03", "35");
    }//GEN-LAST:event_btn35ActionPerformed

    private void btn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn36ActionPerformed
        addtable("03", "36");
    }//GEN-LAST:event_btn36ActionPerformed

    private void btn37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn37ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn37ActionPerformed

    private void btn38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn38ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn38ActionPerformed

    private void btn39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn39ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn39ActionPerformed

    private void btn40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn40ActionPerformed
        addtable("03", "40");
    }//GEN-LAST:event_btn40ActionPerformed

    private void btn41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn41ActionPerformed
        addtable("03", "41");
    }//GEN-LAST:event_btn41ActionPerformed

    private void btn42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn42ActionPerformed
        addtable("03", "42");
    }//GEN-LAST:event_btn42ActionPerformed

    private void btn43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn43ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn43ActionPerformed

    private void btn44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn44ActionPerformed
        addtable("03", "44");
    }//GEN-LAST:event_btn44ActionPerformed

    private void btn45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn45ActionPerformed
        addtable("03", "45");
    }//GEN-LAST:event_btn45ActionPerformed

    private void btn46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn46ActionPerformed
        addtable("04", "46");
    }//GEN-LAST:event_btn46ActionPerformed

    private void btn47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn47ActionPerformed
        addtable("04", "47");
    }//GEN-LAST:event_btn47ActionPerformed

    private void btn48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn48ActionPerformed
        addtable("04", "48");
    }//GEN-LAST:event_btn48ActionPerformed

    private void btn49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn49ActionPerformed
        addtable("04", "49");
    }//GEN-LAST:event_btn49ActionPerformed

    private void btn50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn50ActionPerformed
        addtable("04", "50");
    }//GEN-LAST:event_btn50ActionPerformed

    private void btn51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn51ActionPerformed
        addtable("04", "51");
    }//GEN-LAST:event_btn51ActionPerformed

    private void btn52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn52ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn52ActionPerformed

    private void btn53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn53ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn53ActionPerformed

    private void btn54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn54ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn54ActionPerformed

    private void btn55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn55ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn55ActionPerformed

    private void btn56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn56ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn56ActionPerformed

    private void btn57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn57ActionPerformed
        addtable("04", "57");
    }//GEN-LAST:event_btn57ActionPerformed

    private void btn58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn58ActionPerformed
        addtable("04", "58");
    }//GEN-LAST:event_btn58ActionPerformed

    private void btn59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn59ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn59ActionPerformed

    private void btn60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn60ActionPerformed
        addtable("04", "60");
    }//GEN-LAST:event_btn60ActionPerformed

    private void btn61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn61ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn61ActionPerformed

    private void btn62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn62ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn62ActionPerformed

    private void btn63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn63ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn63ActionPerformed

    private void btn64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn64ActionPerformed
        addtable("05", "64");
    }//GEN-LAST:event_btn64ActionPerformed

    private void btn65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn65ActionPerformed
        addtable("05", "65");
    }//GEN-LAST:event_btn65ActionPerformed

    private void btn66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn66ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn66ActionPerformed

    private void btn67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn67ActionPerformed
        addtable("05", "67");
    }//GEN-LAST:event_btn67ActionPerformed

    private void btn68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn68ActionPerformed
        addtable("05", "68");
    }//GEN-LAST:event_btn68ActionPerformed

    private void btn69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn69ActionPerformed
        addtable("05", "69");
    }//GEN-LAST:event_btn69ActionPerformed

    private void btn70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn70ActionPerformed
        addtable("05", "70");
    }//GEN-LAST:event_btn70ActionPerformed

    private void btn71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn71ActionPerformed
        addtable("05", "71");
    }//GEN-LAST:event_btn71ActionPerformed

    private void btn72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn72ActionPerformed
        addtable("05", "72");
    }//GEN-LAST:event_btn72ActionPerformed

    private void btn73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn73ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn73ActionPerformed

    private void btn74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn74ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn74ActionPerformed

    private void btn75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn75ActionPerformed
        addtable("05", "75");
    }//GEN-LAST:event_btn75ActionPerformed

    private void btn76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn76ActionPerformed
        addtable("06", "76");
    }//GEN-LAST:event_btn76ActionPerformed

    private void btn77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn77ActionPerformed
        addtable("06", "77");
    }//GEN-LAST:event_btn77ActionPerformed

    private void btn78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn78ActionPerformed
        addtable("06", "78");
    }//GEN-LAST:event_btn78ActionPerformed

    private void btn79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn79ActionPerformed
        addtable("06", "79");
    }//GEN-LAST:event_btn79ActionPerformed

    private void btn80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn80ActionPerformed
        addtable("06", "80");
    }//GEN-LAST:event_btn80ActionPerformed

    private void btn81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn81ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn81ActionPerformed

    private void btn82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn82ActionPerformed
        addtable("06", "82");
    }//GEN-LAST:event_btn82ActionPerformed

    private void btn83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn83ActionPerformed
        addtable("06", "83");
    }//GEN-LAST:event_btn83ActionPerformed

    private void btn84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn84ActionPerformed
        addtable("06", "84");
    }//GEN-LAST:event_btn84ActionPerformed

    private void btn85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn85ActionPerformed
        addtable("06", "85");
    }//GEN-LAST:event_btn85ActionPerformed

    private void btn86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn86ActionPerformed
        addtable("06", "86");
    }//GEN-LAST:event_btn86ActionPerformed

    private void btn87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn87ActionPerformed
        addtable("06", "87");
    }//GEN-LAST:event_btn87ActionPerformed

    private void btn88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn88ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn88ActionPerformed

    private void btn89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn89ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn89ActionPerformed

    private void btn90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn90ActionPerformed
        addtable("06", "90");
    }//GEN-LAST:event_btn90ActionPerformed

    private void btn91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn91ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn91ActionPerformed

    private void btn92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn92ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn92ActionPerformed

    private void btn93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn93ActionPerformed
        addtable("07", "93");
    }//GEN-LAST:event_btn93ActionPerformed

    private void btn94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn94ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn94ActionPerformed

    private void btn95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn95ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn95ActionPerformed

    private void btn96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn96ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn96ActionPerformed

    private void btn97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn97ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn97ActionPerformed

    private void btn98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn98ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn98ActionPerformed

    private void btn99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn99ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn99ActionPerformed

    private void btn100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100ActionPerformed
        addtable("07", "100");
    }//GEN-LAST:event_btn100ActionPerformed

    private void btn101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn101ActionPerformed
        addtable("07", "101");
    }//GEN-LAST:event_btn101ActionPerformed

    private void btn102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn102ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn102ActionPerformed

    private void btn103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn103ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn103ActionPerformed

    private void btn104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn104ActionPerformed
        addtable("07", "104");
    }//GEN-LAST:event_btn104ActionPerformed

    private void btn105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn105ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn105ActionPerformed

    private void btn106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn106ActionPerformed
        addtable("08", "106");
    }//GEN-LAST:event_btn106ActionPerformed

    private void btn107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn107ActionPerformed
        addtable("08", "107");
    }//GEN-LAST:event_btn107ActionPerformed

    private void btn108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn108ActionPerformed
        addtable("08", "108");
    }//GEN-LAST:event_btn108ActionPerformed

    private void btn109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn109ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn109ActionPerformed

    private void btn110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn110ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn110ActionPerformed

    private void btn111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn111ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn111ActionPerformed

    private void btn112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn112ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn112ActionPerformed

    private void btn113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn113ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn113ActionPerformed

    private void btn114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn114ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn114ActionPerformed

    private void btn115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn115ActionPerformed
        addtable("08", "115");
    }//GEN-LAST:event_btn115ActionPerformed

    private void btn116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn116ActionPerformed
        addtable("08", "116");
    }//GEN-LAST:event_btn116ActionPerformed

    private void btn117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn117ActionPerformed
        addtable("08", "117");
    }//GEN-LAST:event_btn117ActionPerformed

    private void btn118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn118ActionPerformed
        addtable("08", "118");
    }//GEN-LAST:event_btn118ActionPerformed

    private void btn119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn119ActionPerformed
        addtable("08", "119");
    }//GEN-LAST:event_btn119ActionPerformed

    private void btn120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn120ActionPerformed
        addtable("08", "120");
    }//GEN-LAST:event_btn120ActionPerformed

    private void btn135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn135ActionPerformed
        addtable("09", "135");
    }//GEN-LAST:event_btn135ActionPerformed

    private void btn134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn134ActionPerformed
        addtable("09", "134");
    }//GEN-LAST:event_btn134ActionPerformed

    private void btn133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn133ActionPerformed
        addtable("09", "133");
    }//GEN-LAST:event_btn133ActionPerformed

    private void btn132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn132ActionPerformed
        addtable("09", "132");
    }//GEN-LAST:event_btn132ActionPerformed

    private void btn131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn131ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn131ActionPerformed

    private void btn130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn130ActionPerformed
        addtable("09", "130");
    }//GEN-LAST:event_btn130ActionPerformed

    private void btn129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn129ActionPerformed
        addtable("09", "129");
    }//GEN-LAST:event_btn129ActionPerformed

    private void btn128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn128ActionPerformed
        addtable("09", "128");
    }//GEN-LAST:event_btn128ActionPerformed

    private void btn127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn127ActionPerformed
        addtable("09", "127");
    }//GEN-LAST:event_btn127ActionPerformed

    private void btn126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn126ActionPerformed
        addtable("09", "126");
    }//GEN-LAST:event_btn126ActionPerformed

    private void btn125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn125ActionPerformed
        addtable("09", "125");
    }//GEN-LAST:event_btn125ActionPerformed

    private void btn124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn124ActionPerformed
        addtable("09", "124");
    }//GEN-LAST:event_btn124ActionPerformed

    private void btn123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn123ActionPerformed
        JOptionPane.showMessageDialog(null, "Sorry, this seat is already taken.");
    }//GEN-LAST:event_btn123ActionPerformed

    private void btn122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn122ActionPerformed
        addtable("09", "122");
    }//GEN-LAST:event_btn122ActionPerformed

    private void btn121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn121ActionPerformed
        addtable("09", "121");
    }//GEN-LAST:event_btn121ActionPerformed

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        btn1.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn1MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        btn3.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn3MouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        btn4.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn4MouseClicked

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked
        btn5.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn5MouseClicked

    private void btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseClicked
        btn6.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn6MouseClicked

    private void btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseClicked
        btn7.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn7MouseClicked

    private void btn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseClicked
        btn8.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn8MouseClicked

    private void btn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseClicked
        btn9.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn9MouseClicked

    private void btn11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn11MouseClicked
        btn11.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn11MouseClicked

    private void btn12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn12MouseClicked
        btn12.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn12MouseClicked

    private void btn13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn13MouseClicked
        btn13.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn13MouseClicked

    private void btn14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn14MouseClicked
        btn14.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn14MouseClicked

    private void btn15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn15MouseClicked
        btn15.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn15MouseClicked

    private void btn16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn16MouseClicked
        btn16.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn16MouseClicked

    private void btn17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn17MouseClicked
        btn17.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn17MouseClicked

    private void btn18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn18MouseClicked
        btn18.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn18MouseClicked

    private void btn19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn19MouseClicked
        btn19.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn19MouseClicked

    private void btn21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn21MouseClicked
        btn21.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn21MouseClicked

    private void btn22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn22MouseClicked
        btn22.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn22MouseClicked

    private void btn23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn23MouseClicked
        btn23.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn23MouseClicked

    private void btn24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn24MouseClicked
        btn24.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn24MouseClicked

    private void btn25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn25MouseClicked
        btn25.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn25MouseClicked

    private void btn27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn27MouseClicked
        btn27.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn27MouseClicked

    private void btn28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn28MouseClicked
        btn28.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn28MouseClicked

    private void btn29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn29MouseClicked
        btn29.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn29MouseClicked

    private void btn31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn31MouseClicked
        btn31.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn31MouseClicked

    private void btn33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn33MouseClicked
        btn33.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn33MouseClicked

    private void btn34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn34MouseClicked
        btn34.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn34MouseClicked

    private void btn35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn35MouseClicked
        btn35.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn35MouseClicked

    private void btn36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn36MouseClicked
        btn36.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn36MouseClicked

    private void btn40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn40MouseClicked
        btn40.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn40MouseClicked

    private void btn41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn41MouseClicked
        btn41.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn41MouseClicked

    private void btn42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn42MouseClicked
        btn42.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn42MouseClicked

    private void btn44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn44MouseClicked
        btn44.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn44MouseClicked

    private void btn45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn45MouseClicked
        btn45.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn45MouseClicked

    private void btn46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn46MouseClicked
        btn46.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn46MouseClicked

    private void btn47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn47MouseClicked
        btn47.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn47MouseClicked

    private void btn48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn48MouseClicked
        btn48.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn48MouseClicked

    private void btn49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn49MouseClicked
        btn49.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn49MouseClicked

    private void btn50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn50MouseClicked
        btn50.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn50MouseClicked

    private void btn51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn51MouseClicked
        btn51.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn51MouseClicked

    private void btn57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn57MouseClicked
        btn57.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn57MouseClicked

    private void btn58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn58MouseClicked
        btn58.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn58MouseClicked

    private void btn60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn60MouseClicked
        btn60.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn60MouseClicked

    private void btn64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn64MouseClicked
        btn64.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn64MouseClicked

    private void btn65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn65MouseClicked
        btn65.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn65MouseClicked

    private void btn67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn67MouseClicked
        btn67.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn67MouseClicked

    private void btn68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn68MouseClicked
        btn68.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn68MouseClicked

    private void btn69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn69MouseClicked
        btn69.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn69MouseClicked

    private void btn70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn70MouseClicked
        btn70.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn70MouseClicked

    private void btn71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn71MouseClicked
        btn71.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn71MouseClicked

    private void btn72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn72MouseClicked
        btn72.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn72MouseClicked

    private void btn75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn75MouseClicked
        btn75.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn75MouseClicked

    private void btn76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn76MouseClicked
        btn76.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn76MouseClicked

    private void btn77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn77MouseClicked
        btn77.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn77MouseClicked

    private void btn78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn78MouseClicked
        btn78.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn78MouseClicked

    private void btn79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn79MouseClicked
        btn79.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn79MouseClicked

    private void btn80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn80MouseClicked
        btn80.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn80MouseClicked

    private void btn82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn82MouseClicked
        btn82.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn82MouseClicked

    private void btn83MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn83MouseClicked
        btn83.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn83MouseClicked

    private void btn84MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn84MouseClicked
        btn84.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn84MouseClicked

    private void btn85MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn85MouseClicked
        btn85.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn85MouseClicked

    private void btn86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn86MouseClicked
        btn86.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn86MouseClicked

    private void btn87MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn87MouseClicked
        btn87.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn87MouseClicked

    private void btn90MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn90MouseClicked
        btn90.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn90MouseClicked

    private void btn93MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn93MouseClicked
        btn93.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn93MouseClicked

    private void btn100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn100MouseClicked
        btn100.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn100MouseClicked

    private void btn101MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn101MouseClicked
        btn101.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn101MouseClicked

    private void btn104MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn104MouseClicked
        btn104.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn104MouseClicked

    private void btn106MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn106MouseClicked
        btn106.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn106MouseClicked

    private void btn107MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn107MouseClicked
        btn107.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn107MouseClicked

    private void btn108MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn108MouseClicked
        btn108.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn108MouseClicked

    private void btn115MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn115MouseClicked
        btn115.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn115MouseClicked

    private void btn116MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn116MouseClicked
        btn116.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn116MouseClicked

    private void btn117MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn117MouseClicked
        btn117.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn117MouseClicked

    private void btn118MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn118MouseClicked
        btn118.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn118MouseClicked

    private void btn119MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn119MouseClicked
        btn119.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn119MouseClicked

    private void btn120MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn120MouseClicked
        btn120.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn120MouseClicked

    private void btn121MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn121MouseClicked
        btn121.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn121MouseClicked

    private void btn122MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn122MouseClicked
        btn122.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn122MouseClicked

    private void btn124MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn124MouseClicked
        btn124.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn124MouseClicked

    private void btn125MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn125MouseClicked
        btn125.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn125MouseClicked

    private void btn126MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn126MouseClicked
        btn126.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn126MouseClicked

    private void btn127MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn127MouseClicked
        btn127.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn127MouseClicked

    private void btn128MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn128MouseClicked
        btn128.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn128MouseClicked

    private void btn129MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn129MouseClicked
        btn129.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn129MouseClicked

    private void btn130MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn130MouseClicked
        btn130.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn130MouseClicked

    private void btn132MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn132MouseClicked
        btn132.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn132MouseClicked

    private void btn133MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn133MouseClicked
        btn133.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn133MouseClicked

    private void btn134MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn134MouseClicked
        btn134.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn134MouseClicked

    private void btn135MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn135MouseClicked
        btn135.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn135MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Main df = new Main();
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tickets_RandS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn101;
    private javax.swing.JButton btn102;
    private javax.swing.JButton btn103;
    private javax.swing.JButton btn104;
    private javax.swing.JButton btn105;
    private javax.swing.JButton btn106;
    private javax.swing.JButton btn107;
    private javax.swing.JButton btn108;
    private javax.swing.JButton btn109;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn110;
    private javax.swing.JButton btn111;
    private javax.swing.JButton btn112;
    private javax.swing.JButton btn113;
    private javax.swing.JButton btn114;
    private javax.swing.JButton btn115;
    private javax.swing.JButton btn116;
    private javax.swing.JButton btn117;
    private javax.swing.JButton btn118;
    private javax.swing.JButton btn119;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn120;
    private javax.swing.JButton btn121;
    private javax.swing.JButton btn122;
    private javax.swing.JButton btn123;
    private javax.swing.JButton btn124;
    private javax.swing.JButton btn125;
    private javax.swing.JButton btn126;
    private javax.swing.JButton btn127;
    private javax.swing.JButton btn128;
    private javax.swing.JButton btn129;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn130;
    private javax.swing.JButton btn131;
    private javax.swing.JButton btn132;
    private javax.swing.JButton btn133;
    private javax.swing.JButton btn134;
    private javax.swing.JButton btn135;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn37;
    private javax.swing.JButton btn38;
    private javax.swing.JButton btn39;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn41;
    private javax.swing.JButton btn42;
    private javax.swing.JButton btn43;
    private javax.swing.JButton btn44;
    private javax.swing.JButton btn45;
    private javax.swing.JButton btn46;
    private javax.swing.JButton btn47;
    private javax.swing.JButton btn48;
    private javax.swing.JButton btn49;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btn51;
    private javax.swing.JButton btn52;
    private javax.swing.JButton btn53;
    private javax.swing.JButton btn54;
    private javax.swing.JButton btn55;
    private javax.swing.JButton btn56;
    private javax.swing.JButton btn57;
    private javax.swing.JButton btn58;
    private javax.swing.JButton btn59;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn60;
    private javax.swing.JButton btn61;
    private javax.swing.JButton btn62;
    private javax.swing.JButton btn63;
    private javax.swing.JButton btn64;
    private javax.swing.JButton btn65;
    private javax.swing.JButton btn66;
    private javax.swing.JButton btn67;
    private javax.swing.JButton btn68;
    private javax.swing.JButton btn69;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn70;
    private javax.swing.JButton btn71;
    private javax.swing.JButton btn72;
    private javax.swing.JButton btn73;
    private javax.swing.JButton btn74;
    private javax.swing.JButton btn75;
    private javax.swing.JButton btn76;
    private javax.swing.JButton btn77;
    private javax.swing.JButton btn78;
    private javax.swing.JButton btn79;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn80;
    private javax.swing.JButton btn81;
    private javax.swing.JButton btn82;
    private javax.swing.JButton btn83;
    private javax.swing.JButton btn84;
    private javax.swing.JButton btn85;
    private javax.swing.JButton btn86;
    private javax.swing.JButton btn87;
    private javax.swing.JButton btn88;
    private javax.swing.JButton btn89;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn90;
    private javax.swing.JButton btn91;
    private javax.swing.JButton btn92;
    private javax.swing.JButton btn93;
    private javax.swing.JButton btn94;
    private javax.swing.JButton btn95;
    private javax.swing.JButton btn96;
    private javax.swing.JButton btn97;
    private javax.swing.JButton btn98;
    private javax.swing.JButton btn99;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> menu;
    private javax.swing.JLabel name;
    public javax.swing.JTable rowandseat;
    public javax.swing.JLabel section;
    public javax.swing.JLabel show;
    public javax.swing.JLabel tier;
    private javax.swing.JButton twice;
    // End of variables declaration//GEN-END:variables
private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}

