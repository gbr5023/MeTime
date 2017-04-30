package metime.views;

import metime.controllers.SearchCntl;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import metime.models.Contact;

/**
 * @author jxr5398
 */
public class SearchContactsUI extends JFrame {

    private final SearchCntl theSearchCntl;
    private JTextField searchTerm;

    public SearchContactsUI(SearchCntl theSearchCntl) {
        this.theSearchCntl = theSearchCntl;
        initComponents();

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initComponents() {
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

        c.fill = GridBagConstraints.BOTH;
        c.gridx = 2;
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new BackButtonListener());

        pane.add(backButton, c);

        c.gridwidth = 3;

        searchTerm = new JTextField();

        c.ipady = 0;
        c.gridy = 1;
        c.gridx = 0;

        pane.add(searchTerm, c);

        c.gridwidth = 1;

        JButton searchEmailsButton = new JButton("Search by Email");
        searchEmailsButton.addActionListener(new SearchEmailButtonListener());

        c.gridy = 2;
        pane.add(searchEmailsButton, c);

        JButton searchNameButton = new JButton("Search By Name");
        searchNameButton.addActionListener(new SearchNameButtonListener());

        c.gridx = 1;
        pane.add(searchNameButton, c);

        JButton searchPhoneButton = new JButton("Search By Phone");
        searchPhoneButton.addActionListener(new SearchPhoneButtonListener());

        c.gridx = 2;
        pane.add(searchPhoneButton, c);

        this.add(pane);
    }

    class SearchEmailButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            requestSearchResultUI(theSearchCntl.searchContactEmail(searchTerm.getText()));
        }
    }

    class SearchNameButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            requestSearchResultUI(theSearchCntl.searchContactName(searchTerm.getText()));
        }
    }

    class SearchPhoneButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            requestSearchResultUI(theSearchCntl.searchContactPhone(searchTerm.getText()));
        }
    }

    private void requestSearchResultUI(int theContactID) {
        if (theContactID >= 0) {
            this.setVisible(false);
            theSearchCntl.getParentNavigationCntl().requestContactUI(theContactID);
        } else {
            JOptionPane.showMessageDialog(null, "No contact found matching the search term.");
        }
    }

    class BackButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            theSearchCntl.getParentNavigationCntl().requestMainMenuUI();
        }
    }
}
