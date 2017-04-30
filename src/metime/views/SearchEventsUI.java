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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import metime.controllers.SearchCntl;

/**
 *
 * @author Gisward
 */
public class SearchEventsUI extends JFrame {

    private final SearchCntl theSearchCntl;
    private JTextField searchTerm;

    public SearchEventsUI(SearchCntl theSearchCntl) {
        this.theSearchCntl = theSearchCntl;
        initComponents();

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initComponents() {
        this.setSize(500, 125);
        this.setTitle("Search Events");
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
        backButton.addActionListener(new BackButtonListener(this));

        pane.add(backButton, c);

        c.gridwidth = 3;

        searchTerm = new JTextField();

        c.ipady = 0;
        c.gridy = 1;
        c.gridx = 0;

        pane.add(searchTerm, c);

        c.gridwidth = 1;

        JButton searchNameButton = new JButton("Search by Event Name");
        searchNameButton.addActionListener(new SearchNameButtonListener());

        c.gridy = 2;
        pane.add(searchNameButton, c);

        JButton searchLocationButton = new JButton("Search By Location");
        searchLocationButton.addActionListener(new SearchLocationButtonListener());

        c.gridx = 1;
        pane.add(searchLocationButton, c);

        this.add(pane);
    }

    class SearchNameButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            requestSearchEventResultUI(theSearchCntl.searchEventTitle(searchTerm.getText()));
        }
    }

    class SearchLocationButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            requestSearchEventResultUI(theSearchCntl.searchEventLocation(searchTerm.getText()));
        }
    }

    private void requestSearchEventResultUI(int theEventID) {
        if (theEventID >= 0) {
            theSearchCntl.getParentNavigationCntl().requestEventUI(theEventID);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "No event found matching the search term.");
        }
    }

    class BackButtonListener implements ActionListener {

        private final SearchEventsUI ui;

        public BackButtonListener(SearchEventsUI ui) {
            this.ui = ui;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            ui.dispose();
            theSearchCntl.getParentNavigationCntl().requestMainMenuUI();
        }
    }
}
