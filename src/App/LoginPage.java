/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.awt.Color;

/**
 *
 * @author Sifat
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        rightAdminPanel = new javax.swing.JPanel();
        adminLoginText = new javax.swing.JLabel();
        adminEmailText = new javax.swing.JLabel();
        adminEmailTextField = new javax.swing.JTextField();
        adminEmailSeparator = new javax.swing.JSeparator();
        adminPasswordText = new javax.swing.JLabel();
        adminPasswordSeparator = new javax.swing.JSeparator();
        adminPasswordField = new javax.swing.JPasswordField();
        adminLoginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(875, 491));
        setSize(new java.awt.Dimension(875, 491));

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        rightAdminPanel.setBackground(new java.awt.Color(49, 19, 51));

        adminLoginText.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        adminLoginText.setForeground(new java.awt.Color(204, 204, 204));
        adminLoginText.setText("Admin Login");

        adminEmailText.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        adminEmailText.setForeground(new java.awt.Color(204, 204, 204));
        adminEmailText.setText("Username");

        adminEmailTextField.setBackground(new java.awt.Color(49, 19, 51));
        adminEmailTextField.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        adminEmailTextField.setForeground(new java.awt.Color(255, 255, 255));
        adminEmailTextField.setBorder(null);
        adminEmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminEmailTextFieldActionPerformed(evt);
            }
        });

        adminEmailSeparator.setBackground(new java.awt.Color(204, 204, 204));

        adminPasswordText.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        adminPasswordText.setForeground(new java.awt.Color(204, 204, 204));
        adminPasswordText.setText("Password");

        adminPasswordSeparator.setBackground(new java.awt.Color(204, 204, 204));

        adminPasswordField.setBackground(new java.awt.Color(49, 19, 51));
        adminPasswordField.setBorder(null);

        adminLoginButton.setBackground(new java.awt.Color(49, 19, 51));
        adminLoginButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        adminLoginButton.setForeground(new java.awt.Color(204, 204, 204));
        adminLoginButton.setText("Login");
        adminLoginButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout rightAdminPanelLayout = new javax.swing.GroupLayout(rightAdminPanel);
        rightAdminPanel.setLayout(rightAdminPanelLayout);
        rightAdminPanelLayout.setHorizontalGroup(
            rightAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightAdminPanelLayout.createSequentialGroup()
                .addGroup(rightAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightAdminPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(rightAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adminPasswordSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                            .addComponent(adminEmailSeparator)
                            .addComponent(adminEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminPasswordText)
                            .addComponent(adminEmailTextField)
                            .addComponent(adminLoginText, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminPasswordField)))
                    .addGroup(rightAdminPanelLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(adminLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        rightAdminPanelLayout.setVerticalGroup(
            rightAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightAdminPanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(adminLoginText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(adminEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(adminEmailSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminPasswordText)
                .addGap(18, 18, 18)
                .addComponent(adminPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(adminPasswordSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(adminLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminEmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminEmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminEmailTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator adminEmailSeparator;
    private javax.swing.JLabel adminEmailText;
    private javax.swing.JTextField adminEmailTextField;
    private javax.swing.JButton adminLoginButton;
    private javax.swing.JLabel adminLoginText;
    private javax.swing.JPasswordField adminPasswordField;
    private javax.swing.JSeparator adminPasswordSeparator;
    private javax.swing.JLabel adminPasswordText;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightAdminPanel;
    // End of variables declaration//GEN-END:variables
}
