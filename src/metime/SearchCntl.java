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
    int numOfInstantiations = 0;
    
    public SearchCntl()
    {
        numOfInstantiations++;
        System.out.println("SearchCntl instantiated " + this.numOfInstantiations + " time(s).");
        this.theContactList = new ContactList();
    }
    
    public void setNavigationCntl(NavigationCntl newParentNavigationCntl)
    {
        System.out.println("Made it to the SpaceAssignCntl");
        this.parentNavigationCntl = newParentNavigationCntl;
        // instantiate SearchContactListUI class here
    }
    
    /* copied & modified from LoginCntl class. Use the same logic when searching for a contact in ContactList */
    public boolean searchContactName(String nameToSearch)
    {
        boolean contactNameFound;
        
        contactNameFound = this.theContactList.searchContactName(nameToSearch);

        return contactNameFound;
    }

    public boolean searchContactPhone(int phoneToSearch)
    {
        boolean contactPhoneFound;
        
        contactPhoneFound = this.theContactList.searchContactPhone(phoneToSearch);
        
        return contactPhoneFound;
    }
    
    public boolean searchContactEmail(String emailToSearch)
    {
        boolean contactEmailFound;
        
        contactEmailFound = this.theContactList.searchContactEmail(emailToSearch);
        
        return contactEmailFound;
    }
    
    public void requestSearchContactsUI(){
        SearchContactsUI searchUI = new SearchContactsUI();
        searchUI.setVisible(true);
    }
}
