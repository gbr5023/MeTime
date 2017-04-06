/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metime;

import javax.swing.JFrame;

/**
 *
 * @author Gisward
 */
public class SearchCntl 
{
   private final NavigationCntl parentNavigationCntl;
   private final ContactList theContactList;
   private SearchContactsUI theSearchUI;
   private int numOfInstantiations = 0;
    
    public SearchCntl()
    {
        numOfInstantiations++;
        System.out.println("SearchCntl instantiated " + this.numOfInstantiations + " time(s).");
        this.theContactList = new ContactList();
        this.parentNavigationCntl = new NavigationCntl();
    }
    
    /* copied & modified from LoginCntl class. Use the same logic when searching for a contact in ContactList */
    public Contact searchContactName(String nameToSearch)
    {
        return this.theContactList.searchContactName(nameToSearch);
    }

    public Contact searchContactPhone(int phoneToSearch)
    {
        return this.theContactList.searchContactPhone(phoneToSearch);
    }
    
    public Contact searchContactEmail(String emailToSearch)
    {
        return this.theContactList.searchContactEmail(emailToSearch);
    }
    
    public void requestSearchContactsUI(){
        this.theSearchUI = new SearchContactsUI(this);
        this.theSearchUI.setLocationRelativeTo(null);
        this.theSearchUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.theSearchUI.setVisible(true);
    }
    
    public void requestSearchResultUI(Contact searchedContact){
        SearchResultUI theSearchResultUI = new SearchResultUI(searchedContact);
        theSearchResultUI.setLocationRelativeTo(null);
        theSearchResultUI.setVisible(true);
    }

    public NavigationCntl getParentNavigationCntl() {
        return parentNavigationCntl;
    }
}
