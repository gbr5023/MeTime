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
public class ContactCntl
{
    private final NavigationCntl parentNavigationCntl;
    private final ContactList theContactList;
    
    
    public ContactCntl(NavigationCntl newParentNavigationCntl)
    {
        this.theContactList = new ContactList();        
        this.parentNavigationCntl = newParentNavigationCntl;
    }
    
    public ContactList getContactList()
    {
        return this.theContactList;
    }
    
    public ArrayList<Contact> getListOfContacts(){
        return this.theContactList.getListOfContacts();
    }
    
    public void setListOfContacts(ArrayList<Contact> updatedListOfContacts){
        this.theContactList.setListOfContacts(updatedListOfContacts);
    }
    
    public void addContact(Contact theContactToAdd){
        theContactList.add(theContactToAdd);
    }
    
    public NavigationCntl getParentNavigationCntl() 
    {
        return this.parentNavigationCntl;
    }
}