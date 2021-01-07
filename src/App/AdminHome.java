
package App;

import javax.swing.JOptionPane;


public class AdminHome extends javax.swing.JFrame {

    /**
     * Creates new form AdminHome
     * 
     */
    public AdminHome(boolean fromBackBtn) {
        initComponents();
        
        // Set the username to the current sessions username
        adminToStudentText.setText("Hello," + CurrentSession.getUsername() + "");
        
        // Show the Successful Login Prompt
        if(fromBackBtn) JOptionPane.showMessageDialog(null, "Successfully logged in as "+CurrentSession.getUsername() +"");
    }
    
    public AdminHome() {
        initComponents();
        
        // Set the username to the current sessions username
        adminToStudentText.setText("Hello," + CurrentSession.getUsername() + "");
        
        // Show the Successful Login Prompt
        JOptionPane.showMessageDialog(null, "Successfully logged in as "+CurrentSession.getUsername() +"");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightPanel = new javax.swing.JPanel();
        adminToStudentText = new javax.swing.JLabel();
        adminLoginText = new javax.swing.JLabel();
        AddStudentButton = new javax.swing.JLabel();
        addStudentSeparator = new javax.swing.JSeparator();
        EditStudentButton = new javax.swing.JLabel();
        editStudentSeparator = new javax.swing.JSeparator();
        AssignStudentButton = new javax.swing.JLabel();
        assignStudentSeparator = new javax.swing.JSeparator();
        leftPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JLabel();
        iconUniversity = new javax.swing.JLabel();
        universityName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 200, 875, 491));

        rightPanel.setBackground(new java.awt.Color(49, 19, 51));
        addStudentSeparator.setVisible(false);
        editStudentSeparator.setVisible(false);
        assignStudentSeparator.setVisible(false);

        adminToStudentText.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        adminToStudentText.setForeground(new java.awt.Color(236, 240, 241));
        adminToStudentText.setText("Welcome, [USERNAME]");

        adminLoginText.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        adminLoginText.setForeground(new java.awt.Color(236, 240, 241));
        adminLoginText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_database_administrator_21px.png"))); // NOI18N
        adminLoginText.setText("Admin Panel");

        AddStudentButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        AddStudentButton.setForeground(new java.awt.Color(236, 240, 241));
        AddStudentButton.setText("Add Student");
        AddStudentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddStudentButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddStudentButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddStudentButtonMouseExited(evt);
            }
        });

        EditStudentButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        EditStudentButton.setForeground(new java.awt.Color(236, 240, 241));
        EditStudentButton.setText("Edit Student Details");
        EditStudentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditStudentButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EditStudentButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EditStudentButtonMouseExited(evt);
            }
        });

        AssignStudentButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        AssignStudentButton.setForeground(new java.awt.Color(236, 240, 241));
        AssignStudentButton.setText("Assign Courses");
        AssignStudentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AssignStudentButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AssignStudentButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AssignStudentButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(adminToStudentText, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminLoginText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addStudentSeparator)
                            .addComponent(AddStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(AssignStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editStudentSeparator)
                            .addComponent(assignStudentSeparator))
                        .addGap(0, 334, Short.MAX_VALUE)))
                .addContainerGap())
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(adminToStudentText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminLoginText, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addGap(52, 52, 52)
                .addComponent(AddStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(addStudentSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(EditStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(editStudentSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(AssignStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(assignStudentSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_back_to_30px.png"))); // NOI18N

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
                        .addComponent(iconUniversity, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(iconUniversity, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(universityName, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(244, 244, 244))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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

    private void AddStudentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStudentButtonMouseClicked

        //JOptionPane.showMessageDialog(null, "Clicked The Add Student Button");
        AdminAddStudent adminaddstudent = new AdminAddStudent();
        adminaddstudent.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_AddStudentButtonMouseClicked

    private void EditStudentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditStudentButtonMouseClicked
        
        AdminEditStudent admineditstudent = new AdminEditStudent();
        admineditstudent.setVisible(true);
        dispose();
    }//GEN-LAST:event_EditStudentButtonMouseClicked

    private void AssignStudentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AssignStudentButtonMouseClicked
        
        AdminAssignCourse adminassigncourse = new AdminAssignCourse();
        adminassigncourse.setVisible(true);
        dispose();
    }//GEN-LAST:event_AssignStudentButtonMouseClicked

    private void AddStudentButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStudentButtonMouseEntered

        
        addStudentSeparator.setVisible(true);
    }//GEN-LAST:event_AddStudentButtonMouseEntered

    private void AddStudentButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStudentButtonMouseExited
        
        addStudentSeparator.setVisible(false);
    }//GEN-LAST:event_AddStudentButtonMouseExited

    private void EditStudentButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditStudentButtonMouseEntered
        
        editStudentSeparator.setVisible(true);
    }//GEN-LAST:event_EditStudentButtonMouseEntered

    private void EditStudentButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditStudentButtonMouseExited
        
        editStudentSeparator.setVisible(false);
    }//GEN-LAST:event_EditStudentButtonMouseExited

    private void AssignStudentButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AssignStudentButtonMouseEntered
        assignStudentSeparator.setVisible(true);
        
    }//GEN-LAST:event_AssignStudentButtonMouseEntered

    private void AssignStudentButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AssignStudentButtonMouseExited
        assignStudentSeparator.setVisible(false);
        
    }//GEN-LAST:event_AssignStudentButtonMouseExited

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddStudentButton;
    private javax.swing.JLabel AssignStudentButton;
    private javax.swing.JLabel EditStudentButton;
    private javax.swing.JSeparator addStudentSeparator;
    private javax.swing.JLabel adminLoginText;
    private javax.swing.JLabel adminToStudentText;
    private javax.swing.JSeparator assignStudentSeparator;
    private javax.swing.JLabel backButton;
    private javax.swing.JSeparator editStudentSeparator;
    private javax.swing.JLabel iconUniversity;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel universityName;
    // End of variables declaration//GEN-END:variables
}
