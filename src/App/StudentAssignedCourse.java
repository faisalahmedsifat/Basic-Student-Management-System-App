/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import javax.swing.*;

public class StudentAssignedCourse extends javax.swing.JFrame {
    
    private int id = CurrentSession.getID();
    private CoursesList courseListCur = new CoursesList();
    /**
     * Creates new form AdminAssignCourse
     */
    public StudentAssignedCourse() {
        initComponents();
        
        // Set the username to the current sessions username
        welcomeText.setText("Hello, " + CurrentSession.getID() + "");
        scanAllDetails();
        
    }
    
    //Reload the frame using a ID
    public StudentAssignedCourse(int ID) {
        initComponents();
    }

    public void scanAllDetails(){
        boolean hasError = false;

        try{
            courseListCur = new CoursesList(id); // fetch the course list of the ID
        }catch(Exception e){
            hasError = true;
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        if(!hasError){

            // Set the panel to visible
            CoursePanel.setVisible(true);

            // Set the values of the panel to appropiate values
            int i;
            for (i = 0; i < courseListCur.listOfCourse.size(); i++) {
                String identifier = courseListCur.listOfCourse.get(i).getIdentifier();
                String courseName = courseListCur.listOfCourse.get(i).getName();
                showRowValues(i,identifier,courseName);
            }

            // Set visibility of the other rows to not-visible
            for (; i < 6; i++) {
                dismissRow(i);
            }   
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Separator1 = new javax.swing.JSeparator();
        Separator2 = new javax.swing.JSeparator();
        Separator3 = new javax.swing.JSeparator();
        leftPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JLabel();
        iconUniversity = new javax.swing.JLabel();
        universityName = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        welcomeText = new javax.swing.JLabel();
        studentAssignedCourseText = new javax.swing.JLabel();
        CoursePanel = new javax.swing.JPanel();
        firstCourseLabel = new javax.swing.JLabel();
        secondCourseLabel = new javax.swing.JLabel();
        thirdCourseLabel = new javax.swing.JLabel();
        fourthCourseLabel = new javax.swing.JLabel();
        fifthCourseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstCourseDeleteButton = new javax.swing.JButton();
        sixthCourseLabel = new javax.swing.JLabel();
        secondCourseDeleteButton = new javax.swing.JButton();
        thirdCourseDeleteButton = new javax.swing.JButton();
        fourthCourseDeleteButton = new javax.swing.JButton();
        fifthCourseDeleteButton = new javax.swing.JButton();
        sixthCourseDeleteButton = new javax.swing.JButton();
        firstCourseCodeName = new javax.swing.JLabel();
        secondCourseCodeName = new javax.swing.JLabel();
        thirdCourseCodeName = new javax.swing.JLabel();
        fourthCourseCodeName = new javax.swing.JLabel();
        fifthCourseCodeName = new javax.swing.JLabel();
        sixthCourseCodeName = new javax.swing.JLabel();
        firstCourseNameLabel = new javax.swing.JLabel();
        secondCourseNameLabel = new javax.swing.JLabel();
        thirdCourseNameLabel = new javax.swing.JLabel();
        fourthCourseNameLabel = new javax.swing.JLabel();
        fifthCourseNameLabel = new javax.swing.JLabel();
        sixthCourseNameLabel = new javax.swing.JLabel();

        Separator1.setBackground(new java.awt.Color(49, 19, 51));
        Separator1.setForeground(new java.awt.Color(49, 19, 51));

        Separator2.setBackground(new java.awt.Color(49, 19, 51));
        Separator2.setForeground(new java.awt.Color(49, 19, 51));

        Separator3.setBackground(new java.awt.Color(49, 19, 51));
        Separator3.setForeground(new java.awt.Color(49, 19, 51));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addComponent(universityName, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(244, 244, 244))
        );

        rightPanel.setBackground(new java.awt.Color(49, 19, 51));
        Separator2.setVisible(false);
        Separator3.setVisible(false);
        Separator1.setVisible(false);

        welcomeText.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        welcomeText.setForeground(new java.awt.Color(236, 240, 241));
        welcomeText.setText("Welcome, [USERNAME]");

        studentAssignedCourseText.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        studentAssignedCourseText.setForeground(new java.awt.Color(236, 240, 241));
        studentAssignedCourseText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/icons/icons8_read_online_21px.png"))); // NOI18N
        studentAssignedCourseText.setText("Assigned courses");

        firstCourseLabel.setText("1.");

        secondCourseLabel.setText("2.");

        thirdCourseLabel.setText("3.");

        fourthCourseLabel.setText("4.");

        fifthCourseLabel.setText("5.");

        jLabel1.setText("Code");

        jLabel3.setText("Name");

        firstCourseDeleteButton.setText("X");
        firstCourseDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstCourseDeleteButtonActionPerformed(evt);
            }
        });

        sixthCourseLabel.setText("6.");

        secondCourseDeleteButton.setText("X");
        secondCourseDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondCourseDeleteButtonActionPerformed(evt);
            }
        });

        thirdCourseDeleteButton.setText("X");
        thirdCourseDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirdCourseDeleteButtonActionPerformed(evt);
            }
        });

        fourthCourseDeleteButton.setText("X");
        fourthCourseDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourthCourseDeleteButtonActionPerformed(evt);
            }
        });

        fifthCourseDeleteButton.setText("X");
        fifthCourseDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fifthCourseDeleteButtonActionPerformed(evt);
            }
        });

        sixthCourseDeleteButton.setText("X");
        sixthCourseDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixthCourseDeleteButtonActionPerformed(evt);
            }
        });

        firstCourseCodeName.setText("ABC123");

        secondCourseCodeName.setText("ABC123");

        thirdCourseCodeName.setText("ABC123");

        fourthCourseCodeName.setText("ABC123");

        fifthCourseCodeName.setText("ABC123");

        sixthCourseCodeName.setText("ABC123");

        firstCourseNameLabel.setText("Sample Name");

        secondCourseNameLabel.setText("Sample Name");

        thirdCourseNameLabel.setText("Sample Name");

        fourthCourseNameLabel.setText("Sample Name");

        fifthCourseNameLabel.setText("Sample Name");

        sixthCourseNameLabel.setText("Sample Name");

        javax.swing.GroupLayout CoursePanelLayout = new javax.swing.GroupLayout(CoursePanel);
        CoursePanel.setLayout(CoursePanelLayout);
        CoursePanelLayout.setHorizontalGroup(
            CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoursePanelLayout.createSequentialGroup()
                .addGroup(CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CoursePanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1))
                    .addGroup(CoursePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sixthCourseLabel)
                        .addGap(18, 18, 18)
                        .addComponent(sixthCourseCodeName, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CoursePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CoursePanelLayout.createSequentialGroup()
                                .addComponent(fifthCourseLabel)
                                .addGap(18, 18, 18)
                                .addComponent(fifthCourseCodeName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(CoursePanelLayout.createSequentialGroup()
                                .addComponent(fourthCourseLabel)
                                .addGap(18, 18, 18)
                                .addComponent(fourthCourseCodeName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(CoursePanelLayout.createSequentialGroup()
                                .addComponent(secondCourseLabel)
                                .addGap(18, 18, 18)
                                .addComponent(secondCourseCodeName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(CoursePanelLayout.createSequentialGroup()
                                .addComponent(thirdCourseLabel)
                                .addGap(18, 18, 18)
                                .addComponent(thirdCourseCodeName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(CoursePanelLayout.createSequentialGroup()
                                .addComponent(firstCourseLabel)
                                .addGap(18, 18, 18)
                                .addComponent(firstCourseCodeName, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(14, 14, 14)
                .addGroup(CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fourthCourseNameLabel)
                    .addComponent(sixthCourseNameLabel)
                    .addComponent(firstCourseNameLabel)
                    .addComponent(jLabel3)
                    .addComponent(secondCourseNameLabel)
                    .addComponent(thirdCourseNameLabel)
                    .addComponent(fifthCourseNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                .addGroup(CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sixthCourseDeleteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fourthCourseDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(thirdCourseDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(secondCourseDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(firstCourseDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fifthCourseDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        CoursePanelLayout.setVerticalGroup(
            CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoursePanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addGroup(CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstCourseLabel)
                    .addComponent(firstCourseDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstCourseCodeName)
                    .addComponent(firstCourseNameLabel))
                .addGap(11, 11, 11)
                .addGroup(CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondCourseLabel)
                    .addComponent(secondCourseDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondCourseCodeName)
                    .addComponent(secondCourseNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thirdCourseLabel)
                    .addComponent(thirdCourseDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thirdCourseCodeName)
                    .addComponent(thirdCourseNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CoursePanelLayout.createSequentialGroup()
                        .addGroup(CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fourthCourseLabel)
                            .addComponent(fourthCourseCodeName)
                            .addComponent(fourthCourseNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fifthCourseLabel)
                            .addComponent(fifthCourseCodeName)
                            .addComponent(fifthCourseNameLabel)))
                    .addGroup(CoursePanelLayout.createSequentialGroup()
                        .addComponent(fourthCourseDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fifthCourseDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sixthCourseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sixthCourseCodeName)
                        .addComponent(sixthCourseNameLabel))
                    .addComponent(sixthCourseDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(studentAssignedCourseText, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(welcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(CoursePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(welcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(studentAssignedCourseText, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79)
                .addComponent(CoursePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
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

    private void firstCourseDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstCourseDeleteButtonActionPerformed
        dropCourseFromList(0);
    }//GEN-LAST:event_firstCourseDeleteButtonActionPerformed

    private void secondCourseDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondCourseDeleteButtonActionPerformed
        dropCourseFromList(1);
    }//GEN-LAST:event_secondCourseDeleteButtonActionPerformed

    private void fourthCourseDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthCourseDeleteButtonActionPerformed
        dropCourseFromList(3);
    }//GEN-LAST:event_fourthCourseDeleteButtonActionPerformed

    private void sixthCourseDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixthCourseDeleteButtonActionPerformed
        dropCourseFromList(5);
    }//GEN-LAST:event_sixthCourseDeleteButtonActionPerformed

    public void dismissRow(int i){
        if(i == 0){
            firstCourseCodeName.setVisible(false);
            firstCourseNameLabel.setVisible(false);
            firstCourseLabel.setVisible(false);
            firstCourseDeleteButton.setVisible(false);
        }else if(i == 1){
            secondCourseCodeName.setVisible(false);
            secondCourseNameLabel.setVisible(false);
            secondCourseLabel.setVisible(false);
            secondCourseDeleteButton.setVisible(false);
        }else if(i == 2){
            thirdCourseCodeName.setVisible(false);
            thirdCourseNameLabel.setVisible(false);
            thirdCourseLabel.setVisible(false);
            thirdCourseDeleteButton.setVisible(false);
        }else if(i == 3){
            fourthCourseCodeName.setVisible(false);
            fourthCourseNameLabel.setVisible(false);
            fourthCourseLabel.setVisible(false);
            fourthCourseDeleteButton.setVisible(false);
        }else if(i == 4){
            fifthCourseCodeName.setVisible(false);
            fifthCourseNameLabel.setVisible(false);
            fifthCourseLabel.setVisible(false);
            fifthCourseDeleteButton.setVisible(false);
        }else if(i == 5){
            sixthCourseCodeName.setVisible(false);
            sixthCourseNameLabel.setVisible(false);
            sixthCourseLabel.setVisible(false);
            sixthCourseDeleteButton.setVisible(false);
        }
    }
    
    public void showRowValues(int i, String identifier, String courseName){
        if(i == 0){
            firstCourseLabel.setVisible(true);
            firstCourseDeleteButton.setVisible(true);
            firstCourseCodeName.setText(identifier);
            firstCourseNameLabel.setText(courseName);
        }else if(i == 1){
            secondCourseLabel.setVisible(true);
            secondCourseDeleteButton.setVisible(true);
            secondCourseCodeName.setText(identifier);
            secondCourseNameLabel.setText(courseName);
        }else if(i == 2){
            thirdCourseLabel.setVisible(true);
            thirdCourseDeleteButton.setVisible(true);
            thirdCourseCodeName.setText(identifier);
            thirdCourseNameLabel.setText(courseName);
        }else if(i == 3){
            fourthCourseLabel.setVisible(true);
            fourthCourseDeleteButton.setVisible(true);
            fourthCourseCodeName.setText(identifier);
            fourthCourseNameLabel.setText(courseName);
        }else if(i == 4){
            fifthCourseLabel.setVisible(true);
            fifthCourseDeleteButton.setVisible(true);
            fifthCourseCodeName.setText(identifier);
            fifthCourseNameLabel.setText(courseName);
        }else if(i == 5){
            sixthCourseLabel.setVisible(true);
            sixthCourseDeleteButton.setVisible(true);
            sixthCourseCodeName.setText(identifier);
            sixthCourseNameLabel.setText(courseName);
        }
    }
    
    
    private void fifthCourseDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fifthCourseDeleteButtonActionPerformed
        dropCourseFromList(4);
    }//GEN-LAST:event_fifthCourseDeleteButtonActionPerformed

    private void thirdCourseDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdCourseDeleteButtonActionPerformed
        dropCourseFromList(2);
    }//GEN-LAST:event_thirdCourseDeleteButtonActionPerformed

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        int option = JOptionPane.showConfirmDialog(this, "Do you want to go back?", "Are you sure?", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            StudentHome studentHomex = new StudentHome();
            studentHomex.setVisible(true);
            dispose(); 
        }
    }//GEN-LAST:event_backButtonMouseClicked

    private void dropCourseFromList(int i){
        int option = JOptionPane.showConfirmDialog(this, "Do you want to drop this course?", "Are you sure?", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            String current_dropping_course_identifier = courseListCur.listOfCourse.get(i).getIdentifier();
            courseListCur.dropCourseOfStudent(current_dropping_course_identifier);
            courseListCur.updateToDataBase();

            scanAllDetails();
        }
    }

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
            java.util.logging.Logger.getLogger(StudentAssignedCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentAssignedCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentAssignedCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentAssignedCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CurrentSession.setIsLoggedIn(true);
                new StudentAssignedCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CoursePanel;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JSeparator Separator3;
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel fifthCourseCodeName;
    private javax.swing.JButton fifthCourseDeleteButton;
    private javax.swing.JLabel fifthCourseLabel;
    private javax.swing.JLabel fifthCourseNameLabel;
    private javax.swing.JLabel firstCourseCodeName;
    private javax.swing.JButton firstCourseDeleteButton;
    private javax.swing.JLabel firstCourseLabel;
    private javax.swing.JLabel firstCourseNameLabel;
    private javax.swing.JLabel fourthCourseCodeName;
    private javax.swing.JButton fourthCourseDeleteButton;
    private javax.swing.JLabel fourthCourseLabel;
    private javax.swing.JLabel fourthCourseNameLabel;
    private javax.swing.JLabel iconUniversity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel secondCourseCodeName;
    private javax.swing.JButton secondCourseDeleteButton;
    private javax.swing.JLabel secondCourseLabel;
    private javax.swing.JLabel secondCourseNameLabel;
    private javax.swing.JLabel sixthCourseCodeName;
    private javax.swing.JButton sixthCourseDeleteButton;
    private javax.swing.JLabel sixthCourseLabel;
    private javax.swing.JLabel sixthCourseNameLabel;
    private javax.swing.JLabel studentAssignedCourseText;
    private javax.swing.JLabel thirdCourseCodeName;
    private javax.swing.JButton thirdCourseDeleteButton;
    private javax.swing.JLabel thirdCourseLabel;
    private javax.swing.JLabel thirdCourseNameLabel;
    private javax.swing.JLabel universityName;
    private javax.swing.JLabel welcomeText;
    // End of variables declaration//GEN-END:variables
}
