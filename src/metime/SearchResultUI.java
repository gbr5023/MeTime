/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metime;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
        
        JLabel searchLabel = new JLabel("Search Results: ");
        
        c.gridx = 0;
        c.gridy = 0;
        pane.add(searchLabel, c);
        
        
        c.fill = GridBagConstraints.HORIZONTAL;
        
        this.add(pane);
    }
    

class requestSearchResultUI implements ActionListener{

        private Object theSearchCntl;
        @Override
        public void actionPerformed(ActionEvent e) {
           if(theContact != null)
           SearchResultUI(theContact);
        else
            JOptionPane.showMessageDialog(null, "No contact found matching the search term.");
        }

        private void SearchResultUI(Contact theContact) {
            System.out.print(theContact);
        }
         
    }
}
