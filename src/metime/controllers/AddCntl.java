/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metime.controllers;

import java.util.ArrayList;
import metime.models.Contact;
import metime.models.ContactList;
import metime.models.Event;
import metime.models.EventList;

/**
 *
 * @author Gisward
 */
public class AddCntl 
{
    private final NavigationCntl parentNavigationCntl;
    private final EventList theEventList;
    private final ContactList theContactList;
    private int numOfInstantiations = 0;
    
    
    public AddCntl(NavigationCntl newParentNavigationCntl)
    {
        numOfInstantiations++;
        System.out.println("EventCntl instantiated " + this.numOfInstantiations + " time(s).");
        this.theEventList = new EventList();
        System.out.println("ContactCntl instantiated " + this.numOfInstantiations + " time(s).");
        this.theContactList = new ContactList();        
        this.parentNavigationCntl = newParentNavigationCntl;
    }
    
    public ArrayList<Contact> getListOfContacts(){
        return this.theContactList.getListOfContacts();
    }
    
    public ArrayList<Event> getListOfEvents()
    {
        return this.theEventList.getListOfEvents();
    }
    
    public void setListOfEvents(ArrayList<Event> updatedListOfEvents)
    {
        this.theEventList.setListOfEvents(updatedListOfEvents);
    }
    
    public void setListOfContacts(ArrayList<Contact> updatedListOfContacts){
        this.theContactList.setListOfContacts(updatedListOfContacts);
    }
    
    public void addEvent(Event theEventToAdd){
        theEventList.add(theEventToAdd);
    }
    
    public void addContact(Contact theContactToAdd){
        theContactList.add(theContactToAdd);
    }
    
    public NavigationCntl getParentNavigationCntl() 
    {
        return this.parentNavigationCntl;
    }
    
    public EventList getEventList()
    {
        return this.theEventList;
    }
    
    public ContactList getContactList(){
        return this.theContactList;
    }
}