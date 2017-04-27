/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metime.controllers;

import javax.swing.JFrame;
import metime.models.Contact;
import metime.models.ContactList;
import metime.models.Event;
import metime.models.EventList;
import metime.views.SearchUI;
import metime.views.SearchContactsUI;
import metime.views.SearchEventsUI;
import metime.views.SearchContactResultUI;
import metime.views.SearchEventResultUI;

/**
 *
 * @author Gisward
 */
public class SearchCntl
{
   private NavigationCntl parentNavigationCntl;
   private final ContactList theContactList;
   private final EventList theEventList;
   private ContactCntl parentAddCntl; 
   private SearchContactsUI theSearchContactsUI;
   private SearchUI theSearchUI;
   private SearchEventsUI theSearchEventsUI;
   private int numOfInstantiations = 0;
    
    public SearchCntl()
    {
        numOfInstantiations++;
        System.out.println("SearchCntl instantiated " + this.numOfInstantiations + " time(s).");
        this.theContactList = new ContactList();
        this.theEventList = new EventList();
    }
    
    public void setNavigationCntl(NavigationCntl newParentNavigationCntl)
    {
        System.out.println("Welcome to the SearchCntl");
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
    
    public Event searchEventTitle(String nameToSearch)
    {
        return this.theEventList.searchEventName(nameToSearch);
    }
    
    public Event searchEventLocation(String locationToSearch)
    {
        return this.theEventList.searchEventLocation(locationToSearch);
    }
    
    public void requestSearchUI()
    {
        this.theSearchUI = new SearchUI(this);
        this.theSearchUI.setVisible(true);
        this.theSearchUI.setLocationRelativeTo(null);
        this.theSearchUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void requestSearchContactsUI(){
        this.theSearchContactsUI = new SearchContactsUI(this);
        this.theSearchContactsUI.setVisible(true);
        this.theSearchContactsUI.setLocationRelativeTo(null);
        this.theSearchContactsUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void requestSearchEventsUI()
    {
        this.theSearchEventsUI = new SearchEventsUI(this);
        this.theSearchEventsUI.setVisible(true);
        this.theSearchEventsUI.setLocationRelativeTo(null);
        this.theSearchEventsUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void requestSearchContactResultUI(Contact searchedContact){
        SearchContactResultUI theSearchContactResultUI = new SearchContactResultUI(searchedContact);
        theSearchContactResultUI.setVisible(true);
        theSearchContactResultUI.setLocationRelativeTo(null);
        theSearchContactResultUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void requestSearchEventResultUI(Event searchedEvent)
    {
        SearchEventResultUI theSearchEventResultUI = new SearchEventResultUI(searchedEvent);
        theSearchEventResultUI.setVisible(true);
        theSearchEventResultUI.setLocationRelativeTo(null);
        theSearchEventResultUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public NavigationCntl getParentNavigationCntl() 
    {
        return this.parentNavigationCntl;
    }
    
    public SearchCntl getParentSearchCntl()
    {
        return this;
    }
}
