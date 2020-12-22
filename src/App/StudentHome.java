/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import javax.swing.JOptionPane;

/**
 * @author Sifat
 */
public class StudentHome extends javax.swing.JFrame {

    /**
     * Creates new form AdminHome
     */
    public StudentHome() {
        initComponents();
        
        // Set the username to the current sessions username
        welcomeText.setText("Hello," + CurrentSession.getUsername() + "");
        
        // Show the Successful Login Prompt
        JOptionPane.showMessageDialog(null, "Successfully logged in as "+ CurrentSession.getUsername() +"");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightPanel = new javax.swing.JPanel();
        welcomeText = new javax.swing.JLabel();
        studentLoginText = new javax.swing.JLabel();
        viewDetailsButton = new javax.swing.JLabel();
        viewDetailsSeparator = new javax.swing.JSeparator();
        updateDetailsButton = new javax.swing.JLabel();
        updateDetailsSeparator = new javax.swing.JSeparator();
        ExitButton = new javax.swing.JLabel();
        ExitButtonSeparator = new javax.swing.JSeparator();
        leftPanel = new javax.swing.JPanel();
        iconUniversity = new javax.swing.JLabel();
        universityName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rightPanel.setBackground(new java.awt.Color(49, 19, 51));
        viewDetailsSeparator.setVisible(false);
        updateDetailsSeparator.setVisible(false);
        ExitButtonSeparator.setVisible(false);

        welcomeText.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        welcomeText.setForeground(new java.awt.Color(236, 240, 241));
        welcomeText.setText("Welcome, [USERNAME]");

        studentLoginText.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        studentLoginText.setForeground(new java.awt.Color(236, 240, 241));
        studentLoginText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_read_online_21px.png"))); // NOI18N
        studentLoginText.setText("Student Panel");

        viewDetailsButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        viewDetailsButton.setForeground(new java.awt.Color(236, 240, 241));
        viewDetailsButton.setText("View Details");
        viewDetailsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewDetailsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewDetailsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewDetailsButtonMouseExited(evt);
            }
        });

        updateDetailsButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        updateDetailsButton.setForeground(new java.awt.Color(236, 240, 241));
        updateDetailsButton.setText("Update Details");
        updateDetailsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateDetailsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateDetailsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateDetailsButtonMouseExited(evt);
            }
        });

        ExitButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(236, 240, 241));
        ExitButton.setText("EXIT");
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(welcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentLoginText, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewDetailsSeparator)
                            .addComponent(viewDetailsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateDetailsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateDetailsSeparator)
                            .addComponent(ExitButtonSeparator))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(welcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studentLoginText, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addGap(52, 52, 52)
                .addComponent(viewDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(viewDetailsSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(updateDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(updateDetailsSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ExitButtonSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));

        iconUniversity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUniversity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_university_campus_100px_1.png"))); // NOI18N
        iconUniversity.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        universityName.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        universityName.setForeground(new java.awt.Color(117, 97, 119));
        universityName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        universityName.setText("X - Y - Z University");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(universityName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(iconUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(iconUniversity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(universityName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(244, 244, 244))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDetailsButtonMouseClicked

    }//GEN-LAST:event_viewDetailsButtonMouseClicked

    private void updateDetailsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateDetailsButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateDetailsButtonMouseClicked

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
 
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void viewDetailsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDetailsButtonMouseEntered

        // TODO add your handling code here:
        viewDetailsSeparator.setVisible(true);
    }//GEN-LAST:event_viewDetailsButtonMouseEntered

    private void viewDetailsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDetailsButtonMouseExited
        // TODO add your handling code here:
        viewDetailsSeparator.setVisible(false);
    }//GEN-LAST:event_viewDetailsButtonMouseExited

    private void updateDetailsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateDetailsButtonMouseEntered
        // TODO add your handling code here:
        updateDetailsSeparator.setVisible(true);
    }//GEN-LAST:event_updateDetailsButtonMouseEntered

    private void updateDetailsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateDetailsButtonMouseExited
        // TODO add your handling code here:
        updateDetailsSeparator.setVisible(false);
    }//GEN-LAST:event_updateDetailsButtonMouseExited

    private void ExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseEntered
        ExitButtonSeparator.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonMouseEntered

    private void ExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseExited
        ExitButtonSeparator.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonMouseExited

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
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExitButton;
    private javax.swing.JSeparator ExitButtonSeparator;
    private javax.swing.JLabel iconUniversity;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel studentLoginText;
    private javax.swing.JLabel universityName;
    private javax.swing.JLabel updateDetailsButton;
    private javax.swing.JSeparator updateDetailsSeparator;
    private javax.swing.JLabel viewDetailsButton;
    private javax.swing.JSeparator viewDetailsSeparator;
    private javax.swing.JLabel welcomeText;
    // End of variables declaration//GEN-END:variables
}
