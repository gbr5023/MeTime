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
   private NavigationCntl parentNavigationCntl;
   private ContactList theContactList;
   private SearchContactsUI theSearchUI;
   private int numOfInstantiations = 0;
    
    public SearchCntl()
    {
        numOfInstantiations++;
        System.out.println("SearchCntl instantiated " + this.numOfInstantiations + " time(s).");
        this.theContactList = new ContactList();
    }
    
    public void setNavigationCntl(NavigationCntl newParentNavigationCntl)
    {
        this.parentNavigationCntl = newParentNavigationCntl;
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
        this.theSearchUI.setVisible(true);
    }
    
    public void requestSearchResultUI(Contact searchedContact){
        SearchResultUI theSearchResultUI = new SearchResultUI(searchedContact);
        theSearchResultUI.setVisible(true);
    }

    public NavigationCntl getParentNavigationCntl() 
    {
        return this.parentNavigationCntl;
    }
}
