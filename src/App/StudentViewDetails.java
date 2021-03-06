
package App;


import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class StudentViewDetails extends javax.swing.JFrame {
    private int id = CurrentSession.getID();
    private Student curStudent = new Student();
    
    public StudentViewDetails() {
        initComponents();
        welcomeText.setText("Welcome, ID = "+CurrentSession.getID());
        scanAllDetails();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightPanel = new javax.swing.JPanel();
        refreshLabel = new javax.swing.JLabel();
        fullNameConst = new javax.swing.JLabel();
        idConst = new javax.swing.JLabel();
        dateOfBirthConst = new javax.swing.JLabel();
        fatherNameConst = new javax.swing.JLabel();
        motherNameConst = new javax.swing.JLabel();
        genderConst = new javax.swing.JLabel();
        addressConst = new javax.swing.JLabel();
        cellPhoneConst = new javax.swing.JLabel();
        fullNameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        dateOfBirthLabel = new javax.swing.JLabel();
        fatherNameLabel = new javax.swing.JLabel();
        motherNameLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        cellPhoneLabel = new javax.swing.JLabel();
        emailConst = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        citizenshipConst = new javax.swing.JLabel();
        citizenshipLabel = new javax.swing.JLabel();
        maritalStatusConst = new javax.swing.JLabel();
        maritalStatusLabel = new javax.swing.JLabel();
        editCellLabel = new javax.swing.JLabel();
        editAddressLabel = new javax.swing.JLabel();
        editEmailLabel = new javax.swing.JLabel();
        editMaritalLabel = new javax.swing.JLabel();
        editMaritalTextField = new javax.swing.JTextField();
        editCellTextField = new javax.swing.JTextField();
        editAddressTextField = new javax.swing.JTextField();
        editEmailTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        welcomeText = new javax.swing.JLabel();
        saveChangesLabel = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        iconUniversity = new javax.swing.JLabel();
        universityName = new javax.swing.JLabel();
        backButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 200, 875, 491));

        rightPanel.setBackground(new java.awt.Color(49, 19, 51));
        rightPanel.setLayout(null);
        editCellTextField.setVisible(false);
        editMaritalTextField.setVisible(false);
        editEmailTextField.setVisible(false);
        editAddressTextField.setVisible(false);

        refreshLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        refreshLabel.setForeground(new java.awt.Color(236, 240, 241));
        refreshLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_refresh_25px.png"))); // NOI18N
        refreshLabel.setText("Refresh");
        refreshLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshLabelMouseClicked(evt);
            }
        });
        rightPanel.add(refreshLabel);
        refreshLabel.setBounds(20, 20, 176, 30);

        fullNameConst.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        fullNameConst.setForeground(new java.awt.Color(255, 255, 255));
        fullNameConst.setText("Full Name            :");
        rightPanel.add(fullNameConst);
        fullNameConst.setBounds(62, 127, 117, 24);

        idConst.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        idConst.setForeground(new java.awt.Color(255, 255, 255));
        idConst.setText("ID                          :");
        rightPanel.add(idConst);
        idConst.setBounds(62, 93, 117, 16);

        dateOfBirthConst.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        dateOfBirthConst.setForeground(new java.awt.Color(255, 255, 255));
        dateOfBirthConst.setText("Date Of Birth       :");
        rightPanel.add(dateOfBirthConst);
        dateOfBirthConst.setBounds(62, 357, 117, 16);

        fatherNameConst.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        fatherNameConst.setForeground(new java.awt.Color(255, 255, 255));
        fatherNameConst.setText("Father's Name    :");
        rightPanel.add(fatherNameConst);
        fatherNameConst.setBounds(62, 169, 117, 16);

        motherNameConst.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        motherNameConst.setForeground(new java.awt.Color(255, 255, 255));
        motherNameConst.setText("Mother's Name   :");
        rightPanel.add(motherNameConst);
        motherNameConst.setBounds(62, 203, 117, 16);

        genderConst.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        genderConst.setForeground(new java.awt.Color(255, 255, 255));
        genderConst.setText("Gender                :");
        rightPanel.add(genderConst);
        genderConst.setBounds(62, 395, 117, 16);

        addressConst.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        addressConst.setForeground(new java.awt.Color(255, 255, 255));
        addressConst.setText("Address               :");
        rightPanel.add(addressConst);
        addressConst.setBounds(62, 278, 117, 16);

        cellPhoneConst.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cellPhoneConst.setForeground(new java.awt.Color(255, 255, 255));
        cellPhoneConst.setText("Cell Phone          :");
        rightPanel.add(cellPhoneConst);
        cellPhoneConst.setBounds(62, 237, 117, 16);

        fullNameLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        fullNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        fullNameLabel.setText("Hello");
        rightPanel.add(fullNameLabel);
        fullNameLabel.setBounds(185, 127, 416, 24);

        idLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setText("Hello");
        rightPanel.add(idLabel);
        idLabel.setBounds(185, 93, 416, 16);

        dateOfBirthLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        dateOfBirthLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateOfBirthLabel.setText("Hello");
        rightPanel.add(dateOfBirthLabel);
        dateOfBirthLabel.setBounds(185, 354, 416, 23);

        fatherNameLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        fatherNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        fatherNameLabel.setText("Hello");
        rightPanel.add(fatherNameLabel);
        fatherNameLabel.setBounds(185, 169, 416, 16);

        motherNameLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        motherNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        motherNameLabel.setText("Hello");
        rightPanel.add(motherNameLabel);
        motherNameLabel.setBounds(185, 203, 416, 16);

        genderLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setText("Hello");
        rightPanel.add(genderLabel);
        genderLabel.setBounds(185, 395, 416, 16);

        addressLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressLabel.setText("Hello");
        rightPanel.add(addressLabel);
        addressLabel.setBounds(185, 275, 416, 30);

        cellPhoneLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cellPhoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        cellPhoneLabel.setText("Hello");
        rightPanel.add(cellPhoneLabel);
        cellPhoneLabel.setBounds(185, 237, 416, 16);

        emailConst.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        emailConst.setForeground(new java.awt.Color(255, 255, 255));
        emailConst.setText("Email                    :");
        rightPanel.add(emailConst);
        emailConst.setBounds(62, 320, 117, 16);

        emailLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Hello");
        rightPanel.add(emailLabel);
        emailLabel.setBounds(185, 320, 416, 16);

        citizenshipConst.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        citizenshipConst.setForeground(new java.awt.Color(255, 255, 255));
        citizenshipConst.setText("Citizenship         :");
        rightPanel.add(citizenshipConst);
        citizenshipConst.setBounds(62, 429, 117, 16);

        citizenshipLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        citizenshipLabel.setForeground(new java.awt.Color(255, 255, 255));
        citizenshipLabel.setText("hello");
        rightPanel.add(citizenshipLabel);
        citizenshipLabel.setBounds(185, 429, 416, 16);

        maritalStatusConst.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        maritalStatusConst.setForeground(new java.awt.Color(255, 255, 255));
        maritalStatusConst.setText("Marital Status     :");
        rightPanel.add(maritalStatusConst);
        maritalStatusConst.setBounds(62, 463, 117, 16);

        maritalStatusLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        maritalStatusLabel.setForeground(new java.awt.Color(255, 255, 255));
        maritalStatusLabel.setText("Hello");
        rightPanel.add(maritalStatusLabel);
        maritalStatusLabel.setBounds(185, 463, 416, 16);

        editCellLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_edit_20px.png"))); // NOI18N
        editCellLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editCellLabelMouseClicked(evt);
            }
        });
        rightPanel.add(editCellLabel);
        editCellLabel.setBounds(607, 237, 20, 16);

        editAddressLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_edit_20px.png"))); // NOI18N
        editAddressLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editAddressLabelMouseClicked(evt);
            }
        });
        rightPanel.add(editAddressLabel);
        editAddressLabel.setBounds(607, 271, 20, 16);

        editEmailLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_edit_20px.png"))); // NOI18N
        editEmailLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editEmailLabelMouseClicked(evt);
            }
        });
        rightPanel.add(editEmailLabel);
        editEmailLabel.setBounds(607, 320, 20, 16);

        editMaritalLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_edit_20px.png"))); // NOI18N
        editMaritalLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMaritalLabelMouseClicked(evt);
            }
        });
        rightPanel.add(editMaritalLabel);
        editMaritalLabel.setBounds(610, 460, 20, 16);

        editMaritalTextField.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        rightPanel.add(editMaritalTextField);
        editMaritalTextField.setBounds(180, 450, 410, 30);

        editCellTextField.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        rightPanel.add(editCellTextField);
        editCellTextField.setBounds(180, 230, 410, 30);

        editAddressTextField.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        rightPanel.add(editAddressTextField);
        editAddressTextField.setBounds(180, 270, 410, 30);

        editEmailTextField.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        rightPanel.add(editEmailTextField);
        editEmailTextField.setBounds(180, 310, 410, 30);
        rightPanel.add(jSeparator1);
        jSeparator1.setBounds(450, 70, 160, 10);

        welcomeText.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        welcomeText.setForeground(new java.awt.Color(236, 240, 241));
        welcomeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeText.setText("Welcome, ");
        rightPanel.add(welcomeText);
        welcomeText.setBounds(450, 10, 176, 31);

        saveChangesLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        saveChangesLabel.setForeground(new java.awt.Color(236, 240, 241));
        saveChangesLabel.setText("Click Here to save changes");
        saveChangesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveChangesLabelMouseClicked(evt);
            }
        });
        rightPanel.add(saveChangesLabel);
        saveChangesLabel.setBounds(450, 50, 176, 31);

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

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setText("Instructions:");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setText("To edit any fields, press on edit button to ");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setText("the  right of the fields.  ");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setText("Edit your desired field and press on edit button ");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setText("again to see the preview. ");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setText("Then press \"Click here to save changes \" to  ");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setText("update to database.");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(universityName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(iconUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(backButton)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(17, 17, 17)
                .addComponent(iconUniversity, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(universityName, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void scanAllDetails(){
        boolean hasError = false;
        try{
            curStudent = new Student(id);
        }catch(Exception e){
            hasError = true;
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
 
        if(!hasError){
            idLabel.setText(String.valueOf(id));
            fullNameLabel.setText(curStudent.getName());
            fatherNameLabel.setText(curStudent.getFathers_name());
            motherNameLabel.setText(curStudent.getMothers_name());
            cellPhoneLabel.setText(curStudent.getPhone());
            addressLabel.setText(curStudent.getAddress());
            emailLabel.setText(curStudent.getEmail());
            dateOfBirthLabel.setText(curStudent.getDob());
            genderLabel.setText(curStudent.getGender());
            citizenshipLabel.setText(curStudent.getCitizenship());
            maritalStatusLabel.setText(curStudent.getMarital_status());
        }
    }

    
    private void editCellLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editCellLabelMouseClicked
        // TODO add your handling code here:
        if(cellPhoneLabel.isVisible()){
            
            cellPhoneLabel.setVisible(false);
            editCellTextField.setText(cellPhoneLabel.getText());
            editCellTextField.setVisible(true);
        }else{
            cellPhoneLabel.setText(editCellTextField.getText());
            editCellTextField.setVisible(false);
            cellPhoneLabel.setVisible(true);
        }
    }//GEN-LAST:event_editCellLabelMouseClicked

    private void editAddressLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editAddressLabelMouseClicked
        // TODO add your handling code here:
        if(addressLabel.isVisible()){
            
            addressLabel.setVisible(false);
            editAddressTextField.setVisible(true);
            editAddressTextField.setText(addressLabel.getText());
        }else{
            addressLabel.setText(editAddressTextField.getText());
            editAddressTextField.setVisible(false);
            addressLabel.setVisible(true);
        }
        
    }//GEN-LAST:event_editAddressLabelMouseClicked

    private void editEmailLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmailLabelMouseClicked
        // TODO add your handling code here:
        if(emailLabel.isVisible()){
            
            emailLabel.setVisible(false);
            editEmailTextField.setVisible(true);
            editEmailTextField.setText(emailLabel.getText());
        }else{
            emailLabel.setText(editEmailTextField.getText());
            editEmailTextField.setVisible(false);
            emailLabel.setVisible(true);
        }
    }//GEN-LAST:event_editEmailLabelMouseClicked

    private void editMaritalLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMaritalLabelMouseClicked
        // TODO add your handling code here:
        if(maritalStatusLabel.isVisible()){
            
            maritalStatusLabel.setVisible(false);
            editMaritalTextField.setVisible(true);
            editMaritalTextField.setText(maritalStatusLabel.getText());
        }else{
            maritalStatusLabel.setText(editMaritalTextField.getText());
            editMaritalTextField.setVisible(false);
            maritalStatusLabel.setVisible(true);
        }
    }//GEN-LAST:event_editMaritalLabelMouseClicked

    private void refreshLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshLabelMouseClicked
        scanAllDetails();
        JOptionPane.showMessageDialog(null,"Succesfully Refreshed");
    }//GEN-LAST:event_refreshLabelMouseClicked

    private void saveChangesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveChangesLabelMouseClicked
        Map<String,String> updatedFields = new LinkedHashMap<>();
        updatedFields.put("Phone",            cellPhoneLabel.getText()); 
        updatedFields.put("Address",          addressLabel.getText());
        updatedFields.put("Email",            emailLabel.getText());
        updatedFields.put("Marital Status",   maritalStatusLabel.getText()); 
 
        boolean hasError = false;
 
        try{
            new Validator(updatedFields);
        }catch(InvalidInput e){
            hasError = true;
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
 
        if(!hasError){
            // Update in the instance of the Student
            curStudent.setPhone(cellPhoneLabel.getText());
            curStudent.setAddress(addressLabel.getText());
            curStudent.setEmail(emailLabel.getText());
            curStudent.setMarital_status(maritalStatusLabel.getText());
 
            //Update the instance to the database
            try{
                curStudent.updateToDatabase();
                JOptionPane.showMessageDialog(null, "Successfully Updated!");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error Occured!");
            }
        }
    }//GEN-LAST:event_saveChangesLabelMouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked

        int option = JOptionPane.showConfirmDialog(this, "Do you want to go back?", "Are you sure?", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            new StudentHome().setVisible(true);
            dispose(); 
        }
    }//GEN-LAST:event_backButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressConst;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel cellPhoneConst;
    private javax.swing.JLabel cellPhoneLabel;
    private javax.swing.JLabel citizenshipConst;
    private javax.swing.JLabel citizenshipLabel;
    private javax.swing.JLabel dateOfBirthConst;
    private javax.swing.JLabel dateOfBirthLabel;
    private javax.swing.JLabel editAddressLabel;
    private javax.swing.JTextField editAddressTextField;
    private javax.swing.JLabel editCellLabel;
    private javax.swing.JTextField editCellTextField;
    private javax.swing.JLabel editEmailLabel;
    private javax.swing.JTextField editEmailTextField;
    private javax.swing.JLabel editMaritalLabel;
    private javax.swing.JTextField editMaritalTextField;
    private javax.swing.JLabel emailConst;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel fatherNameConst;
    private javax.swing.JLabel fatherNameLabel;
    private javax.swing.JLabel fullNameConst;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JLabel genderConst;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel iconUniversity;
    private javax.swing.JLabel idConst;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel maritalStatusConst;
    private javax.swing.JLabel maritalStatusLabel;
    private javax.swing.JLabel motherNameConst;
    private javax.swing.JLabel motherNameLabel;
    private javax.swing.JLabel refreshLabel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel saveChangesLabel;
    private javax.swing.JLabel universityName;
    private javax.swing.JLabel welcomeText;
    // End of variables declaration//GEN-END:variables
}
