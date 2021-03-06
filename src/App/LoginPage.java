
package App;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {
    
    public LoginPage() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        iconUniversity = new javax.swing.JLabel();
        universityName = new javax.swing.JLabel();
        rightAdminPanel = new javax.swing.JPanel();
        adminLoginText = new javax.swing.JLabel();
        adminUsernameText = new javax.swing.JLabel();
        adminUserNameTextField = new javax.swing.JTextField();
        adminUsernameSeparator = new javax.swing.JSeparator();
        adminPasswordText = new javax.swing.JLabel();
        adminPasswordSeparator = new javax.swing.JSeparator();
        adminPasswordField = new javax.swing.JPasswordField();
        adminLoginButton = new javax.swing.JButton();
        adminToStudentText = new javax.swing.JLabel();
        adminToStudentSeparator = new javax.swing.JSeparator();
        rightStudentPanel = new javax.swing.JPanel();
        studentLoginText = new javax.swing.JLabel();
        studentIdText = new javax.swing.JLabel();
        studentIdTextField = new javax.swing.JTextField();
        studentUsernameSeparator = new javax.swing.JSeparator();
        studentPasswordText = new javax.swing.JLabel();
        studentPasswordSeparator = new javax.swing.JSeparator();
        studentPasswordField = new javax.swing.JPasswordField();
        studentLoginButton = new javax.swing.JButton();
        studentToAdminText = new javax.swing.JLabel();
        studentToAdminSeparator = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 200, 875, 491));
        setLocation(new java.awt.Point(200, 200));
        setPreferredSize(new java.awt.Dimension(875, 491));
        setSize(new java.awt.Dimension(875, 491));

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
                .addGap(122, 122, 122)
                .addComponent(iconUniversity, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addGap(143, 143, 143))
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(universityName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(96, 96, 96))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(iconUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(universityName, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(244, 244, 244))
        );

        rightAdminPanel.setBackground(new java.awt.Color(49, 19, 51));

        adminLoginText.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        adminLoginText.setForeground(new java.awt.Color(204, 204, 204));
        adminLoginText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_database_administrator_21px.png"))); // NOI18N
        adminLoginText.setText("Admin Login");

        adminUsernameText.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        adminUsernameText.setForeground(new java.awt.Color(204, 204, 204));
        adminUsernameText.setText("Username");

        adminUserNameTextField.setBackground(new java.awt.Color(49, 19, 51));
        adminUserNameTextField.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        adminUserNameTextField.setForeground(new java.awt.Color(255, 255, 255));
        adminUserNameTextField.setBorder(null);


        adminUsernameSeparator.setBackground(new java.awt.Color(204, 204, 204));

        adminPasswordText.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        adminPasswordText.setForeground(new java.awt.Color(204, 204, 204));
        adminPasswordText.setText("Password");

        adminPasswordSeparator.setBackground(new java.awt.Color(204, 204, 204));

        adminPasswordField.setBackground(new java.awt.Color(49, 19, 51));
        adminPasswordField.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        adminPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        adminPasswordField.setBorder(null);

        adminLoginButton.setBackground(new java.awt.Color(49, 19, 51));
        adminLoginButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        adminLoginButton.setForeground(new java.awt.Color(204, 204, 204));
        adminLoginButton.setText("Login as admin");
        adminLoginButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        adminLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginButtonActionPerformed(evt);
            }
        });

        adminToStudentText.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        adminToStudentText.setForeground(new java.awt.Color(204, 204, 204));
        adminToStudentText.setText("Click here to login as student.");
        adminToStudentText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminToStudentTextMouseClicked(evt);
            }
        });

        adminToStudentSeparator.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout rightAdminPanelLayout = new javax.swing.GroupLayout(rightAdminPanel);
        rightAdminPanel.setLayout(rightAdminPanelLayout);
        rightAdminPanelLayout.setHorizontalGroup(
            rightAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightAdminPanelLayout.createSequentialGroup()
                .addGroup(rightAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightAdminPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(rightAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminPasswordSeparator)
                            .addComponent(adminUsernameSeparator)
                            .addComponent(adminUserNameTextField)
                            .addComponent(adminPasswordField)
                            .addGroup(rightAdminPanelLayout.createSequentialGroup()
                                .addGroup(rightAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(rightAdminPanelLayout.createSequentialGroup()
                                        .addComponent(adminUsernameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(143, 143, 143))
                                    .addGroup(rightAdminPanelLayout.createSequentialGroup()
                                        .addComponent(adminPasswordText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(153, 153, 153))
                                    .addComponent(adminLoginText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(119, 119, 119))))
                    .addGroup(rightAdminPanelLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(adminLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(69, 69, 69)))
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightAdminPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(rightAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminToStudentText, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminToStudentSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        rightAdminPanelLayout.setVerticalGroup(
            rightAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightAdminPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(adminToStudentText, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(adminToStudentSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 9, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminLoginText, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(adminUsernameText, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(adminUserNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(adminUsernameSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 9, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(adminPasswordText, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(adminPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(adminPasswordSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 7, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(adminLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(105, 105, 105))
        );

        rightAdminPanel.setVisible(false);

        rightStudentPanel.setBackground(new java.awt.Color(49, 19, 51));


        studentLoginText.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        studentLoginText.setForeground(new java.awt.Color(204, 204, 204));
        studentLoginText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_read_online_21px.png"))); // NOI18N
        studentLoginText.setText("Student Login");

        studentIdText.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        studentIdText.setForeground(new java.awt.Color(204, 204, 204));
        studentIdText.setText("ID");

        studentIdTextField.setBackground(new java.awt.Color(49, 19, 51));
        studentIdTextField.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        studentIdTextField.setForeground(new java.awt.Color(255, 255, 255));
        studentIdTextField.setBorder(null);


        studentUsernameSeparator.setBackground(new java.awt.Color(204, 204, 204));

        studentPasswordText.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        studentPasswordText.setForeground(new java.awt.Color(204, 204, 204));
        studentPasswordText.setText("Password");

        studentPasswordSeparator.setBackground(new java.awt.Color(204, 204, 204));

        studentPasswordField.setBackground(new java.awt.Color(49, 19, 51));
        studentPasswordField.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        studentPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        studentPasswordField.setBorder(null);

        studentLoginButton.setBackground(new java.awt.Color(49, 19, 51));
        studentLoginButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        studentLoginButton.setForeground(new java.awt.Color(204, 204, 204));
        studentLoginButton.setText("Login as student");
        studentLoginButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        studentLoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentLoginButtonMouseClicked(evt);
            }
        });

        studentToAdminText.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        studentToAdminText.setForeground(new java.awt.Color(204, 204, 204));
        studentToAdminText.setText("Click here to login as admin.");
        studentToAdminText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentToAdminTextMouseClicked(evt);
            }

        });

        studentToAdminSeparator.setBackground(new java.awt.Color(204, 204, 204));

        //rightStudentPanel.setVisible(false);

        javax.swing.GroupLayout rightStudentPanelLayout = new javax.swing.GroupLayout(rightStudentPanel);
        rightStudentPanel.setLayout(rightStudentPanelLayout);
        rightStudentPanelLayout.setHorizontalGroup(
            rightStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightStudentPanelLayout.createSequentialGroup()
                .addGroup(rightStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightStudentPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(rightStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentPasswordSeparator)
                            .addComponent(studentUsernameSeparator)
                            .addGroup(rightStudentPanelLayout.createSequentialGroup()
                                .addComponent(studentIdText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(262, 262, 262))
                            .addGroup(rightStudentPanelLayout.createSequentialGroup()
                                .addComponent(studentPasswordText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(272, 272, 272))
                            .addComponent(studentIdTextField)
                            .addGroup(rightStudentPanelLayout.createSequentialGroup()
                                .addComponent(studentLoginText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(119, 119, 119))
                            .addComponent(studentPasswordField)))
                    .addGroup(rightStudentPanelLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(studentLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(51, 51, 51)))
                .addGap(99, 99, 99))
            .addGroup(rightStudentPanelLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addGroup(rightStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentToAdminText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightStudentPanelLayout.createSequentialGroup()
                        .addComponent(studentToAdminSeparator)
                        .addGap(32, 32, 32))))
        );
        rightStudentPanelLayout.setVerticalGroup(
            rightStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightStudentPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(studentToAdminText, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentToAdminSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 11, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studentLoginText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(studentIdText, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(studentIdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(studentUsernameSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 11, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(studentPasswordText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(studentPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(studentPasswordSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 11, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(studentLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(105, 105, 105))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(410, 410, 410)
                    .addComponent(rightStudentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(rightStudentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminToStudentTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminToStudentTextMouseClicked

        int option = JOptionPane.showConfirmDialog(this, "Do you want to login in as student?", "Are you sure?", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            rightAdminPanel.setVisible(false);
            rightStudentPanel.setVisible(true);
        }
    }//GEN-LAST:event_adminToStudentTextMouseClicked



    private void studentToAdminTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentToAdminTextMouseClicked

        int option = JOptionPane.showConfirmDialog(this, "Do you want to login in as admin?", "Are you sure?", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            rightAdminPanel.setVisible(true);
            rightStudentPanel.setVisible(false);
        }
    }//GEN-LAST:event_studentToAdminTextMouseClicked

    private void adminLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginButtonActionPerformed
        Credential credentials = new Credential();
        String username = this.adminUserNameTextField.getText();
        String password = String.valueOf(this.adminPasswordField.getPassword());
        
        try {
            if(credentials.isCorrectCredentials(username,password)){
                
                // Set The Credentials in the Current Session
                CurrentSession.setIsLoggedIn(true);
                CurrentSession.setIsAdmin(true);
                CurrentSession.setID(0);
                CurrentSession.setUsername(username);
                
                AdminHome adminHomex = new AdminHome();
                adminHomex.setVisible(true);
                dispose();
                
            }
        } catch (InvalidCredentials ex) {
            JOptionPane.showMessageDialog(null, "Invalid Credentials!");
        } catch (SQLException ex) {
            System.out.println("SQL error");
       
    }
       
    }//GEN-LAST:event_adminLoginButtonActionPerformed

    private void studentLoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentLoginButtonMouseClicked

        Credential credentials = new Credential();
        int id = Integer.parseInt(this.studentIdTextField.getText());
        String password = String.valueOf(this.studentPasswordField.getPassword());
        
        try {
            if(credentials.isCorrectCredentials(id,password)){
                CurrentSession.setIsLoggedIn(true);
                CurrentSession.setID(id);
                
                StudentHome studentHomex = new StudentHome();
                studentHomex.setVisible(true);
                dispose();
                
                
                JOptionPane.showMessageDialog(null, "Successfully logged in as student id = "+ CurrentSession.getID());
            }
        } catch (InvalidCredentials ex) {
            JOptionPane.showMessageDialog(null, "Invalid Credentials!");
        } catch (SQLException ex) {
            System.out.println("SQL error");
        }
    }//GEN-LAST:event_studentLoginButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminLoginButton;
    private javax.swing.JLabel adminLoginText;
    private javax.swing.JPasswordField adminPasswordField;
    private javax.swing.JSeparator adminPasswordSeparator;
    private javax.swing.JLabel adminPasswordText;
    private javax.swing.JSeparator adminToStudentSeparator;
    private javax.swing.JLabel adminToStudentText;
    private javax.swing.JTextField adminUserNameTextField;
    private javax.swing.JSeparator adminUsernameSeparator;
    private javax.swing.JLabel adminUsernameText;
    private javax.swing.JLabel iconUniversity;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightAdminPanel;
    private javax.swing.JPanel rightStudentPanel;
    private javax.swing.JLabel studentIdText;
    private javax.swing.JTextField studentIdTextField;
    private javax.swing.JButton studentLoginButton;
    private javax.swing.JLabel studentLoginText;
    private javax.swing.JPasswordField studentPasswordField;
    private javax.swing.JSeparator studentPasswordSeparator;
    private javax.swing.JLabel studentPasswordText;
    private javax.swing.JSeparator studentToAdminSeparator;
    private javax.swing.JLabel studentToAdminText;
    private javax.swing.JSeparator studentUsernameSeparator;
    private javax.swing.JLabel universityName;
    // End of variables declaration//GEN-END:variables
}
