package CRM;

import javax.swing.JOptionPane;
import Model.*;
import DAO.*;

public class registration extends javax.swing.JFrame {
    
    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9}+$";
    public String nipPattern = "^[0-9]*$";
    
    public registration() {
        initComponents();
        btnRegister.setEnabled(false);
    }
    
    public void clear(){
        txtCompanyName.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
        txtNIPNumber.setText("");
        btnRegister.setEnabled(false);
    }
    
    public void validate(){
        String cn = txtCompanyName.getText();
        String nip = txtNIPNumber.getText();
        String email = txtEmail.getText();
        String pswd = txtPassword.getText();
        if(!cn.equals("") && !nip.matches(nipPattern) && nip.length() == 10 && email.matches(emailPattern) && !pswd.equals(""))
            btnRegister.setEnabled(true);
        else
            btnRegister.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCompanyName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtNIPNumber = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rejestracja");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nazwa firmy");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Hasło");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("NIP Firmy");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 80, -1));

        txtCompanyName.setToolTipText("");
        txtCompanyName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCompanyName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCompanyNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 250, -1));

        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 250, -1));

        txtPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 250, -1));

        txtNIPNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNIPNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIPNumberActionPerformed(evt);
            }
        });
        txtNIPNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNIPNumberKeyReleased(evt);
            }
        });
        getContentPane().add(txtNIPNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 250, -1));

        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegister.setText("Zarejestruj się");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        btnReturn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReturn.setText("Wróć");
        btnReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 410, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background.png"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(1440, 810));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtNIPNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIPNumberActionPerformed
    }//GEN-LAST:event_txtNIPNumberActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        User user = new User();
        user.setName("");
        user.setSurname("");
        user.setEmail(txtEmail.getText());
        user.setPassword(txtPassword.getText());
        user.setPhone("");
        user.setPosition("");
        UserDao.save(user);
        Company company = new Company();
        company.setName(txtCompanyName.getText());
        company.setNip(txtNIPNumber.getText());
        company.setAddress("");
        company.setCity("");
        company.setZipCode("");
        company.setCountry("");
        CompanyDao.register(company);
        clear();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        new login().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void txtCompanyNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCompanyNameKeyReleased
        validate();
    }//GEN-LAST:event_txtCompanyNameKeyReleased

    private void txtNIPNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNIPNumberKeyReleased
        validate();
    }//GEN-LAST:event_txtNIPNumberKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        validate();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        validate();
    }//GEN-LAST:event_txtPasswordKeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNIPNumber;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
