/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metime;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author DeeShalz
 */
public class SearchResultUI extends JFrame {
    private Contact theContact;
    
    public SearchResultUI(Contact theContact){
        this.theContact = theContact;
        initComponents();
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
        
        JLabel nameLabel = new JLabel("Full Name: " + theContact.getFullName());
        JLabel emailLabel = new JLabel("Email: " + theContact.getEmail());
        JLabel phoneLabel = new JLabel("Phone: " + theContact.getPhone());
        
        // TODO: Add ability to show multiple results, and return the results in a JFrame table
        
        pane.add(nameLabel, c);
        
        c.gridx = 1;
        pane.add(emailLabel, c);
        
        c.gridx = 2;
        pane.add(phoneLabel, c);
        
        this.add(pane);
    }
}