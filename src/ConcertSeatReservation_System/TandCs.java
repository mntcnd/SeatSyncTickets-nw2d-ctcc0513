/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ConcertSeatReservation_System;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class TandCs extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public TandCs() {
        initComponents();
        Main();
        setIconImage();
       
    }

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
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Terms & Conditions");
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
        menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home", "Login or Sign Up", "About Us", "Contact Us" }));
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
        jLabel4.setText("TERMS AND CONDITIONS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 690, 250, 40));

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Terms and Conditions\nWelcome to Concert Ticketing and Seat Reservation System!\n\nThese terms and conditions outline the rules and regulations for the use of CaRose Tickets's Website, located at www.carosetix.com.\n\nBy accessing this website we assume you accept these terms and conditions. Do not continue to use Concert Ticketing and Seat Reservation System if you do not agree to take all of the terms and conditions stated on this page.\n\nThe following terminology applies to these Terms and Conditions, Privacy Statement and Disclaimer Notice and all Agreements: \"Client\", \"You\" and \"Your\" refers to you, the person log on this website and compliant to the Company's terms and conditions. \"The Company\", \"Ourselves\", \"We\", \"Our\" and \"Us\", refers to our Company. \"Party\", \"Parties\", or \"Us\", refers to both the Client and ourselves. All terms refer to the offer, acceptance and consideration of payment necessary to undertake the process of our assistance to the Client in the most appropriate manner for the express purpose of meeting the Client's needs in respect of provision of the Company's stated services, in accordance with and subject to, prevailing law of ph. Any use of the above terminology or other words in the singular, plural, capitalization and/or he/she or they, are taken as interchangeable and therefore as referring to same.\n\nCookies\nWe employ the use of cookies. By accessing Concert Ticketing and Seat Reservation System, you agreed to use cookies in agreement with the CaRose Tickets's Privacy Policy.\n\nMost interactive websites use cookies to let us retrieve the user's details for each visit. Cookies are used by our website to enable the functionality of certain areas to make it easier for people visiting our website. Some of our affiliate/advertising partners may also use cookies.\n\nLicense\nUnless otherwise stated, CaRose Tickets and/or its licensors own the intellectual property rights for all material on Concert Ticketing and Seat Reservation System. All intellectual property rights are reserved. You may access this from Concert Ticketing and Seat Reservation System for your own personal use subjected to restrictions set in these terms and conditions.\n\nYou must not:\n\nRepublish material from Concert Ticketing and Seat Reservation System\nSell, rent or sub-license material from Concert Ticketing and Seat Reservation System\nReproduce, duplicate or copy material from Concert Ticketing and Seat Reservation System\nRedistribute content from Concert Ticketing and Seat Reservation System\nThis Agreement shall begin on the date hereof. Our Terms and Conditions were created with the help of the Free Terms and Conditions Generator.\n\nParts of this website offer an opportunity for users to post and exchange opinions and information in certain areas of the website. CaRose Tickets does not filter, edit, publish or review Comments prior to their presence on the website. Comments do not reflect the views and opinions of CaRose Tickets,its agents and/or affiliates. Comments reflect the views and opinions of the person who post their views and opinions. To the extent permitted by applicable laws, CaRose Tickets shall not be liable for the Comments or for any liability, damages or expenses caused and/or suffered as a result of any use of and/or posting of and/or appearance of the Comments on this website.\n\nCaRose Tickets reserves the right to monitor all Comments and to remove any Comments which can be considered inappropriate, offensive or causes breach of these Terms and Conditions.\n\nYou warrant and represent that:\n\nYou are entitled to post the Comments on our website and have all necessary licenses and consents to do so;\nThe Comments do not invade any intellectual property right, including without limitation copyright, patent or trademark of any third party;\nThe Comments do not contain any defamatory, libelous, offensive, indecent or otherwise unlawful material which is an invasion of privacy\nThe Comments will not be used to solicit or promote business or custom or present commercial activities or unlawful activity.\nYou hereby grant CaRose Tickets a non-exclusive license to use, reproduce, edit and authorize others to use, reproduce and edit any of your Comments in any and all forms, formats or media.\n\nHyperlinking to our Content\nThe following organizations may link to our Website without prior written approval:\n\nGovernment agencies;\nSearch engines;\nNews organizations;\nOnline directory distributors may link to our Website in the same manner as they hyperlink to the Websites of other listed businesses; and\nSystem wide Accredited Businesses except soliciting non-profit organizations, charity shopping malls, and charity fundraising groups which may not hyperlink to our Web site.\nThese organizations may link to our home page, to publications or to other Website information so long as the link: (a) is not in any way deceptive; (b) does not falsely imply sponsorship, endorsement or approval of the linking party and its products and/or services; and (c) fits within the context of the linking party's site.\n\nWe may consider and approve other link requests from the following types of organizations:\n\ncommonly-known consumer and/or business information sources;\ndot.com community sites;\nassociations or other groups representing charities;\nonline directory distributors;\ninternet portals;\naccounting, law and consulting firms; and\neducational institutions and trade associations.\nWe will approve link requests from these organizations if we decide that: (a) the link would not make us look unfavorably to ourselves or to our accredited businesses; (b) the organization does not have any negative records with us; (c) the benefit to us from the visibility of the hyperlink compensates the absence of CaRose Tickets; and (d) the link is in the context of general resource information.\n\nThese organizations may link to our home page so long as the link: (a) is not in any way deceptive; (b) does not falsely imply sponsorship, endorsement or approval of the linking party and its products or services; and (c) fits within the context of the linking party's site.\n\nIf you are one of the organizations listed in paragraph 2 above and are interested in linking to our website, you must inform us by sending an e-mail to CaRose Tickets. Please include your name, your organization name, contact information as well as the URL of your site, a list of any URLs from which you intend to link to our Website, and a list of the URLs on our site to which you would like to link. Wait 2-3 weeks for a response.\n\nApproved organizations may hyperlink to our Website as follows:\n\nBy use of our corporate name; or\nBy use of the uniform resource locator being linked to; or\nBy use of any other description of our Website being linked to that makes sense within the context and format of content on the linking party's site.\nNo use of CaRose Tickets's logo or other artwork will be allowed for linking absent a trademark license agreement.\n\niFrames\nWithout prior approval and written permission, you may not create frames around our Webpages that alter in any way the visual presentation or appearance of our Website.\n\nContent Liability\nWe shall not be hold responsible for any content that appears on your Website. You agree to protect and defend us against all claims that is rising on your Website. No link(s) should appear on any Website that may be interpreted as libelous, obscene or criminal, or which infringes, otherwise violates, or advocates the infringement or other violation of, any third party rights.\n\nReservation of Rights\nWe reserve the right to request that you remove all links or any particular link to our Website. You approve to immediately remove all links to our Website upon request. We also reserve the right to amen these terms and conditions and it's linking policy at any time. By continuously linking to our Website, you agree to be bound to and follow these linking terms and conditions.\n\nRemoval of links from our website\nIf you find any link on our Website that is offensive for any reason, you are free to contact and inform us any moment. We will consider requests to remove links but we are not obligated to or so or to respond to you directly.\n\nWe do not ensure that the information on this website is correct, we do not warrant its completeness or accuracy; nor do we promise to ensure that the website remains available or that the material on the website is kept up to date.\n\nDisclaimer\nTo the maximum extent permitted by applicable law, we exclude all representations, warranties and conditions relating to our website and the use of this website. Nothing in this disclaimer will:\n\nlimit or exclude our or your liability for death or personal injury;\nlimit or exclude our or your liability for fraud or fraudulent misrepresentation;\nlimit any of our or your liabilities in any way that is not permitted under applicable law; or\nexclude any of our or your liabilities that may not be excluded under applicable law.\nThe limitations and prohibitions of liability set in this Section and elsewhere in this disclaimer: (a) are subject to the preceding paragraph; and (b) govern all liabilities arising under the disclaimer, including liabilities arising in contract, in tort and for breach of statutory duty.\n\nAs long as the website and the information and services on the website are provided free of charge, we will not be liable for any loss or damage of any nature.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 1440, 490));

        bg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1550, 830));
        bg.getAccessibleContext().setAccessibleName("Terms & Conditions");

        getAccessibleContext().setAccessibleName("About Us");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        
        else if (menu.getSelectedItem() == "Contact Us"){
        ContactUs cu = new ContactUs();
        cu.show();
        dispose();   
        }
        
        
        
    }//GEN-LAST:event_menuActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Main mn = new Main();
        mn.show();
        dispose();   
    }//GEN-LAST:event_jButton3ActionPerformed
        
    /**
     * @param args the command line arguments
    [1620, 900] */
    public static void main(String args[]) {
        TandCs df = new TandCs();
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TandCs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TandCs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TandCs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TandCs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TandCs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SearchField;
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> menu;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}

