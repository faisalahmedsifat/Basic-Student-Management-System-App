
package App;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class StudentPasswordReset extends javax.swing.JFrame {
    private int id = CurrentSession.getID();
    private Student curStudent = new Student();
    private Credential credential = new Credential();

    public StudentPasswordReset() {
        initComponents();
        welcomeText.setText("Welcome, ID = "+id);
        idLabel.setText(""+id);
        try {
            curStudent = new Student(id);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        // Show the Successful Login Prompt
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightPanel = new javax.swing.JPanel();
        welcomeText = new javax.swing.JLabel();
        confirmPasswordLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        welcomeSeparator = new javax.swing.JSeparator();
        idConst = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        newPasswordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        saveButton = new javax.swing.JPanel();
        saveLabel = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        iconUniversity = new javax.swing.JLabel();
        universityName = new javax.swing.JLabel();
        backButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 200, 875, 491));

        rightPanel.setBackground(new java.awt.Color(49, 19, 51));
        rightPanel.setLayout(null);

        welcomeText.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        welcomeText.setForeground(new java.awt.Color(236, 240, 241));
        welcomeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeText.setText("Welcome");
        rightPanel.add(welcomeText);
        welcomeText.setBounds(450, 50, 176, 20);

        confirmPasswordLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        confirmPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        confirmPasswordLabel.setText("Confirm new password    :");
        rightPanel.add(confirmPasswordLabel);
        confirmPasswordLabel.setBounds(60, 350, 150, 16);

        idLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        rightPanel.add(idLabel);
        idLabel.setBounds(230, 90, 370, 20);
        rightPanel.add(welcomeSeparator);
        welcomeSeparator.setBounds(460, 70, 170, 10);

        idConst.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        idConst.setForeground(new java.awt.Color(255, 255, 255));
        idConst.setText("ID                                       :");
        rightPanel.add(idConst);
        idConst.setBounds(62, 93, 160, 16);

        passwordLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password                          :");
        rightPanel.add(passwordLabel);
        passwordLabel.setBounds(60, 180, 160, 16);

        newPasswordLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        newPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        newPasswordLabel.setText("New Password                 :");
        rightPanel.add(newPasswordLabel);
        newPasswordLabel.setBounds(60, 270, 160, 16);
        rightPanel.add(passwordField);
        passwordField.setBounds(220, 170, 350, 30);
        rightPanel.add(newPasswordField);
        newPasswordField.setBounds(220, 260, 350, 30);
        rightPanel.add(confirmPasswordField);
        confirmPasswordField.setBounds(220, 340, 350, 30);

        saveButton.setBackground(new java.awt.Color(98, 74, 100));
        saveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        saveLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        saveLabel.setForeground(new java.awt.Color(255, 255, 255));
        saveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saveLabel.setText("Save");
        saveLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout saveButtonLayout = new javax.swing.GroupLayout(saveButton);
        saveButton.setLayout(saveButtonLayout);
        saveButtonLayout.setHorizontalGroup(
            saveButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saveButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        saveButtonLayout.setVerticalGroup(
            saveButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        rightPanel.add(saveButton);
        saveButton.setBounds(240, 420, 230, 60);

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
                    .addComponent(universityName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backButton))
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(28, 28, 28)
                .addComponent(iconUniversity, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(universityName, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addGap(244, 244, 244))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveLabelMouseClicked
        try {
            // TODO add your handling code here:
            String oldPassword = String.valueOf(this.passwordField.getPassword());
            String newPassword = String.valueOf(this.newPasswordField.getPassword());
            String confirmPassword = String.valueOf(this.confirmPasswordField.getPassword());
            
            if(credential.isCorrectCredentials(id,oldPassword)){
                if(allValid()){
                    if(newPassword.equals(confirmPassword)){
                        changePassword(id, newPassword);
                        String EmptyText = "";
                        
                        
                        this.passwordField.setText(EmptyText);
                        this.newPasswordField.setText(EmptyText);
                        this.confirmPasswordField.setText(EmptyText);
                    }else{
                        JOptionPane.showMessageDialog(confirmPasswordField, "Your passwords don't match!");
                    }
                }
            }
        }  catch (InvalidCredentials ex) {
            JOptionPane.showMessageDialog(null, "Entered Wrong Credentials");
        } catch (SQLException ex) {
            System.out.println("SQL error");
        }
    }//GEN-LAST:event_saveLabelMouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        int option = JOptionPane.showConfirmDialog(this, "Do you want to go back?", "Are you sure?", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            new StudentHome().setVisible(true);
            dispose(); 
        }
    }//GEN-LAST:event_backButtonMouseClicked

    
    private void changePassword(int id, String password){
        curStudent.setPassword(password);
        
        //Update the instance to the database
        try{
            curStudent.updatePassToDatabase();
            JOptionPane.showMessageDialog(null, "Successfully Updated!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Occured!");
        }
    }
    
    private boolean allValid(){
        boolean valid = true;
        
        Map<String,String> updatedFields = new LinkedHashMap<>();
        updatedFields.put("password", String.valueOf(this.newPasswordField.getPassword()));
        
        try{
            new Validator(updatedFields);
        }catch(InvalidInput e){
            valid = false;
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return valid;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backButton;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JLabel iconUniversity;
    private javax.swing.JLabel idConst;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel saveButton;
    private javax.swing.JLabel saveLabel;
    private javax.swing.JLabel universityName;
    private javax.swing.JSeparator welcomeSeparator;
    private javax.swing.JLabel welcomeText;
    // End of variables declaration//GEN-END:variables
}
