
package App;

import javax.swing.JOptionPane;

public class StudentHome extends javax.swing.JFrame {

    public StudentHome() {
        initComponents();
        
        welcomeText.setText("Welcome, ID = "+CurrentSession.getID());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightPanel = new javax.swing.JPanel();
        welcomeText = new javax.swing.JLabel();
        studentLoginText = new javax.swing.JLabel();
        viewDetailsButton = new javax.swing.JLabel();
        viewDetailsSeparator = new javax.swing.JSeparator();
        ExitButton = new javax.swing.JLabel();
        ExitButtonSeparator = new javax.swing.JSeparator();
        resetButton = new javax.swing.JLabel();
        resetButtonSeparator = new javax.swing.JSeparator();
        leftPanel = new javax.swing.JPanel();
        iconUniversity = new javax.swing.JLabel();
        universityName = new javax.swing.JLabel();
        backButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 200, 875, 491));

        rightPanel.setBackground(new java.awt.Color(49, 19, 51));
        viewDetailsSeparator.setVisible(false);
        ExitButtonSeparator.setVisible(false);
        resetButtonSeparator.setVisible(false);

        welcomeText.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        welcomeText.setForeground(new java.awt.Color(236, 240, 241));
        welcomeText.setText("Welcome, [USERNAME]");

        studentLoginText.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        studentLoginText.setForeground(new java.awt.Color(236, 240, 241));
        studentLoginText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_read_online_21px.png"))); // NOI18N
        studentLoginText.setText("Student Panel");

        viewDetailsButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        viewDetailsButton.setForeground(new java.awt.Color(236, 240, 241));
        viewDetailsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_more_details_25px_2.png"))); // NOI18N
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

        ExitButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(236, 240, 241));
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_exit_25px.png"))); // NOI18N
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

        resetButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        resetButton.setForeground(new java.awt.Color(236, 240, 241));
        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_reset_25px_2.png"))); // NOI18N
        resetButton.setText("Reset Password");
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetButtonMouseExited(evt);
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
                            .addComponent(viewDetailsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExitButtonSeparator)
                            .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetButtonSeparator, javax.swing.GroupLayout.Alignment.TRAILING))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewDetailsSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetButtonSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ExitButtonSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));

        iconUniversity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUniversity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_university_campus_100px_1.png"))); // NOI18N
        iconUniversity.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        universityName.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        universityName.setForeground(new java.awt.Color(117, 97, 119));
        universityName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        universityName.setText("X - Y - Z University");

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_back_to_30px.png"))); // NOI18N
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(universityName, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton)
                            .addComponent(iconUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(42, 42, 42)
                .addComponent(iconUniversity, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(universityName, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(255, 255, 255))
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
        StudentViewDetails svd = new StudentViewDetails();
        svd.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_viewDetailsButtonMouseClicked

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        int option = JOptionPane.showConfirmDialog(this, "Do you want to go back?", "Are you sure?", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            LoginPage loginPagex = new LoginPage();
            loginPagex.setVisible(true);
            dispose(); 
        }
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void viewDetailsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDetailsButtonMouseEntered
        viewDetailsSeparator.setVisible(true);
    }//GEN-LAST:event_viewDetailsButtonMouseEntered

    private void viewDetailsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDetailsButtonMouseExited
        viewDetailsSeparator.setVisible(false);
    }//GEN-LAST:event_viewDetailsButtonMouseExited

    private void ExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseEntered
        ExitButtonSeparator.setVisible(true);
    }//GEN-LAST:event_ExitButtonMouseEntered

    private void ExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseExited
        ExitButtonSeparator.setVisible(false);
    }//GEN-LAST:event_ExitButtonMouseExited

    private void resetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseClicked
        StudentPasswordReset spr = new StudentPasswordReset();
        spr.setVisible(true);
        dispose();
    }//GEN-LAST:event_resetButtonMouseClicked

    private void resetButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseEntered
        resetButtonSeparator.setVisible(true);
    }//GEN-LAST:event_resetButtonMouseEntered

    private void resetButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseExited
        resetButtonSeparator.setVisible(false);
    }//GEN-LAST:event_resetButtonMouseExited

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        int option = JOptionPane.showConfirmDialog(this, "Do you want to go back?", "Are you sure?", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            LoginPage loginPagex = new LoginPage();
            loginPagex.setVisible(true);
            dispose(); 
        }
    }//GEN-LAST:event_backButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExitButton;
    private javax.swing.JSeparator ExitButtonSeparator;
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel iconUniversity;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel resetButton;
    private javax.swing.JSeparator resetButtonSeparator;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel studentLoginText;
    private javax.swing.JLabel universityName;
    private javax.swing.JLabel viewDetailsButton;
    private javax.swing.JSeparator viewDetailsSeparator;
    private javax.swing.JLabel welcomeText;
    // End of variables declaration//GEN-END:variables
}
