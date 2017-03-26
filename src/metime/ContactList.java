/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metime;

import java.util.ArrayList;

/**
 *
 * @author Gisward
 */
public class ContactList 
{
    private ArrayList<Contact> theListOfContacts;
    
    public ContactList()
    {
        // Do this if there are no real users
        if(this.theListOfContacts == null){
            buildTestContactList();
        }
    }
    
    public ArrayList<Contact> getListOfContacts()
    {
        if(this.theListOfContacts == null){
            buildTestContactList();
        }
        return this.theListOfContacts;
    }
    
    public void buildTestContactList()
    {
        this.theListOfContacts = new ArrayList();
        for(int i = 0; i < 100; i++)
        {
            String firstName = "Jane";
            String lastName = "Doe" + i;
            int phone = 1234567;
            String email = "jdoe@email.com";
            Contact newContact = new Contact(firstName, lastName, phone, email);
            this.theListOfContacts.add(newContact);
        }
    }
    /* just copied from UserList class, but use the same logic to search for contacts */
    public Contact searchContactName(String nameToSearch)
    {
        boolean nameMatch;
        for(int i = 0; i < this.theListOfContacts.size(); i++){
            Contact contactToSearch = this.theListOfContacts.get(i);
            nameMatch = contactToSearch.getFullName().contains(nameToSearch);
            if(nameMatch){
                return contactToSearch;
            }
        }
        
        return null;
    }
    
    public Contact searchContactPhone(int phoneToSearch)
    {
        boolean phoneMatch;
        
        for(int i = 0; i < this.theListOfContacts.size(); i++){
            Contact contactToSearch = this.theListOfContacts.get(i);
            phoneMatch = contactToSearch.getPhone() == phoneToSearch;
            if(phoneMatch){
                return contactToSearch;
            }
        }
        
        return null;
    }
    
    public Contact searchContactEmail(String emailToSearch)
    {
        boolean emailMatch;
        
        for(int i = 0; i < this.theListOfContacts.size(); i++){
            Contact contactToSearch = this.theListOfContacts.get(i);
            emailMatch = contactToSearch.getEmail().contains(emailToSearch);
            if(emailMatch){
                return contactToSearch;
            }
        }
        
        return null;
    }
}
