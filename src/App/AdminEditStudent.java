
package App;
import java.util.*;
import javax.swing.*;


public class AdminEditStudent extends javax.swing.JFrame {
    
    private boolean fetched_atleast_once = false;
    private int current_fetched_id = -1;
    private ArrayList<String> errors = new ArrayList<>();
    private Student fetchedStudent = new Student();
    /**
     * Creates new form AdminEditStudent
     */
    public AdminEditStudent() {
        initComponents();
        
        // Set the username to the current sessions username
        adminToStudentText.setText("Hello," + CurrentSession.getUsername() + "");
    }
    
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
        SubmitEditStudent = new javax.swing.JButton();
        addStudentSeparator = new javax.swing.JSeparator();
        editStudentSeparator = new javax.swing.JSeparator();
        assignStudentSeparator = new javax.swing.JSeparator();
        FetchID = new javax.swing.JTextField();
        FetchButton = new javax.swing.JButton();
        instruction_text0 = new javax.swing.JLabel();
        instruction_text1 = new javax.swing.JLabel();
        instruction_text2 = new javax.swing.JLabel();
        instruction_text3 = new javax.swing.JLabel();
        instruction_text4 = new javax.swing.JLabel();
        instruction_text5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 200, 875, 491));

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_back_to_30px.png"))); // NOI18N
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });

        iconUniversity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUniversity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_university_campus_100px_1.png"))); // NOI18N
        iconUniversity.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        universityName.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        universityName.setForeground(new java.awt.Color(117, 97, 119));
        universityName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        universityName.setText("X - Y - Z University");

        rightPanel.setBackground(new java.awt.Color(49, 19, 51));
        rightPanel.setForeground(new java.awt.Color(255, 255, 255));
        addStudentSeparator.setVisible(false);
        editStudentSeparator.setVisible(false);
        assignStudentSeparator.setVisible(false);

        adminToStudentText.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        adminToStudentText.setForeground(new java.awt.Color(236, 240, 241));
        adminToStudentText.setText("Welcome, [USERNAME]");

        adminLoginText.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        adminLoginText.setForeground(new java.awt.Color(236, 240, 241));
        adminLoginText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_database_administrator_21px.png"))); // NOI18N
        adminLoginText.setText("Edit Student");

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

        SubmitEditStudent.setText("Submit");
        SubmitEditStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitEditStudentMouseClicked(evt);
            }
        });

        addStudentSeparator.setBackground(new java.awt.Color(49, 19, 51));
        addStudentSeparator.setForeground(new java.awt.Color(49, 19, 51));

        editStudentSeparator.setBackground(new java.awt.Color(49, 19, 51));
        editStudentSeparator.setForeground(new java.awt.Color(49, 19, 51));

        assignStudentSeparator.setBackground(new java.awt.Color(49, 19, 51));
        assignStudentSeparator.setForeground(new java.awt.Color(49, 19, 51));

        FetchButton.setText("Fetch");
        FetchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FetchButtonMouseClicked(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rightPanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(rightPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(60, 60, 60)
                                        .addComponent(MothersName))
                                    .addGroup(rightPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(99, 99, 99)
                                        .addComponent(Phone))
                                    .addGroup(rightPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(92, 92, 92)
                                        .addComponent(Address))
                                    .addGroup(rightPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(105, 105, 105)
                                        .addComponent(Email))
                                    .addGroup(rightPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(67, 67, 67)
                                        .addComponent(DOB))
                                    .addGroup(rightPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(95, 95, 95)
                                        .addComponent(Gender))
                                    .addGroup(rightPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(80, 80, 80)
                                        .addComponent(Citizenship))
                                    .addGroup(rightPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(65, 65, 65)
                                        .addComponent(MaritalStatus))
                                    .addGroup(rightPanelLayout.createSequentialGroup()
                                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(rightPanelLayout.createSequentialGroup()
                                        .addComponent(addStudentSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(editStudentSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(167, 167, 167))))
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                                        .addComponent(FetchID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FetchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SubmitEditStudent)))))
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
                .addGap(8, 8, 8)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FetchID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FetchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(MothersName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(Citizenship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(MaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(SubmitEditStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addStudentSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editStudentSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignStudentSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        instruction_text0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        instruction_text0.setText("Instructions:");

        instruction_text1.setText("Phone number needs to be 11 digits.");

        instruction_text2.setText("Email needs to be a valid email.");

        instruction_text3.setText("Gender needs to be either male or female");

        instruction_text4.setText("Date of birth needs to be digits and '-' or '/'");

        instruction_text5.setText("The others fields needs to be non-empty.");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(universityName, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addGroup(leftPanelLayout.createSequentialGroup()
                                .addComponent(iconUniversity, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGap(14, 14, 14))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(instruction_text1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(instruction_text2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(instruction_text3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(instruction_text4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(instruction_text5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(leftPanelLayout.createSequentialGroup()
                                .addComponent(instruction_text0)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(17, 17, 17)
                .addComponent(iconUniversity, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(universityName, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addGap(64, 64, 64)
                .addComponent(instruction_text0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instruction_text1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instruction_text2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instruction_text3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instruction_text4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instruction_text5)
                .addGap(66, 66, 66))
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

    private void FetchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FetchButtonMouseClicked
        String id_need_to_fetch = FetchID.getText();        
        int id_in_int = Integer.parseInt(id_need_to_fetch);
        boolean idExists = true;
        try{
            fetchedStudent = new Student(id_in_int); // Set the current instance to the fetched instance
        }catch (Exception e){
            idExists = false;
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        if(idExists){            
            // Set the values of the Student instance into the datafields
            Name.setText(fetchedStudent.getName());
            FatherName.setText(fetchedStudent.getFathers_name());
            MothersName.setText(fetchedStudent.getMothers_name());
            Phone.setText(fetchedStudent.getPhone());
            Address.setText(fetchedStudent.getAddress());
            Email.setText(fetchedStudent.getEmail());
            DOB.setText(fetchedStudent.getDob());
            Gender.setText(fetchedStudent.getGender());
            Citizenship.setText(fetchedStudent.getCitizenship());
            MaritalStatus.setText(fetchedStudent.getMarital_status());
            
            // Set the important flags
            fetched_atleast_once = true;
            current_fetched_id = id_in_int;
        }
       
    }//GEN-LAST:event_FetchButtonMouseClicked

    private void SubmitEditStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitEditStudentMouseClicked
        if(fetched_atleast_once && current_fetched_id != -1){
            
            // Put everything in a unordered map that we got from the GUI text fields
            Map<String,String> editedFields = new LinkedHashMap<>();
            editedFields.put("ID",               String.valueOf(current_fetched_id)); 
            editedFields.put("Name",             Name.getText()); 
            editedFields.put("Fathers name",     FatherName.getText());
            editedFields.put("Mothers name",     MothersName.getText());
            editedFields.put("Phone",            Phone.getText());
            editedFields.put("Address",          Address.getText());
            editedFields.put("Email",            Email.getText());
            editedFields.put("Date of Birth",    DOB.getText());
            editedFields.put("Gender",           Gender.getText());
            editedFields.put("Citizenship",      Citizenship.getText());
            editedFields.put("Marital Status",   MaritalStatus.getText());
            
            // Run validator on the fields
            boolean hasError = false;
            try{
                new Validator(editedFields);
            }catch (InvalidInput e){
                
                // Print in the JOptionPane
                hasError = true;
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
            if(!hasError){
                boolean success = true;
                try{
                    // Set the map's value into the instance of the Student
                    fetchedStudent.setName(editedFields.get("Name"));
                    fetchedStudent.setFathers_name(editedFields.get("Fathers name"));
                    fetchedStudent.setMothers_name(editedFields.get("Mothers name"));
                    fetchedStudent.setPhone(editedFields.get("Phone"));
                    fetchedStudent.setAddress(editedFields.get("Address"));
                    fetchedStudent.setEmail(editedFields.get("Email"));
                    fetchedStudent.setDob(editedFields.get("Date of Birth"));
                    fetchedStudent.setGender(editedFields.get("Gender"));
                    fetchedStudent.setCitizenship(editedFields.get("Citizenship"));
                    fetchedStudent.setMarital_status(editedFields.get("Marital Status"));
                    
                    // Update the fields of the instance into the database
                    fetchedStudent.updateToDatabase();
                }catch(Exception e){
                    success = false;
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                
                if(success){
                    
                    JOptionPane.showMessageDialog(null, "Successfully edited information of id="+current_fetched_id+"!");
                    
                    // Reset the Whole GUI
                    current_fetched_id = -1;
                    errors.clear();
                    fetched_atleast_once = false;
                    String EmptyString = "";
                    FetchID.setText(EmptyString);
                    Name.setText(EmptyString);
                    FatherName.setText(EmptyString);
                    MothersName.setText(EmptyString);
                    Phone.setText(EmptyString);
                    Address.setText(EmptyString);
                    Email.setText(EmptyString);
                    DOB.setText(EmptyString);
                    Gender.setText(EmptyString);
                    Citizenship.setText(EmptyString);
                    MaritalStatus.setText(EmptyString);
                }
               
            }
        }else{
            JOptionPane.showMessageDialog(null, "You need to fetch a student information using id and fetch button!");
        }
    }//GEN-LAST:event_SubmitEditStudentMouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        int option = JOptionPane.showConfirmDialog(this, "Do you want to go back?", "Are you sure?", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            AdminHome adminHomex = new AdminHome(false);
            adminHomex.setVisible(true);
            dispose(); 
        }
    }//GEN-LAST:event_backButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Citizenship;
    private javax.swing.JTextField DOB;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField FatherName;
    private javax.swing.JButton FetchButton;
    private javax.swing.JTextField FetchID;
    private javax.swing.JTextField Gender;
    private javax.swing.JTextField MaritalStatus;
    private javax.swing.JTextField MothersName;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Phone;
    private javax.swing.JButton SubmitEditStudent;
    private javax.swing.JSeparator addStudentSeparator;
    private javax.swing.JLabel adminLoginText;
    private javax.swing.JLabel adminToStudentText;
    private javax.swing.JSeparator assignStudentSeparator;
    private javax.swing.JLabel backButton;
    private javax.swing.JSeparator editStudentSeparator;
    private javax.swing.JLabel iconUniversity;
    private javax.swing.JLabel instruction_text0;
    private javax.swing.JLabel instruction_text1;
    private javax.swing.JLabel instruction_text2;
    private javax.swing.JLabel instruction_text3;
    private javax.swing.JLabel instruction_text4;
    private javax.swing.JLabel instruction_text5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
