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
import javax.swing.JLabel;
import javax.swing.JPanel;
import metime.models.*;
import metime.controllers.*;

/**
 *
 * @author Gisward
 */
public class SearchEventResultUI extends JFrame {
    private Event theEvent;
    
    public SearchEventResultUI(Event theEvent){
        this.theEvent = theEvent;
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private void initComponents(){
        this.setSize(500, 125);
        this.setTitle("Search Results");
        this.setLocationRelativeTo(null);
        
        JPanel pane = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        c.ipady = 10;
        c.ipadx = 10;
        c.weightx = 1.0;
        
        c.gridx = 0;
        c.gridy = 0;
        
        JLabel nameLabel = new JLabel("Event Name: " + theEvent.getTitle());
        JLabel locationLabel = new JLabel("Location: " + theEvent.getLocation());
        JLabel dateTimeLabel = new JLabel(theEvent.getDateTime());
        
        // TODO: Add ability to show multiple results, and return the results in a JFrame table
        
        pane.add(nameLabel, c);
        
        c.gridx = 1;
        pane.add(locationLabel, c);
        
        c.gridx = 2;
        pane.add(dateTimeLabel, c);
        
        c.gridy = 1;
        c.gridx = 1;
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new BackButtonListener());
        
        pane.add(backButton, c);
        
        this.add(pane);
    }
    
    private SearchEventResultUI getInstance(){
        return this;
    }
    
    class BackButtonListener implements ActionListener {
      
        @Override
        public void actionPerformed(ActionEvent ae) {
            getInstance().dispose();
        }
    }
}