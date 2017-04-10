/**
 * Overview
 * This is the second of five sprints you will implement towards completing your group project application prototype. 
 * In this sprint you will choose one of your four use cases for implementation. When completed, the functionality of 
 * the sprint should closely resemble the use case specification written earlier in the semester.
 * 
 * You should use Java FX/FXML for this sprint implementation. As discussed in the lesson on FX/FXML, 
 * there is a learning curve associated with moving from the Swing GUI Library but it will pay off as you work through 
 * the rest of the application.
 * 
 * Activity Description
 * This is a group assignment.
 * In this sprint your application should launch, authenticate a user against a list of test users, and, 
 * if the user is authenticated, open a navigation window where the user can choose what they want to do next. 
 * You did this part in the first sprint.
 * The use should then be able to navigate to one of the four use cases you defined as the scope of the application. 
 * The functionality should match or extend what you defined in the use case specification.
 * Make sure your application runs without error and be sure to include any required username and password information 
 * as a note on your Canvas submission.
 */
package metime;

/**
 *
 * @author Gisward
 */
public class MainMenuUI extends javax.swing.JFrame 
{

    private final NavigationCntl parentNavigationCntl;
    private NavigationOption selectedOption;
    
    public MainMenuUI(NavigationCntl newParentNavigationCntl) 
    {
        this.parentNavigationCntl = newParentNavigationCntl;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        chooseLabel = new javax.swing.JLabel();
        scheduleRadioButton = new javax.swing.JRadioButton();
        calendarRadioButton = new javax.swing.JRadioButton();
        prioritizeRadioButton = new javax.swing.JRadioButton();
        searchRadioButton = new javax.swing.JRadioButton();
        exitButton = new javax.swing.JButton();
        goButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chooseLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chooseLabel.setText("Choose an option:");

        buttonGroup1.add(scheduleRadioButton);
        scheduleRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        scheduleRadioButton.setText("Add Events / Contacts");
        scheduleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(calendarRadioButton);
        calendarRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        calendarRadioButton.setText("Event Calendar");
        calendarRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calendarRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(prioritizeRadioButton);
        prioritizeRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prioritizeRadioButton.setText("Prioritize Events");
        prioritizeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioritizeRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(searchRadioButton);
        searchRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchRadioButton.setText("Search Contacts");
        searchRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchRadioButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        goButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        goButton.setText("Go");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chooseLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calendarRadioButton)
                            .addComponent(scheduleRadioButton)
                            .addComponent(prioritizeRadioButton)
                            .addComponent(searchRadioButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(goButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chooseLabel)
                .addGap(18, 18, 18)
                .addComponent(scheduleRadioButton)
                .addGap(18, 18, 18)
                .addComponent(calendarRadioButton)
                .addGap(18, 18, 18)
                .addComponent(prioritizeRadioButton)
                .addGap(18, 18, 18)
                .addComponent(searchRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(goButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scheduleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleRadioButtonActionPerformed
        selectedOption = NavigationOption.SCHEDULE;
    }//GEN-LAST:event_scheduleRadioButtonActionPerformed

    private void calendarRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calendarRadioButtonActionPerformed
        selectedOption = NavigationOption.CALENDAR;
    }//GEN-LAST:event_calendarRadioButtonActionPerformed

    private void prioritizeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioritizeRadioButtonActionPerformed
       selectedOption = NavigationOption.PRIORITIZE;
    }//GEN-LAST:event_prioritizeRadioButtonActionPerformed

    private void searchRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchRadioButtonActionPerformed
        selectedOption = NavigationOption.SEARCH;
    }//GEN-LAST:event_searchRadioButtonActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        switch(selectedOption){
            case SCHEDULE:
                this.setVisible(false);
                this.parentNavigationCntl.requestEventCntl();
                break;
            case CALENDAR:
                // TODO
                break;
            case PRIORITIZE:
                // TODO
                break;
            case SEARCH:
                this.setVisible(false);
                this.parentNavigationCntl.requestSearchCntl();
        }
    }//GEN-LAST:event_goButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton calendarRadioButton;
    private javax.swing.JLabel chooseLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton goButton;
    private javax.swing.JRadioButton prioritizeRadioButton;
    private javax.swing.JRadioButton scheduleRadioButton;
    private javax.swing.JRadioButton searchRadioButton;
    // End of variables declaration//GEN-END:variables
}
