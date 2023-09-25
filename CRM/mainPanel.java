package CRM;

public class mainPanel extends javax.swing.JFrame {

    public mainPanel() {
        initComponents();
    }
    
    public mainPanel(String email) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUsers = new javax.swing.JButton();
        btnCustomers = new javax.swing.JButton();
        btnOffers = new javax.swing.JButton();
        btnInvoices = new javax.swing.JButton();
        btnProducts = new javax.swing.JButton();
        btnAvatar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUsers.setBackground(new java.awt.Color(98, 241, 255));
        btnUsers.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnUsers.setText("Użytkownicy");
        btnUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsersActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 300, 100));

        btnCustomers.setBackground(new java.awt.Color(98, 241, 255));
        btnCustomers.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCustomers.setText("Klienci");
        btnCustomers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 300, 100));

        btnOffers.setBackground(new java.awt.Color(98, 241, 255));
        btnOffers.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnOffers.setText("Oferty");
        btnOffers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnOffers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 300, 100));

        btnInvoices.setBackground(new java.awt.Color(98, 241, 255));
        btnInvoices.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnInvoices.setText("Faktury");
        btnInvoices.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInvoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvoicesActionPerformed(evt);
            }
        });
        getContentPane().add(btnInvoices, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 300, 100));

        btnProducts.setBackground(new java.awt.Color(98, 241, 255));
        btnProducts.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnProducts.setText("Produkty/Usługi");
        btnProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 300, 100));

        btnAvatar.setBackground(new java.awt.Color(98, 189, 227));
        btnAvatar.setBorderPainted(false);
        btnAvatar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1365, 5, 70, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Zenith CRM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 300, 70));

        jPanel1.setBackground(new java.awt.Color(220, 241, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 80));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1440, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsersActionPerformed

    private void btnInvoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvoicesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInvoicesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(mainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvatar;
    private javax.swing.JButton btnCustomers;
    private javax.swing.JButton btnInvoices;
    private javax.swing.JButton btnOffers;
    private javax.swing.JButton btnProducts;
    private javax.swing.JButton btnUsers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
