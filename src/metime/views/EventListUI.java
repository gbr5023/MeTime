/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package metime.views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import metime.controllers.EventCntl;

/**
 *
 * @author jxr5398
 */
public class EventListUI extends JFrame {
    
    private final EventCntl theEventCntl;
    private JTable theEventListTable;
    
    /**
     *
     * @param theEventCntl
     */
    public EventListUI(EventCntl theEventCntl){
        this.setSize(500, 500);
        this.setTitle("Event List");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.theEventCntl = theEventCntl;
        
        initComponents();
    }
    
    private void initComponents(){
        JPanel pane = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new BackListener());
        
        c.gridx = 0;
        c.gridy = 0;
        pane.add(backButton, c);
        
        theEventListTable = new JTable(theEventCntl.getEventListTableModel());
        
        JScrollPane theScrollPane = new JScrollPane(theEventListTable);
        theScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        theScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        c.fill = GridBagConstraints.BOTH;
        c.gridheight = GridBagConstraints.REMAINDER;
        c.weighty = 1.0;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(theScrollPane, c);
        
        this.add(pane);
    }
    
    class BackListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evt){
            theEventCntl.requestNavigationController();
        }
    }
}
