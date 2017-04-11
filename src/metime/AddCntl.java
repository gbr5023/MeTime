/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metime;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Gisward
 */
public class AddCntl 
{
    private NavigationCntl parentNavigationCntl;
    private EventList theEventList;
    private ContactList theContactList;
    private AddEventUI theEventUI;
    private int numOfInstantiations = 0;
    private AddContactUI theContactUI;
    private AddChoiceUI theChoiceUI;
    
    
    public AddCntl()
    {
        numOfInstantiations++;
        System.out.println("EventCntl instantiated " + this.numOfInstantiations + " time(s).");
        this.theEventList = new EventList();
        System.out.println("ContactCntl instantiated " + this.numOfInstantiations + " time(s).");
        this.theContactList = new ContactList();
    }
    
    public void setNavigationCntl(NavigationCntl newParentNavigationCntl)
    {
        System.out.println("Welcome to the AddCntl");
        this.parentNavigationCntl = newParentNavigationCntl;
    }
    

    public void requestAddChoiceUI() {
        this.theChoiceUI = new AddChoiceUI(this);
        this.theChoiceUI.pack();
        this.theChoiceUI.setTitle("Create, Read, Update, & Delete Events and Contacts");
        this.theChoiceUI.setLocationRelativeTo(null);
        this.theChoiceUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.theChoiceUI.setVisible(true);
        
    }
    public void requestContactUI(){
        this.theContactUI = new AddContactUI(this);
        this.theContactUI.pack();
        this.theContactUI.setTitle("Create, Read, Update, & Delete Events");
        this.theContactUI.setLocationRelativeTo(null);
        this.theContactUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.theContactUI.setVisible(true);
    }
    public void requestEventUI()
    {
        this.theEventUI = new AddEventUI(this);
        this.theEventUI.pack();
        this.theEventUI.setTitle("Create, Read, Update, & Delete Events");
        this.theEventUI.setLocationRelativeTo(null);
        this.theEventUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.theEventUI.setVisible(true);
    }
    public ArrayList<Contact>getListOfContacts(){
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