/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author ari13
 */
public class AdminAddStudent extends javax.swing.JFrame {
    
    /**
     * Creates new form AdminAddStudent
     */
    public AdminAddStudent() {
        initComponents();
        
        // Set the username to the current sessions username
        adminToStudentText.setText("Hello," + CurrentSession.getUsername() + "");
        
        // Get the latest ID
        int idx = 0;
        try{
            conn c1 = new conn();
            
            String query = "SELECT * FROM student_profile";
            ResultSet rs = c1.s.executeQuery(query);
            while(rs.next()){
                idx++;
            }
            
        }catch(Exception ae){
             ae.printStackTrace();
        }
        jLabel20.setText(""+(idx+1));
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
        backButton = new javax.swing.JLabel();
        iconUniversity = new javax.swing.JLabel();
        universityName = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        adminToStudentText = new javax.swing.JLabel();
        adminLoginText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FatherName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MothersName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Phone = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        DOB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Gender = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Citizenship = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        MaritalStatus = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        SubmitAddStudent = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        addStudentSeparator = new javax.swing.JSeparator();
        editStudentSeparator = new javax.swing.JSeparator();
        assignStudentSeparator = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 200, 875, 491));

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_back_to_30px.png"))); // NOI18N

        iconUniversity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUniversity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_university_campus_100px_1.png"))); // NOI18N
        iconUniversity.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        universityName.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        universityName.setForeground(new java.awt.Color(117, 97, 119));
        universityName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        universityName.setText("X - Y - Z University");

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
        adminLoginText.setText("Add Student");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fathers Name");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mothers Name");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address");

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date Of Birth");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Gender");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Citizenship");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Marital Status");

        SubmitAddStudent.setText("Create Student");
        SubmitAddStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitAddStudentMouseClicked(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("[MAX_ID+1]");

        addStudentSeparator.setBackground(new java.awt.Color(49, 19, 51));
        addStudentSeparator.setForeground(new java.awt.Color(49, 19, 51));

        editStudentSeparator.setBackground(new java.awt.Color(49, 19, 51));
        editStudentSeparator.setForeground(new java.awt.Color(49, 19, 51));

        assignStudentSeparator.setBackground(new java.awt.Color(49, 19, 51));
        assignStudentSeparator.setForeground(new java.awt.Color(49, 19, 51));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Password");

        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(adminLoginText, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(adminToStudentText, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel1)
                            .addComponent(jLabel19)
                            .addComponent(jLabel17)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(60, 60, 60)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MaritalStatus)
                                    .addComponent(Citizenship)
                                    .addComponent(Gender)
                                    .addComponent(DOB)
                                    .addComponent(Email)
                                    .addComponent(Address)
                                    .addComponent(Phone)
                                    .addComponent(MothersName))
                                .addGap(128, 128, 128))
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rightPanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(addStudentSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editStudentSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(167, 167, 167))
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SubmitAddStudent)))
                        .addGap(38, 38, 38)
                        .addComponent(assignStudentSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminToStudentText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminLoginText, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel20))
                .addGap(4, 4, 4)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MothersName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(Citizenship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(MaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitAddStudent)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addStudentSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editStudentSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignStudentSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(universityName, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(iconUniversity, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iconUniversity, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(universityName, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addGap(244, 244, 244))
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void SubmitAddStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitAddStudentMouseClicked
        // TODO add your handling code here:
        String iddd = jLabel20.getText();
        String password = Password.getText();
        String name = Name.getText();
        String fatherName = FatherName.getText();
        String mothersName = MothersName.getText();
        String phoneNo = Phone.getText();
        String address = Address.getText();
        String email = Email.getText();
        String dateOfBirth = DOB.getText();
        String gender = Gender.getText();
        String citizenship = Citizenship.getText();
        String maritalStatus = MaritalStatus.getText();
        boolean all_valid = true;
        ArrayList<String> arr = new ArrayList<>();
        if(!isValidName(password)){
            all_valid = false;
            arr.add("Password");
        }
        if(!isValidName(name)){
            all_valid = false;
            arr.add("Name");
        }
        if(!isValidName(fatherName)){
            all_valid = false;
            arr.add("Fathers Name");
        }
        if(!isValidName(mothersName)){
            all_valid = false;
            arr.add("Mothers Name");
        }
        if(!isValidPhone(phoneNo)){
            all_valid = false;
            arr.add("Phone No");
        }
        if(!isValidName(address)){
            all_valid = false;
            arr.add("Address");
        }
        if(!isValidEmail(email)){
            all_valid = false;
            arr.add("Email");
        }
        if(!isValidDOB(dateOfBirth)){
            all_valid = false;
            arr.add("Date of Birth");
        }
        if(!isValidGender(gender)){
            all_valid = false;
            arr.add("Gender");
        }
        if(!isValidName(citizenship)){
            all_valid = false;
            arr.add("Citizenship");
        }
        if(!isValidName(maritalStatus)){
            all_valid = false;
            arr.add("Marital Status");
        }
        
        if(all_valid){
            // Insert 
            
            try{
                conn c1 = new conn();
               
                String sql1 = "INSERT INTO student_login " +
                   "VALUES (" + iddd + ", '" + password + "')";
                
                String sql2 = "INSERT INTO student_profile " +
                   "VALUES (" + iddd + ", '" + name + "', '" + fatherName + "', '" + mothersName + "', '" + 
                        phoneNo + "', '" + address + "', '" + email + "', '" + dateOfBirth + "', '" + gender + 
                        "', '" + citizenship + "', '" + maritalStatus + "')";
                
                // Uncomment This for real time application
                c1.s.executeUpdate(sql1);
                c1.s.executeUpdate(sql2);
                JOptionPane.showMessageDialog(null, "Successful!");
                
                
                jLabel20.setText(""+ (Integer.parseInt(jLabel20.getText()) + 1)  );
                Password.setText("");
                Name.setText("");
                FatherName.setText("");
                MothersName.setText("");
                Phone.setText("");
                Address.setText("");
                Email.setText("");
                DOB.setText("");
                Gender.setText("");
                Citizenship.setText("");
                MaritalStatus.setText("");
                
                //DEBUG ONLY
//                JOptionPane.showMessageDialog(null, sql1);
//                JOptionPane.showMessageDialog(null, sql2);
            }catch(Exception ae){
                 ae.printStackTrace();
            }
        }else{
            // Throw error
            String errorMessage = "Error! Correctly fill the following fields: ";
            for (String s:arr) {
                errorMessage = errorMessage + s + ",";
            }
            JOptionPane.showMessageDialog(null, errorMessage.substring(0, errorMessage.length() - 1));
        }
    }//GEN-LAST:event_SubmitAddStudentMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int option = JOptionPane.showConfirmDialog(this, "Do you want to go back?", "Are you sure?", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            AdminHome adminHomex = new AdminHome(false);
            adminHomex.setVisible(true);
            dispose(); 
        }
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
   
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AdminAddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AdminAddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AdminAddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AdminAddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AdminAddStudent().setVisible(true);
//            }
//        });
//    }
    
    public boolean isValidName(String name){
        return (name.length() > 0);
    }
    
    public boolean isValidPhone(String phone){
        return (phone.length() == 11);
    }
    
    public boolean isValidEmail(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
        return ((Pattern.compile(emailRegex).matcher(email).matches()) && (email != null)); 
    }
    
    public boolean isValidDOB(String dob){
        for (int i = 0; i < dob.length(); i++) {
            if(!((dob.charAt(i) >= '0' && dob.charAt(i) <= '9') || dob.charAt(i) == '-') ) return false;            
        }
        return true;
    }
    
    public boolean isValidGender(String gender){
        return (gender.toUpperCase().equals("MALE") || gender.toUpperCase().equals("FEMALE"));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Citizenship;
    private javax.swing.JTextField DOB;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField FatherName;
    private javax.swing.JTextField Gender;
    private javax.swing.JTextField MaritalStatus;
    private javax.swing.JTextField MothersName;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Password;
    private javax.swing.JTextField Phone;
    private javax.swing.JButton SubmitAddStudent;
    private javax.swing.JSeparator addStudentSeparator;
    private javax.swing.JLabel adminLoginText;
    private javax.swing.JLabel adminToStudentText;
    private javax.swing.JSeparator assignStudentSeparator;
    private javax.swing.JLabel backButton;
    private javax.swing.JSeparator editStudentSeparator;
    private javax.swing.JLabel iconUniversity;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel universityName;
    // End of variables declaration//GEN-END:variables
}
