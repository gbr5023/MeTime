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
    private NavigationCntl parentNavigationCntl;
    private final ContactList theContactList;
    private int numOfInstantiations = 0;
    
    public SearchCntl()
    {
        numOfInstantiations++;
        System.out.println("SearchCntl instantiated " + this.numOfInstantiations + " time(s).");
        this.theContactList = new ContactList();
    }
    
    public void setNavigationCntl(NavigationCntl newParentNavigationCntl)
    {
        System.out.println("Made it to the SearchCntl");
        System.out.println();
        System.out.println("Search by Name: Jane Doe1 (You can replace 1 with any number between 0-99");
        System.out.println("Search by Phone: 1234567");
        System.out.println("Search by Email: jdoe@email.com");
        this.parentNavigationCntl = newParentNavigationCntl;
        // instantiate SearchContactListUI class here
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
        SearchContactsUI searchUI = new SearchContactsUI(this);
        searchUI.setVisible(true);
    }
    
    public void requestSearchResultUI(Contact searchedContact){
        SearchResultUI theSearchResultUI = new SearchResultUI(searchedContact);
        theSearchResultUI.setVisible(true);
    }
}
