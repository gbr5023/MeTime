package metime;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author jxr5398
 */
public class SearchContactsUI extends JFrame {
    
    private JTextField searchTerm;
    
    public SearchContactsUI(){
        initComponents();
    }
    
    private void initComponents(){
        this.setSize(500, 125);
        this.setTitle("Search Contacts");
        this.setLocationRelativeTo(null);
        
        JPanel pane = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        c.ipady = 10;
        c.ipadx = 10;
        c.weightx = 1.0;
        
        JLabel searchLabel = new JLabel("Enter term to search:");
        
        c.gridx = 0;
        c.gridy = 0;
        pane.add(searchLabel, c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        
        searchTerm = new JTextField();
        
        c.ipady = 0;
        c.gridy = 1;
        c.gridx = 0;
        pane.add(searchTerm, c);
        
        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(new SearchButtonListener());
        
        c.gridy = 2;
        pane.add(searchButton, c);
        
        this.add(pane);
    }
    
    class SearchButtonListener implements ActionListener {
      
        @Override
        public void actionPerformed(ActionEvent ae) {
            // TODO
        }
        
    }
    
}
