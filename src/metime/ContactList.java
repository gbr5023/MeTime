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
    public boolean searchContactName(String nameToSearch)
    {
        boolean contactNameFound = false;
        boolean nameMatch;
        for(int i = 0; i < this.theListOfContacts.size(); i++){
            nameMatch = this.theListOfContacts.get(i).getFullName().contains(nameToSearch);
            if(nameMatch == true){
                contactNameFound = true;
                break;
            }
        }
        return contactNameFound;
    }
    
    public boolean searchContactPhone(int phoneToSearch)
    {
        boolean contactPhoneFound = false;
        boolean phoneMatch;
        
        for(int i = 0; i < this.theListOfContacts.size(); i++){
            phoneMatch = this.theListOfContacts.get(i).getPhone() == phoneToSearch;
            if(phoneMatch == true){
                contactPhoneFound = true;
                break;
            }
        }
        
        return contactPhoneFound;
    }
    
    public boolean searchContactEmail(String emailToSearch)
    {
        boolean contactEmailFound = false;
        boolean emailMatch;
        
        for(int i = 0; i < this.theListOfContacts.size(); i++){
            emailMatch = this.theListOfContacts.get(i).getEmail().contains(emailToSearch);
            if(emailMatch == true){
                contactEmailFound = true;
                break;
            }
        }
        
        return contactEmailFound;
    }
}
