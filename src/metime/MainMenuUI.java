
package metime;

/**
 *
 * @author Gisward
 */
public class MainMenuUI extends javax.swing.JFrame 
{

    private NavigationCntl parentNavigationCntl;
    
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
        // TODO add your handling code here:
    }//GEN-LAST:event_scheduleRadioButtonActionPerformed

    private void calendarRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calendarRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calendarRadioButtonActionPerformed

    private void prioritizeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioritizeRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prioritizeRadioButtonActionPerformed

    private void searchRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchRadioButtonActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_goButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                //new MainMenuUI().setVisible(true);
            }
        });
    }

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
