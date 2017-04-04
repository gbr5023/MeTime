/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metime;

/**
 *
 * @author Gisward
 */
public class SearchCntl 
{
    NavigationCntl parentNavigationCntl;
    ContactList theContactList;
    SearchContactsUI searchUI;
    int numOfInstantiations = 0;
    
    public SearchCntl()
    {
        numOfInstantiations++;
        System.out.println("SearchCntl instantiated " + this.numOfInstantiations + " time(s).");
        this.theContactList = new ContactList();
    }
    
    public void setNavigationCntl(NavigationCntl newParentNavigationCntl)
    {
        System.out.println("Made it to the SearchCntl");
        this.parentNavigationCntl = newParentNavigationCntl;
        this.requestSearchContactsUI();
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
        this.searchUI = new SearchContactsUI(this);
        searchUI.setVisible(true);
    }
    
    public void requestSearchResultUI(Contact searchedContact){
        SearchResultUI theSearchResultUI = new SearchResultUI(searchedContact);
        theSearchResultUI.setVisible(true);
    }
}
